package com.springSecretCode.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.springSecretCode.model.Student;
import com.springSecretCode.service.StudentService;

@Component
public class StudentRunner implements ApplicationRunner{
	
	@Autowired StudentService studentService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Run...");
		//setStudents();
		getAllStudents();
	}
	
	private void setStudents() {
		Student s1 = Student.builder()
							.name("Mario")
							.lastname("Rossi")
							.city("Roma")
							.age(25)
							.secretCode("123")
							.build();
		System.out.println(studentService.addStudent(s1));
		
		Student s2 = Student.builder()
				.name("Giuseppe")
				.lastname("Verdi")
				.city("Milano")
				.age(49)
				.secretCode("964")
				.build();
		System.out.println(studentService.addStudent(s2));
		
		Student s3 = Student.builder()
				.name("Francesca")
				.lastname("Neri")
				.city("Napoli")
				.age(33)
				.secretCode("953")
				.build();
		System.out.println(studentService.addStudent(s3));
	}
	
	private void getAllStudents() {
		List<Student> listaStudenti = studentService.getAllStudents();
		listaStudenti.forEach(s -> System.out.println(s));
	}
	
	

}
