package com.example.SpringBoot_Lezione4.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.SpringBoot_Lezione4.model.User;
import com.example.SpringBoot_Lezione4.service.UserService;

@Component
public class UserRunner implements CommandLineRunner {
	
	@Autowired UserService userService;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("UserRunner...");

		//userService.insertUser();
		//User user = userService.getUserByID(2l);
		//user.setCity("Milano");
		//System.out.println(user);
		//userService.updateUser(user);
		//userService.removeUser(user.getId());
		
		List<User> userlist = userService.getAllUser();
		userlist.forEach(u -> System.out.println(u));
		
	}

}
