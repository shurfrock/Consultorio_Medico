package com.ventanas;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import com.constantes.*;
import java.awt.Dimension;

public class InfoCuentaSecretaria extends JPanel implements Fonts, Colores, ConstantesComponentes{

	private static final long serialVersionUID = 1L;	

	public InfoCuentaSecretaria(String cuenta) {
		setBackground(new Color(255, 255, 255));
		setBounds(100, 100, 822, 620);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 797, 80);
		panel.setPreferredSize(new Dimension(0, 80));
		add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Información de la cuenta");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(FUENTE_ENCABEZADO);
		lblNewLabel.setForeground(COLOR_SECUNDARIO);
		panel.add(lblNewLabel, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 80, 797, 540);
		panel_1.setPreferredSize(new Dimension(350, 70));
		add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(92, 11, 86, 22);
		lblNombre.setFont(FUENTE_PRINCIPAL);
		lblNombre.setForeground(COLOR_SECUNDARIO);;
		panel_1.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(92, 53, 68, 22);
		lblApellido.setFont(FUENTE_PRINCIPAL);
		lblApellido.setForeground(COLOR_SECUNDARIO);
		panel_1.add(lblApellido);
		
		JLabel lblEstadoCivil = new JLabel("Estado civil:");
		lblEstadoCivil.setBounds(92, 181, 93, 22);
		lblEstadoCivil.setFont(FUENTE_PRINCIPAL);
		lblEstadoCivil.setForeground(COLOR_SECUNDARIO);
		panel_1.add(lblEstadoCivil);
		
		JLabel lblEdad = new JLabel("Edad: ");
		lblEdad.setBounds(92, 138, 68, 14);
		lblEdad.setFont(FUENTE_PRINCIPAL);
		lblEdad.setForeground(COLOR_SECUNDARIO);
		panel_1.add(lblEdad);
		
		JLabel lblDireccion = new JLabel("Domicilio:");
		lblDireccion.setBounds(92, 235, 86, 14);
		lblDireccion.setForeground(COLOR_SECUNDARIO);
		lblDireccion.setFont(FUENTE_PRINCIPAL);
		panel_1.add(lblDireccion);
		
		JLabel lblCurp = new JLabel("CURP: ");
		lblCurp.setBounds(92, 325, 68, 14);
		lblCurp.setForeground(COLOR_SECUNDARIO);
		lblCurp.setFont(FUENTE_PRINCIPAL);
		panel_1.add(lblCurp);
		
		JLabel lblNumTel = new JLabel("Número de teléfono: ");
		lblNumTel.setBounds(92, 279, 183, 14);
		lblNumTel.setForeground(COLOR_SECUNDARIO);
		lblNumTel.setFont(FUENTE_PRINCIPAL);
		panel_1.add(lblNumTel);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setForeground(COLOR_SECUNDARIO);
		lblSexo.setFont(FUENTE_PRINCIPAL);
		lblSexo.setBounds(92, 99, 46, 14);
		panel_1.add(lblSexo);
		
		
		if(cuenta.equals(MEDICO)) {
			JLabel lblCedula = new JLabel("Cédula profesional:");
			lblCedula.setForeground(COLOR_SECUNDARIO);
			lblCedula.setFont(FUENTE_PRINCIPAL);
			lblCedula.setBounds(92, 371, 183, 20);
			panel_1.add(lblCedula);
		}
	}
}
