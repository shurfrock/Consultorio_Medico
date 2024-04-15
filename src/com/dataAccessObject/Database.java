package com.dataAccessObject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database{
	
	private static String dburl = "jdbc:mysql://localhost:3306/hospital";
	private static String username = "root";
	private static String password = "Salas2001.";
	
	public static Connection getConnection() throws SQLException{
		
		Connection conexion = null;
		conexion = DriverManager.getConnection(dburl, username, password);
		
		return conexion;
	}
}

