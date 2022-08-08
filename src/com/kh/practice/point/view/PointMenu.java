package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {
	private Scanner sc = new Scanner(System.in);
	private	CircleController cc = new CircleController();
	private	RectangleController rc = new RectangleController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("===== �޴� =====");
			System.out.println("1. ��");
			System.out.println("2. �簢��");
			System.out.println("9. ������");
			System.out.print("�޴� ��ȣ : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1:circleMenu();
					break;
			
			case 2:retangleMenu();
					break;
			
			case 9:System.out.println("�����մϴ�.");
					break;
			
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			          mainMenu();
			}
			break;
		}
	}
	
	public void circleMenu() {
		System.out.println("=====�� �޴� =====");
		System.out.println("1. �� �ѷ�");
		System.out.println("2. �� ����");
		System.out.println("9. ��������");
		System.out.print("�޴� ��ȣ : ");
		int num = sc.nextInt();
		
		switch(num) {
			case 1:calcCircum();
					break;
			
			case 2:calcCircleArea();
					break;
			
			case 9:System.out.println("�����մϴ�.");
					break;
					
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					  mainMenu();
		}	
	}
	
	public void retangleMenu() {
		System.out.println("=====�簢�� �޴� =====");
		System.out.println("1. �簢�� �ѷ�");
		System.out.println("2. �簢�� ����");
		System.out.println("9. ��������");
		System.out.print("�޴� ��ȣ : ");
		int num = sc.nextInt();
		
		switch(num) {
			case 1:calcPerimeter();
					break;
			
			case 2:calcRectArea();
					break;
			
			case 9:System.out.println("�����մϴ�.");
					break;
					
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			          mainMenu();
		} 
	}
	
	public void calcCircum() {
		System.out.print("x ��ǥ : ");
		int x = sc.nextInt();
		System.out.print("y ��ǥ : ");
		int y = sc.nextInt();
		System.out.print("������ : ");
		int radius = sc.nextInt();
		cc.calcCircum(x, y, radius);
		System.out.println("�ѷ� : " + cc.calcCircum(x, y, radius));
	}
	
	public void calcCircleArea() {
		System.out.print("x ��ǥ : ");
		int x = sc.nextInt();
		System.out.print("y ��ǥ : ");
		int y = sc.nextInt();
		System.out.print("������ : ");
		int radius = sc.nextInt();
		cc.calcArea(x, y, radius);
		System.out.println("���� : " + cc.calcArea(x, y, radius));
	}
	
	public void calcPerimeter() {
		System.out.print("x ��ǥ : ");
		int x = sc.nextInt();
		System.out.print("y ��ǥ : ");
		int y = sc.nextInt();
		System.out.print("���� : ");
		int width = sc.nextInt();
		System.out.print("�ʺ� : ");
		int height = sc.nextInt();
		rc.calcPerimeter(x, y, width, height);
		System.out.println("�ѷ� : " + rc.calcPerimeter(x, y, width, height));
	}
	
	public void calcRectArea() {
		System.out.print("x ��ǥ : ");
		int x = sc.nextInt();
		System.out.print("y ��ǥ : ");
		int y = sc.nextInt();
		System.out.print("���� : ");
		int width = sc.nextInt();
		System.out.print("�ʺ� : ");
		int height = sc.nextInt();
		rc.calcArea(x, y, height, width);
		System.out.println("���� : " + rc.calcArea(x, y, height, width));
	}
}
