package com.ventanas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.JScrollBar;
import javax.swing.JButton;

public class ListadoCitas extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public ListadoCitas() {
		setBackground(new Color(245, 245, 245));
		setLayout(null);
		
		JLabel lblTitle = new JLabel("Listado de Citas");
		lblTitle.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		lblTitle.setBounds(200, 21, 195, 30);
		add(lblTitle);
		
		JList list = new JList();
		list.setToolTipText("");
		list.setBackground(new Color(221, 221, 221));
		list.setBounds(28, 116, 550, 100);
		add(list);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(577, 116, 17, 100);
		add(scrollBar);
		
		JButton btnSeleccionarFecha = new JButton("Seleccionar Fecha");
		btnSeleccionarFecha.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSeleccionarFecha.setBounds(28, 79, 131, 23);
		add(btnSeleccionarFecha);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCerrar.setBounds(220, 265, 163, 45);
		add(btnCerrar);

	}

}
