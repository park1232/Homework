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
		while(true) {
			System.out.println("���� �ϳ� �Է� : ");
			int num = sc.nextInt();
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
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1�̻��� ���ڸ� �Է��ϼ��� : ");
			int num = sc.nextInt();
			
			if(num >= 1) {
				for(int i = num; i >= 1; i--) {
					System.out.print(i + " ");
				} 
				break;
			} else {
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
			}
		}
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

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("ù ��° ���� : ");
			int first = sc.nextInt();
			System.out.println("�� ��° ���� : ");
			int seconde = sc.nextInt();
			
			if(first < 1 || seconde < 1) {
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���");
			} else { 
				if(first > seconde) {
					for(int i = seconde; i <= first; i++) {
						System.out.print(i + " ");
					}
				} else if(first < seconde) {
					for(int j = first; j <= seconde; j++) {
						System.out.print(j + " ");
					}
				} break;
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

		while(true) {
			System.out.println("���� : ");
			int num = sc.nextInt();
			
			if(num <= 9) {
				for(int i = num; i <= 9; i++) {
					System.out.println("===== " + i + "��" + " =====");
						} break;
			} else {
				System.out.println("9 ������ ���ڸ� �Է����ּ���");
			}
		}
	}
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� : ");
		int start = sc.nextInt();
		System.out.println("���� : ");
		int num = sc.nextInt();

		for(int i = 1; i <= 10; i++) {
			System.out.print((num * i) + start + " ");
		}	
	}
	
	public void practice11_1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� : ");
		int start = sc.nextInt();
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		for(int i = 0; i < 10; i++) {
			System.out.print(num * i + start + " ");
		}
//		int count = 0;
//		for(int i = start; ; i += num) {
//			System.out.print(i + " ");
//			count++;
//			
//			if(count == 10) {
//				break;
//			}
//		}
	}
	
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		
		while(true) { 
			System.out.print("������(+, -, *, /, %) : ");
			String str = sc.next();
			System.out.print("���� 1 : ");
			int num1 = sc.nextInt();
			System.out.print("���� 2 : ");
			int num2 = sc.nextInt();
			
			if(str.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			
			switch(str) {
				case "+": 
					System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
					break;
				case "-":
					System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
					break;
				case "*":
					System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
					break;
				case "/":
					if(num2 == 0) {
						System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.");
					} else {
						System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
					}
					break;
				case "%":
					System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
					break;
				default :
					System.out.println("���� �������Դϴ�. �ٽ� �Է����ּ���");
			}
		}
	}
	
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		String sum = "";
		
		for(int i = 1; i <= num; i++) {
			sum += "*";
			System.out.println(sum);
		}
	}
	
	public void practice13_1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {				
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void practice14() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		int num = sc.nextInt();
		
		for(int i = num; i > 0; i--) {
			for(int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}