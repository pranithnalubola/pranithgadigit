package com.springbootannotations.SpringBoot_Annotations.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootannotations.SpringBoot_Annotations.entity.Products;

public interface ProductRepository extends JpaRepository<Products, Long> {

}
