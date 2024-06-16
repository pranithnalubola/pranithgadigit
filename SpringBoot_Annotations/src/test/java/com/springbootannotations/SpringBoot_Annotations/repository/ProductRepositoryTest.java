package com.springbootannotations.SpringBoot_Annotations.repository;

import java.math.BigDecimal;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springbootannotations.SpringBoot_Annotations.entity.Products;

@SpringBootTest

public class ProductRepositoryTest {
	
	@Autowired
	private ProductRepository productRepository;
	
	
	
	
	/*
	 * @Test void testSaveMethod() { Products product = new Products();
	 * product.setName("product1"); product.setDescription("description");
	 * product.setSku("100ABC"); product.setPrice(new BigDecimal(100));
	 * product.setImageUrl("url.png"); product.setActive(true);
	 * 
	 * Products savedObject = productRepository.save(product);
	 * 
	 * System.out.println(savedObject.getId());
	 * 
	 * }
	 * 
	 * 
	 * @Test void testUpdateSaveMethod() { Long id = 1L; Products product =
	 * productRepository.findById(id).get();
	 * product.setDescription("updated Description");
	 * product.setName("updated name"); productRepository.save(product); }
	 */
	
	/*
	 * @Test void testSaveAllMethod() { Products product = new Products();
	 * product.setName("product");
	 * product.setDescription("description for product"); product.setSku("100ABCD");
	 * product.setPrice(new BigDecimal(100)); product.setImageUrl("url1.png");
	 * product.setActive(true);
	 * 
	 * 
	 * Products product2 = new Products(); product2.setName("product2");
	 * product2.setDescription("description for product2");
	 * product2.setSku("100ABCde"); product2.setPrice(new BigDecimal(200));
	 * product2.setImageUrl("url2.png"); product2.setActive(true);
	 * 
	 * productRepository.saveAll(List.of(product, product2)); }
	 * 
	 */
	/*
	 * @Test void testSaveAllMethod() { List<Products> products =
	 * productRepository.findAll();
	 * products.forEach((p)->{System.out.println(p.getName());} ); }
	 * 
	 * @Test void testDeleteById() { Long Id = 4L; productRepository.deleteById(Id);
	 * List<Products> products = productRepository.findAll();
	 * products.forEach((p)->{System.out.println(p.getName());} ); }
	 */
}

