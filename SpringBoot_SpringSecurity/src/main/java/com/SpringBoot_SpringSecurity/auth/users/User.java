package com.SpringBoot_SpringSecurity.auth.users;

import java.util.HashSet;
import java.util.Set;

import com.SpringBoot_SpringSecurity.auth.roles.Role;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "be_service_users", uniqueConstraints = { @UniqueConstraint(columnNames = "username"),
		@UniqueConstraint(columnNames = "email") })
@Data
@NoArgsConstructor
@ToString
public class User {

	@Id
	//@SequenceGenerator(name = "be_service_users_seq", sequenceName = "be_service_users_seq", allocationSize = 1)
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "be_service_users_seq")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	@Size(max = 20)
	private String username;

	@NotBlank
	@Size(max = 50)
	@Email
	private String email;

	@NotBlank
	@Size(max = 120)
	private String password;

	@Size(max = 50)
	private String nome;

	@Size(max = 50)
	private String cognome;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "be_service_user_roles", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles = new HashSet<>();

	public User(Long id, @NotBlank @Size(max = 20) String username, @NotBlank @Size(max = 50) @Email String email,
			@NotBlank @Size(max = 120) String password, @Size(max = 50) String nome, @Size(max = 50) String cognome) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.nome = nome;
		this.cognome = cognome;
	}

}
