package main;

import java.sql.SQLException;

//import com.ventanas.*;
import com.ventanas.*;

public class Main {
	
	public static void main(String args[]) throws SQLException {
		
		VentanaPrinSecretaria ventana;
		
		ventana = new VentanaPrinSecretaria();
		
		
		ventana.setVisible(true);
	}
}
