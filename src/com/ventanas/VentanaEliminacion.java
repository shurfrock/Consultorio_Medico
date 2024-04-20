package com.ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class VentanaEliminacion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaEliminacion frame = new VentanaEliminacion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaEliminacion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEliminacion = new JLabel("Eliminacion");
		lblEliminacion.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		lblEliminacion.setBounds(187, 10, 147, 30);
		contentPane.add(lblEliminacion);
		
		JLabel lblSeEliminar = new JLabel("Se eliminara del registro.");
		lblSeEliminar.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		lblSeEliminar.setBounds(37, 76, 465, 73);
		contentPane.add(lblSeEliminar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCancelar.setBounds(37, 223, 131, 36);
		contentPane.add(btnCancelar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEliminar.setBounds(371, 223, 131, 36);
		contentPane.add(btnEliminar);
	}

}
