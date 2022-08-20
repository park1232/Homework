package com.kh.homework.person.view;

import java.util.Scanner;

import com.kh.homework.person.controller.PersonController;

public class PersonMenu {
	Scanner sc = new Scanner(System.in);
	PersonController pc = new PersonController();
	
	public void mainMenu() {
		int[] M = pc.personCount();
		int[] N = pc.personCount();
		
		System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 학생은 " + M[0] + "명입니다.");
		System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 사원은 " + N[1] + "명입니다.");
		int[] result = pc.personCount();
		
		System.out.println("1. 학생 메뉴");
		System.out.println("2. 사원 메뉴");
		System.out.println("9. 끝내기");
		System.out.print("메뉴 번호 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		while(true) {
			switch(num) {
			case 1: studentMenu();
					break;
			case 2: employeeMenu();
					break;
			case 9: System.out.println("종료합니다.");
					return;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}
		}
	}
	
	public void studentMenu() {
		System.out.println("1. 학생 추가");
		System.out.println("2. 학생 보기");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		int num = Integer.parseInt(sc.nextLine());
		int[] M = pc.personCount();
		
		while(true) {
			switch(num) {
			case 1: if(M[0] == 3) {
						while(true) {
							System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");
							System.out.print("메뉴 번호 : ");
							int num1 = Integer.parseInt(sc.nextLine());
							
							switch(num1) {
							case 1 : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
									 break;
							case 2 : printStudent();
									 break;
							case 9 : mainMenu();
							}
						}
					}
					insertStudent();
					break;
			case 2: printStudent();
					break;
			case 9: System.out.println("메인으로 돌아갑니다.");
			        return;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}
		}
	}
	
	public void employeeMenu() {
		System.out.println("1. 사원 추가");
		System.out.println("2. 사원 보기");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		while(true) {
			switch(num) {
			case 1: insertEmployee();
					break;
			case 2: printEmployee();
					break;
			case 9: System.out.println("메인으로 돌아갑니다.");
			        return;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}
		}
	}
	
	public void insertStudent() {
		System.out.print("학생 이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학생 나이 : ");
		int age = Integer.parseInt(sc.nextLine());
		
		System.out.print("학생 키 : ");
		double height = Double.parseDouble(sc.nextLine());
		
		System.out.print("학생 몸무게 : ");
		double weight = Double.parseDouble(sc.nextLine());
		
		System.out.print("학생 학년 : ");
		int grade = Integer.parseInt(sc.nextLine());
		
		System.out.print("학생 전공 : ");
		String major = sc.nextLine();
		
		pc.insertStudent(name, age, height, weight, grade, major);
		int[] N = pc.personCount();
		if(N[1] < 3) { 
			System.out.println("그만하시려면 N, 이어하시려면 아무 키나 누르세요 : ");
			char data = sc.nextLine().charAt(0);
			if(data == 'N') {
				return;
			} else {
				insertStudent();
			}
		} else if(N[1] == 3) {
			System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생 메뉴로 돌아갑니다.");
			return;
		}
	}
	
	public void printStudent() {
		System.out.println(pc.printStudent());
	}
	
	public void insertEmployee() {
		System.out.print("사원 이름 : ");
		String name = sc.nextLine();
		
		System.out.print("사원 나이 : ");
		int age = Integer.parseInt(sc.nextLine());
		
		System.out.print("사원 키 : ");
		double height = Double.parseDouble(sc.nextLine());
		
		System.out.print("사원 몸무게 : ");
		double weight = Double.parseDouble(sc.nextLine());
		
		System.out.print("사원 급여 : ");
		int salary = Integer.parseInt(sc.nextLine());
		
		System.out.print("사원 부서 : ");
		String dept = sc.nextLine();
		
		pc.insertEmployee(name, age, height, weight, salary, dept);
		int[] M = pc.personCount();
		if(M[1] < 10) { 
			System.out.println("그만하시려면 N, 이어하시려면 아무 키나 누르세요 : ");
			char data = sc.nextLine().charAt(0);
			if(data == 'N') {
				return;
			} else {
				insertEmployee();
			}
		} else if(M[1] == 10) {
			System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가를 종료하고 학생 메뉴로 돌아갑니다.");
			return;
		}
	}
	
	public void printEmployee() {
		System.out.println(pc.printEmployee());
	}
}
