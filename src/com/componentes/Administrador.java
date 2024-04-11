package com.componentes;

public class Administrador extends Usuario{
	
	public Administrador(String nombre, String apellido, char sexo, short edad,
			String estadoCivil, String domicilio, String curp, String numeroTelefono,
			String username, String password){
		
		super(nombre, apellido, sexo, edad, estadoCivil, domicilio, curp, numeroTelefono, username, password);
	}
}
