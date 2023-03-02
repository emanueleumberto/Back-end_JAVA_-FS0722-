package com.example.SpringBoot_Lezione4.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.SpringBoot_Lezione4.model.User;

@Repository
public interface UserDaoRepository {
	
	public void createUser(User user);
	public void updateUser(User user);
	public void removeUser(Long id);
	public User getUserByID(Long id);
	public List<User> getAllUsers();

}
