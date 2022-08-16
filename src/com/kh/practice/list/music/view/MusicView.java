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
			System.out.println("=====***** ���� �޴� *****=====");
			System.out.println("1. ������ ��ġ�� �� �߰�");
			System.out.println("2. ù ��ġ�� �� �߰�");
			System.out.println("3. ��ü �� ��� ���");
			System.out.println("4. Ư�� �� �˻� ");
			System.out.println("5. Ư�� �� ����");
			System.out.println("6. Ư�� �� ����");
			System.out.println("9. ����");
			
			System.out.println();
			System.out.print("�޴� ��ȣ �Է� : ");
			num = Integer.parseInt(sc.nextLine());
			
			switch(num) {
			case 1: addList(); break;
			case 2: addAtZero(); break;
			case 3: printAll(); break;
			case 4: searchMusic(); break;
			case 5: removeMusic(); break;
			case 6: setMusic(); break;
			case 9: System.out.println("���α׷� ����"); break;
			default: System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}while(num != 9);
	}
	
	public void addList() {
		System.out.println("******* ������ ��ġ�� �� �߰� *******");
		System.out.print("�� �� : ");
		String title = sc.nextLine();
		
		System.out.print("���� �� : ");
		String singer = sc.nextLine();
		
		Music music = new Music(title, singer);
		boolean result = mc.addList(music);
		
		if(result == true) {
			System.out.println("�߰� ����");
		} else {
			System.out.println("�߰� ����");
		}
	}
	
	public void addAtZero() {
		System.out.println("****** ù ��ġ�� �� �߰� ******");
		System.out.print("�� �� : ");
		String title = sc.nextLine();
		System.out.print("���� �� : ");
		String singer = sc.nextLine();
		
		Music music = new Music(title, singer);
		int result = mc.addAtZero(music);
		
		if(result == 1) {
			System.out.println("�߰� ����");
		} else {
			System.out.println("�߰� ����");
		}
	}
	
	public void printAll() {
		System.out.println("******* ��ü �� ��� ��� *******");
		if(mc.printAll() == null) {
			System.out.println("�� ����� �����ϴ�.");
		} else {
			System.out.println(mc.printAll());
		}
	}
	
	public void searchMusic() {
		System.out.println("******* Ư�� �� �˻� *******");
		System.out.print("�� �� : ");
		String title = sc.nextLine();
		
		Music result = mc.searchMusic(title);
		if(result == null) {
			System.out.println("�˻��� ���� �����ϴ�.");
		} else {
			System.out.println(result + " �Դϴ�.");
		}
	}
	
	public void removeMusic() {
		System.out.println("******* Ư�� �� ���� *******");
		System.out.print("�� �� : ");
		String title = sc.nextLine();
		
		Music music = mc.removeMusic(title);
		if(music == null) {
			System.out.println("������ ���� �����ϴ�.");
		} else {
			System.out.println(music + " �� ���� �߽��ϴ�.");
		}
	}
	
	public void setMusic() {
		System.out.println("******* Ư�� �� ���� ���� *******");
		System.out.print("�˻��� �� �� : ");
		String searchTitle = sc.nextLine();
		
		System.out.print("������ �� �� : ");
		String title = sc.nextLine();
		
		System.out.print("������ ���� ��: ");
		String singer = sc.nextLine();
		
		Music music = new Music(title, singer);
		Music music1= mc.setMusic(searchTitle, music);
		
		if(music1 == null) {
			System.out.println("������ ���� �����ϴ�.");
		} else {
			System.out.println(music + " �� ���� ���� �Ǿ����ϴ�.");
		}
	}
}
