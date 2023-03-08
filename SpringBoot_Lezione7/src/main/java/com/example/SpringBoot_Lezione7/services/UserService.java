package com.example.SpringBoot_Lezione7.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBoot_Lezione7.models.User;
import com.example.SpringBoot_Lezione7.repositorys.UserRepository;

import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;

@Service
public class UserService {
	
	@Autowired UserRepository userRepo;
	
	public User createUser(User user) {
		if(userRepo.existsByNameAndLastname(user.getName(), user.getLastname())) {
			 throw new EntityExistsException("User name and lastname exists!!");
		}
		userRepo.save(user);
		return user;
	}
	
	public List<User> getAllUsers() {
		return (List<User>) userRepo.findAll();
	}
	
	public User getUserById(Long id) {
		if(!userRepo.existsById(id)) {
			 throw new EntityNotFoundException("User not exists!!!!");
		}
		return userRepo.findById(id).get();
	}
	
	public User updateUser(User user) {
		if(!userRepo.existsById(user.getId())) {
			 throw new EntityNotFoundException("User not exists!!!!");
		}
		userRepo.save(user);
		return user;
	}
	
	public String removeUser(Long id) {
		if(!userRepo.existsById(id)) {
			 throw new EntityNotFoundException("User not exists!!!!");
		}
		userRepo.deleteById(id);
		return "User deleted!!!!";
	}

}
