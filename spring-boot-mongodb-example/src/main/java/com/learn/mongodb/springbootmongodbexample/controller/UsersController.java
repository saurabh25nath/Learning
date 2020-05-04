package com.learn.mongodb.springbootmongodbexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.mongodb.springbootmongodbexample.model.Users;
import com.learn.mongodb.springbootmongodbexample.repository.UserRepository;

@RestController
@RequestMapping("v1/rest/users")
public class UsersController {

	@Autowired
	UserRepository repository;
	
	@RequestMapping("/all")
	public List<Users> getAll(){
		return repository.findAll();
	}
}
