package com.GodfathersPizza.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Setter
@Getter
@ToString
public class Pizza extends Prodotto {
	
	double calorie;
	
	public Pizza(String nome, double prezzo, double calorie) {
		super(nome, prezzo);
		this.calorie = calorie;
	}


}
