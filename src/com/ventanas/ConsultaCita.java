package com.ventanas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;

public class ConsultaCita extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public ConsultaCita() {
		setBackground(new Color(245, 245, 245));
		setLayout(null);
		
		JLabel lblConsultaDeCitas = new JLabel("Consulta de Citas");
		lblConsultaDeCitas.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		lblConsultaDeCitas.setBounds(200, 10, 208, 30);
		add(lblConsultaDeCitas);
		
		JButton btnSleccionarFecha = new JButton("Sleccionar Fecha");
		btnSleccionarFecha.setForeground(Color.BLACK);
		btnSleccionarFecha.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSleccionarFecha.setBackground(new Color(218, 218, 218));
		btnSleccionarFecha.setBounds(24, 60, 165, 30);
		add(btnSleccionarFecha);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBackground(new Color(221, 221, 221));
		list.setBounds(24, 115, 550, 165);
		add(list);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(574, 115, 17, 165);
		add(scrollBar);

	}

}
