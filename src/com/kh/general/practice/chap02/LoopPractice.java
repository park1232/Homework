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
	public void method11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if(num >= 3) {
			for(int i = 2; i <= num; i++) {
				int j;
				for(j = 2; j < i; j++) {
					if(i % j == 0) {
						break;
					}
				}
				if(j == i) {
					System.out.println("�Ҽ��Դϴ�.");
				} else if(j != i) {
					System.out.println("�Ҽ��� �ƴմϴ�.");
				}
			}
		} else if(num <= 2 && num > 0) { 
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
	
	public void method12() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("���� : ");
			int num = sc.nextInt();
			
			if(num >= 3) {
				for(int i = num; i <= num; i++) {
					int j;
					for(j = 2; j < i; j++) {
						if(i % j == 0) {
							break;
						}
					}
					if(j == i) {
						System.out.println("�Ҽ��Դϴ�.");
					} else if(j != i) {
						System.out.println("�Ҽ��� �ƴմϴ�.");
					}
				}
				break;
			} else if(num <= 2) { 
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
	}
	
	public void method13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		int count = 0;
		
		if(num >= 2) {
			for(int i = 2; i <= num; i++) {
				int j;
				for(j = 2; j < i; j++) {
					if(i % j == 0) {
						break;
					}
				}
				if(j == i) {
					System.out.print(i + " ");
					count++;
				}
			}
			System.out.println();
			System.out.println("2����" + num + "���� �Ҽ��� ������" + count + "���Դϴ�." );
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
	
	public void method14() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ڿ��� �ϳ��� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		int count = 0;
		
		for(int i = 1; i <= num; i++) {
			if(i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		
		for(int i = 1; i <= num; i++) {
			if(i % 2 == 0 && i % 3 == 0) {
				count++;
			}
		}
		System.out.println();
		System.out.println("count : " + count);
	}
	
	public void method15() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			System.out.println();
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
		}
		for(int i = (num - 1); i >= 1; i--) {
			System.out.println();
			for(int j = i; j >= 1; j--) {
				System.out.print("*");
			}
		}
	}
	
	public void method16() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= (num - i); j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
					System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void method17() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= (num - i); j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= (i * 2) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void method18() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			if(i == 1 || i == num) {
				for(int j = 1; j <= num; j++) {
					System.out.print("*");
				} 
				System.out.println();
			} else {
				for(int j = 1; j <= num; j++) {
					if(j == 1 || j == num) {
						for(int k = 1; k < 2; k++) {
							System.out.print("*");
						} 
					} else if (j != 1 || j != num) {
						System.out.print(" ");
					}
			}
			System.out.println();
			}
		}
	}
}
