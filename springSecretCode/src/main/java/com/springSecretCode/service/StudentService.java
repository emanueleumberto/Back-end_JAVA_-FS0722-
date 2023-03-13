package com.springSecretCode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springSecretCode.model.Student;
import com.springSecretCode.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired StudentRepository repo;
	
	public String addStudent(Student s) {
		repo.save(s);
		return "Student created!!";
	}
	
	public List<Student> getAllStudents() {
		return repo.findAll();
	}

}
