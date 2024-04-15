package com.dataAccessObject;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.componentes.Signo;

public class SignoDAOImplementacion implements SignoDAO {	
	
	private Connection conexion;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	private String sql;
	
	public SignoDAOImplementacion() {
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
	
	public int insertar(Signo signo) throws SQLException{
		
		conexion = Database.getConnection();
		
		if(conexion != null) {
			sql = "INSERT INTO Signo (nombre) VALUES (?)";
			preparedStatement = conexion.prepareStatement(sql);
			preparedStatement.setString(1, signo.getNombre());
			preparedStatement.executeUpdate();
			
			cerrarConexion();
			return VERDADERO;
		}
		
		return FALSO;
	}
	public int eliminar(Signo signo) throws SQLException{
		return 0; /* Si importancia de implementacion*/
	}
	
	public int actualizar(Signo signo) throws SQLException{
		
		conexion = Database.getConnection();
		
		if(conexion != null) {
			sql = "UPDATE Signo SET nombre = ? WHERE id_signo = ?";
			preparedStatement = conexion.prepareStatement(sql);
			preparedStatement.setString(1, signo.getNombre());
			preparedStatement.setInt(2, signo.getId());
			preparedStatement.executeUpdate();
			
			cerrarConexion();			
			return VERDADERO;
		}
				
		return FALSO;
	}
	
	public Signo consultar(String criterio) throws SQLException {
		return null; /* Sin importancia de implemencacion */
	}
	
	public List<Signo> consultarTodo() throws SQLException{
		
		conexion = Database.getConnection();
		
		if(conexion != null) {
			List<Signo> listaSignos;
			Signo signo;
			sql = "SELECT * FROM Signo";			
			preparedStatement = conexion.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery(sql);
						
			listaSignos = new ArrayList<>();
			while(resultSet.next()) {
				signo = new Signo(resultSet.getInt(1), resultSet.getString(2));
				listaSignos.add(signo);
			}
			
			cerrarConexion();
			return listaSignos;
		}
				
		return null;
	}
}
