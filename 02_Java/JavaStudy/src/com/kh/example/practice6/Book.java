package com.kh.example.practice6;

public class Book {
	private String title;
	private	String publisher;
	private	String author;
	private int price;
	private	double discountRate;
	
	public Book() {
		
	}

	
	public Book(String title, String publisher, String author) {
		super();
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}


	public Book(String title, String publisher, String author, int price, double discountRate) {
		super();
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	}
	
	public void inform() {
		
	}
}
