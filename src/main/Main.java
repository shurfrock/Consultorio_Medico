package main;

import java.sql.SQLException;
import com.ventanas.*;

public class Main {
	
	public static void main(String args[]) throws SQLException {
		
		VentanaPrinDoctor ventana;
		
		ventana = new VentanaPrinDoctor();
		
		
		ventana.setVisible(true);
	}
}
