package com.example.SpringBoot_Lezione4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBoot_Lezione4.model.User;
import com.example.SpringBoot_Lezione4.repository.UserDaoJdbc;

@Service
public class UserService {
	
	@Autowired UserDaoJdbc jdbc;

	public User createTestUser() {
		/*User u1 = User.builder().name("Mario").lastname("Rossi").city("Roma").age(25).email("m.rossi@example.com").build();
		
		User u3 = new User();
		u3.setName("Mario");
		u3.setLastname("Rossi");
		u3.setCity("Roma");
		u3.setAge(25);
		u3.setEmail("m.rossi@example.com");*/
		
		User u = new User("Giuseppe", "Verdi", "Napoli", 49, "g.verdi@example.com");
		
		return u;
	
	}
	
	public void insertUser() {
		jdbc.createUser(createTestUser());
	}
	
	public User getUserByID(Long id) {
		return jdbc.getUserByID(id);
	}
	
	public void updateUser(User user) {
		jdbc.updateUser(user);
	}
	
	public void removeUser(Long id) {
		jdbc.removeUser(id);
	}
	
	public List<User> getAllUser() {
		return jdbc.getAllUsers();
	}
	

}
