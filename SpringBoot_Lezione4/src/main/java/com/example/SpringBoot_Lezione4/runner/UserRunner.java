package com.example.SpringBoot_Lezione4.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.SpringBoot_Lezione4.service.UserService;

@Component
public class UserRunner implements CommandLineRunner {
	
	@Autowired UserService userService;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("UserRunner...");

		userService.insertUser();
	}

}
