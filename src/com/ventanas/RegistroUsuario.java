package com.ventanas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JSpinner;

public class RegistroUsuario extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtNombreUsuario;
	private JTextField textApellidosUsuario;
	private JTextField txtEstadoCivilUsuario;
	private JTextField txtDomicilioUsuario;
	private JTextField txtCurpUsuario;
	private JTextField txtNumeroDeTelefono;

	/**
	 * Create the panel.
	 */
	public RegistroUsuario() {
		setLayout(null);
		
		JLabel lblRegistroDeUsuario = new JLabel("Registro de Usuario");
		lblRegistroDeUsuario.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		lblRegistroDeUsuario.setBounds(190, 10, 290, 30);
		add(lblRegistroDeUsuario);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nombre del usuario");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(33, 50, 145, 22);
		add(lblNewLabel_1_1);
		
		txtNombreUsuario = new JTextField();
		txtNombreUsuario.setText("Ingresar nombre de Usuario");
		txtNombreUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		txtNombreUsuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtNombreUsuario.setColumns(10);
		txtNombreUsuario.setBounds(33, 78, 560, 30);
		add(txtNombreUsuario);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido(s)");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(33, 118, 145, 22);
		add(lblNewLabel_1);
		
		textApellidosUsuario = new JTextField();
		textApellidosUsuario.setText("Ingresar apellido(s) de usuario");
		textApellidosUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		textApellidosUsuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textApellidosUsuario.setColumns(10);
		textApellidosUsuario.setBounds(33, 146, 560, 30);
		add(textApellidosUsuario);
		
		txtEstadoCivilUsuario = new JTextField();
		txtEstadoCivilUsuario.setText("Estado civil del usuairo");
		txtEstadoCivilUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		txtEstadoCivilUsuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtEstadoCivilUsuario.setColumns(10);
		txtEstadoCivilUsuario.setBounds(33, 214, 560, 30);
		add(txtEstadoCivilUsuario);
		
		JLabel lblNewLabel_1_4 = new JLabel("Estado Civil");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_4.setBounds(33, 186, 145, 22);
		add(lblNewLabel_1_4);
		
		JCheckBox Masculino = new JCheckBox("Masculino");
		Masculino.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Masculino.setBounds(50, 346, 93, 21);
		add(Masculino);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSexo.setBounds(33, 318, 145, 22);
		add(lblSexo);
		
		JCheckBox Femenino = new JCheckBox("Femenino");
		Femenino.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Femenino.setBounds(161, 346, 93, 21);
		add(Femenino);
		
		JCheckBox Otro = new JCheckBox("Otro");
		Otro.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Otro.setBounds(270, 346, 93, 21);
		add(Otro);
		
		JLabel lblNewLabel_1_2 = new JLabel("Edad");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(33, 254, 145, 22);
		add(lblNewLabel_1_2);
		
		txtDomicilioUsuario = new JTextField();
		txtDomicilioUsuario.setText("Domicilio del usuario");
		txtDomicilioUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		txtDomicilioUsuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtDomicilioUsuario.setColumns(10);
		txtDomicilioUsuario.setBounds(33, 401, 560, 30);
		add(txtDomicilioUsuario);
		
		JLabel lblNewLabel_1_5 = new JLabel("Domicilio del usuario");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_5.setBounds(33, 373, 180, 22);
		add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("CURP");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_6.setBounds(33, 441, 145, 22);
		add(lblNewLabel_1_6);
		
		txtCurpUsuario = new JTextField();
		txtCurpUsuario.setText("CURP del usuario");
		txtCurpUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		txtCurpUsuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtCurpUsuario.setColumns(10);
		txtCurpUsuario.setBounds(33, 469, 560, 30);
		add(txtCurpUsuario);
		
		txtNumeroDeTelefono = new JTextField();
		txtNumeroDeTelefono.setText("Numero de telefono del usuario");
		txtNumeroDeTelefono.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumeroDeTelefono.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtNumeroDeTelefono.setColumns(10);
		txtNumeroDeTelefono.setBounds(33, 537, 560, 30);
		add(txtNumeroDeTelefono);
		
		JLabel lblNewLabel_1_6_1 = new JLabel("Numero de Telefono");
		lblNewLabel_1_6_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_6_1.setBounds(33, 509, 145, 22);
		add(lblNewLabel_1_6_1);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnRegistrar.setBounds(260, 653, 119, 37);
		add(btnRegistrar);
		
		JLabel lblNewLabel_1_6_1_1 = new JLabel("Tipo de Usuario");
		lblNewLabel_1_6_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_6_1_1.setBounds(33, 577, 145, 22);
		add(lblNewLabel_1_6_1_1);
		
		JCheckBox chckbxSecretaria = new JCheckBox("Secretaria");
		chckbxSecretaria.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxSecretaria.setBounds(43, 605, 93, 21);
		add(chckbxSecretaria);
		
		JCheckBox chckbxDoctor = new JCheckBox("Doctor");
		chckbxDoctor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxDoctor.setBounds(161, 607, 93, 21);
		add(chckbxDoctor);
		
		JSpinner Edad = new JSpinner();
		Edad.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Edad.setBounds(33, 282, 110, 26);
		add(Edad);

	}
}
