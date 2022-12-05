package com.Bookstore.BookstoreProject.model;

public class BookDetails {

	private Long Id;
	
	private String Bookname;
	
	private String author;
	
	private double price;
	
	private String category;
	
	private String description;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getBookname() {
		return Bookname;
	}

	public void setBookname(String bookname) {
		Bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
