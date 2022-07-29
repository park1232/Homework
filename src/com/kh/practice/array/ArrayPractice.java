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
		System.out.print("���� ���� : ");
		int i = sc.nextInt();
		
		int[] arr = new int[i];
		
		for(int j = 0; j <= arr.length; j++) {
			arr[j] = i;
		}
	}
	
	public void practice4() {
		String[] arr = {"���", "��", "����", "������", "����"};
		
		System.out.println(arr[1]); 
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڿ� : ");
		String str = sc.nextLine();
		System.out.println("����");
		char cha = str.charAt(0);
		
	}
	
	public void practice6() {
		 String[] str = {"��", "ȭ", "��", "��", "��", "��", "��"};
		 Scanner sc = new Scanner(System.in);
		 System.out.print("0 ~ 6 ���� ���� �Է� : ");
		 int num = sc.nextInt();
		 
		 if(num >= 0 && num < 7) {
			 System.out.println(str[num] + "����");
		 } else {
			 System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		 }
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		int sum = 0;
		
		System.out.print("�迭 0��° �ε����� ���� �� : ");
		int arr0 = sc.nextInt();
		arr[0] = arr0;
		System.out.print("�迭 1��° �ε����� ���� �� : ");
		int arr1 = sc.nextInt();
		arr[1] = arr1;
		System.out.print("�迭 2��° �ε����� ���� �� : ");
		int arr2 = sc.nextInt();
		arr[2] = arr2;
		System.out.print("�迭 3��° �ε����� ���� �� : ");
		int arr3 = sc.nextInt();
		arr[3] = arr3;
		System.out.print("�迭 4��° �ε����� ���� �� : ");
		int arr4 = sc.nextInt();
		arr[4] = arr4;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		System.out.println();
		System.out.print("�� �� : " + sum);
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("���� : ");
			int num = sc.nextInt();
			
		    if(num < 3 || num % 2 == 0) {
			System.out.println("�ٽ� �Է��ϼ��� .");
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