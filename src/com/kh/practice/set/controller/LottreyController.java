package com.kh.practice.set.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

import com.kh.practice.set.model.vo.Lottery;

public class LottreyController {
	private HashSet<Lottery> lottery = new HashSet<>();
	private HashSet<Lottery> win = new HashSet<>();
	
	public boolean insertObject(Lottery l) {
		lottery.add(l);
		return lottery.add(l);
	}
	
	public HashSet<Lottery> selectAll() {
		return lottery;
	}
	
	public boolean deleteObject(Lottery l) {
		boolean result = lottery.remove(l.toString());
		
		if(win != null && result != false) {
			win.remove(l.toString());
		}
		return result;
	}
	
	public HashSet<Lottery> winObject() {
		ArrayList<Lottery> list = new ArrayList<>(lottery);
			Iterator<Lottery> it = list.iterator();
			while(it.hasNext()) {
				win = it.next();
		}
	}
	
	public boolean searchWinner(Lottery l) {
		boolean result = win.contains(l);
		return result;
	}
}
