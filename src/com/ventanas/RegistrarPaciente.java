package com.ventanas;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JSpinner;

public class RegistrarPaciente extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField Apellidos;
	private JTextField Nombre;
	private JTextField txtEstadoCivilDel;
	private JTextField txtDomicilioDelPaciente;
	private JTextField txtCurpDelPaciente;

	/**
	 * Create the panel.
	 */
	public RegistrarPaciente() {
		setLayout(null);
		
		Apellidos = new JTextField();
		Apellidos.setHorizontalAlignment(SwingConstants.CENTER);
		Apellidos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Apellidos.setText("Ingresar apellido(s) de paciente");
		Apellidos.setColumns(10);
		Apellidos.setBounds(23, 149, 560, 30);
		add(Apellidos);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido(s)");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(23, 121, 145, 22);
		add(lblNewLabel_1);
		
		JLabel lblRegistroDePaciente = new JLabel("Registro de Paciente");
		lblRegistroDePaciente.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		lblRegistroDePaciente.setBounds(180, 10, 290, 30);
		add(lblRegistroDePaciente);
		
		Nombre = new JTextField();
		Nombre.setText("Ingresar nombre de paciente");
		Nombre.setHorizontalAlignment(SwingConstants.CENTER);
		Nombre.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Nombre.setColumns(10);
		Nombre.setBounds(23, 78, 560, 30);
		add(Nombre);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nombre del paciente");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(23, 50, 145, 22);
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Edad");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(23, 189, 145, 22);
		add(lblNewLabel_1_2);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSexo.setBounds(23, 257, 145, 22);
		add(lblSexo);
		
		txtEstadoCivilDel = new JTextField();
		txtEstadoCivilDel.setText("Estado civil del paciemte");
		txtEstadoCivilDel.setHorizontalAlignment(SwingConstants.CENTER);
		txtEstadoCivilDel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtEstadoCivilDel.setColumns(10);
		txtEstadoCivilDel.setBounds(23, 353, 560, 30);
		add(txtEstadoCivilDel);
		
		JLabel lblNewLabel_1_4 = new JLabel("Estado Civil");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_4.setBounds(23, 325, 145, 22);
		add(lblNewLabel_1_4);
		
		txtDomicilioDelPaciente = new JTextField();
		txtDomicilioDelPaciente.setText("Domicilio del paciente");
		txtDomicilioDelPaciente.setHorizontalAlignment(SwingConstants.CENTER);
		txtDomicilioDelPaciente.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtDomicilioDelPaciente.setColumns(10);
		txtDomicilioDelPaciente.setBounds(23, 428, 560, 30);
		add(txtDomicilioDelPaciente);
		
		JLabel lblNewLabel_1_5 = new JLabel("Domicilio del paciente");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_5.setBounds(23, 400, 180, 22);
		add(lblNewLabel_1_5);
		
		txtCurpDelPaciente = new JTextField();
		txtCurpDelPaciente.setText("CURP del paciente");
		txtCurpDelPaciente.setHorizontalAlignment(SwingConstants.CENTER);
		txtCurpDelPaciente.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtCurpDelPaciente.setColumns(10);
		txtCurpDelPaciente.setBounds(23, 496, 560, 30);
		add(txtCurpDelPaciente);
		
		JLabel lblNewLabel_1_6 = new JLabel("CURP");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_6.setBounds(23, 468, 145, 22);
		add(lblNewLabel_1_6);
		
		JCheckBox Masculino = new JCheckBox("Masculino");
		Masculino.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Masculino.setBounds(40, 285, 93, 21);
		add(Masculino);
		
		JCheckBox Femenino = new JCheckBox("Femenino");
		Femenino.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Femenino.setBounds(151, 285, 93, 21);
		add(Femenino);
		
		JCheckBox Otro = new JCheckBox("Otro");
		Otro.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Otro.setBounds(260, 285, 93, 21);
		add(Otro);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnGuardar.setBounds(260, 553, 119, 37);
		add(btnGuardar);
		
		JSpinner Edad = new JSpinner();
		Edad.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Edad.setBounds(23, 221, 110, 26);
		add(Edad);

	}
}
