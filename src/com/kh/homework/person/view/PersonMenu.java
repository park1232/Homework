package com.kh.homework.person.view;

import java.util.Scanner;

import com.kh.homework.person.controller.PersonController;

public class PersonMenu {
	Scanner sc = new Scanner(System.in);
	PersonController pc = new PersonController();
	
	public void mainMenu() {
		int[] M = pc.personCount();
		int[] N = pc.personCount();
		
		System.out.println("�л��� �ִ� 3����� ������ �� �ֽ��ϴ�.");
		System.out.println("���� ����� �л��� " + M[0] + "���Դϴ�.");
		System.out.println("����� �ִ� 10����� ������ �� �ֽ��ϴ�.");
		System.out.println("���� ����� ����� " + N[1] + "���Դϴ�.");
		int[] result = pc.personCount();
		
		System.out.println("1. �л� �޴�");
		System.out.println("2. ��� �޴�");
		System.out.println("9. ������");
		System.out.print("�޴� ��ȣ : ");
		int num = Integer.parseInt(sc.nextLine());
		
		while(true) {
			switch(num) {
			case 1: studentMenu();
					break;
			case 2: employeeMenu();
					break;
			case 9: System.out.println("�����մϴ�.");
					return;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
			}
		}
	}
	
	public void studentMenu() {
		System.out.println("1. �л� �߰�");
		System.out.println("2. �л� ����");
		System.out.println("9. ��������");
		System.out.print("�޴� ��ȣ : ");
		int num = Integer.parseInt(sc.nextLine());
		int[] M = pc.personCount();
		
		while(true) {
			switch(num) {
			case 1: if(M[0] == 3) {
						while(true) {
							System.out.println("�л��� ���� �� �ִ� ������ �� á�� ������ �л� �߰� �޴��� �� �̻� Ȱ��ȭ ���� �ʽ��ϴ�.");
							System.out.print("�޴� ��ȣ : ");
							int num1 = Integer.parseInt(sc.nextLine());
							
							switch(num1) {
							case 1 : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
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
			case 9: System.out.println("�������� ���ư��ϴ�.");
			        return;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
			}
		}
	}
	
	public void employeeMenu() {
		System.out.println("1. ��� �߰�");
		System.out.println("2. ��� ����");
		System.out.println("9. ��������");
		System.out.print("�޴� ��ȣ : ");
		int num = Integer.parseInt(sc.nextLine());
		
		while(true) {
			switch(num) {
			case 1: insertEmployee();
					break;
			case 2: printEmployee();
					break;
			case 9: System.out.println("�������� ���ư��ϴ�.");
			        return;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
			}
		}
	}
	
	public void insertStudent() {
		System.out.print("�л� �̸� : ");
		String name = sc.nextLine();
		
		System.out.print("�л� ���� : ");
		int age = Integer.parseInt(sc.nextLine());
		
		System.out.print("�л� Ű : ");
		double height = Double.parseDouble(sc.nextLine());
		
		System.out.print("�л� ������ : ");
		double weight = Double.parseDouble(sc.nextLine());
		
		System.out.print("�л� �г� : ");
		int grade = Integer.parseInt(sc.nextLine());
		
		System.out.print("�л� ���� : ");
		String major = sc.nextLine();
		
		pc.insertStudent(name, age, height, weight, grade, major);
		int[] N = pc.personCount();
		if(N[1] < 3) { 
			System.out.println("�׸��Ͻ÷��� N, �̾��Ͻ÷��� �ƹ� Ű�� �������� : ");
			char data = sc.nextLine().charAt(0);
			if(data == 'N') {
				return;
			} else {
				insertStudent();
			}
		} else if(N[1] == 3) {
			System.out.println("�л��� ���� �� �ִ� ������ �� á�� ������ �л� �߰��� �����ϰ� �л� �޴��� ���ư��ϴ�.");
			return;
		}
	}
	
	public void printStudent() {
		System.out.println(pc.printStudent());
	}
	
	public void insertEmployee() {
		System.out.print("��� �̸� : ");
		String name = sc.nextLine();
		
		System.out.print("��� ���� : ");
		int age = Integer.parseInt(sc.nextLine());
		
		System.out.print("��� Ű : ");
		double height = Double.parseDouble(sc.nextLine());
		
		System.out.print("��� ������ : ");
		double weight = Double.parseDouble(sc.nextLine());
		
		System.out.print("��� �޿� : ");
		int salary = Integer.parseInt(sc.nextLine());
		
		System.out.print("��� �μ� : ");
		String dept = sc.nextLine();
		
		pc.insertEmployee(name, age, height, weight, salary, dept);
		int[] M = pc.personCount();
		if(M[1] < 10) { 
			System.out.println("�׸��Ͻ÷��� N, �̾��Ͻ÷��� �ƹ� Ű�� �������� : ");
			char data = sc.nextLine().charAt(0);
			if(data == 'N') {
				return;
			} else {
				insertEmployee();
			}
		} else if(M[1] == 10) {
			System.out.println("����� ���� �� �ִ� ������ �� á�� ������ ��� �߰��� �����ϰ� �л� �޴��� ���ư��ϴ�.");
			return;
		}
	}
	
	public void printEmployee() {
		System.out.println(pc.printEmployee());
	}
}
