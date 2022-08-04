package com.kh.homework.member.model.view;

import java.util.Scanner;

import com.kh.homework.member.controller.MemberController;
import com.kh.homework.member.model.vo.Member;

public class MemberMenu {
	private MemberController mc = new MemberController();
	Scanner sc = new Scanner(System.in);
	
	public MemberMenu() {}

	public void mainMenu() {
		int maxMember = mc.SIZE;
		int nowMember = mc.existMemberNum();
		
		while(true) {
			System.out.println("�ִ� ��� ������ ȸ�� ����" + maxMember + "���Դϴ�.");
			System.out.println("���� ��ϵ� ȸ�� ����" + nowMember + "���Դϴ�.");
			
			if(nowMember < maxMember) {
				Scanner sc = new Scanner(System.in);
				System.out.println("1. �� ȸ�� ���");
				System.out.println("2. ȸ�� �˻�");
				System.out.println("3. ȸ�� ���� ����");
				System.out.println("4. ȸ�� ����");
				System.out.println("5. ��� ���");
				System.out.println("9. ������");
				System.out.print("�޴� ��ȣ : ");
				int num = sc.nextInt();
				
				switch(num) {
				
				case 1: insertMember();
						break;
				case 2: searchMember();
						break;
				case 3: updateMember();
						break;
				case 4: deleteMember();
						break;
				case 5: printAll();
						break;
				default : if(num == 9) {
						  	break;
						  } else {
							  System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
						  }
				}
				break;
			} else if(nowMember == maxMember) {
				Scanner sc = new Scanner(System.in);
				System.out.println("2. ȸ�� �˻�");
				System.out.println("3. ȸ�� ���� ����");
				System.out.println("4. ȸ�� ����");
				System.out.println("5. ��� ���");
				System.out.println("9. ������");
				System.out.print("�޴� ��ȣ : ");
				int num = sc.nextInt();
				
				switch(num) {
				
				case 2: searchMember();
						break;
				case 3: updateMember();
						break;
				case 4: deleteMember();
						break;
				case 5: printAll();
						break;	
				default : if(num == 9) {
						  	break;
						  } else {
							  System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
						  }
				}
				break;
			}
		} 
	}
					
	public void insertMember() {
		while(true) {
			System.out.print("���̵� : ");
			String id = sc.nextLine();
			if(mc.checkId(id)) {
				break;
			} else {
				System.out.println("�ߺ��� ���̵��Դϴ�. �ٽ� �Է����ּ���.");
			}
		}

		System.out.println("�̸� : ");
		String name = sc.nextLine();
		System.out.println("��й�ȣ : ");
		String password = sc.nextLine();
		System.out.println("�̸��� : ");
		String email = sc.nextLine();

		while(true) {
			System.out.println("����(M/F) : ");
			char gender = sc.nextLine().charAt(0);
			if(gender == 'F' || gender == 'M') {
				break;
			} else {
				System.out.println("������ �ٽ� �Է��ϼ���.");
			}
		}
		
		System.out.println("���� : ");
		int age = sc.nextInt();
		
	}

	public void searchMember() {
		System.out.println("1. ���̵�� �˻��ϱ�");
		System.out.println("2. �̸����� �˻��ϱ�");
		System.out.println("3. �̸��Ϸ� �˻��ϱ�");
		System.out.println("9. �������� ���ư���");
		System.out.print("�޴� ��ȣ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1: searchId();
				break;
		case 2: searchName();
				break;
		case 3: searchEmail();
				break;
		case 9: System.out.println("�������� ���ư��ϴ�.");
				mainMenu();
				break;
		default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		        mainMenu();
		}
	}
	
	public void searchId() {
		System.out.print("�˻��� ���̵�");
		String id = sc.nextLine();
		mc.searchId(id);
	}
	
	public void searchName() {
		System.out.print("�˻��� �̸�");
		String name = sc.nextLine();
		mc.searchName(name);
	}
	
	public void searchEmail() {
		System.out.print("�˻��� �̸���");
		String email = sc.nextLine();
		mc.searchEmail(email);
	}
	
	public void updateMember() {
		System.out.println("1. ��й�ȣ �����ϱ�");
		System.out.println("2. �̸� �����ϱ�");
		System.out.println("3. �̸��� �����ϱ�");
		System.out.println("9. �������� ���ư���");
		System.out.print("�޴� ��ȣ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1: updatePassword();
				break;
		case 2: updateName();
				break;
		case 3: updateEmail();
				break;
		case 9: System.out.println("�������� ���ư��ϴ�.");
				mainMenu();
				break;
		default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		        mainMenu();
		}
	}
	
	public void updatePassword() {
		System.out.print("������ ȸ���� ���̵� : ");
		String id = sc.nextLine();
		System.out.print("������ ��й�ȣ : ");
		String password = sc.nextLine();
		mc.updatePassword(id, password);
		
		if(mc.updatePassword != true) {
			mainMenu();
		}
	}
	
	public void updateName() {
		System.out.print("������ ȸ���� ���̵� : ");
		String id = sc.nextLine();
		System.out.print("������ �̸� : ");
		String name = sc.nextLine();
		mc.updateName(id, name);
		
		if(mc.updateName != true) {
			mainMenu();
		}
	}
	
	public void updateEmail() {
		System.out.print("������ ȸ���� ���̵� : ");
		String id = sc.nextLine();
		System.out.print("������ �̸��� : ");
		String email = sc.nextLine();
		mc.updatePassword(id, email);
		
		if(mc.updateEmail != true) {
			mainMenu();
		}	
	}
	
	public void deleteMember() {
		System.out.println("1. Ư�� ȸ�� �����ϱ�");
		System.out.println("2. ��� ȸ�� �����ϱ�");
		System.out.println("9. �������� ���ư���");
		System.out.print("�޴� ��ȣ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1: deleteOne();
				break;
		case 2: deleteAll();
				break;
		case 9: System.out.println("�������� ���ư��ϴ�.");
				mainMenu();
				break;
		default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		        mainMenu();
		}
	}
	
	public void deleteOne() {
		System.out.print("������ ȸ���� ���̵� : ");
		String id = sc.nextLine();
		System.out.println("���� �����Ͻðڽ��ϱ�?(y/n)");
		char ans = sc.nextLine().charAt(0);
		if(ans == 'y' || ans == 'Y') {
			mc.deleteMember(id);
		} else if (ans == 'n' || ans == 'N') {
			mainMenu();
		}
		
	}
	
	public void deleteAll() {
		System.out.println("���� �����Ͻðڽ��ϱ�?(y/n)");
		char ans = sc.nextLine().charAt(0);
		if(ans == 'y' || ans == 'Y') {
			mc.delete();
		} else if (ans == 'n' || ans == 'N') {
			mainMenu();
		}
	}
	
	public void printAll() {
		mc.printAll();
	}
}