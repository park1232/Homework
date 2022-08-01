package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {
	Scanner sc = new Scanner(System.in);
	SnackController scr = new SnackController();
	
	public void menu() {
		
		System.out.println("�������� �Է��ϼ���.");
		System.out.print("���� : ");
		String kind = sc.nextLine();
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("�� : ");
		String flavor = sc.nextLine();
		
		System.out.print("���� : ");
		int kinOf = Integer.parseInt(sc.nextLine());
		
		System.out.print("���� : ");
		int price = Integer.parseInt(sc.nextLine());
	
		String result = scr.saveData(kind, name, flavor, kinOf, price);
		System.out.println(result);
		
		System.out.print("������ ������ Ȯ���Ͻðڽ��ϱ�?(y/n) : ");
		String answer = sc.nextLine();
		if(answer.toUpperCase().equals("Y")) { // toUpperCase �ȿ� �� ���ڸ� �빮�ڷ� �ٲ�
			System.out.println(scr.confirmdata());
		}
	}
}
