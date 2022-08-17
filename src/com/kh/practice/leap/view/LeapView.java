package com.kh.practice.leap.view;

import java.util.Calendar;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {
	LeapController lc = new LeapController();
	Calendar c = Calendar.getInstance();
	
	public LeapView() {
		int year = c.get(Calendar.YEAR);
		boolean check = lc.isLeapYear(c.get(Calendar.YEAR));
		if(check) {
			System.out.println(year + "년은 윤년입니다.");
		} else {
			System.out.println(year + "년은 평년입니다.");
		}
		System.out.println("총 날짜 수 : " + lc.leapDate(c));
	}
}
