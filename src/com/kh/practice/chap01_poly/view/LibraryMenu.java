package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {
	private LibraryController Ic;
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("���� : ");
		int age = sc.nextInt();
		System.out.print("���� : ");
		char gender = sc.next().charAt(0);
		
		Member mem = new Member(name, age, gender);
		LibraryController lc = new LibraryController();
		lc.insertMember(mem);
		

		while(true) {
			System.out.println("1. ����������");
			System.out.println("2. ���� ��ü ��ȸ");
			System.out.println("3. ���� �˻�");
			System.out.println("4. ���� �뿩�ϱ�");
			System.out.println("5. ���α׷� �����ϱ�");
			System.out.print("�޴� ��ȣ : ");
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
					
			case 9: System.out.println("���α׷��� �����մϴ�.");
			        
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
