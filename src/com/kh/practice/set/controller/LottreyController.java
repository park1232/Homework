package com.kh.practice.set.controller;

import java.util.ArrayList;
import java.util.HashSet;

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
		lottery.remove(l);
		boolean result = lottery.remove(l);
		
		if(win != null && result != false) {
			win.remove(l);
		}
		return true;
	}
	
	public HashSet<Lottery> winObject() {
		ArrayList<Lottery> ran = lottery;
	}
	
	public boolean searchWinner(Lottery l) {
		boolean result = win.contains(l);
		return result;
	}
}
