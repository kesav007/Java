package com.kesav;

import javax.persistence.Embeddable;

@Embeddable
public class Book {

	private String name;
	private String isbn;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String name, String isbn) {
		this.name = name;
		this.isbn = isbn;
	}

}
