package com.kh.practice.map.controller;

import java.util.HashMap;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Member;

public class MemberController {
	private HashMap<String, Member> map = new HashMap<>();
	
	public boolean joinMembership(String id, Member m) {
		if(map.containsKey(id) == false) {
			map.put(id, m);
			return true;
		} else {
			return false;
		}
	}
	
	public String logIn(String id, String password) {
		if(map.containsKey(id) != true) {
			
		}
	}
	
	public boolean changePassword(String id, String oldPw, String newPw) {
		
	}
	
	public void changeName(String id, String newName) {
		
	}
	
	public TreeMap sameName(String name) {
		
	}
}
