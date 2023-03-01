package com.example.SpringBoot_Lezione2;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.example.SpringBoot_Lezione2.classes.Box;



@RunWith(Parameterized.class)
public class BoxTestParameterized {
	
	private Box b;
	private int x;
	private int y;
	private int result;
	private String name;
	
	public BoxTestParameterized(int result, int x, int y) {
		this.result = result;
		this.x = x;
		this.y = y;
		this.name = "Test";
	}
	
	@Parameters
	public static Collection testCaseParameterized() {
		return Arrays.asList(
				new Integer[][] {
					{200, 20, 10},
					{300, 30, 10},
					{200, 40, 10},
					{400, 40, 10}
				}
				);
	}

	@Before
	public void beforeTest() {
		b = new Box(x, y, name);
	}
	
	@Test
	public void testArea() {
		assertEquals(result, b.getArea());
	}

}
