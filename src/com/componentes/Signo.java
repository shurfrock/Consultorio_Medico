package com.componentes;

public class Signo {

	private int id;
	private String nombre;
	
	public Signo(String nombre) {
		id = -1;
		this.nombre = nombre;
	}
	
	public Signo(int id, String nombre) {
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
