package com.componentes;

public class Fecha {
	
	private short dia;
	private short mes;
	private int anio;
	private String hora;
	
	private boolean esFechaValida(short dia, short mes, int anio) {
		if(dia >= 1 && dia <= 31) {
			if(mes >= 1 && mes <= 12) {
				if(anio >= 2024) {
					return true;
				}
			}
		}
		return false;
	}
	
	public Fecha(short dia, short mes, int anio, String hora) {
		if(esFechaValida(dia,mes,anio)) {
			this.dia = dia;
			this.mes = mes;
			this.anio = anio;
		}else {
			this.dia = 2;
			this.mes = 2;
			this.anio = 2024;
		}
	}
	
	public void setDia(short dia) {
		this.dia = dia;
	}
	
	public void setMes(short mes) {
		this.mes = mes;
	}
	
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	public void setHora(String hora) {
		this.hora = hora;
	}
	
	public short getDia() {
		return this.dia;
	}
	
	public short getMes() {
		return this.mes;
	}
	
	public int getAnio() {
		return this.anio;
	}
	
	public String getHora() {
		return this.hora;
	}
	
	public String getFecha() {
		String fecha, mesAnio;
		
		if(dia < 10) {
			fecha = "0" + Short.toString(dia) + " de ";
		}else {
			fecha = Short.toString(dia) + " de ";
		}
		
		mesAnio = "";
		switch(mes) {
			case 1: mesAnio = "Enero"; break;
			case 2: mesAnio = "Febrero"; break;			
			case 3: mesAnio = "Marzo"; break;			
			case 4: mesAnio = "Abril"; break;			
			case 5: mesAnio = "Mayo"; break;			
			case 6: mesAnio = "Junio"; break;
			case 7: mesAnio = "Julio"; break;			
			case 8: mesAnio = "Agosto"; break;			
			case 9: mesAnio = "Septiembre"; break;			
			case 10: mesAnio = "Octubre"; break;			
			case 11: mesAnio = "Noviembre"; break;			
			case 12: mesAnio = "Diciembre"; break;			
			default: break;		
		}
		
		fecha += mesAnio + " del " + Integer.toString(anio);
		
		return fecha;
	}
}
