package com.GodfathersPizza.model;

public class PizzaFamilySize extends Pizza {
	
	private Pizza pizza;
	private double CoeffCalorie;
	private double CoeffPrezzo;
	
	
	public PizzaFamilySize(Pizza pizza) {
		super();
		this.pizza = pizza;
		this.CoeffCalorie = 1.95;
		this.CoeffPrezzo = 4.15;
	}
	
	@Override
	public String getNome() {
		return this.pizza.getNome() + " - Family Size";
	}

	@Override
	public double getCalorie() {
		return this.pizza.getCalorie() * this.CoeffCalorie;
	}


	@Override
	public double getPrezzo() {
		return this.pizza.getPrezzo() + this.CoeffPrezzo;
	}

	public Pizza getPizza() {
		return pizza;
	}

	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}
	
	public String getPizzaFamilySize() {
		return "Family Size for Pizza ("+ this.pizza.getNome() +") - Calorie: " + this.getCalorie() + " Perzzo: " + this.getPrezzo();
	}
	
}
