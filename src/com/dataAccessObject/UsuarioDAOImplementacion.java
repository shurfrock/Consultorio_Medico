package com.dataAccessObject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.componentes.Usuario;

public class UsuarioDAOImplementacion implements UsuarioDAO{

	private Connection conexion;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	private String sql;
	
	public UsuarioDAOImplementacion() {
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
		
		if(conexion !=null) {
			conexion.close();
		}
	}
	
	public int insertar(Usuario usuario) throws SQLException {
		
		conexion = Database.getConnection();
		
		if(conexion != null) {
			
			sql = "INSERT INTO Usuario (curp, nombre, apellido, sexo, edad, estado_civil, "
					+ "domicilio, telefono, username, contrasena) VALUES (?,?,?,?,?,?,?,?,?,?)";
			preparedStatement = conexion.prepareStatement(sql);
			preparedStatement.setString(1, usuario.getCurp());
			preparedStatement.setString(2, usuario.getNombre());
			preparedStatement.setString(3, usuario.getApellido());			
			preparedStatement.setString(4, Character.toString(usuario.getSexo()));
			preparedStatement.setInt(5, usuario.getEdad());
			preparedStatement.setString(6, usuario.getEstadoCivil());
			preparedStatement.setString(7, usuario.getDomicilio());
			preparedStatement.setString(8, usuario.getNumeroTelefono());
			preparedStatement.setString(9, usuario.getUsername());
			preparedStatement.setString(10, usuario.getPassword());
			preparedStatement.executeUpdate();
			
			cerrarConexion();
			return VERDADERO;
		}
		
		return FALSO;
	}

	public int eliminar(Usuario usuario) throws SQLException { /* se aplica una eliminación lógica */
		
		conexion = Database.getConnection();
		
		if(conexion != null) {
			
			sql = "UPDATE Usuario SET estatus = 'inactivo' WHERE curp = ?;";
			preparedStatement = conexion.prepareStatement(sql);
			preparedStatement.setString(1, usuario.getCurp());
			preparedStatement.executeUpdate();
			
			cerrarConexion();
			return VERDADERO;
		}
		
		return FALSO;
	}

	public int actualizar(Usuario usuario) throws SQLException {
		
		conexion = Database.getConnection();
		
		if(conexion != null) {
			
			sql = "UPDATE usuario SET nombre = ?, apellido = ?, sexo = ?, edad = ?, "
					+ "estado_civil = ?, domicilio = ?, telefono = ? WHERE curp = ?;";
			preparedStatement = conexion.prepareStatement(sql);			
			preparedStatement.setString(1, usuario.getNombre());
			preparedStatement.setString(2, usuario.getApellido());
			preparedStatement.setString(3, Character.toString(usuario.getSexo()));
			preparedStatement.setInt(4, usuario.getEdad());
			preparedStatement.setString(5, usuario.getEstadoCivil());
			preparedStatement.setString(6, usuario.getDomicilio());
			preparedStatement.setString(7, usuario.getNumeroTelefono());
			preparedStatement.setString(8, usuario.getCurp());
		}
		
		return 0;
	}

	public Usuario consultar(String criterio) throws SQLException {
		return null;
	}

	public List<Usuario> consultarTodo() throws SQLException {
		return null;
	}

	
}
