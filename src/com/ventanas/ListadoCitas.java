package com.ventanas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.JScrollBar;
import com.constantes.Fonts;
import javax.swing.JButton;

public class ListadoCitas extends JPanel implements Fonts{

	private static final long serialVersionUID = 1L;

	public ListadoCitas() {
		setBackground(new Color(245, 245, 245));
		setLayout(null);
		
		JLabel lblTitle = new JLabel("Listado de Citas");
		lblTitle.setFont(FUENTE_ENCABEZADO);
		lblTitle.setBounds(200, 21, 195, 30);
		add(lblTitle);
		
		JList list = new JList();
		list.setBackground(new Color(221, 221, 221));
		list.setBounds(28, 116, 550, 100);
		add(list);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(577, 116, 17, 100);
		add(scrollBar);
		
		JButton btnSeleccionarFecha = new JButton("Seleccionar Fecha");
		btnSeleccionarFecha.setFont(FUENTE_SECUNDARIA);
		btnSeleccionarFecha.setBounds(28, 79, 178, 25);
		add(btnSeleccionarFecha);
	}
}
