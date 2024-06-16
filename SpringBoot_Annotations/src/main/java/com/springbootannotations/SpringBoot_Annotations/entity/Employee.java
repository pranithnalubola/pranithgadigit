package com.springbootannotations.SpringBoot_Annotations.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity

public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String empName;
	public Employee(String empName, String empDept, Double empsal) {
		super();
		this.empName = empName;
		this.empDept = empDept;
		this.empsal = empsal;
		
	}
	
	 public Employee() {
	        // Default constructor
	    }
	private String empDept;
	private Double empsal;
	  @Override
	    public String toString() {
	        return "Employee{" +
	                "id=" + id +
	                ", empName='" + empName + '\'' +
	                ", empDept='" + empDept + '\'' +
	                ", empsal=" + empsal +
	                '}';
	    }
}
