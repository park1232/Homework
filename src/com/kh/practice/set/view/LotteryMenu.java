package com.kh.practice.set.view;

import java.util.HashSet;
import java.util.Scanner;

import com.kh.practice.set.controller.LottreyController;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryMenu {
	
	private Scanner sc = new Scanner(System.in);
	private LottreyController lc = new LottreyController();
	
	public void mainMenu() {
		System.out.println("======== KH 추첨 프로그램 ========");
		
		while(true) {
			System.out.println("1. 추첨 대상 추가");
			System.out.println("2. 추첨 대상 확인");
			System.out.println("3. 추첨 대상 삭제");
			System.out.println("4. 당첨 대상 확인");
			System.out.println("5. 당첨 대상 검색");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1: insertObject();
					break;
			case 2: selectAll();
					break;
			case 3: deleteObject();
					break;
			case 4: winObject();
					break;
			case 5: searchWinner();
					break;
			case 9: System.out.println("프로그램 종료");
					return;
			}
		}
	}
	
	public void insertObject() {
		while(true) {
			System.out.println("추첨 대상자를 추가합니다.");
			System.out.print("이름 : ");
			String name = sc.next();
			
			System.out.print("핸드폰 번호('-')빼고 : ");
			String phone = sc.next();
				
			Lottery l = new Lottery(name, phone);
			lc.insertObject(l); 
			
			if(lc.selectAll().contains(name)) {
				System.out.println("중복된 대상입니다. 다시 입력하세요");
			}
			System.out.println("더 추가하시겠습니까?(Y/N) : ");
			char ans = sc.next().charAt(0);
			if(ans == 'Y') {

			} else if(ans == 'N') {
				System.out.println(lc.selectAll().size() + "명 추가 완료되었습니다.");
				mainMenu();
			} else {
				System.out.println("Y나 N 중에서 대답해주세요.");
			}
		}	
	}
	
	public void selectAll() {
		if(lc.selectAll().isEmpty()) {
			System.out.println("추첨 대상자가 없습니다.");
		} else {
			System.out.println(lc.selectAll());
		}
	}
	
	public void deleteObject() {
		System.out.println("삭제할 대상의 이름과 핸드폰 번호를 입력하세요.");
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("핸드폰 번호('-'빼고) : ");
		String phone = sc.next();
		
		Lottery l = new Lottery(name, phone);
		boolean result = lc.deleteObject(l);
		
		if(result == true) {
			System.out.println("삭제 완료 되었습니다.");
		} else {
			System.out.println("존재하지 않는 대상입니다.");
		}
	}
	
	public void winObject() {
		if(lc.winObject() == null) {
			System.out.println("추첨 대상이 4명 이상이 되어야 합니다.");
		} else {
			System.out.println(lc.winObject());
		}
	}
	
	public void searchWinner() {
		System.out.println("검색할 대상의 이름과 핸드폰 번호를 입력하세요.");
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.println("핸드폰 번호('-'빼고) : ");
		String phone = sc.next();
		
		Lottery l = new Lottery(name, phone);
		boolean result = lc.searchWinner(l);
		
		if(result == true) {
			System.out.println("축하합니다. 당첨 목록에 존재합니다.");
		} else {
			System.out.println("안타깝지만 당첨 목록에 존재하지 않습니다.");
		}
	}
}
