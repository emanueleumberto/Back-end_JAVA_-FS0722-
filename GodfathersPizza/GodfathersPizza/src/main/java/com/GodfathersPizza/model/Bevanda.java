package com.GodfathersPizza.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Bevanda extends Prodotto {
	
	double calorie;

	public Bevanda(String nome, double prezzo, double calorie) {
		super(nome, prezzo);
		this.calorie = calorie;
	}
	
}
