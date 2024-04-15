package com.dataAccessObject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.componentes.Doctor;

public class DoctorDAOImplementacion implements DoctorDAO {
	
	private Connection conexion;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	private String sql;
	
	public DoctorDAOImplementacion() {
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

	public int insertar(Doctor doctor) throws SQLException {
		
		UsuarioDAOImplementacion DAO = new UsuarioDAOImplementacion();
		if(DAO.insertar(doctor) == VERDADERO) {
			
			conexion = Database.getConnection();
			
			if(conexion != null) {
				
				sql = "INSERT INTO Medico (curp, cedula_profesional) VALUES (?, ?)";
				preparedStatement = conexion.prepareStatement(sql);
				preparedStatement.setString(1, doctor.getCurp());
				preparedStatement.setString(2, doctor.getCedulaProfesional());
				preparedStatement.executeUpdate();
				
				cerrarConexion();
				return VERDADERO;
			}
		}
		
		return FALSO;
	}

	public int eliminar(Doctor doctor) throws SQLException { /* Eliminacion logica */
		
		/* Delegar la responsabilidad */
		UsuarioDAOImplementacion DAO = new UsuarioDAOImplementacion();
		if(DAO.eliminar(doctor) == VERDADERO) {
			return VERDADERO;
		}
		
		return FALSO;
	}

	public int actualizar(Doctor doctor) throws SQLException {
		
		/* Delegar la responsabilidad */
		UsuarioDAOImplementacion DAO = new UsuarioDAOImplementacion();
		if(DAO.actualizar(doctor) == VERDADERO) {
			
			conexion = Database.getConnection();			
			if(conexion != null) {
				
				sql = "UPDATE Medico SET cedula_profesional = ? WHERE curp = ?;";
				preparedStatement = conexion.prepareStatement(sql);
				preparedStatement.setString(1, doctor.getCedulaProfesional());
				preparedStatement.setString(2, doctor.getCurp());
				preparedStatement.executeUpdate();
				
				cerrarConexion();
				return VERDADERO;
			}
		}
		
		return FALSO;
	}

	public Doctor consultar(String criterio) throws SQLException {
		return null; /* Pendiente de implementar */
	}

	public List<Doctor> consultarTodo() throws SQLException {
		return null; /* Pendiente de implementar */
	}

}
