package com.ventanas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;

public class CrearConsulta extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField txtSignos;
	private JTextField txtSintomas;
	private JTextField SignosSleccionados;
	private JTextField Sintomas;

	/**
	 * Create the panel.
	 */
	public CrearConsulta() {
		setBackground(new Color(245, 245, 245));
		setLayout(null);
		
		JLabel lblCrearConsulta = new JLabel("Consulta Medica");
		lblCrearConsulta.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		lblCrearConsulta.setBounds(230, 10, 224, 30);
		add(lblCrearConsulta);
		
		textField = new JTextField();
		textField.setText("Ingrese el Nombre del paciente");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setColumns(10);
		textField.setBackground(Color.WHITE);
		textField.setBounds(45, 79, 446, 31);
		add(textField);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre del Paciente");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(45, 60, 184, 13);
		add(lblNewLabel_1);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setForeground(Color.BLACK);
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBuscar.setBackground(new Color(218, 218, 218));
		btnBuscar.setBounds(527, 79, 85, 31);
		add(btnBuscar);
		
		JList list = new JList();
		list.setBackground(new Color(221, 221, 221));
		list.setBounds(45, 130, 550, 100);
		add(list);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(595, 130, 17, 100);
		add(scrollBar);
		
		txtSignos = new JTextField();
		txtSignos.setText("Signos");
		txtSignos.setHorizontalAlignment(SwingConstants.LEFT);
		txtSignos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtSignos.setColumns(10);
		txtSignos.setBounds(45, 281, 194, 30);
		add(txtSignos);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(237, 281, 29, 30);
		add(comboBox_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Signos");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1.setBounds(45, 258, 184, 19);
		add(lblNewLabel_1_1_1_1);
		
		txtSintomas = new JTextField();
		txtSintomas.setText("Sintomas");
		txtSintomas.setHorizontalAlignment(SwingConstants.LEFT);
		txtSintomas.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtSintomas.setColumns(10);
		txtSintomas.setBounds(45, 344, 194, 30);
		add(txtSintomas);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setBounds(237, 344, 29, 30);
		add(comboBox_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Sintomas");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1_1.setBounds(45, 321, 184, 19);
		add(lblNewLabel_1_1_1_1_1);
		
		SignosSleccionados = new JTextField();
		SignosSleccionados.setHorizontalAlignment(SwingConstants.CENTER);
		SignosSleccionados.setForeground(Color.BLACK);
		SignosSleccionados.setFont(new Font("Tahoma", Font.PLAIN, 15));
		SignosSleccionados.setColumns(10);
		SignosSleccionados.setBackground(Color.WHITE);
		SignosSleccionados.setBounds(45, 403, 567, 31);
		add(SignosSleccionados);
		
		JLabel lblNewLabel_1_1 = new JLabel("Signos Seleccionados");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(45, 384, 184, 19);
		add(lblNewLabel_1_1);
		
		Sintomas = new JTextField();
		Sintomas.setHorizontalAlignment(SwingConstants.CENTER);
		Sintomas.setForeground(Color.BLACK);
		Sintomas.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Sintomas.setColumns(10);
		Sintomas.setBackground(Color.WHITE);
		Sintomas.setBounds(45, 463, 567, 31);
		add(Sintomas);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Sintomas Seleccionados");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(45, 444, 184, 19);
		add(lblNewLabel_1_1_1);
		
		JButton btnGenerarDiagnostico = new JButton("Generar Diagnostico");
		btnGenerarDiagnostico.setForeground(Color.BLACK);
		btnGenerarDiagnostico.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnGenerarDiagnostico.setBackground(new Color(218, 218, 218));
		btnGenerarDiagnostico.setBounds(216, 521, 208, 39);
		add(btnGenerarDiagnostico);

	}
}
