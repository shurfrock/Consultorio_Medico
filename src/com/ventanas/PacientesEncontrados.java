package com.ventanas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JScrollBar;

import com.constantes.Fonts;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

public class PacientesEncontrados extends JPanel implements Fonts {

	private static final long serialVersionUID = 1L;
	private JTable table;

	public PacientesEncontrados() {
		setBackground(new Color(245, 245, 245));
		setLayout(null);
		
		JLabel lblPacientesEncontrados = new JLabel("Pacientes Encontrados");
		lblPacientesEncontrados.setHorizontalAlignment(SwingConstants.CENTER);
		lblPacientesEncontrados.setFont(FUENTE_ENCABEZADO);
		lblPacientesEncontrados.setBounds(206, 11, 219, 30);
		add(lblPacientesEncontrados);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(589, 68, 17, 100);
		add(scrollBar);
		
		JButton btnAtras = new JButton("Regresar");
		btnAtras.setBounds(512, 296, 123, 36);
		add(btnAtras);
		
		String[] columnas = {"Nombre", "Domicilio", ""};
		
		Object[][] data = {
				{"Ricardo Estrada", "Rio la barca #1222", new JButton("Ver información")},
				{"Rodolfo Salazar", "Rio nilo #512", new JButton("Ver información")},
				{"Carlos Dimas", "Barra de Navidad #105", new JButton("Ver información")}
		};
		
		DefaultTableModel model = new DefaultTableModel(data, columnas);
		
		table = new JTable(model);
		table.setBounds(53, 53, 526, 156);
		add(table);

	}
}
