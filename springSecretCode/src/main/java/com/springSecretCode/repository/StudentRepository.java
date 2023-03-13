package com.springSecretCode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springSecretCode.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
