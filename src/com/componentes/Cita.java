package com.componentes;

public class Cita {

	private Paciente paciente;
	private Doctor doctor;
	private Fecha fecha;
	private String estatus;
	
	public Cita(Paciente p, Doctor d, Fecha f) {
		this.paciente = p;
		this.doctor = d;
		this.fecha = f;
	}
	
	public void setPaciente(Paciente p) {
		this.paciente = p;
	}
	
	public void setDoctor(Doctor d) {
		this.doctor = d;
	}
	
	public void setFecha(Fecha f) {
		this.fecha = f;
	}
	
	public void setEstatus(String e) {
		this.estatus = e;
	}
	
	public String getInformacionCita() { // pendiente de implementar
		return null;
	}
}
