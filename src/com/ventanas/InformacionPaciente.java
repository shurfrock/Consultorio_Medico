package com.ventanas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class InformacionPaciente extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public InformacionPaciente() {
		setLayout(null);
		
		JLabel lblInformacionDelPaciente = new JLabel("Informacion del Paciente");
		lblInformacionDelPaciente.setBounds(182, 5, 290, 30);
		lblInformacionDelPaciente.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		add(lblInformacionDelPaciente);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(41, 77, 88, 19);
		add(lblNewLabel);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblApellidos.setBounds(41, 118, 97, 19);
		add(lblApellidos);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEdad.setBounds(41, 156, 52, 19);
		add(lblEdad);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSexo.setBounds(41, 192, 52, 19);
		add(lblSexo);
		
		JLabel lblEstadoCivil = new JLabel("Estado Civil:");
		lblEstadoCivil.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEstadoCivil.setBounds(41, 234, 124, 19);
		add(lblEstadoCivil);
		
		JLabel lblDomicilio = new JLabel("Domicilio:");
		lblDomicilio.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDomicilio.setBounds(41, 271, 97, 19);
		add(lblDomicilio);
		
		JLabel lblCurp = new JLabel("CURP:");
		lblCurp.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCurp.setBounds(41, 312, 63, 19);
		add(lblCurp);
		
		JButton btnNewButton = new JButton("Cerrar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(514, 305, 97, 30);
		add(btnNewButton);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNombre.setBounds(139, 77, 231, 19);
		add(lblNombre);
		
		JLabel lblApellidos_2 = new JLabel("Apellidos");
		lblApellidos_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblApellidos_2.setBounds(142, 118, 97, 19);
		add(lblApellidos_2);
		
		JLabel lblEdad_2 = new JLabel("Edad");
		lblEdad_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEdad_2.setBounds(106, 156, 97, 19);
		add(lblEdad_2);
		
		JLabel lblSexo_2 = new JLabel("Sexo");
		lblSexo_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSexo_2.setBounds(103, 192, 52, 19);
		add(lblSexo_2);
		
		JLabel lblEstadoCivil_2 = new JLabel("Estado Civil");
		lblEstadoCivil_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEstadoCivil_2.setBounds(159, 234, 124, 19);
		add(lblEstadoCivil_2);
		
		JLabel lblDomicilio_2 = new JLabel("Domicilio");
		lblDomicilio_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDomicilio_2.setBounds(139, 271, 97, 19);
		add(lblDomicilio_2);
		
		JLabel lblCurp_2 = new JLabel("CURP");
		lblCurp_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCurp_2.setBounds(106, 312, 169, 19);
		add(lblCurp_2);

	}

}
