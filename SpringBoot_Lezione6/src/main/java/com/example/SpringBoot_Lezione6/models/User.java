package com.example.SpringBoot_Lezione6.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
	
	private String name;
	private String email;
	private String password;

}
