package com.GodfathersPizza.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class ArticoloBrand extends Prodotto {
	
	
	public ArticoloBrand(String nome, double prezzo) {
		super(nome, prezzo);
	}

}
