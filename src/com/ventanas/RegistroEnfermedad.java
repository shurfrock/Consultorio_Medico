package com.ventanas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class RegistroEnfermedad extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textEnfermedad;
	private JTextField txtSignos;
	private JTextField txtSintomas;
	private JTextField textSignosSleccionados;
	private JTextField textSintomasSeleccionados;

	/**
	 * Create the panel.
	 */
	public RegistroEnfermedad() {
		setLayout(null);
		
		JLabel lblRegistroDeEnfermedad = new JLabel("Registro de Enfermedad");
		lblRegistroDeEnfermedad.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		lblRegistroDeEnfermedad.setBounds(167, 10, 288, 30);
		add(lblRegistroDeEnfermedad);
		
		textEnfermedad = new JTextField();
		textEnfermedad.setText("Ingrese el nombre de la enfermedad");
		textEnfermedad.setHorizontalAlignment(SwingConstants.CENTER);
		textEnfermedad.setForeground(Color.BLACK);
		textEnfermedad.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textEnfermedad.setColumns(10);
		textEnfermedad.setBackground(Color.WHITE);
		textEnfermedad.setBounds(36, 80, 567, 31);
		add(textEnfermedad);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enfermedad");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(36, 61, 184, 19);
		add(lblNewLabel_1_1);
		
		txtSignos = new JTextField();
		txtSignos.setText("Seleccione los signos de enfermedad");
		txtSignos.setHorizontalAlignment(SwingConstants.CENTER);
		txtSignos.setForeground(Color.BLACK);
		txtSignos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtSignos.setColumns(10);
		txtSignos.setBackground(Color.WHITE);
		txtSignos.setBounds(36, 140, 536, 31);
		add(txtSignos);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Signos");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(36, 121, 184, 19);
		add(lblNewLabel_1_1_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setBounds(571, 140, 29, 31);
		add(comboBox_1_1);
		
		txtSintomas = new JTextField();
		txtSintomas.setText("Seleccione los signos de enfermedad");
		txtSintomas.setHorizontalAlignment(SwingConstants.CENTER);
		txtSintomas.setForeground(Color.BLACK);
		txtSintomas.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtSintomas.setColumns(10);
		txtSintomas.setBackground(Color.WHITE);
		txtSintomas.setBounds(36, 200, 536, 31);
		add(txtSintomas);
		
		JComboBox comboBox_1_1_1 = new JComboBox();
		comboBox_1_1_1.setBounds(571, 200, 29, 31);
		add(comboBox_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Sintomas");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1.setBounds(36, 181, 184, 19);
		add(lblNewLabel_1_1_1_1);
		
		textSignosSleccionados = new JTextField();
		textSignosSleccionados.setHorizontalAlignment(SwingConstants.CENTER);
		textSignosSleccionados.setForeground(Color.BLACK);
		textSignosSleccionados.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textSignosSleccionados.setColumns(10);
		textSignosSleccionados.setBackground(Color.WHITE);
		textSignosSleccionados.setBounds(36, 260, 567, 31);
		add(textSignosSleccionados);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Signos seleccionados");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_2.setBounds(36, 241, 269, 19);
		add(lblNewLabel_1_1_2);
		
		textSintomasSeleccionados = new JTextField();
		textSintomasSeleccionados.setHorizontalAlignment(SwingConstants.CENTER);
		textSintomasSeleccionados.setForeground(Color.BLACK);
		textSintomasSeleccionados.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textSintomasSeleccionados.setColumns(10);
		textSintomasSeleccionados.setBackground(Color.WHITE);
		textSintomasSeleccionados.setBounds(36, 320, 567, 31);
		add(textSintomasSeleccionados);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Sintomas seleccionados");
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_2_1.setBounds(36, 301, 269, 19);
		add(lblNewLabel_1_1_2_1);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setForeground(Color.BLACK);
		btnRegistrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnRegistrar.setBackground(new Color(218, 218, 218));
		btnRegistrar.setBounds(220, 376, 208, 39);
		add(btnRegistrar);

	}

}
