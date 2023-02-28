package com.example.SpringBoot_Lezione2.classes;

import org.springframework.beans.factory.annotation.Value;

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
public class Box {
	
	private int x;
	private int y;
	
	private String name;
	
	public int getArea() {
		return x * y;
	}
	
	public int getPerimeter() {
		return (x + y) * 2;
	}

	public Box(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

}
