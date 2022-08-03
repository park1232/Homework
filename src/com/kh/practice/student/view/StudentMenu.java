package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {
	private StudentController ssm = new StudentController();
	
	public StudentMenu() {
		System.out.println("========= �л� ���� ��� =========");
		
		Student[] stdArr = ssm.printStudent();
		
		for(int i = 0; i < stdArr.length; i++) {
			System.out.println(stdArr[i].inform());
		}
		
		System.out.println("========= �л� ���� ��� =========");
		
		double[] dArr = ssm.avgScore();
		System.out.println("�л� ���� �հ� : " + (int)dArr[0]);
		System.out.println("�л� ���� ��� : " + dArr[1]);
		
		System.out.println("========= ���� ��� ��� =========");
		
		for(int i = 0; i < stdArr.length; i++) {
			if(stdArr[i].getScore() >= 60) {
				System.out.println(stdArr[i].getName() + "�л��� ����Դϴ�.");
			} else {
				System.out.println(stdArr[i].getName() + "�л��� ����� ����Դϴ�.");
			}
		}
	}
}
