package com.learn.mongodb.springbootmongodbexample.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.learn.mongodb.springbootmongodbexample.model.Users;
import com.learn.mongodb.springbootmongodbexample.repository.UserRepository;

@EnableMongoRepositories(basePackages="com.learn.mongodb.springbootmongodbexample.repository")
@Configuration
public class MongoDBConfig {
	
	@Bean
	CommandLineRunner commandLineRunner(UserRepository userRepository) {
		return args -> {
			userRepository.save(new Users(1, "Peter", "Development", 5000L));
			userRepository.save(new Users(2, "Sam", "Operations", 3000L));
		};
				
	}

}
