package com.dataAccessObject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.componentes.Paciente;

public class PacienteDAOImplementacion implements PacienteDAO {

	private Connection conexion;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	private String sql;
	
	public PacienteDAOImplementacion() {
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
	
	public int insertar(Paciente paciente) throws SQLException {
		
		conexion = Database.getConnection();
		
		if(conexion != null) {
			
			sql = "INSERT INTO Paciente VALUES (?, ?, ?, ?, ?, ?, ?)";
			preparedStatement = conexion.prepareStatement(sql);
			preparedStatement.setString(1, paciente.getCurp());
			preparedStatement.setString(2, paciente.getNombre());
			preparedStatement.setString(3, paciente.getApellido());
			preparedStatement.setString(4, Character.toString(paciente.getSexo()));
			preparedStatement.setInt(5, paciente.getEdad());
			preparedStatement.setString(6, paciente.getEstadoCivil());
			preparedStatement.setString(7, paciente.getDomicilio());
			preparedStatement.executeUpdate();
			
			cerrarConexion();
			return VERDADERO;
		}
		
		return FALSO;
	}

	public int eliminar(Paciente paciente) throws SQLException {
		return 0; /* No tiene caso eliminar pacientes! */
	}

	public int actualizar(Paciente paciente) throws SQLException {
		
		conexion = Database.getConnection();
		
		if(conexion != null) {
			
			sql = "UPDATE Paciente SET curp = ?, nombre = ?, apellido = ?, sexo = ?, edad = ?, estado_civil = ?, domicilio = ? "
					+ "WHERE curp = ?;";
			preparedStatement = conexion.prepareStatement(sql);
			preparedStatement.setString(1, paciente.getCurp());
			preparedStatement.setString(2, paciente.getNombre());
			preparedStatement.setString(3, paciente.getApellido());
			preparedStatement.setString(4, Character.toString(paciente.getSexo()));
			preparedStatement.setInt(5, paciente.getEdad());
			preparedStatement.setString(6, paciente.getEstadoCivil());
			preparedStatement.setString(7, paciente.getDomicilio());
			preparedStatement.setString(8, paciente.getId());
			preparedStatement.executeUpdate();
			
			cerrarConexion();
			return VERDADERO;
		}
		
		return FALSO;
	}

	public Paciente consultar(String curp) throws SQLException {
		
		conexion = Database.getConnection();
		
		if(conexion != null) {
			sql = "SELECT * FROM Paciente WHERE curp = ?;";
			preparedStatement = conexion.prepareStatement(sql);
			preparedStatement.setString(1, curp);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				
				Paciente paciente;
				String nombre, apellido, estadoCivil, domicilio, curpX;
				char sexo;
				short edad;
				
				nombre = resultSet.getString("nombre");
				apellido = resultSet.getString("apellido");
				estadoCivil = resultSet.getString("estado_civil");
				domicilio = resultSet.getString("domicilio");
				curpX = resultSet.getString("curp");
				sexo = resultSet.getString("sexo").charAt(0);
				edad = (short)resultSet.getInt("edad");
				
				paciente = new Paciente(nombre, apellido, edad, sexo, estadoCivil, domicilio, curpX, curpX);
				
				cerrarConexion();
				return paciente;
			}
		}
		
		return null;
	}
	
	public List<Paciente> buscarPaciente(String nombre) throws SQLException {
		
		conexion = Database.getConnection();
		
		if(conexion != null) {
			
			Paciente paciente;
			List<Paciente> pacientes;
			String nombreX, apellido, estadoCivil, domicilio, curp;
			char sexo;
			short edad;
			
			sql = "SELECT * FROM Paciente WHERE nombre LIKE ?";
			preparedStatement = conexion.prepareStatement(sql);
			preparedStatement.setString(1, nombre + "%");
			resultSet = preparedStatement.executeQuery();
			
			pacientes = new ArrayList<>();
			while(resultSet.next()) {
				nombreX = resultSet.getString("nombre");
				apellido = resultSet.getString("apellido");
				sexo = resultSet.getString("sexo").charAt(0);
				edad = (short)resultSet.getInt("edad");
				estadoCivil = resultSet.getString("estado_civil");
				domicilio = resultSet.getString("domicilio");
				curp = resultSet.getString("curp");
				
				paciente = new Paciente(nombreX, apellido, edad, sexo, estadoCivil, domicilio, curp, curp);
				
				pacientes.add(paciente);
			}
			
			cerrarConexion();
			return pacientes;
		}
		
		return null;
	}

	public List<Paciente> consultarTodo() throws SQLException {
		
		conexion = Database.getConnection();
		
		if(conexion != null) {
			
			String nombre, apellido, sexo, estadoCivil, domicilio, curp;
			int edad;
			
			sql = "SELECT * FROM Paciente;";
			preparedStatement = conexion.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			
			Paciente paciente;
			List <Paciente> pacientes = new ArrayList<>();
			while(resultSet.next()) {
				
				nombre = resultSet.getString(2);
				apellido = resultSet.getString(3);
				edad = resultSet.getInt(5);
				sexo = resultSet.getString(4);
				estadoCivil = resultSet.getString(6);
				domicilio = resultSet.getString(7);
				curp = resultSet.getString(1);
				
				paciente = new Paciente(nombre, apellido, (short)edad, sexo.charAt(0), estadoCivil, domicilio, curp, curp);
				pacientes.add(paciente);
			}
			
			cerrarConexion();
			return pacientes;
		}
		
		return null;
	}
}
