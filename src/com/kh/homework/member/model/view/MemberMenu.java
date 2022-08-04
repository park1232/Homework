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
			System.out.println("최대 등록 가능한 회원 수는" + maxMember + "명입니다.");
			System.out.println("현재 등록된 회원 수는" + nowMember + "명입니다.");
			
			if(nowMember < maxMember) {
				Scanner sc = new Scanner(System.in);
				System.out.println("1. 새 회원 등록");
				System.out.println("2. 회원 검색");
				System.out.println("3. 회원 정보 수정");
				System.out.println("4. 회원 삭제");
				System.out.println("5. 모두 출력");
				System.out.println("9. 끝내기");
				System.out.print("메뉴 번호 : ");
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
							  System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
						  }
				}
				break;
			} else if(nowMember == maxMember) {
				Scanner sc = new Scanner(System.in);
				System.out.println("2. 회원 검색");
				System.out.println("3. 회원 정보 수정");
				System.out.println("4. 회원 삭제");
				System.out.println("5. 모두 출력");
				System.out.println("9. 끝내기");
				System.out.print("메뉴 번호 : ");
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
							  System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
						  }
				}
				break;
			}
		} 
	}
					
	public void insertMember() {
		while(true) {
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			if(mc.checkId(id)) {
				break;
			} else {
				System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			}
		}

		System.out.println("이름 : ");
		String name = sc.nextLine();
		System.out.println("비밀번호 : ");
		String password = sc.nextLine();
		System.out.println("이메일 : ");
		String email = sc.nextLine();

		while(true) {
			System.out.println("성별(M/F) : ");
			char gender = sc.nextLine().charAt(0);
			if(gender == 'F' || gender == 'M') {
				break;
			} else {
				System.out.println("성별을 다시 입력하세요.");
			}
		}
		
		System.out.println("나이 : ");
		int age = sc.nextInt();
		
	}

	public void searchMember() {
		System.out.println("1. 아이디로 검색하기");
		System.out.println("2. 이름으로 검색하기");
		System.out.println("3. 이메일로 검색하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호");
		int num = sc.nextInt();
		
		switch(num) {
		case 1: searchId();
				break;
		case 2: searchName();
				break;
		case 3: searchEmail();
				break;
		case 9: System.out.println("메인으로 돌아갑니다.");
				mainMenu();
				break;
		default : System.out.println("잘못 입력하셨습니다.");
		        mainMenu();
		}
	}
	
	public void searchId() {
		System.out.print("검색할 아이디");
		String id = sc.nextLine();
		mc.searchId(id);
	}
	
	public void searchName() {
		System.out.print("검색할 이름");
		String name = sc.nextLine();
		mc.searchName(name);
	}
	
	public void searchEmail() {
		System.out.print("검색할 이메일");
		String email = sc.nextLine();
		mc.searchEmail(email);
	}
	
	public void updateMember() {
		System.out.println("1. 비밀번호 수정하기");
		System.out.println("2. 이름 수정하기");
		System.out.println("3. 이메일 수정하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호");
		int num = sc.nextInt();
		
		switch(num) {
		case 1: updatePassword();
				break;
		case 2: updateName();
				break;
		case 3: updateEmail();
				break;
		case 9: System.out.println("메인으로 돌아갑니다.");
				mainMenu();
				break;
		default : System.out.println("잘못 입력하셨습니다.");
		        mainMenu();
		}
	}
	
	public void updatePassword() {
		System.out.print("수정할 회원의 아이디 : ");
		String id = sc.nextLine();
		System.out.print("수정할 비밀번호 : ");
		String password = sc.nextLine();
		mc.updatePassword(id, password);
		
		if(mc.updatePassword != true) {
			mainMenu();
		}
	}
	
	public void updateName() {
		System.out.print("수정할 회원의 아이디 : ");
		String id = sc.nextLine();
		System.out.print("수정할 이름 : ");
		String name = sc.nextLine();
		mc.updateName(id, name);
		
		if(mc.updateName != true) {
			mainMenu();
		}
	}
	
	public void updateEmail() {
		System.out.print("수정할 회원의 아이디 : ");
		String id = sc.nextLine();
		System.out.print("수정할 이메일 : ");
		String email = sc.nextLine();
		mc.updatePassword(id, email);
		
		if(mc.updateEmail != true) {
			mainMenu();
		}	
	}
	
	public void deleteMember() {
		System.out.println("1. 특정 회원 삭제하기");
		System.out.println("2. 모든 회원 삭제하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호");
		int num = sc.nextInt();
		
		switch(num) {
		case 1: deleteOne();
				break;
		case 2: deleteAll();
				break;
		case 9: System.out.println("메인으로 돌아갑니다.");
				mainMenu();
				break;
		default : System.out.println("잘못 입력하셨습니다.");
		        mainMenu();
		}
	}
	
	public void deleteOne() {
		System.out.print("삭제할 회원의 아이디 : ");
		String id = sc.nextLine();
		System.out.println("정말 삭제하시겠습니까?(y/n)");
		char ans = sc.nextLine().charAt(0);
		if(ans == 'y' || ans == 'Y') {
			mc.deleteMember(id);
		} else if (ans == 'n' || ans == 'N') {
			mainMenu();
		}
		
	}
	
	public void deleteAll() {
		System.out.println("정말 삭제하시겠습니까?(y/n)");
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