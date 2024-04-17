package com.ventanas;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.SwingConstants;
import javax.swing.JScrollBar;
import java.awt.Color;

public class AgendarCita extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtIngreseElNombre;
	private JTextField textField;
	private JTextField txtFecha;
	private JTextField txtSeleccionarHorario;

	/**
	 * Create the panel.
	 */
	public AgendarCita() {
		setBackground(new Color(245, 245, 245));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Agendar Cita");
		lblNewLabel.setBounds(240, 10, 149, 30);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		add(lblNewLabel);
		
		txtIngreseElNombre = new JTextField();
		txtIngreseElNombre.setForeground(new Color(0, 0, 0));
		txtIngreseElNombre.setBackground(new Color(255, 255, 255));
		txtIngreseElNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtIngreseElNombre.setHorizontalAlignment(SwingConstants.CENTER);
		txtIngreseElNombre.setText("Ingrese el Nombre del paciente");
		txtIngreseElNombre.setBounds(20, 72, 446, 31);
		add(txtIngreseElNombre);
		txtIngreseElNombre.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBuscar.setForeground(new Color(0, 0, 0));
		btnBuscar.setBackground(new Color(218, 218, 218));
		btnBuscar.setBounds(502, 72, 85, 31);
		add(btnBuscar);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre del Paciente");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(20, 53, 184, 13);
		add(lblNewLabel_1);
		
		JList list = new JList();
		list.setBackground(new Color(221, 221, 221));
		list.setBounds(20, 124, 550, 100);
		add(list);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(570, 124, 17, 100);
		add(scrollBar);
		
		JLabel lblNewLabel_1_1 = new JLabel("Seleccionar Doctor");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(20, 247, 184, 13);
		add(lblNewLabel_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(558, 270, 29, 30);
		add(comboBox);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setText("...");
		textField.setBounds(20, 270, 538, 30);
		add(textField);
		textField.setColumns(10);
		
		txtFecha = new JTextField();
		txtFecha.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtFecha.setText("Fecha 00 - 00 - 0000");
		txtFecha.setHorizontalAlignment(SwingConstants.LEFT);
		txtFecha.setColumns(10);
		txtFecha.setBounds(20, 343, 194, 30);
		add(txtFecha);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Seleccionar Fecha");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(20, 320, 184, 13);
		add(lblNewLabel_1_1_1);
		
		txtSeleccionarHorario = new JTextField();
		txtSeleccionarHorario.setText("Seleccionar Horario");
		txtSeleccionarHorario.setHorizontalAlignment(SwingConstants.LEFT);
		txtSeleccionarHorario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtSeleccionarHorario.setColumns(10);
		txtSeleccionarHorario.setBounds(20, 427, 194, 30);
		add(txtSeleccionarHorario);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Seleccionar Horario");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1.setBounds(20, 404, 184, 13);
		add(lblNewLabel_1_1_1_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(212, 427, 29, 30);
		add(comboBox_1);
		
		JButton btnAgendar = new JButton("Agendar");
		btnAgendar.setForeground(Color.BLACK);
		btnAgendar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAgendar.setBackground(new Color(218, 218, 218));
		btnAgendar.setBounds(240, 490, 138, 47);
		add(btnAgendar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setForeground(Color.BLACK);
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCancelar.setBackground(new Color(218, 218, 218));
		btnCancelar.setBounds(484, 461, 108, 30);
		add(btnCancelar);

	}
}
