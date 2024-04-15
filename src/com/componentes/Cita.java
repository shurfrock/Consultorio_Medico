package com.componentes;

public class Cita {

	private Paciente paciente;
	private Doctor doctor;
	private String fecha;
	private String estatus;	
	
	public Cita(Paciente p, Doctor d, String fecha) {
		this.paciente = p;
		this.doctor = d;
		this.fecha = fecha;
		estatus = "activa";
	}
	
	public void setPaciente(Paciente p) {
		this.paciente = p;
	}
	
	public void setDoctor(Doctor d) {
		this.doctor = d;
	}
	
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}	
	
	public void setEstatus(String e) {
		this.estatus = e;
	}
	
	public Paciente getPaciente() {
		return this.paciente;
	}
	
	public Doctor getDoctor() {
		return this.doctor;
	}
	
	public String getFecha() {
		return this.fecha;
	}
	
	public String getEstatus() {
		return this.estatus;
	}
}
