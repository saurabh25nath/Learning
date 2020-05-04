package com.learn.mongodb.springbootmongodbexample.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.learn.mongodb.springbootmongodbexample.model.Users;

public interface UserRepository extends MongoRepository<Users, Integer> {

}
