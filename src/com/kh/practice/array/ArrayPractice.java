package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {
	public void practice1() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			System.out.println(arr[i]);
		}
	}
	
	public void practice2() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 10 - i;
			System.out.println(arr[i]);
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int i = sc.nextInt();
		
		int[] arr = new int[i];
		
		for(int j = 0; j <= arr.length; j++) {
			arr[j] = i;
		}
	}
	
	public void practice4() {
		String[] arr = {"사과", "귤", "포도", "복숭아", "참외"};
		
		System.out.println(arr[1]); 
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		System.out.print("문자 : ");
		char cha = sc.nextLine().charAt(0);
		
		char[] chArr = new char[str.length()];
		int count = 0;
		
		System.out.print(str + "에 " + cha + "가 존재하는 위치(인덱스) : ");
		
		for(int i = 0; i < str.length(); i++) {
			chArr[i] = str.charAt(i);
			
			if(cha == chArr[i]) {
				count++;
				System.out.print(i + " ");
			}
		} 
		System.out.println();
		System.out.println(cha + "개수 : " +count);
	}
	
	public void practice6() {
		 String[] str = {"월", "화", "수", "목", "금", "토", "일"};
		 Scanner sc = new Scanner(System.in);
		 System.out.print("0 ~ 6 사이 숫자 입력 : ");
		 int num = sc.nextInt();
		 
		 if(num >= 0 && num < 7) {
			 System.out.println(str[num] + "요일");
		 } else {
			 System.out.println("잘못 입력하셨습니다.");
		 }
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		int sum = 0;
		
		System.out.print("배열 0번째 인덱스에 넣을 값 : ");
		int arr0 = sc.nextInt();
		arr[0] = arr0;
		System.out.print("배열 1번째 인덱스에 넣을 값 : ");
		int arr1 = sc.nextInt();
		arr[1] = arr1;
		System.out.print("배열 2번째 인덱스에 넣을 값 : ");
		int arr2 = sc.nextInt();
		arr[2] = arr2;
		System.out.print("배열 3번째 인덱스에 넣을 값 : ");
		int arr3 = sc.nextInt();
		arr[3] = arr3;
		System.out.print("배열 4번째 인덱스에 넣을 값 : ");
		int arr4 = sc.nextInt();
		arr[4] = arr4;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		System.out.println();
		System.out.print("총 합 : " + sum);
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
		    if(num < 3 || num % 2 == 0) {
			System.out.println("다시 입력하세요.");
		    } else { 
		    	int[] arr = new int[num];
				int before = (num / 2); 
				int after = before - 1;
		    
			if(num >= 3 && num % 2 == 1) {
				for(int i = 1; i <= before; i++) {
					arr[i-1] = i;
					
				}
				for(int i = after; i < arr.length; i--) {
					arr[1] = i;
				}
				break;
				}
		    }
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("치킨 이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		String[] menu = {"양념", "후라이드", "간장", "파닭"};
		
		boolean check = false;
		
		for(int i = 0; i < menu.length; i++) {
			if(menu[i].equals(name)) { // equals 비교시 String과 String 비교 arr[i] = index에 저장된 값 arr = 배열 그 자체
				check = true;
				break;
			}
		}
		
		if(check) {
			System.out.println(name + "치킨 배달 가능");
		} else {
			System.out.println(name + "치킨은 없는 메뉴입니다.");
		}
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String ide = sc.nextLine();
		
		char[] cha = new char[ide.length()];
		
		for(int i = 0; i < ide.length(); i++) {
			cha[i] = ide.charAt(i);
		}
		
		char[] copyCha = new char[cha.length];
		
		for(int i = 0; i < copyCha.length; i++) {
			if(i <= 7) {
				copyCha[i] = cha[i];
			} else {
				copyCha[i] = '*';
			}
			System.out.print(copyCha[i]);
		} 		
	}
	
	public void practice11() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			if(i <= 9) {
			arr[i] = (int)(Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");
			} else {
				arr[i] = (int)(Math.random() * 10 + 1);
				System.out.print(arr[i]);
			}
		}
	}
	
	public void practice12() {
		int[] arr = new int[10];
		
		int max = 10;
		int min = 1;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()* 10 + 1);
			System.out.print(arr[i] + " ");
			if(arr[i] == max) {
				max = arr[i];
			} else {
				min = arr[i];
			}
		}
		System.out.println();
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
	
	public void practice13() { // 물어볼 것 
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length;) {
			int random = (int)(Math.random()* 10 + 1);
			boolean check = false;
			
			for(int j = 0; j < i; j++) {
				if(arr[j] == random) {
					check = true;
					break;
				}
			}
			
			if(!check) {
				arr[i] = random;
				System.out.println(arr[i] + " ");
				i++;
			}
		}
	}
	
	public void practice14() {
		int[] arr = new int[6];
		
		for(int i = 0; i < arr.length;) {
			int random = (int)(Math.random() * 45 + 1);
			boolean check = false;
			
			for(int j = 0; j < i; j++) {
				if(j == random) {
					check = true;
					break;
				}
			}
			
			if(!check) {
				arr[i] = random;
				i++;
			}
		}
	}

	public void practice15() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
			boolean check = false;
			
			for(int j = 0; j < i; j++) {
				if(j == arr[i]);
				
			}
		}
	}
}