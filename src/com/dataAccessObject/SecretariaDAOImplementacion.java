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
	
	public int insertar(Secretaria secretaria) throws SQLException {
		
		conexion = Database.getConnection();
		
		if(conexion != null) {
			
			UsuarioDAOImplementacion DAO = new UsuarioDAOImplementacion(); 
			DAO.insertar(secretaria);
			
		}
		
		return FALSO;
	}

	public int eliminar(Secretaria secretaria) throws SQLException {
		return 0;
	}

	public int actualizar(Secretaria secretaria) throws SQLException {
		return 0;
	}

	public Secretaria consultar(String criterio) throws SQLException {
		return null;
	}

	public List<Secretaria> consultarTodo() throws SQLException {
		return null;
	}

}
