package com.dataAccessObject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.componentes.Secretaria;

public class SecretariaDAOImplementacion implements SecretariaDAO{

	private Connection conexion;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	private String sql;
	
	public SecretariaDAOImplementacion() {
		conexion = null;
		preparedStatement = null;
		resultSet = null;
	}
	
	private void cerrarConexion() throws SQLException {
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
	
	public int insertar(Secretaria secretaria) throws SQLException {
		
		conexion = Database.getConnection();
		
		if(conexion != null) {
			
			UsuarioDAOImplementacion DAO = new UsuarioDAOImplementacion();
			DAO.insertar(secretaria);
			
			sql = "INSERT INTO Secretaria (curp) VALUES (?)";
			preparedStatement = conexion.prepareStatement(sql);
			preparedStatement.setString(1, secretaria.getCurp());
			preparedStatement.executeUpdate();
			
			cerrarConexion();
			return VERDADERO;
		}
		
		return FALSO;
	}

	public int eliminar(Secretaria secretaria) throws SQLException { /* Eliminación logica */
		
		/* Delegar la resposabilidad */
		UsuarioDAOImplementacion DAO = new UsuarioDAOImplementacion();
		
		if(DAO.eliminar(secretaria) == VERDADERO) {
			return VERDADERO;
		}
		
		return FALSO;
	}

	public int actualizar(Secretaria secretaria) throws SQLException {
		
		/* Delegar la resposabilidad */
		UsuarioDAOImplementacion DAO = new UsuarioDAOImplementacion();
		
		if(DAO.actualizar(secretaria) == VERDADERO) {
			return VERDADERO;
		}
		
		return FALSO;
	}

	public Secretaria consultar(String criterio) throws SQLException {
		return null; /* Implementacion no necesaria */
	}

	public List<Secretaria> consultarTodo() throws SQLException {
		return null; /* Implementacion pendiente */
	}

}
