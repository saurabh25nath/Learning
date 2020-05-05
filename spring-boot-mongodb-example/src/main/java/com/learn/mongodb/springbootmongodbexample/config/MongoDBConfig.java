package com.learn.mongodb.springbootmongodbexample.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.learn.mongodb.springbootmongodbexample.model.Users;
import com.learn.mongodb.springbootmongodbexample.repository.UserRepository;
import com.mongodb.MongoClient;

@EnableMongoRepositories(basePackages="com.learn.mongodb.springbootmongodbexample.repository")
@Configuration
public class MongoDBConfig extends AbstractMongoConfiguration{
	
	@Value("${spring.data.mongodb.host}")
	private String host;
	@Value("${spring.data.mongodb.database}")
	private String database;
	
	
	@Override
	protected String getDatabaseName() {
		return database;
	}
	
	@Override
	public MongoClient mongoClient() {
		return new MongoClient(host);
	}
	
	@Bean
	public GridFsTemplate gridFsTemplate() throws Exception {
		return new GridFsTemplate(mongoDbFactory(), mappingMongoConverter());
	}

}
