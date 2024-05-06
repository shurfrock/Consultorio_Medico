package com.componentes;

public class Sintoma {
	
	private int id;
	private String nombre;
	
	public Sintoma(String nombre) {
		this.id = -1;
		this.nombre = nombre;
	}
	
	public Sintoma(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getId() {
		return this.id;
	}
}