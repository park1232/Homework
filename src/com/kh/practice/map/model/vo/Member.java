package com.kh.practice.map.model.vo;

public class Member {
	private String password, name;
	
	public Member() {}
	
	public Member(String password, String name) {
		this.password = password;
		this.name = name;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return name + "-" + password;
	}
}
