package com.springbootannotations.SpringBoot_Annotations.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springbootannotations.SpringBoot_Annotations.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	@Query("FROM Employee WHERE id>=:min and id<=:max")
	List<Employee> fetchEmployeeByIdRange(int min,int max);
}
