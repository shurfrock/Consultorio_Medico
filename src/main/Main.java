package main;

//import com.ventanas.*;
import com.componentes.*;
import com.dataAccessObject.EnfermedadDAOImplementacion;
import java.sql.SQLException;
import java.util.List;

public class Main {
	
	public static void main(String args[]) throws SQLException{
	
		
		EnfermedadDAOImplementacion DAO = new EnfermedadDAOImplementacion();
		List<Enfermedad> enfermedades;
		
		enfermedades = DAO.consultarTodo();
		
		// mostrar todas las enfermedades
		for(Enfermedad enfermedad : enfermedades) {
			System.out.println("Enfermedad: " + enfermedad.getNombre());
			System.out.print("signos: ");
			
			for(Signo signo : enfermedad.getSignos()) {
				System.out.print(signo.getNombre() + ", ");
			}
			System.out.print("\n");
			
			System.out.print("sintomas: ");
			
			for(Sintoma sintoma : enfermedad.getSintomas()) {
				System.out.print(sintoma.getNombre() + ", ");
			}
			
			System.out.println("\n\n");
		}
	}
}
