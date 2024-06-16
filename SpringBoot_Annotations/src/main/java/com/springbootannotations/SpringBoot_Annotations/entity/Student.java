package com.springbootannotations.SpringBoot_Annotations.entity;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Student {

	

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	

	@Id
	int sid;
	
	String sname;
	
	@ManyToMany
	@JoinTable(name ="Stu_book",
			 joinColumns=
	            @JoinColumn(name="stu_ID"),
	        inverseJoinColumns=
	            @JoinColumn(name="book_ID")
)
	Set<Book> set;

	public Set<Book> getSet() {
		return set;
	}

	public void setSet(Set<Book> set) {
		this.set = set;
	}
	
	
	
	
}
