package corso.java;

public class Persona {
	
	String name;
	Telefono telefono;
	
	public Persona(String name) {
		super();
		this.name = name;
	}
	
	
	public Persona(String name, Telefono telefono) {
		super();
		this.name = name;
		//this.telefono = new Telefono("Iphone", "+39 123.4567890");
		this.telefono = telefono;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Telefono getTelefono() {
		return telefono;
	}


	public void setTelefono(Telefono telefono) {
		this.telefono = telefono;
	}
	
	

}
