package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	private List<Music> list = new ArrayList<>();
	
	public boolean addList(Music music) {
		return list.add(music);
	}
	
	public int addAtZero(Music music) {
		list.add(0, music);
		if(list.contains(music)) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public List<Music> printAll() {
		return list;
	}
	
	public Music searchMusic(String title) {
		for(int i = 0; i < list.size(); i++) {
			Music music = list.get(i);
			if(title.equals(music.getTitle())) {
				return list.get(i);
			}
		}
		return null;
	}
	
	public Music removeMusic(String title) {
		for(int i = 0; i < list.size(); i++) {
			Music music = list.get(i);
			if(title.equals(music.getTitle())) {
				return list.remove(i);
			}
		}
		return null;
	}
	
	public Music setMusic(String title, Music music) {
		for(int i = 0; i < list.size(); i++) {
			Music music1 = list.get(i);
			if(title.equals(music1.getTitle())) {
				return list.set(i, music);
			}
		}
		return null;
	}
}
