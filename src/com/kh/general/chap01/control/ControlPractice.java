package com.kh.general.chap01.control;

import java.util.Scanner;

public class ControlPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("5. 종료");
		System.out.println("메뉴 번호를 입력하세요 : ");
		int menu = sc.nextInt();
		switch(menu) {
		case 1: 
			System.out.println("입력 메뉴입니다.");
			break;
		case 2:
			System.out.println("수정 메뉴입니다.");
			break;
		case 3:
			System.out.println("조회 메뉴입니다.");
			break;
		case 4:
			System.out.println("삭제메뉴입니다.");
			break;
		case 7:
			System.out.println("프로그램이 종료됩니다.");
		}
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		String strNum  = sc.nextLine();
		int num = Integer.parseInt(strNum);
		
		if(num > 0 && num % 2 ==0) {
			System.out.println("짝수다");
		} else if(num % 2 ==1) {
			System.out.println("홀수다");
		} else 
			System.out.println("양수만 입력해주세요.");
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수 : ");
		int lan = sc.nextInt();
		System.out.println("수학점수 : ");
		int math = sc.nextInt();
		System.out.println("영어점수 : ");
		int eng = sc.nextInt();
		
		int sum = lan + math + eng;
		
		if(lan > 40 && math > 40 && eng > 40 && (lan + math + eng) / 3 >= 60)  {
			System.out.println("국어: " + lan);
			System.out.println("수학: " + math);
			System.out.println("영어: " + eng);
			System.out.println("합계: " + sum);
			System.out.println("평균: " + (lan + math + eng) / 3);
			System.out.println("축하합니다, 합격입니다!");
		} else if ((lan + math + eng) / 3 < 60) {
			System.out.println("불합격입니다.");
		}
	}
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1~12 사이의 정수 입력 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
		case 2:
		case 12:
			System.out.println(num + "월은 겨울입니다.");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println(num + "월은 봄입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(num + "월은 여름입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(num + "월은 가을입니다.");
			break;
		default : 
			System.out.println("해당하는 계절이 없습니다.");
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 : ");
		String name = sc.nextLine();
		System.out.println("비밀번호 : ");
		String pass = sc.nextLine();
		
		String myId = "wzwz123z";
		String myPassword12 = "11111111";
		
		if(name.equals(myId) && pass.equals(myPassword12)) {
			System.out.println("로그인 성공");
		} else if(name.equals(myId) && !pass.equals(myPassword12)) {
			System.out.println("비밀번호가 틀렸습니다.");
		} else if(!name.equals(myId) && pass.equals(myPassword12)) {
			System.out.println("아이디가 틀렸습니다.");
		}
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("권한을 확인하고자 하는 회원 등급");
		String grade = sc.nextLine();
		
		String grade1 = "admin";
		String grade2 = "member";
		String grade3 = "nonmemver";
		
		if(grade.equals(grade1)) {
			System.out.println("회원관리, 게시글 관리, 게시글 작성, 댓글 작성, 게시글 조회");
		} else if(grade.equals(grade2)) {
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
		} else if(grade.equals(grade3)) {
			System.out.println("게시글 조회");
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		System.out.println("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		System.out.println("BMI 지수 : " + bmi);
		
		if(bmi < 18.5) {
			System.out.println("저체중");
		} else if(bmi >= 18.5 && bmi < 23) {
			System.out.println("정상체중");
		} else if(bmi >= 30) {
			System.out.println("고도 비만");
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.println("피연산자1 입력");
		int num1 = sc.nextInt();
		System.out.println("피연산자2 입력");
		int num2 = sc.nextInt();
		System.out.println("연산자를 입력(+,-,8,/,%) : ");
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
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.println("중간 고사 점수 : ");
		int middle = sc.nextInt();
		System.out.println("기말 고사 점수 : ");
		int finalExams = sc.nextInt();
		System.out.println("과제 점수 : ");
		int report = sc.nextInt();
		System.out.println("출석 회수 : ");
		int check = sc.nextInt();
		
		double mid = middle / 5;
		double fin = finalExams * 3/10;
		double rep = report * 3/10;
		double che = check;
		double sum = (mid + fin + rep + che);
		System.out.println("중간 고사 점수(20) : " + mid);
		System.out.println("기말 고사 점수(30) : " + fin);
		System.out.println("과제 점수(30) : " + rep);
		System.out.println("출석 점수(20) : " + che);	
		System.out.println("총점 : " + sum);
		
		if(sum >= 70) {
			System.out.println("pass");
		} else if(sum < 70 || che >= 14) {
			System.out.println("fail");
		}
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		System.out.println("선택 : ");
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

