package com.springbootannotations.SpringBoot_Annotations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springbootannotations.SpringBoot_Annotations.configuration.Config;
import com.springbootannotations.SpringBoot_Annotations.controller.PizzaController;
import com.springbootannotations.SpringBoot_Annotations.lazy.LazyLoader;
import com.springbootannotations.SpringBoot_Annotations.service.VegPizza;

@SpringBootApplication
public class SpringBootAnnotationsApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootAnnotationsApplication.class,
				  args);
		
		/*
		 * var context = SpringApplication.run(SpringBootAnnotationsApplication.class,
		 * args); PizzaController pz = context.getBean(PizzaController.class);
		 * System.out.println(pz.getPizza());
		 * 
		 * LazyLoader lz = context.getBean(LazyLoader.class);
		 */
			/*
			 * VegPizza vegPizza = context.getBean(VegPizza.class);
			 * System.out.println(vegPizza.getPizza());
			 */
		
		
	}

}
