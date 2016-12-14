package com.ngx20080110.service;

import com.ngx20080110.bean.Book;

public class BookService {
	public Book[] getBooks() {
		return new Book[] {
			new Book("Java", "James Gosling"),
			new Book("Oracle", "Lawrence J. Ellison"),
			new Book("Linux", "Linus")
		};
	}
}
