package com.springboot.crudapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.crudapi.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
