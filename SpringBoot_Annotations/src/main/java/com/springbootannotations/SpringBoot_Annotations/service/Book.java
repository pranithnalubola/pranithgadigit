package com.springbootannotations.SpringBoot_Annotations.service;

import org.springframework.stereotype.Component;


public class Book {
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	private String name;
	private String description;
	public Book(int id, String name, String description) {
		
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
}
