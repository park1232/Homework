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
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1:circleMenu();
					break;
			
			case 2:retangleMenu();
					break;
			
			case 9:System.out.println("종료합니다.");
					break;
			
			default : System.out.println("잘못 입력하셨습니다.");
			          mainMenu();
			}
			break;
		}
	}
	
	public void circleMenu() {
		System.out.println("=====원 메뉴 =====");
		System.out.println("1. 원 둘레");
		System.out.println("2. 원 넓이");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
		
		switch(num) {
			case 1:calcCircum();
					break;
			
			case 2:calcCircleArea();
					break;
			
			case 9:System.out.println("종료합니다.");
					break;
					
			default : System.out.println("잘못 입력하셨습니다.");
					  mainMenu();
		}	
	}
	
	public void retangleMenu() {
		System.out.println("=====사각형 메뉴 =====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 넓이");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
		
		switch(num) {
			case 1:calcPerimeter();
					break;
			
			case 2:calcRectArea();
					break;
			
			case 9:System.out.println("종료합니다.");
					break;
					
			default : System.out.println("잘못 입력하셨습니다.");
			          mainMenu();
		} 
	}
	
	public void calcCircum() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("반지름 : ");
		int radius = sc.nextInt();
		cc.calcCircum(x, y, radius);
		System.out.println("둘레 : " + cc.calcCircum(x, y, radius));
	}
	
	public void calcCircleArea() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("반지름 : ");
		int radius = sc.nextInt();
		cc.calcArea(x, y, radius);
		System.out.println("면적 : " + cc.calcArea(x, y, radius));
	}
	
	public void calcPerimeter() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("높이 : ");
		int width = sc.nextInt();
		System.out.print("너비 : ");
		int height = sc.nextInt();
		rc.calcPerimeter(x, y, width, height);
		System.out.println("둘레 : " + rc.calcPerimeter(x, y, width, height));
	}
	
	public void calcRectArea() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("높이 : ");
		int width = sc.nextInt();
		System.out.print("너비 : ");
		int height = sc.nextInt();
		rc.calcArea(x, y, height, width);
		System.out.println("면적 : " + rc.calcArea(x, y, height, width));
	}
}
