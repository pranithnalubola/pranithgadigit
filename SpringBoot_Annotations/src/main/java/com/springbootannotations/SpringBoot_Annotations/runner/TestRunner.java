package com.springbootannotations.SpringBoot_Annotations.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springbootannotations.SpringBoot_Annotations.repository.EmployeeRepository;
@Component
public class TestRunner implements CommandLineRunner{

	@Autowired
	private EmployeeRepository repo;
	@Override
	public void run(String... args) throws Exception {
		
		 repo.fetchEmployeeByIdRange(3,7).forEach(System.out::println); 
	}

}
