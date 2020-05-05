package com.learn.mongodb.springbootmongodbexample.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "book")
public class Book {

	@Id
	private Integer id;
	private String bookName;
	private String authorName;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(Integer id, String bookName, String authorName) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.authorName = authorName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", authorName=" + authorName + "]";
	}

}
