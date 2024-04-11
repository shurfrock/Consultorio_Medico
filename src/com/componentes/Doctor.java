package com.componentes;
import com.constantes.ConstantesComponentes;

public class Doctor extends Usuario implements ConstantesComponentes{
	
	private String cedulaProfesional;
	
	private boolean esCedulaProfesionalValida(String cedulaProfesional) {
		return cedulaProfesional.length() == TAM_MAX_CEDULA ? true : false;
	}
	
	public Doctor(String nombre, String apellido, char sexo, short edad, String estadoCivil, String domicilio,
			String curp, String numeroTelefono, String username, String password, String cedulaProfesional) {
		
		super(nombre,apellido,sexo, edad, estadoCivil, domicilio, curp, numeroTelefono, username, password);
		
		if(esCedulaProfesionalValida(cedulaProfesional)) {
			this.cedulaProfesional = cedulaProfesional;
		}else {
			this.cedulaProfesional = CEDULA_DEFECTO;
		}
	}
	
	public void setCedulaProfesional(String cedulaProfesional) {
		if(esCedulaProfesionalValida(cedulaProfesional)) {
			this.cedulaProfesional = cedulaProfesional;
		}else {
			this.cedulaProfesional = CEDULA_DEFECTO;
		}
	}
	
	public String getCedulaProfesional() {
		return this.cedulaProfesional;
	}
}
