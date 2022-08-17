package com.kh.practice.leap.controller;

import java.util.Calendar;

public class LeapController {
	public boolean isLeapYear(int year) {
		int checkYear = year;
			if(checkYear % 4 == 0 && (checkYear % 100 !=0 || checkYear % 400 == 0)) {
				return true;
			} else {
				return false;
		}
	}
	
	public long leapDate(Calendar c) {
		Calendar cc = Calendar.getInstance();
		int year = cc.get(Calendar.YEAR);
		int month = cc.get(Calendar.MONTH + 1);
		int day = cc.get(Calendar.DATE);
		Long count = 0L;
		
		for(int i = 0; i < year; i++) {
			if(isLeapYear(i)) {
				count += 366;
			} else {
				count += 365;
			}
		}
		if(isLeapYear(year)) {
			for(int i = 1; i <= month; i++) {
				switch(i) {
				case 1: 
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12: count += 31;
						 break;
				case 4:
				case 6:
				case 9:
				case 11: count += 30;
						 break;
				case 2: count += 29;
						 break;
				}
			}
		} else if(isLeapYear(year)) {
			for(int i = 1; i <= month; i++) {
				switch(i) {
				case 1: 
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12: count += 31;
						 break;
				case 4:
				case 6:
				case 9:
				case 11: count += 30;
						 break;
				case 2: count += 28;
						 break;
				}
			}
		}
		count += day;
		return count;
	}
}
