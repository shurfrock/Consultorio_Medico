package main;
import com.ventanas.*;
import com.componentes.Signo;
import com.componentes.Sintoma;
import com.componentes.Enfermedad;
import com.dataAccessObject.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
	
	private static Connection conexion;
	private static PreparedStatement preparedStatement;
	private static ResultSet resultSet;
	private static String sql;
	
	
	/*public static Connection ConectarBD(){
		Connection conexion;
		
		String host = "jdbc:mysql://localhost:3306/hospital";
		String user = "root";
		String password = "Salas2001.";
		
		try {
			conexion = DriverManager.getConnection(host,user,password);
			System.out.println("Conexion exitosa");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}*/
	
	public static void main(String args[]) {
		
		List<String> signosSeleccionados = new ArrayList<>();
		List<String> sintomasSeleccionados = new ArrayList<>();
		List<String> enfermedades = new ArrayList<>();
		
		List<Integer> idSignos = new ArrayList<>();
		List<Integer> idSintomas = new ArrayList<>();
		
		
		Database bd = new Database();
		
		try {
			Connection conexion = bd.getConnection();
			//System.out.println("Conexion exitosa");
			
			List<Signo> signos;
			SignoDAOImplementacion signoDAO = new SignoDAOImplementacion();

			signos = signoDAO.consultarTodo();
			
			List<Sintoma> sintomas;
			SintomaDAOImplementacion sintomaDAO = new SintomaDAOImplementacion();
			
			sintomas = sintomaDAO.consultarTodo();
			
			List<Enfermedad> enfermedades1;
			enfermedades1 = consultarTodo();
			/*
			for (Signo signo : signos) {
				System.out.println(signo.getId() + " " + signo.getNombre());
			}
			
			System.out.println("\n");
			
			for (Sintoma sintoma : sintomas) {
				System.out.println(sintoma.getId() + " " + sintoma.getNombre());
			}
			
			System.out.println("\n");
			
			for (Enfermedad enfermedad : enfermedades1) {
				System.out.println(enfermedad.getId() + " " + enfermedad.getNombre());
			}
			*/
			signosSeleccionados.add("inflamacion");
			signosSeleccionados.add("estreñimiento");
			signosSeleccionados.add("fierigidezbre");
			sintomasSeleccionados.add("dolorMuscular");
			sintomasSeleccionados.add("nauseas");
			sintomasSeleccionados.add("algesia");
			enfermedades.add("");
			
			//diagnostico
			
			diagnostico(signosSeleccionados, sintomasSeleccionados);
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
public static List<Enfermedad> consultarTodo() throws SQLException{
		/*
		conexion = Database.getConnection();
		
		if(conexion != null) {
			List<Enfermedad> listaEnfermedad;
			Enfermedad signo;
			sql = "SELECT * FROM enfermedad";			
			preparedStatement = conexion.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery(sql);
						
			listaEnfermedad = new ArrayList<>();
			while(resultSet.next()) {
				signo = new Enfermedad(resultSet.getInt(1), resultSet.getString(2));
				listaEnfermedad.add(signo);
			}
			
			cerrarConexion();
			return listaEnfermedad;
		}
				*/
		return null;
	}

/*++++++++++++++++++++++Diagnostico++++++++++++++++++++++*/

public static void diagnostico(List<String> signosSeleccionados, List<String> sintomasSeleccionados) throws SQLException {
	
	conexion = Database.getConnection();
	
	if(conexion != null) {
		
		List<String> nombreEnfermedad = new ArrayList<>();
		
		//Signos
		for(String signo : signosSeleccionados) {
			
			sql = "select e.nombre, s.nombre from signo_por_enfermedad as conn \r\n"
					+ "join enfermedad as e on conn.enfermedad = e.id_enfermedad \r\n"
					+ "join signo as s on conn.signo = s.id_signo where s.nombre = \"" + signo + "\"";			
			preparedStatement = conexion.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery(sql);
			
			while(resultSet.next()) {
				nombreEnfermedad.add(resultSet.getString(1));
			}
			
		}
		
		//Sintomas
		for(String sintoma : sintomasSeleccionados) {
			
			sql = "select e.nombre, s.nombre from sintoma_por_enfermedad as conn \r\n"
					+ "join enfermedad as e on conn.enfermedad = e.id_enfermedad \r\n"
					+ "join sintoma as s on conn.sintoma = s.id_sintoma where s.nombre = \"" + sintoma + "\"";			
			preparedStatement = conexion.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery(sql);
			
			while(resultSet.next()) {
				nombreEnfermedad.add(resultSet.getString(1));
			}
			
		}
		
		Set<String> enfermedadRepetida = findDuplicates(nombreEnfermedad);
		
		if(enfermedadRepetida.isEmpty()) {
			for(String nombre : nombreEnfermedad) {
				System.out.println(nombre);
			}
		}
		else
			System.out.println(enfermedadRepetida);
		
		cerrarConexion();
	}
}

private static Set<String> findDuplicates(List<String> list) {
	Set<String> seen = new HashSet<>();
    return list.stream()
            .filter(e -> !seen.add(e))
            .collect(Collectors.toSet());
}

private static void cerrarConexion() throws SQLException{
	
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

}
