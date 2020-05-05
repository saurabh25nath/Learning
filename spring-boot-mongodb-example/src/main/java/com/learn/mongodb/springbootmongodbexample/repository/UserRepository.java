package com.learn.mongodb.springbootmongodbexample.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.learn.mongodb.springbootmongodbexample.model.Users;

public interface UserRepository extends MongoRepository<Users, Integer> {

	List<Users> findByName(String name);

	@Query("{'UserAddress.city' :?0}")
	List<Users> findByCity(String cityName);

}
