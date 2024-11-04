package com.web.binding;

public class Book {

	private String bookname;
	private String author;
	private Double price;
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookname=" + bookname + ", author=" + author + ", price=" + price + "]";
	}
	
	
	
	
}
