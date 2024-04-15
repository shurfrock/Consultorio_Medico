package com.componentes;
import java.util.List;

public class Enfermedad {
	
	private int id;
	private String nombre;
	private List<Signo> signos;
	private List<Sintoma> sintomas;	
	
	public Enfermedad(String nombre, List<Signo> signos, List<Sintoma> sintomas) {
		this.nombre = nombre;
		this.signos = signos;
		this.sintomas = sintomas;
	}
	
	public Enfermedad(int id, String nombre, List<Signo> signos, List<Sintoma> sintomas) {
		this.id = id;
		this.nombre = nombre;
		this.signos = signos;
		this.sintomas = sintomas;
	}
	
	public void setEnfermedad(String nombre) {
		this.nombre = nombre;
	}
	
	public void setSignos(List<Signo> signos) {
		this.signos = signos;
	}
	
	public void setSintomas(List<Sintoma> sintomas) {
		this.sintomas = sintomas;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public List<Signo> getSignos(){
		return this.signos;
	}
	
	public List<Sintoma> getSintomas(){
		return this.sintomas;
	}
}