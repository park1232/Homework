package com.kh.homework.member.controller;

import com.kh.homework.member.model.vo.Member;

public class MemberController {
	private Member[] m = new Member[SIZE];
	public static final int SIZE = 10;
	
	public int existMemberNum() {
		return SIZE;
	}
	
	public boolean checkId(String inputId) {
		return false;
	}
	
	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		m[0] = new Member("aaaaa", "�ڽſ�", "aa", "aaa@aaa.aaa", 'F', 33);
		m[1] = new Member("bbbbb", "�����", "bb", "bbb@bbb.bbb", 'M', 34);
		m[2] = new Member("ccccc", "������", "cc", "ccc@ccc.ccc", 'M', 28);
		m[3] = new Member("ddddd", "�����", "dd", "ddd@ddd.ddd", 'M', 35);
		m[4] = new Member("eeeee", "�����", "ee", "eee@eee.eee", 'F', 17);
		m[5] = new Member("fffff", "���̹�", "ff", "fff@fff.fff", 'F', 20);
		m[6] = new Member("ggggg", "�ں���", "gg", "ggg@ggg.ggg", 'M', 26);
		m[7] = new Member("hhhhh", "�ۼ���", "hh", "hhh@hhh.hhh", 'M', 41);
		m[8] = new Member("iiiii", "������", "ii", "iii@iii.iii", 'F', 28);
		m[9] = new Member("jjjjj", "������", "jj", "jjj@jjj.jjj", 'M', 23);
	}
	
	public String searchId(String id) {
		return m[SIZE].getId();
	}
	
	public Member[] searchName(String name) {
		return m; 
	}
	
	public Member[] searchEmail(String email) {
		return m; 
	}
	
	public boolean updatePassword(String id, String password) {
		m[SIZE].getId();
		m[SIZE].getPassword();
		
		m[SIZE].setPassword(password);
		return true;
	}
	
	public boolean updateName(String id, String name) {
		m[SIZE].getId();
		m[SIZE].getName();
		
		m[SIZE].setName(name);
		return true;
	}
	
	public boolean updateEmail(String id, String email) {
		m[SIZE].getId(); 
		m[SIZE].getEmail(); 
		
		m[SIZE].setEmail(email);
		return true;
	}
	
	public boolean delete(String id) {
		if(m[SIZE].getId().equals(id)) {
			
		}
	}
	
	public void delete() {
		
	}
	
	public Member[] printAll() {
		return m;
	}
	
	
}
