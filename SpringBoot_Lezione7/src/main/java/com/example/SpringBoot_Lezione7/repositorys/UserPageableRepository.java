package com.example.SpringBoot_Lezione7.repositorys;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.SpringBoot_Lezione7.models.User;

public interface UserPageableRepository extends PagingAndSortingRepository<User, Long> {

}
