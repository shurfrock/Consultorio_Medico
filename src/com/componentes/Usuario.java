package com.componentes;
import com.constantes.ConstantesComponentes;

public class Usuario implements ConstantesComponentes{
	
	private String nombre;
	private String apellido;
	private char sexo;
	private short edad;
	private String estadoCivil;
	private String domicilio;
	private String curp;
	private String numeroTelefono;
	private String username;
	private String password;
	
	private boolean esSexoValido(char sexo) {
		return sexo == MASCULINO || sexo == FEMENINO ? true : false;
	}
	
	private boolean esEdadValida(short edad) {
		return edad >= EDAD_MINIMA && edad <= EDAD_MAXIMA ? true : false;
	}
	
	private boolean esCurpValida(String curp) {
		return curp.length() == TAM_CURP ? true : false;
	}
	
	private boolean esNumeroTelefonoValido(String numeroTelefono) {
		return numeroTelefono.length() == TAM_NUMERO_TELEFONO ? true : false;
	}
	
	public Usuario(String nombre, String apellido, char sexo, short edad, String estadoCivil,
			String domicilio, String curp, String numeroTelefono, String username, String password) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		if(esSexoValido(sexo)) {
			this.sexo = sexo;	
		}else {
			this.sexo = MASCULINO;
		}
		if(esEdadValida(edad)) {
			this.edad = edad;
		}else {
			this.edad = EDAD_MINIMA;
		}
		this.estadoCivil = estadoCivil;
		this.domicilio = domicilio;
		if(esCurpValida(curp)) {
			this.curp = curp;
		}else {
			this.curp = CURP_DEFECTO;
		}
		if(esNumeroTelefonoValido(numeroTelefono)) {
			this.numeroTelefono = numeroTelefono;
		}else {
			this.numeroTelefono = NUMERO_DEFECTO;
		}
		this.username = username;
		this.password = ConvertMD5.getMD5hash(password);
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public void setSexo(char sexo) {
		if(esSexoValido(sexo)) {
			this.sexo = sexo;
		}else {
			this.sexo = MASCULINO;
		}
	}
	
	public void setEdad(short edad) {
		if(esEdadValida(edad)) {
			this.edad = edad;
		}else {
			this.edad = EDAD_MINIMA;
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
	
	public void setNumeroTelefono(String numeroTelefono) {
		if(esNumeroTelefonoValido(numeroTelefono)) {
			this.numeroTelefono = numeroTelefono;
		}else {
			this.numeroTelefono = NUMERO_DEFECTO;
		}
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setPassword(String password) {
		this.password = ConvertMD5.getMD5hash(password);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public char getSexo() {
		return this.sexo;
	}
	
	public short getEdad() {
		return this.edad;
	}
	
	public String getEstadoCivil() {
		return this.estadoCivil;
	}
	
	public String getDomicilio() {
		return this.domicilio;
	}
	
	public String getCurp() {
		return this.curp;
	}
	
	public String getNumeroTelefono() {
		return this.numeroTelefono;
	}
	
	public String getUsername() {
		return this.username;
	}
}
