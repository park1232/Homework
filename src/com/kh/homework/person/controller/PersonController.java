package com.kh.homework.person.controller;

import com.kh.homework.person.model.vo.Employee;
import com.kh.homework.person.model.vo.Student;

public class PersonController {

	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];
	
	public int[] personCount() {
		int[] count = new int[2];
		
		for(int i = 0; i < e.length; i++) {
			if(e[i] != null) {
				count[1]++;
			}
		}
		
		for(int i = 0; i < s.length; i++) {
			if(s[i] != null) {
				count[0]++;
			}
		}
		return count;
	}

	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		
		for(int i = 0; i < s.length; i++) {
			if(s[i] == null) {
				Student sd = new Student(name, age, height, weight, grade, major);
				s[i] = sd;
			}
		}
	}

	public Student[] printStudent() {
		return s;
	}
	
	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		for(int i = 0; i < e.length; i++) {
			if(e[i] == null) {
				Employee ey = new Employee(name, age, height, weight, salary, dept);
				e[i] = ey;
			}
		}
	}
	
	public Employee[] printEmployee() {
		return e;
	}
}
