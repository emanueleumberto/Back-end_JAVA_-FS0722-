package com.springSecretCode.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springSecretCode.auth.entity.ERole;
import com.springSecretCode.auth.entity.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    
	Optional<Role> findByRoleName(ERole roleName);

}
