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
		System.out.println("문자열 : ");
		String str = sc.nextLine();
		System.out.println("문자");
		char cha = str.charAt(0);
		
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
			System.out.println("다시 입력하세요 .");
		    } else { 
		    	int[] arr = new int[num];
				int before = (num / 2) + 1; 
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
}