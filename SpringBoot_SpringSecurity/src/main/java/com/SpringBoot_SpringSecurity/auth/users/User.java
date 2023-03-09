package com.SpringBoot_SpringSecurity.auth.users;

import java.util.HashSet;
import java.util.Set;

import com.SpringBoot_SpringSecurity.auth.roles.Role;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="users", uniqueConstraints = {
		@UniqueConstraint(columnNames = "username"),
		@UniqueConstraint(columnNames = "email")})
@NoArgsConstructor
@Data
@ToString
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Size(min=5, max=10)
	private String username;
	private String name;
	private String lastname;
	
	@Email
	private String email;
	@Size(min=8)
	private String password;
	
	@ManyToMany()
	@JoinTable(name = "users_roles", 
				joinColumns = @JoinColumn(name= "user_id"),
				inverseJoinColumns = @JoinColumn(name="role_id")
			)
	private Set<Role> roles = new HashSet<>();
	
}
