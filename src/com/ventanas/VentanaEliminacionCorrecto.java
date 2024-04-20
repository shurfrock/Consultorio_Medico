package com.ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class VentanaEliminacionCorrecto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaEliminacionCorrecto frame = new VentanaEliminacionCorrecto();
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
	public VentanaEliminacionCorrecto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 475, 315);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEliminacion = new JLabel("Eliminacion");
		lblEliminacion.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		lblEliminacion.setBounds(160, 32, 147, 30);
		contentPane.add(lblEliminacion);
		
		JLabel lblSeEliminoCorrectamente = new JLabel("Se eliminó correctamente");
		lblSeEliminoCorrectamente.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		lblSeEliminoCorrectamente.setBounds(50, 90, 383, 79);
		contentPane.add(lblSeEliminoCorrectamente);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCerrar.setBounds(170, 202, 123, 47);
		contentPane.add(btnCerrar);
	}

}
