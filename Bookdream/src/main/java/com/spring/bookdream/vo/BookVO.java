package com.spring.bookdream.vo;

import java.util.Date;

public class BookVO {
	
	private int book_no;
	private double isbn_no;
	private String title;
	private String author;
	private String publisher;
	private String book_content;
	private int stock;
	private int book_price;
	private String book_img;
	private Date pblic_date;
	private String book_category;
	
	public int getBook_no() {
		return book_no;
	}
	public void setBook_no(int book_no) {
		this.book_no = book_no;
	}
	
	public double getIsbn_no() {
		return isbn_no;
	}
	public void setIsbn_no(double isbn_no) {
		this.isbn_no = isbn_no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getBook_content() {
		return book_content;
	}
	public void setBook_content(String book_content) {
		this.book_content = book_content;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getBook_price() {
		return book_price;
	}
	public void setBook_price(int book_price) {
		this.book_price = book_price;
	}
	public String getBook_img() {
		return book_img;
	}
	public void setBook_img(String book_img) {
		this.book_img = book_img;
	}


	public Date getPblic_date() {
		return pblic_date;
	}
	public void setPblic_date(Date pblic_date) {
		this.pblic_date = pblic_date;
	}
	public String getBook_category() {
		return book_category;
	}
	public void setBook_category(String book_category) {
		this.book_category = book_category;
	}

	
}
