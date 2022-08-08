package com.kh.practice.chap01_poly.model.vo;

public class Member {
	private String name;
	private int age, couponCount;
	private char gender;
	
	public Member() {}
	
	public Member(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int Age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setcouponCount(int couponCount) {
		this.couponCount = couponCount;
	}
	
	public int getCouponCount() {
		return couponCount;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public char getGender() {
		return gender;
	}
	
	@Override
	public String toString() {
		return "회원명" + name + "회원나이" + age + "성별";
	}
}
