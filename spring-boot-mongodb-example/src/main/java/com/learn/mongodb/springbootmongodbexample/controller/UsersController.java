package com.learn.mongodb.springbootmongodbexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping("/add")
	public Users saveBook(@RequestBody Users user){
		return repository.save(user);
	}
	
	@GetMapping("/getByName/{name}")
	public List<Users> getUserByName(@PathVariable String name){
		return repository.findByName(name);
	}
	
	@GetMapping("/getByCity/{cityName}")
	public List<Users> getUserByCity(@PathVariable String cityName){
		return repository.findByCity(cityName);
	}
}
