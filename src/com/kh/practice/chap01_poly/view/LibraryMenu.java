package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {
	private LibraryController Ic;
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);
		
		Member mem = new Member(name, age, gender);
		LibraryController lc = new LibraryController();
		lc.insertMember(mem);
		

		while(true) {
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("5. 프로그램 종료하기");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			
			switch(num) {

			case 1: Ic.myInfo();
					break;
	
			case 2: selectAll();
					break;
					
			case 3: searchBook();
					break;
					
			case 4: rentBook();
					break;
					
			case 9: System.out.println("프로그램을 종료합니다.");
			        
			}
			break;
		}
		
	}
	
	public void selectAll() {
		System.out.println(Ic.selectAll());
	}
	
	public void searchBook() {
		
	}
	
	public void rentBook() {
		
	}
}
