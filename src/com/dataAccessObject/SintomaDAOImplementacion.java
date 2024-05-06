package com.dataAccessObject;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.componentes.Sintoma;

public class SintomaDAOImplementacion implements SintomaDAO {
	
	private Connection conexion;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	private String sql;
	
	public SintomaDAOImplementacion() {
		conexion = null;
		preparedStatement = null;
		resultSet = null;
	}
	
	private void cerrarConexion() throws SQLException{
		
		if(resultSet != null) {
			resultSet.close();
		}
		
		if(preparedStatement != null) {
			preparedStatement.close();
		}
		
		if(conexion != null) {
			conexion.close();
		}
	}
	
	public int insertar(Sintoma sintoma) throws SQLException {
		
		conexion = Database.getConnection();
		if(conexion != null) {
			sql = "INSERT INTO sintoma (nombre) VALUES (?);";
			preparedStatement = conexion.prepareStatement(sql);
			preparedStatement.setString(1, sintoma.getNombre());
			preparedStatement.executeUpdate();
			
			cerrarConexion();
			return 1;
		}
		
		return 0;
	}

	public int eliminar(Sintoma sintoma) throws SQLException {
		return 0; /* implementacion no necesaria */
	}

	public int actualizar(Sintoma sintoma) throws SQLException {
		
		conexion = Database.getConnection();
		if(conexion != null) {
			sql = "UPDATE Sintoma SET nombre = ? WHERE id_sintoma = ?";
			preparedStatement = conexion.prepareStatement(sql);
			preparedStatement.setString(1, sintoma.getNombre());
			preparedStatement.setInt(2, sintoma.getId());
			preparedStatement.executeUpdate();
			
			cerrarConexion();
			return 1;
		}
		
		return 0;
	}

	public Sintoma consultar(String criterio) throws SQLException {
		return null; /* Implementacion pendiente */
	}

	public List<Sintoma> consultarTodo() throws SQLException {
		
		conexion = Database.getConnection();
		if(conexion != null) {
			Sintoma sintoma;
			List<Sintoma> listaSintomas;
			sql = "SELECT * FROM Sintoma";
			preparedStatement = conexion.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			
			listaSintomas = new ArrayList<>();
			while(resultSet.next()) {
				sintoma = new Sintoma(resultSet.getInt(1), resultSet.getString(2));
				listaSintomas.add(sintoma);
			}
			
			cerrarConexion();
			return listaSintomas;
		}
		
		return null;
	}
	
}