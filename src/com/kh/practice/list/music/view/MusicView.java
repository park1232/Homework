package com.kh.practice.list.music.view;

import java.util.Scanner;

import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {
	
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	public void mainMenu() {
		int num = 0;
		do {
			System.out.println();
			System.out.println("=====***** 메인 메뉴 *****=====");
			System.out.println("1. 마지막 위치에 곡 추가");
			System.out.println("2. 첫 위치에 곡 추가");
			System.out.println("3. 전체 곡 목록 출력");
			System.out.println("4. 특정 곡 검색 ");
			System.out.println("5. 특정 곡 삭제");
			System.out.println("6. 특정 곡 수정");
			System.out.println("9. 종료");
			
			System.out.println();
			System.out.print("메뉴 번호 입력 : ");
			num = Integer.parseInt(sc.nextLine());
			
			switch(num) {
			case 1: addList(); break;
			case 2: addAtZero(); break;
			case 3: printAll(); break;
			case 4: searchMusic(); break;
			case 5: removeMusic(); break;
			case 6: setMusic(); break;
			case 9: System.out.println("프로그램 종료"); break;
			default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}while(num != 9);
	}
	
	public void addList() {
		System.out.println("******* 마지막 위치에 곡 추가 *******");
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		
		System.out.print("가수 명 : ");
		String singer = sc.nextLine();
		
		Music music = new Music(title, singer);
		boolean result = mc.addList(music);
		
		if(result == true) {
			System.out.println("추가 성공");
		} else {
			System.out.println("추가 실패");
		}
	}
	
	public void addAtZero() {
		System.out.println("****** 첫 위치에 곡 추가 ******");
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		System.out.print("가수 명 : ");
		String singer = sc.nextLine();
		
		Music music = new Music(title, singer);
		int result = mc.addAtZero(music);
		
		if(result == 1) {
			System.out.println("추가 성공");
		} else {
			System.out.println("추가 실패");
		}
	}
	
	public void printAll() {
		System.out.println("******* 전체 곡 목록 출력 *******");
		if(mc.printAll() == null) {
			System.out.println("곡 목록이 없습니다.");
		} else {
			System.out.println(mc.printAll());
		}
	}
	
	public void searchMusic() {
		System.out.println("******* 특정 곡 검색 *******");
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		
		Music result = mc.searchMusic(title);
		if(result == null) {
			System.out.println("검색한 곡이 없습니다.");
		} else {
			System.out.println(result + " 입니다.");
		}
	}
	
	public void removeMusic() {
		System.out.println("******* 특정 곡 삭제 *******");
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		
		Music music = mc.removeMusic(title);
		if(music == null) {
			System.out.println("삭제할 곡이 없습니다.");
		} else {
			System.out.println(music + " 을 삭제 했습니다.");
		}
	}
	
	public void setMusic() {
		System.out.println("******* 특정 곡 정보 수정 *******");
		System.out.print("검색할 곡 명 : ");
		String searchTitle = sc.nextLine();
		
		System.out.print("수정할 곡 명 : ");
		String title = sc.nextLine();
		
		System.out.print("수정할 가수 명: ");
		String singer = sc.nextLine();
		
		Music music = new Music(title, singer);
		Music music1= mc.setMusic(searchTitle, music);
		
		if(music1 == null) {
			System.out.println("수정할 곡이 없습니다.");
		} else {
			System.out.println(music + " 의 값이 변경 되었습니다.");
		}
	}
}
