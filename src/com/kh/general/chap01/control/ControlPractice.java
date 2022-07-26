package com.kh.general.chap01.control;

import java.util.Scanner;

public class ControlPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("5. ����");
		System.out.println("�޴� ��ȣ�� �Է��ϼ��� : ");
		int menu = sc.nextInt();
		switch(menu) {
		case 1: 
			System.out.println("�Է� �޴��Դϴ�.");
			break;
		case 2:
			System.out.println("���� �޴��Դϴ�.");
			break;
		case 3:
			System.out.println("��ȸ �޴��Դϴ�.");
			break;
		case 4:
			System.out.println("�����޴��Դϴ�.");
			break;
		case 7:
			System.out.println("���α׷��� ����˴ϴ�.");
		}
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		String strNum  = sc.nextLine();
		int num = Integer.parseInt(strNum);
		
		if(num > 0 && num % 2 ==0) {
			System.out.println("¦����");
		} else if(num % 2 ==1) {
			System.out.println("Ȧ����");
		} else 
			System.out.println("����� �Է����ּ���.");
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� : ");
		int lan = sc.nextInt();
		System.out.println("�������� : ");
		int math = sc.nextInt();
		System.out.println("�������� : ");
		int eng = sc.nextInt();
		
		int sum = lan + math + eng;
		
		if(lan > 40 && math > 40 && eng > 40 && (lan + math + eng) / 3 >= 60)  {
			System.out.println("����: " + lan);
			System.out.println("����: " + math);
			System.out.println("����: " + eng);
			System.out.println("�հ�: " + sum);
			System.out.println("���: " + (lan + math + eng) / 3);
			System.out.println("�����մϴ�, �հ��Դϴ�!");
		} else if ((lan + math + eng) / 3 < 60) {
			System.out.println("���հ��Դϴ�.");
		}
	}
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1~12 ������ ���� �Է� : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
		case 2:
		case 12:
			System.out.println(num + "���� �ܿ��Դϴ�.");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println(num + "���� ���Դϴ�.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(num + "���� �����Դϴ�.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(num + "���� �����Դϴ�.");
			break;
		default : 
			System.out.println("�ش��ϴ� ������ �����ϴ�.");
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���̵� : ");
		String name = sc.nextLine();
		System.out.println("��й�ȣ : ");
		String pass = sc.nextLine();
		
		String myId = "wzwz123z";
		String myPassword12 = "11111111";
		
		if(name.equals(myId) && pass.equals(myPassword12)) {
			System.out.println("�α��� ����");
		} else if(name.equals(myId) && !pass.equals(myPassword12)) {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		} else if(!name.equals(myId) && pass.equals(myPassword12)) {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		}
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ Ȯ���ϰ��� �ϴ� ȸ�� ���");
		String grade = sc.nextLine();
		
		String grade1 = "admin";
		String grade2 = "member";
		String grade3 = "nonmemver";
		
		if(grade.equals(grade1)) {
			System.out.println("ȸ������, �Խñ� ����, �Խñ� �ۼ�, ��� �ۼ�, �Խñ� ��ȸ");
		} else if(grade.equals(grade2)) {
			System.out.println("�Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�");
		} else if(grade.equals(grade3)) {
			System.out.println("�Խñ� ��ȸ");
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ű(m)�� �Է��� �ּ��� : ");
		double height = sc.nextDouble();
		System.out.println("������(kg)�� �Է��� �ּ��� : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		System.out.println("BMI ���� : " + bmi);
		
		if(bmi < 18.5) {
			System.out.println("��ü��");
		} else if(bmi >= 18.5 && bmi < 23) {
			System.out.println("����ü��");
		} else if(bmi >= 30) {
			System.out.println("�� ��");
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ǿ�����1 �Է�");
		int num1 = sc.nextInt();
		System.out.println("�ǿ�����2 �Է�");
		int num2 = sc.nextInt();
		System.out.println("�����ڸ� �Է�(+,-,8,/,%) : ");
		String operator = sc.next();
		char ope = operator.charAt(0);
		
		if(num1 > 0 && num2 > 0 && (ope == '+' || ope == '-' || ope == '*' || ope == '/' || ope == '%')) {
			switch(ope) {
				case '+':
					System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
					break;
				case '-':
					System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
					break;
				case '*':
					System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
					break;
				case '/':
					System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
					break;
				case '%':
					System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
					break;
			}
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�߰� ��� ���� : ");
		int middle = sc.nextInt();
		System.out.println("�⸻ ��� ���� : ");
		int finalExams = sc.nextInt();
		System.out.println("���� ���� : ");
		int report = sc.nextInt();
		System.out.println("�⼮ ȸ�� : ");
		int check = sc.nextInt();
		
		double mid = middle / 5;
		double fin = finalExams * 3/10;
		double rep = report * 3/10;
		double che = check;
		double sum = (mid + fin + rep + che);
		System.out.println("�߰� ��� ����(20) : " + mid);
		System.out.println("�⸻ ��� ����(30) : " + fin);
		System.out.println("���� ����(30) : " + rep);
		System.out.println("�⼮ ����(20) : " + che);	
		System.out.println("���� : " + sum);
		
		if(sum >= 70) {
			System.out.println("pass");
		} else if(sum < 70 || che >= 14) {
			System.out.println("fail");
		}
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ����� �����ϼ���.");
		System.out.println("1. �޴� ���");
		System.out.println("2. ¦��/Ȧ��");
		System.out.println("3. �հ�/���հ�");
		System.out.println("4. ����");
		System.out.println("5. �α���");
		System.out.println("6. ���� Ȯ��");
		System.out.println("7. BMI");
		System.out.println("8. ����");
		System.out.println("9. P/F");
		System.out.println("���� : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			practice1();
			break;
		case 2:
			practice2();
			break;
		case 3:
			practice3();
			break;
		case 4:
			practice4();
			break;
		case 5:
			practice5();
			break;
		case 6:
			practice6();
			break;
		case 7:
			practice7();
			break;
		case 8:
			practice8();
			break;
		case 9:
			practice9();
			break;
		}
	}
}

