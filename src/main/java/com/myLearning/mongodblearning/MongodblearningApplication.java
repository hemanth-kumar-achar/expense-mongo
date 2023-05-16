package com.myLearning.mongodblearning;

import io.mongock.runner.springboot.EnableMongock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableMongock
public class MongodblearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongodblearningApplication.class, args);
	}

}
