package com.mongo.repository.mongo_repository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class MongoRepositoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoRepositoryApplication.class, args);
	}

}
