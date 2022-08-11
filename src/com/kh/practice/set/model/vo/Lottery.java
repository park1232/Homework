package com.kh.practice.set.model.vo;

public class Lottery {
	private String name, phone;
	
	public Lottery() {}
	
	public Lottery(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String toString() {
		return name +"(" + phone + ")";
	}
}
