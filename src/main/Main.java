package main;
import com.ventanas.*;
import com.dataAccessObject.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
	
	/*public static Connection ConectarBD(){
		Connection conexion;
		
		String host = "jdbc:mysql://localhost:3306/hospital";
		String user = "root";
		String password = "Salas2001.";
		
		try {
			conexion = DriverManager.getConnection(host,user,password);
			System.out.println("Conexion exitosa");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}*/
	
	public static void main(String args[]) {
		/*
		Database bd = new Database();
		
		try {
			Connection conexion = bd.getConnection();
			System.out.println("Conexion exitosa");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		InicioSesion ventana = new InicioSesion();
		
		ventana.setVisible(true);
		
	}
}
