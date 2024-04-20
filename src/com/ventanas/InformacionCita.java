package com.ventanas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;

public class InformacionCita extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public InformacionCita() {
		setLayout(null);
		
		JLabel lblInformacionDelPaciente = new JLabel("Informacion del Paciente");
		lblInformacionDelPaciente.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		lblInformacionDelPaciente.setBounds(135, 10, 290, 30);
		add(lblInformacionDelPaciente);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNombre.setBounds(145, 82, 381, 19);
		add(lblNombre);
		
		JLabel lblNombres = new JLabel("Nombre(s):");
		lblNombres.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNombres.setBounds(26, 82, 109, 19);
		add(lblNombres);
		
		JLabel lblNombre_1 = new JLabel("Nombre");
		lblNombre_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNombre_1.setBounds(85, 121, 167, 19);
		add(lblNombre_1);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSexo.setBounds(26, 121, 63, 19);
		add(lblSexo);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEdad.setBounds(26, 160, 52, 19);
		add(lblEdad);
		
		JLabel lblEdad_2 = new JLabel("Edad");
		lblEdad_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEdad_2.setBounds(91, 160, 97, 19);
		add(lblEdad_2);
		
		JLabel lblCurp = new JLabel("CURP:");
		lblCurp.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCurp.setBounds(26, 196, 63, 19);
		add(lblCurp);
		
		JLabel lblCurp_2 = new JLabel("CURP");
		lblCurp_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCurp_2.setBounds(91, 196, 290, 19);
		add(lblCurp_2);
		
		JLabel lblPaciente = new JLabel("Paciente");
		lblPaciente.setFont(new Font("Trebuchet MS", Font.BOLD, 23));
		lblPaciente.setBounds(67, 50, 109, 28);
		add(lblPaciente);
		
		JLabel lblDoctora = new JLabel("Doctor(a)");
		lblDoctora.setFont(new Font("Trebuchet MS", Font.BOLD, 23));
		lblDoctora.setBounds(67, 229, 109, 28);
		add(lblDoctora);
		
		JLabel lblNombres_1 = new JLabel("Nombre(s):");
		lblNombres_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNombres_1.setBounds(26, 261, 109, 19);
		add(lblNombres_1);
		
		JLabel lblNombre_2 = new JLabel("Nombre");
		lblNombre_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNombre_2.setBounds(145, 261, 381, 19);
		add(lblNombre_2);
		
		JLabel lblNombre_1_1 = new JLabel("Nombre");
		lblNombre_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNombre_1_1.setBounds(85, 300, 167, 19);
		add(lblNombre_1_1);
		
		JLabel lblSexo_1 = new JLabel("Sexo:");
		lblSexo_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSexo_1.setBounds(26, 300, 63, 19);
		add(lblSexo_1);
		
		JLabel lblCedula = new JLabel("Cedula Profesional:");
		lblCedula.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCedula.setBounds(26, 339, 180, 19);
		add(lblCedula);
		
		JLabel lblCedula_2_1 = new JLabel("Cedula");
		lblCedula_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCedula_2_1.setBounds(207, 339, 319, 19);
		add(lblCedula_2_1);
		
		JLabel lblFechaHora = new JLabel("Fecha y Hora");
		lblFechaHora.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFechaHora.setBounds(157, 375, 369, 19);
		add(lblFechaHora);
		
		JLabel lblFechaYHora = new JLabel("Fecha y Hora:");
		lblFechaYHora.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblFechaYHora.setBounds(26, 375, 180, 19);
		add(lblFechaYHora);
		
		JButton btnActualizarCita = new JButton("Actualizar Cita");
		btnActualizarCita.setForeground(Color.BLACK);
		btnActualizarCita.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnActualizarCita.setBackground(new Color(218, 218, 218));
		btnActualizarCita.setBounds(26, 439, 165, 30);
		add(btnActualizarCita);
		
		JButton btnCancelarCita = new JButton("Cancelar Cita");
		btnCancelarCita.setForeground(Color.BLACK);
		btnCancelarCita.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCancelarCita.setBackground(new Color(218, 218, 218));
		btnCancelarCita.setBounds(392, 439, 165, 30);
		add(btnCancelarCita);

	}

}
