package com.springbootannotations.SpringBoot_Annotations.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.springbootannotations.SpringBoot_Annotations.service.Pizza;
import com.springbootannotations.SpringBoot_Annotations.service.VegPizza;


public class PizzaController {
	
	private Pizza pizza;
	@Autowired
	public PizzaController(@Qualifier("vegPizza") Pizza pizza) {
		this.pizza=pizza;
	}

	 public String getPizza() {
		 return pizza.getPizza();
	 }
}
