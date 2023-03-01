package com.example.SpringBoot_Lezione2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.example.SpringBoot_Lezione2.classes.Address;
import com.example.SpringBoot_Lezione2.classes.Persona;
import com.example.SpringBoot_Lezione2.classes.Phone;

public class PersonaTest {
	
	private Persona p;
	
	@Before
	public void beforePersona() {
		Phone ph = new Phone("+39 123456789");
		Address ad = new Address("Via abc, 10");
		p = new Persona("Mario Rossi", ph, ad);
	}

	@Test
	public void testGetFullName() {
		assertEquals("Mario Rossi", p.getFullName());
	}

}
