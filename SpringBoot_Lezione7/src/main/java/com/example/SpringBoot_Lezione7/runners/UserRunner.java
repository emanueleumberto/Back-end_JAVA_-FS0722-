package com.example.SpringBoot_Lezione7.runners;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.SpringBoot_Lezione7.models.User;
import com.example.SpringBoot_Lezione7.services.UserService;

@Component
public class UserRunner implements ApplicationRunner {
	
	@Autowired UserService userService;
	
	@Autowired
	@Qualifier("AdminUserBean")
	ObjectProvider<User> userAdmin;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Run...");
		
		//userService.createUser(userAdmin.getObject());
	}

}
