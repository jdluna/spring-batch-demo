package com.roytuts.spring;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.roytuts.spring")
@EnableBatchProcessing
public class SpringBatch {

	public static void main(String[] args) {
		SpringApplication.run(SpringBatch.class, args);
	}

}
