package kh.java.exam;

import java.util.Scanner;

public class Sort {
	public void sort() {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[5];
		int sum = 0;
		// �ݺ����� ���� �Է�
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "��° ���� �Է� : ");
			arr[i] = scanner.nextInt();
			sum += arr[i];
		}
		// �������� ���� �ڵ�
		int temp = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[j] > arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		// ��� �ڵ�
		System.out.print("���� ��� : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		System.out.println("�Է��� ���� �� ���� : " + sum);
	}
}