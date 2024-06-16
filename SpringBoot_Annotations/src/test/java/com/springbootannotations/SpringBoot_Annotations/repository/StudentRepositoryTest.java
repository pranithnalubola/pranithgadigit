package com.springbootannotations.SpringBoot_Annotations.repository;

import static org.assertj.core.api.Assertions.offset;

import java.util.Set;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;

import com.springbootannotations.SpringBoot_Annotations.entity.Book;
import com.springbootannotations.SpringBoot_Annotations.entity.Student;

@SpringBootTest
@Component
public class StudentRepositoryTest {

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private BookRepository bookRepository;
	
	/*
	 * @Test void testManytoOne() { Book b1 = new Book(); Book b2 = new Book(); Book
	 * b3 = new Book(); b1.setBid(100); b2.setBid(101); b3.setBid(102);
	 * b1.setBname("DS"); b2.setBname("SB"); b3.setBname("SD");
	 * bookRepository.save(b1); bookRepository.save(b2); bookRepository.save(b3);
	 * 
	 * Set<Book> set1 = Set.of(b1,b2); Set<Book> set2 = Set.of(b3,b2); Set<Book>
	 * set3 = Set.of(b1,b3);
	 * 
	 * Student s1 = new Student(); Student s2 = new Student(); Student s3 = new
	 * Student(); s1.setSid(10); s1.setSname("Nalubola"); s1.setSet(set1);
	 * s2.setSid(11); s2.setSname("Pranith"); s2.setSet(set2); s3.setSid(12);
	 * s3.setSname("Sagar"); s3.setSet(set3); studentRepository.save(s1);
	 * studentRepository.save(s2); studentRepository.save(s3);
	 * 
	 * }
	 */
}
