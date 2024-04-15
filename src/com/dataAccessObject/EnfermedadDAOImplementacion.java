package com.dataAccessObject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

import com.componentes.Enfermedad;
import com.componentes.Signo;
import com.componentes.Sintoma;

public class EnfermedadDAOImplementacion implements EnfermedadDAO {
	
	private Connection conexion;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	private String sql;
	
	public EnfermedadDAOImplementacion() {
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
	
	public int insertar(Enfermedad enfermedad) throws SQLException {
		
		conexion = Database.getConnection();
		if(conexion != null) {			
			
			int idEnfermedad;
			int n, i;
			
			/* Insertar la enfermedad en su tabla corespondiente */
			sql = "INSERT INTO Enfermedad (nombre) VALUES (?)";
			preparedStatement = conexion.prepareStatement(sql);
			preparedStatement.setString(1, enfermedad.getNombre());
			preparedStatement.executeUpdate();
			
			/* Obtener id de la enfermedad insertada previamente */
			sql = "SELECT id_enfermedad FROM Enfermedad WHERE nombre = ?;";
			preparedStatement = conexion.prepareStatement(sql);
			preparedStatement.setString(1, enfermedad.getNombre());
			resultSet = preparedStatement.executeQuery();
			
			resultSet.next();
			idEnfermedad = resultSet.getInt(1);
			
			/* Insertar signos por enfermedad */
			n = enfermedad.getSignos().size();
			i = 0;
			while(i < n) {
				sql = "INSERT INTO signo_por_enfermedad VALUES (?,?);";
				preparedStatement = conexion.prepareStatement(sql);
				preparedStatement.setInt(1, idEnfermedad);
				preparedStatement.setInt(2, enfermedad.getSignos().get(i).getId());
				preparedStatement.executeUpdate();
				
				i++;
			}
						
			/* Insertar Sintomas por enfermedad */
			n = enfermedad.getSintomas().size();
			i = 0;
			while(i < n) {
				sql = "INSERT INTO sintoma_por_enfermedad VALUES(?,?);";
				preparedStatement = conexion.prepareStatement(sql);
				preparedStatement.setInt(1, idEnfermedad);
				preparedStatement.setInt(2, enfermedad.getSintomas().get(i).getId());
				preparedStatement.executeUpdate();
				
				i++;
			}
			
			cerrarConexion();
			return VERDADERO;
		}
		
		return FALSO;
	}

	public int eliminar(Enfermedad enfermedad) throws SQLException {
		return 0; /* Imeplementacion no necesaria */
	}

	public int actualizar(Enfermedad enfermedad) throws SQLException {		
		return 0; /* Implementacion pendiente */
	}

	public Enfermedad consultar(String criterio) throws SQLException {				
		return null; /* implementacion no necesaria */
	}

	public List<Enfermedad> consultarTodo() throws SQLException {
		
		conexion = Database.getConnection();
		
		if(conexion != null) {
			Enfermedad enfermedad;
			List<Enfermedad> enfermedades;
			List<Signo> signos;
			Signo signo;
			List<Sintoma> sintomas;
			Sintoma sintoma;
			int i, n, idEnfermedad;
			
			sql = "SELECT * FROM Enfermedad;";
			preparedStatement = conexion.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			
			enfermedades = new ArrayList<>();
			while(resultSet.next()) {
				enfermedad = new Enfermedad(resultSet.getInt(1), resultSet.getString(2), null, null);
				enfermedades.add(enfermedad);
			}
			
			/* para cada enfermedad obtener sus signos y sintomas */
			
			n = enfermedades.size(); // cantidad total de enfermedades
			i = 0;
			
			while(i < n) { // para cada enfermedad, hacer lo siguiente:
				
				idEnfermedad = enfermedades.get(i).getId();
				sql = "SELECT s.id_signo, s.nombre FROM signo AS s "
						+ "INNER JOIN signo_por_enfermedad AS spe ON s.id_signo = spe.signo "
						+ "WHERE spe.enfermedad = ?;";
				preparedStatement = conexion.prepareStatement(sql);
				preparedStatement.setInt(1, idEnfermedad);
				resultSet = preparedStatement.executeQuery();
				
				signos = new ArrayList<>();
				while(resultSet.next()) {
					signo = new Signo(resultSet.getInt(1), resultSet.getString(2));
					signos.add(signo);
				}
				
				sql = "SELECT s.id_sintoma, s.nombre FROM sintoma AS s "
						+ "INNER JOIN sintoma_por_enfermedad AS spe "
						+ "ON s.id_sintoma = spe.sintoma "
						+ "WHERE spe.enfermedad = ?;";
				preparedStatement = conexion.prepareStatement(sql);
				preparedStatement.setInt(1, idEnfermedad);
				resultSet = preparedStatement.executeQuery();
				
				sintomas = new ArrayList<>();
				while(resultSet.next()) {
					sintoma = new Sintoma(resultSet.getInt(1), resultSet.getString(2));
					sintomas.add(sintoma);
				}
								
				enfermedades.get(i).setSignos(signos);
				enfermedades.get(i).setSintomas(sintomas);
				
				i++;
			}
			
			cerrarConexion();
			return enfermedades;
		}
		
		return null;
	}
}
