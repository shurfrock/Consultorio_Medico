package com.ventanas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.JScrollBar;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;

public class ListadoUsuarios extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public ListadoUsuarios() {
		setBackground(new Color(245, 245, 245));
		setLayout(null);
		
		JLabel lblListadoDeUsuarios = new JLabel("Listado de Usuarios");
		lblListadoDeUsuarios.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		lblListadoDeUsuarios.setBounds(272, 10, 290, 30);
		add(lblListadoDeUsuarios);
		
		JList list = new JList();
		list.setToolTipText("");
		list.setBackground(new Color(221, 221, 221));
		list.setBounds(39, 109, 731, 142);
		add(list);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(770, 109, 17, 142);
		add(scrollBar);
		
		JCheckBox chckbxSecretaria = new JCheckBox("Secretaria");
		chckbxSecretaria.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxSecretaria.setBounds(39, 80, 93, 21);
		add(chckbxSecretaria);
		
		JCheckBox chckbxDoctor = new JCheckBox("Doctor");
		chckbxDoctor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxDoctor.setBounds(167, 82, 93, 21);
		add(chckbxDoctor);
		
		JLabel lblNewLabel = new JLabel("Filtrar:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(43, 56, 89, 18);
		add(lblNewLabel);

	}
}
