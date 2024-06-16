package com.springbootannotations.SpringBoot_Annotations.service;

import org.springframework.stereotype.Component;

@Component
public class NonVegPizza implements Pizza{

	@Override
	public String getPizza() {
		// TODO Auto-generated method stub
		return "Its a non veg Pizza";
	}

}
