ppackage com.kh.practice.map.view;

import java.util.Scanner;

import com.kh.practice.map.controller.MemberController;
import com.kh.practice.map.model.vo.Member;


public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public void mainMenu() {
		System.out.println("======== KH ����Ʈ ========");
		while(true) {
			System.out.println("******* ���� �޴� *******");
			System.out.println("1. ȸ������");
			System.out.println("2. �α���");
			System.out.println("3. ���� �̸� ȸ�� ã��");
			System.out.println("9. ����");
			System.out.print("�޴� ��ȣ ���� : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1: joinMembership();
					break;
			case 2: logIn();
					memberMenu();
					break;
			case 3: sameName();
					break;
			case 9: System.out.println("���α׷� ����");
					return;
			default : System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���");
					  mainMenu();
			}
			break;
		}
	}
	
	public void memberMenu() {
		while(true) {
			System.out.println("******* ȸ�� �޴� *******");
			System.out.println("1. ��й�ȣ �ٲٱ�");
			System.out.println("2. �̸� �ٲٱ�");
			System.out.println("3. �α׾ƿ�");
			System.out.print("�޴� ��ȣ ����");
			int num = sc.nextInt();
			
			switch(num) {
			case 1: changePassword();
					break;
			case 2: changeName();
					break;
			case 3: System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
			        mainMenu();
			default : System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���");
			          memberMenu();
			}
			break;
		}

	}
	
	public void joinMembership() {
		System.out.print("���̵� : ");
		String id = sc.nextLine();
		
		System.out.print("��й�ȣ : ");
		String password = sc.nextLine();
		
		System.out.print("�̸� : ");
		String name = sc.next();
		
		Member m = new Member(password, name);
		boolean result = mc.joinMembership(id, m);
		
		if(result == true) {
			System.out.println("���������� ȸ������ �Ϸ��Ͽ����ϴ�.");
		} else {
			System.out.println("�ߺ��� ���̵��Դϴ�. �ٽ� �Է����ּ���.");
		}
	}
	
	public void logIn() {
		while(true) {
			System.out.print("���̵� : ");
			String name = sc.nextLine();
			
			System.out.println("��й�ȣ : ");
			String password = sc.next();
			
			String result = mc.logIn(name, password);
			
			if(result != null) {
				System.out.println(name + "��, ȯ���մϴ�!");
				memberMenu();
			} else {
				System.out.println("Ʋ�� ���̵� �Ǵ� ��й�ȣ�Դϴ�. �ٽ� �Է����ּ���");
			}
		}
	}
	
	public void changePassword() {
		while(true) {
			System.out.print("���̵� : ");
			String id = sc.nextLine();
			
			System.out.print("���� ��й�ȣ : ");
			String nowPassword = sc.nextLine();
			
			System.out.print("���ο� ��й�ȣ : ");
			String newPassword = sc.next();
			
			boolean result = mc.changePassword(id, nowPassword, newPassword);
			
			if(result == true) {
				System.out.println("��й�ȣ ���濡 �����߽��ϴ�.");
				break;
			} else {
				System.out.println("��й�ȣ ���濡 �����߽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}
	
	public void changeName() {
		while(true) {
			System.out.print("���̵� : ");
			String id = sc.nextLine();
			
			System.out.print("��й�ȣ : ");
			String nowPassword = sc.next();
			
			mc.logIn(id, nowPassword);
		}
	}
	
	public void sameName() {
		System.out.print("�˻��� �̸� : ");
		String name = sc.next();
		
		mc.sameName(name);
		
	}
}
