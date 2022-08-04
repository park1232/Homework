package com.kh.homework.member.controller;

import com.kh.homework.member.model.vo.Member;

public class MemberController {
	private Member[] m = new Member[SIZE];
	public static final int SIZE = 10;
	
	public int existMemberNum() {
		int count = 0;
		
		for(int i = 0; i < m.length; i++) {
			Member member = m[i];
			if(member != null) {
				count++;
			} else if(member == null) {
				break;
			}
		}
		
		return count;
	}
	
	public boolean checkId(String inputId) {
		for(int i = 0; i < m.length; i++) {
			if(m[i].getId() == inputId) {
				return false;
			}
		}
		return true;
	}
	
	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		int num = existMemberNum();
		m[num] = new Member();
		
	}
	
	public String searchId(String id) {
		for(int i = 0; i < m.length; i++) {
			if(m[i].getId() == id) {
				System.out.println("ã���� ȸ�� ��ȸ ����Դϴ�.");
				m[i].inform();
				break;
			} else if(m[i].getId() != id) {
				System.out.println("�˻� ����� �����ϴ�.");
			}
		}
		return id;
	}
	
	public Member[] searchName(String name) {
		Member[] samName = null;
		for(int i = 0; i < m.length; i++) {

			if(m[i].getName() == name) {
				System.out.println("ã���� ȸ�� ��ȸ ����Դϴ�.");
				samName = new Member[i];
				samName[i] = m[i].inform();
			} else if(m[i].getName() != name) {
				System.out.println("�˻� ����� �����ϴ�.");
			}
		}
		return samName;
	}
	
	public Member[] searchEmail(String email) {
		Member[] samEmail = null;
		for(int i = 0; i < m.length; i++) {
			
			if(m[i].getEmail() == email) {
				System.out.println("ã���� ȸ�� ��ȸ ����Դϴ�.");
				samEmail = new Member[i];
				samEmail[i] = m[i].inform();
			} else if(m[i].getEmail() != email) {
				System.out.println("�˻� ����� �����ϴ�.");
			}
		}
		return samEmail;
	}
	
	public boolean updatePassword(String id, String password) {
		for(int i = 0; i < m.length; i++) {
			if(m[i].getId() == id) {
				m[i].setPassword(password);
				System.out.println("������ ���������� �Ǿ����ϴ�.");
				break;
			} else if(m[i].getId() != id) {
				System.out.println("�������� �ʴ� ���̵��Դϴ�.");
				return false;
			}
		}
		return true; 
	}
	
	public boolean updateName(String id, String name) {
		for(int i = 0; i < m.length; i++) {
			if(m[i].getId() == id) {
				m[i].setName(name);
				System.out.println("������ ���������� �Ǿ����ϴ�.");
				break;
			} else if(m[i].getId() != id) {
				System.out.println("�������� �ʴ� ���̵��Դϴ�.");
				return false;
			}
		}
		return true; 
	}
	
	public boolean updateEmail(String id, String email) {
		for(int i = 0; i < m.length; i++) {
			if(m[i].getId() == id) {
				m[i].setEmail(email);
				System.out.println("������ ���������� �Ǿ����ϴ�.");
				break;
			} else if(m[i].getId() != id) {
				System.out.println("�˻� ����� �����ϴ�.");
				return false;
			}
		}
		return true; 
	}
	
	public boolean deleteMember(String id) {
		for(int i = 0; i < m.length; i++) {
			if(m[i].getId() == id) {
				m[i] = null;
				System.out.println("���������� �����Ͽ����ϴ�.");
				break;
			} else if (m[i].getId() != id) {
				System.out.println("�������� �ʴ� ���̵��Դϴ�.");
			}
		} 
		
		return true;
	}
	
	public void delete() {
		for(int i = 0; i < m.length; i++) {
			m[i] = null;
			System.out.println("���������� �����Ͽ����ϴ�.");
		} 
	}
	
	public Member[] printAll() {
		return m;
	}
}