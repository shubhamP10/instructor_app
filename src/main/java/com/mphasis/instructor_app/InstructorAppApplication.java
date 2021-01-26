package com.mphasis.instructor_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource({"classpath:application.properties"})
public class InstructorAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(InstructorAppApplication.class, args);
	}

}
