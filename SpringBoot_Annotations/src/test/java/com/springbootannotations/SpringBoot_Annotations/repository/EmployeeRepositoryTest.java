package com.springbootannotations.SpringBoot_Annotations.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springbootannotations.SpringBoot_Annotations.entity.Employee;

@SpringBootTest
public class EmployeeRepositoryTest {
    
	@Autowired
	private EmployeeRepository repo;
	/*
	 * @Test void testCreateEmployee() { repo.save(new Employee("A","QA",200.0));
	 * repo.save(new Employee("B","DEV",200.0)); repo.save(new
	 * Employee("C","DEVOPS",300.0)); repo.save(new Employee("D","TEST",200.0));
	 * repo.save(new Employee("E","DEVOPS",200.0)); repo.save(new
	 * Employee("F","QA",200.0)); repo.save(new Employee("G","DEV",300.0));
	 * repo.save(new Employee("H","QA",200.0)); repo.save(new
	 * Employee("I","DEVOPS",200.0)); repo.save(new Employee("J","QA",800.0));
	 * 
	 * 
	 * }
	 */
	
	/*void testSelectQuery() {
		 repo.fetchEmployeeByIdRange(3,7).forEach(System.out::println); 
		repo.findAll().forEach(System.out::println);
	}*/
}
