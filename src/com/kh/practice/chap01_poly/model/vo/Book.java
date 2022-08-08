package com.kh.practice.chap01_poly.model.vo;

public class Book {
	private String title, author, publisher;
	
	public Book() {}
	
	public Book(String title, String author, String publisher) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getAuthor() {
		return author;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public String getpublisher() {
		return publisher;
	}
	
	@Override
	public String toString() {
		return "도서명" + title + "저자명" + author + "출판사명" + publisher;
	}
}
