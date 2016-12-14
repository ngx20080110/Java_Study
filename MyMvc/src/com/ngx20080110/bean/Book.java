package com.ngx20080110.bean;

public class Book {
	
	public Book() {}
	public Book(String name, String author) {
		this.author = author;
		this.name = name;
	}

	private String author;
	private String name;
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
