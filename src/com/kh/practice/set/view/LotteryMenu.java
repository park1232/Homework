package com.kh.practice.set.view;

import java.util.HashSet;
import java.util.Scanner;

import com.kh.practice.set.controller.LottreyController;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryMenu {
	
	private Scanner sc = new Scanner(System.in);
	private LottreyController lc = new LottreyController();
	
	public void mainMenu() {
		System.out.println("======== KH ��÷ ���α׷� ========");
		
		while(true) {
			System.out.println("1. ��÷ ��� �߰�");
			System.out.println("2. ��÷ ��� Ȯ��");
			System.out.println("3. ��÷ ��� ����");
			System.out.println("4. ��÷ ��� Ȯ��");
			System.out.println("5. ��÷ ��� �˻�");
			System.out.println("9. ����");
			System.out.print("�޴� ��ȣ ���� : ");
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
			case 9: System.out.println("���α׷� ����");
					return;
			}
		}
	}
	
	public void insertObject() {
		while(true) {
			System.out.println("��÷ ����ڸ� �߰��մϴ�.");
			System.out.print("�̸� : ");
			String name = sc.next();
			
			System.out.print("�ڵ��� ��ȣ('-')���� : ");
			String phone = sc.next();
				
			Lottery l = new Lottery(name, phone);
			lc.insertObject(l); 
			
			if(lc.selectAll().contains(name)) {
				System.out.println("�ߺ��� ����Դϴ�. �ٽ� �Է��ϼ���");
			}
			System.out.println("�� �߰��Ͻðڽ��ϱ�?(Y/N) : ");
			char ans = sc.next().charAt(0);
			if(ans == 'Y') {

			} else if(ans == 'N') {
				System.out.println(lc.selectAll().size() + "�� �߰� �Ϸ�Ǿ����ϴ�.");
				mainMenu();
			} else {
				System.out.println("Y�� N �߿��� ������ּ���.");
			}
		}	
	}
	
	public void selectAll() {
		if(lc.selectAll().isEmpty()) {
			System.out.println("��÷ ����ڰ� �����ϴ�.");
		} else {
			System.out.println(lc.selectAll());
		}
	}
	
	public void deleteObject() {
		System.out.println("������ ����� �̸��� �ڵ��� ��ȣ�� �Է��ϼ���.");
		System.out.print("�̸� : ");
		String name = sc.next();
		
		System.out.print("�ڵ��� ��ȣ('-'����) : ");
		String phone = sc.next();
		
		Lottery l = new Lottery(name, phone);
		boolean result = lc.deleteObject(l);
		
		if(result == true) {
			System.out.println("���� �Ϸ� �Ǿ����ϴ�.");
		} else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
		}
	}
	
	public void winObject() {
		if(lc.winObject() == null) {
			System.out.println("��÷ ����� 4�� �̻��� �Ǿ�� �մϴ�.");
		} else {
			System.out.println(lc.winObject());
		}
	}
	
	public void searchWinner() {
		System.out.println("�˻��� ����� �̸��� �ڵ��� ��ȣ�� �Է��ϼ���.");
		System.out.print("�̸� : ");
		String name = sc.next();
		
		System.out.println("�ڵ��� ��ȣ('-'����) : ");
		String phone = sc.next();
		
		Lottery l = new Lottery(name, phone);
		boolean result = lc.searchWinner(l);
		
		if(result == true) {
			System.out.println("�����մϴ�. ��÷ ��Ͽ� �����մϴ�.");
		} else {
			System.out.println("��Ÿ������ ��÷ ��Ͽ� �������� �ʽ��ϴ�.");
		}
	}
}
