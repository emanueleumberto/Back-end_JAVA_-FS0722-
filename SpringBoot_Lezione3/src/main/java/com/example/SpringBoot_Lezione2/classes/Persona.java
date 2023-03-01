package com.example.SpringBoot_Lezione2.classes;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Persona {
	
	private String fullName;
	private Phone phone;
	private Address address;
	
	@Autowired
	private ArrayList<String> materiePreferite;

	public Persona(String fullName, Phone phone, Address address) {
		super();
		this.fullName = fullName;
		this.phone = phone;
		this.address = address;
		//this.materiePreferite = new ArrayList<String>();
	}
	
	
	

}
