package com.springbootannotations.SpringBoot_Annotations.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springbootannotations.SpringBoot_Annotations.controller.PizzaController;
import com.springbootannotations.SpringBoot_Annotations.service.Pizza;
import com.springbootannotations.SpringBoot_Annotations.service.VegPizza;

@Configuration
public class Config {
	@Bean
	public Pizza vegPizza() {
		return new VegPizza();
	}
	
	@Bean
	public PizzaController pizzaController() {
		return new PizzaController(new VegPizza());
	}
}
