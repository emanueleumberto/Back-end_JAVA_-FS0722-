package com.example.SpringBoot_Lezione7.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBoot_Lezione7.models.User;
import com.example.SpringBoot_Lezione7.repositorys.UserPageableRepository;

@RestController
@RequestMapping("/users/pageable")
public class UserPageableController {
	
	@Autowired UserPageableRepository userPage;
	
	@GetMapping
	public ResponseEntity<Page<User>> getPageableUsers(Pageable pageable) {
		//http://localhost:8080/users/pageable?size=2&page=0&sort=id,DESC
		return new ResponseEntity<Page<User>>(userPage.findAll(pageable), HttpStatus.OK);
	}

}
