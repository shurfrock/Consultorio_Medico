package com.ventanas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.JScrollBar;
import javax.swing.JButton;

public class PacientesEncontrados extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public PacientesEncontrados() {
		setBackground(new Color(245, 245, 245));
		setLayout(null);
		
		JLabel lblPacientesEncontrados = new JLabel("Pacientes Encontrados");
		lblPacientesEncontrados.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		lblPacientesEncontrados.setBounds(170, 10, 266, 30);
		add(lblPacientesEncontrados);
		
		JList list = new JList();
		list.setToolTipText("");
		list.setBackground(new Color(221, 221, 221));
		list.setBounds(24, 68, 550, 100);
		add(list);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(573, 68, 17, 100);
		add(scrollBar);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.setBounds(237, 248, 123, 36);
		add(btnAtras);

	}
}
