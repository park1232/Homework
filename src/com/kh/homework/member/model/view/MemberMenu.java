package com.kh.homework.member.model.view;

import java.util.Scanner;

import com.kh.homework.member.controller.MemberController;
import com.kh.homework.member.model.vo.Member;

public class MemberMenu {
	private MemberController mc = new MemberController();
	Scanner sc = new Scanner(System.in);
	
	public MemberMenu() {}

	public void mainMenu() {
			
		Member[] mArr = mc.printAll();
		System.out.println("�ִ� ��� ������ ȸ�� ���� 10���Դϴ�.");
		
		mc.existMemberNum();
		System.out.println("���� ��ϵ� ȸ�� ���� 0���Դϴ�.");
		
	}
	
	public void insertMember() {
			
	}

	public void searchMember() {
	
	}
	
	public void searchId() {
		
	}
	
	public void searchName() {
		
	}
	
	public void searchEmail() {
		
	}
	
	public void updateMember() {
		
	}
	
	public void updatePassword() {
		
	}
	
	public void updateName() {
		
	}
	
	public void updateEmail() {
			
	}
	
	public void deleteMember() {
		
	}
	
	public void deleteOne() {
		
	}
	
	public void deleteAll() {
		
	}
	
	public void printAll() {
		
	}
}
