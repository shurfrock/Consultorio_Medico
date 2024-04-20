package com.ventanas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ConsultaUsuarios extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textNombreUsuario;
	private JTextField textCURPUsuario;

	/**
	 * Create the panel.
	 */
	public ConsultaUsuarios() {
		setLayout(null);
		
		JLabel lblConsultaDeUsuario = new JLabel("Consulta de Usuario");
		lblConsultaDeUsuario.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		lblConsultaDeUsuario.setBounds(132, 20, 266, 30);
		add(lblConsultaDeUsuario);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre del usuario");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(47, 60, 145, 22);
		add(lblNewLabel_1);
		
		textNombreUsuario = new JTextField();
		textNombreUsuario.setColumns(10);
		textNombreUsuario.setBounds(47, 88, 445, 30);
		add(textNombreUsuario);
		
		JLabel lblNewLabel_1_1 = new JLabel("CURP del usuario");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(47, 154, 145, 22);
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("ó");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(253, 138, 59, 13);
		add(lblNewLabel_2);
		
		textCURPUsuario = new JTextField();
		textCURPUsuario.setColumns(10);
		textCURPUsuario.setBounds(47, 180, 445, 30);
		add(textCURPUsuario);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnConsultar.setBounds(206, 241, 123, 36);
		add(btnConsultar);

	}

}
