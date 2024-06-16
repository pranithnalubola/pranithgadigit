package com.springbootannotations.SpringBoot_Annotations.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootannotations.SpringBoot_Annotations.entity.Book;

public interface BookRepository extends JpaRepository<Book,Integer>{

}
