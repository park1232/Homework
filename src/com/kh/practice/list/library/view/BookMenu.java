package com.kh.practice.list.library.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {
	Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();
	
	public void mainMenu() {
		System.out.println("== Welcome KH Library ==");
		
		while(true) {
			System.out.println("******* ���� �޴� *******");
			System.out.println("1. �� ���� �߰�");
			System.out.println("2. ���� ��ü ��ȸ");
			System.out.println("3. ���� �˻� ��ȸ");
			System.out.println("4. ���� ����");
			System.out.println("9. ����");
			System.out.print("�޴� ��ȣ ���� : ");
			int num = Integer.parseInt(sc.nextLine());
			
			switch(num) {
			case 1: insertBook();
					break;
					
			case 2: selectList();
					break;
					
			case 3: searchBook();
					break;
					
			case 4: deleteBook();
					break;
					
			case 9: System.out.println("���α׷��� �����մϴ�.");
					return;
					
			default : System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���");
			}
		}
	}
	
	public void insertBook() {
		System.out.println("===== �� ���� �߰� =====");
		System.out.println("å ������ �Է����ּ���.");
		System.out.print("���� �� : ");
		String title = sc.nextLine();
		
		System.out.print("���� �� : ");
		String author = sc.nextLine();
		
		System.out.print("�帣(1.�ι� / 2.���� / 3.�ܱ��� / 4.��Ÿ : ");
		int select = Integer.parseInt(sc.nextLine());
		
		String category = null;
		
		switch(select) {
		case 1: category = "�ι�"; 
				break;
				
		case 2: category = "����";
				break;
				
		case 3: category = "�ܱ���";
				break;
				
		case 4: category = "��Ÿ";
				break;
		}
		
		System.out.print("���� : ");
		int price = Integer.parseInt(sc.nextLine());
		
		Book book = new Book(title, author, category, price);
		bc.insertBook(book);
	}
	
	public void selectList() {
		System.out.println("�����ϴ� ������ �����ϴ�.");
		ArrayList<Book> bookList = bc.selectList();
		
		if(bookList.isEmpty()) {
			System.out.println("�����ϴ� ������ �����ϴ�.");
		} else {
			for(int i = 0; i < bc.selectList().size(); i++) {
				System.out.println(bookList.get(i));
			}
		}
	}
	
	public void searchBook() {
		System.out.println("===== ���� �˻� =====");
		System.out.print("�˻� Ű���� : ");
		String keyWord = sc.nextLine();
		
		ArrayList<Book> searchList = bc.searchBook(keyWord);
		
		if(searchList.isEmpty()) {
			System.out.println("�˻� ����� �����ϴ�.");
		} else {
			for(int i = 0; i < searchList.size(); i++) {
				System.out.println(searchList.get(i));
			}
		}
	}
	
	public void deleteBook() {
		System.out.println("===== ���� ���� =====");
		System.out.print("������ ���� �� : ");
		String title = sc.nextLine();
		
		System.out.print("������ ���� �� : ");
		String author = sc.nextLine();
		
		Book remove = bc.deleteBook(title, author);
		
		if(remove != null) {
			System.out.println("���������� �����Ǿ����ϴ�.");
		} else {
			System.out.println("������ ������ ã�� ���߽��ϴ�.");
		}
	}
}
