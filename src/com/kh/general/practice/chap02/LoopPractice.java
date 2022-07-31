package com.kh.general.practice.chap02;

import java.util.Scanner;

public class LoopPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if((num / num == 1 && num / num == num) && num >= 3) {
			System.out.print("소수입니다.");
		} else if ((num / num != 1 && num / num != num) && num >= 3) {
			System.out.println("소수가 아닙니다.");
		} else if (num < 2) {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
}
