package com.kh.general.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
		
		for(int i = 1; (i >= 1) && (i <= num); i++) {
			System.out.println(i);
		}
		if(num <= 0) {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		}
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
		
		while(true) {
			if(num >= 1) {
				for(int i = 1; i <= num; i++) {
					System.out.println(i);	
				}
				break;
			}
			else {
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
			}
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
		for(int i = num; (i <= num) && (i >0); i--) {
			if(i < 0) {
				break;
			}
			System.out.println(i);			
		} 
		if(num <= 0) {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		}
	}
	
	public void practice4() {
		
	}
	
	public void practice5() { 
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �ϳ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		int sum = 0;

		for(int i = 1; i <= num; i++) { // for�� ������ �ݺ��� ��� �ؾߵɱ ����
			sum += i;
			if(i == num) {
				System.out.print(i + " + ");
			} else {
				System.out.print(i + " = ");
			}
		} 
		System.out.println(sum);
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ù ��° ���� : ");
		int num1 = sc.nextInt();
		System.out.println("�� ��° ���� : ");
		int num2 = sc.nextInt();
		
		if(num1 < 1 || num2 < 1) {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���");
			return;
		}
		if(num1 > num2) {
			for(int i = num2; i <= num1; i++) {
				System.out.println(i);
				} 
		} else if(num1 < num2) {
			for(int i = num1; i <= num2; i++) {
				System.out.println(i);
			}
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� : ");
		int num = sc.nextInt();
		System.out.println("===== " + num + "��" + " =====");
		
		if(num > 0) {
			for(int i = 1; i <= 9; i++) {
				System.out.println(num + " * " + + i + " = " + (num * i));
			}
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� : ");
		int num = sc.nextInt();
		
		for(int i = num; i <= 9; i++) {
			System.out.println("===== " + i + "��" + " =====");
		} 
		if(num >= 10) {
			System.out.println("9 ������ ���ڸ� �Է����ּ���.");
		}
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� : ");
		int num = sc.nextInt();
		
		for(int i = num; i <= 9; i++) {
			System.out.println("===== " + i + "��" + " =====");  
	   }if(num >= 10) {
			System.out.println("9 ������ ���ڸ� �Է����ּ���.");
	   } return;
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� : ");
		int start = sc.nextInt();
		System.out.println("���� : ");
		int minus = sc.nextInt();
		
//		for(int i = start; )
	}
}
			