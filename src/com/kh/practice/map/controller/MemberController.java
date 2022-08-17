package com.kh.practice.map.controller;

import java.util.HashMap;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Member;

public class MemberController {
	HashMap<String, Member> map = new HashMap<>();
	Member m = new Member();
	
	public boolean joinMembership(String id, Member m) {
		if(!map.containsKey(id)) {
			map.put(id, m);
			return true;
		} else {
			return false;
		}
	}
	
	public String logIn(String id, String password) {
		if(map.containsKey(id)) {
			Member m = map.get(id);
			String savePw = m.getPassword();
			
			if(savePw.equals(password)) {
				return m.getName();
			} 
		}
		return null;
	}
	
	public boolean changePassword(String id, String oldpw, String newpw) {
		Member m = map.get(id); // 여기 이해 안감
		String savePw = m.getPassword(); // 여기도
		
		if(map.containsKey(id) && savePw.equals(oldpw)) {
			m.setPassword(newpw);
			return true;
		} else {
			return false;
		}
	}
	
	public void changeName(String id, String newName) {
		Member m = map.get(id);	 // 여기 이해 안감
		m.setName(newName);
	}
	
	public TreeMap<String, String> sameName(String name) {
		Member m = map.get(name);
		String saveName = m.getName();
		TreeMap<String, String> saveMap = new TreeMap<>();
		
		if(saveName.equals(name)) {
			saveMap.put(id, name);
		}
	}
}
