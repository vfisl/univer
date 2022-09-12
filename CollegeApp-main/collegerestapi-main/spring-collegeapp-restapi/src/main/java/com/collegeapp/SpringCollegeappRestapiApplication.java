package com.collegeapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.collegeapp.repository.CollegeRepository;

@SpringBootApplication
public class SpringCollegeappRestapiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringCollegeappRestapiApplication.class, args);
	}
	@Autowired
	CollegeRepository collegeRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	
    
}
