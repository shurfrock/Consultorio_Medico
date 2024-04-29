package com.dataAccessObject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
		
		conexion = Database.getConnection();
		
		if(conexion != null) {
			
			Doctor medico;
			List<Doctor> medicos;
			String nombre, apellido, estadoCivil, domicilio, curp, telefono, cedula;
			short edad;
			char sexo;
			
			sql = "SELECT u.nombre AS nombre, u.apellido AS apellido, u.sexo AS sexo, u.edad AS edad, u.estado_civil AS estado_civil, "
					+ "u.domicilio AS domicilio, u.curp AS curp, u.telefono AS telefono, "
					+ "m.cedula_profesional AS cedula "
					+ "FROM Usuario AS u "
					+ "INNER JOIN Medico AS m ON u.curp = m.curp;";
			
			preparedStatement = conexion.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			
			medicos = new ArrayList<>();
			while(resultSet.next()) {
				nombre = resultSet.getString("nombre");
				apellido = resultSet.getString("apellido");
				sexo = resultSet.getString("sexo").charAt(0);
				edad = (short)resultSet.getInt("edad");
				estadoCivil = resultSet.getString("estado_civil");
				domicilio = resultSet.getString("domicilio");
				curp = resultSet.getString("curp");
				telefono = resultSet.getString("telefono");
				cedula = resultSet.getString("cedula");
				
				medico = new Doctor(nombre, apellido, sexo, edad, estadoCivil, domicilio, curp, telefono, "", "", cedula);
				medicos.add(medico);
			}
			
			cerrarConexion();
			return medicos;
		}
		
		return null;
	}
}
