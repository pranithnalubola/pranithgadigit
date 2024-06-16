package com.springbootannotations.SpringBoot_Annotations.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootannotations.SpringBoot_Annotations.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
