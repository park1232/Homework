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
		System.out.println("���� ����� �л��� " + N[1] + "���Դϴ�.");
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
			case 1: if(M.length == 3) {
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
		String age = sc.nextLine();
		
		System.out.print("�л� Ű : ");
		String height = sc.nextLine();
		
		System.out.print("�л� ������ : ");
		String weight = sc.nextLine();
		
		System.out.print("�л� �г� : ");
		String grade = sc.nextLine();
		
		System.out.print("�л� ���� : ");
		String major = sc.nextLine();
		
		pc.insertStudent();
	}
	
	public void printStudent() {
		
	}
	
	public void insertEmployee() {
		
	}
	
	public void printEmployee() {
		
	}
}
