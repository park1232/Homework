package com.kh.general.practice.chap02;

import java.util.Scanner;

public class LoopPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if((num / num == 1 && num / num == num) && num >= 3) {
			System.out.print("�Ҽ��Դϴ�.");
		} else if ((num / num != 1 && num / num != num) && num >= 3) {
			System.out.println("�Ҽ��� �ƴմϴ�.");
		} else if (num < 2) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
}
