package com.componentes;
import com.constantes.ConstantesComponentes;

public class Paciente implements ConstantesComponentes{
	
	private String nombre;
	private String apellido;
	private short edad;
	private char sexo;
	private String estadoCivil;
	private String domicilio;
	private String curp;
	
	private boolean esSexoValido(char sexo) {
		return sexo == MASCULINO || sexo == FEMENINO ? true : false;
	}
	
	private boolean esEdadValida(short edad) {
		return edad >= EDAD_MINIMA && edad <= EDAD_MAXIMA ? true : false;
	}
	
	private boolean esCurpValida(String curp) {
		return curp.length() == TAM_CURP ? true : false;
	}
	
	public Paciente(String nombre, String apellido, short edad, char sexo, String estadoCivil,
			String domicilio, String curp) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		
		if(esEdadValida(edad)) {
			this.edad = edad;
		}else {
			this.edad = EDAD_MINIMA;
		}
		
		if(esSexoValido(sexo)) {
			this.sexo = sexo;
		}
		
		this.estadoCivil = estadoCivil;
		this.domicilio = domicilio;
		this.curp = curp;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public void setEdad(short edad) {
		if(esEdadValida(edad)) {
			this.edad = edad;
		}else {
			this.edad = EDAD_MINIMA;
		}
	}
	
	public void setSexo(char sexo) {
		if(esSexoValido(sexo)) {
			this.sexo = sexo;
		}else {
			this.sexo = MASCULINO;
		}
	}
	
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	public void setCurp(String curp) {
		if(esCurpValida(curp)) {
			this.curp = curp;
		}else {
			this.curp = CURP_DEFECTO;
		}
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public short getEdad() {
		return edad;
	}
	
	public String getSexo() {
		return this.sexo == MASCULINO ? "MASCULINO" : "FEMENINO";
	}
	
	public String getEstadoCivil() {
		return estadoCivil;
	}
	
	public String getDomicilio() {
		return domicilio;
	}
	
	public String getCurp() {
		return curp;
	}
}
