package com.learn.mongodb.springbootmongodbexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.mongodb.springbootmongodbexample.model.Book;
import com.learn.mongodb.springbootmongodbexample.repository.BookRepository;

@RestController
@RequestMapping("v1/rest/book")
public class BookControler {
	
	@Autowired
	private BookRepository bookRepository;
	
	@PostMapping("/add")
	public Book saveBook(@RequestBody Book book){
		return bookRepository.save(book);
	}
	
	@GetMapping("/all")
	public List<Book> getAllBook(){
		return bookRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Book getBookById(@PathVariable int id) {
		return bookRepository.findById(id).get();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable int id) {
		 bookRepository.deleteById(id);
		 return "Book deleted with id :- "+id;
	}

}
