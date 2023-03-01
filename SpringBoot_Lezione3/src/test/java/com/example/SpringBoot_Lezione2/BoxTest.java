package com.example.SpringBoot_Lezione2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.example.SpringBoot_Lezione2.classes.Box;

public class BoxTest {

	Box b;
	
	@BeforeClass 
	public static void beforeClassTest () {
		System.out.println("@BeforeClass");
	}

	@Before
	public void beforeTest() {
		System.out.println("@Before");
		b = new Box(20, 10, "BoxTest");
	}
	
	@Test
	public void testArea() {
		System.out.println("@Test testArea");
		//Box b = new Box(20, 10, "BoxTest");
		assertEquals("testArea Fallito per....", 200, b.getArea());
	}
	
	@Test
	public void testNotQuadrato() {
		assertTrue(b.getX() != b.getY());
	}
	
	@Test
	public void testNameNotNull() {
		assertNotNull(b.getName());
	}
	
	@Ignore
	@Test
	public void testPerimeter() {
		System.out.println("@Test testPerimeter");
		//Box b = new Box(20, 10, "BoxTest");
		assertEquals(60, b.getPerimeter());
	}
	
	@After
	public void afterTest() {
		System.out.println("@After");
	}
	
	@AfterClass 
	public static void afterClassTest () {
		System.out.println("@AfterClass ");
	}



}
