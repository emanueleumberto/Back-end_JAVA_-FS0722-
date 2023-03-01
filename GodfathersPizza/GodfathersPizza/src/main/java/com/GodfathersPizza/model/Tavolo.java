package com.GodfathersPizza.model;

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
public class Tavolo {
	
	int numero;
	int numeroMassimoCoperti;
	boolean stato;

}
