package com.springbootannotations.SpringBoot_Annotations.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootannotations.SpringBoot_Annotations.service.Book;

@RestController
public class BookController {
	
	@GetMapping("/Hello")
	@ResponseBody
	public String getBook() {
		return "Hello Book";
	}
	
	@GetMapping("Book")
	@ResponseBody
	public Book getBookDetails() {
	Book book = new Book(1,"Ramyan","Holi Boom");
	return book;
	}
	
	@PostMapping("PostBook")
	public Book postBookDetails(@RequestBody Book book) {
		System.out.println(book.getId());
		System.out.println(book.getName());
		System.out.println(book.getDescription());
		return book;
	}
	
	@PutMapping("putbook/{id}")
	public Book putBookDetails(@PathVariable int id, @RequestBody Book book) {
		book.setId(id);
		System.out.println(book.getId());
		System.out.println(book.getName());
		System.out.println(book.getDescription());
		return book;
	}

}
