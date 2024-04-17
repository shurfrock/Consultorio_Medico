package com.ventanas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class ConsultarPaciente extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public ConsultarPaciente() {
		setLayout(null);
		
		JLabel lblConsultaDePaciente = new JLabel("Consulta de Paciente");
		lblConsultaDePaciente.setBounds(157, 10, 266, 30);
		lblConsultaDePaciente.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		add(lblConsultaDePaciente);
		
		JLabel lblNewLabel = new JLabel("Nota: La consulta del paciente puede der por CURP o sino por nombre, pero los dos campos no deber ser llenados a la vez.");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(73, 67, 443, 30);
		add(lblNewLabel);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(230, 288, 123, 36);
		add(btnConsultar);
		
		textField = new JTextField();
		textField.setBounds(71, 135, 445, 30);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(71, 227, 445, 30);
		add(textField_1);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre del paciente");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(71, 107, 145, 22);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("CURP del paciente");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(71, 201, 145, 22);
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("ó");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(277, 185, 59, 13);
		add(lblNewLabel_2);

	}

}
