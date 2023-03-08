package com.example.SpringBoot_Lezione7.repositorys;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringBoot_Lezione7.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	
	public boolean existsByNameAndLastname(String name, String lastname);

}
