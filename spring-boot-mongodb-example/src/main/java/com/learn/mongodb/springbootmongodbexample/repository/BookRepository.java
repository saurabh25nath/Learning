package com.learn.mongodb.springbootmongodbexample.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.learn.mongodb.springbootmongodbexample.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer>{

}
