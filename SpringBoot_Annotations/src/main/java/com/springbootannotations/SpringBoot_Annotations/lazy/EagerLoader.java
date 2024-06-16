package com.springbootannotations.SpringBoot_Annotations.lazy;

import org.springframework.stereotype.Component;

@Component
public class EagerLoader {
	
	public  EagerLoader() {
		System.out.println("Eager Loader");
	}

}
