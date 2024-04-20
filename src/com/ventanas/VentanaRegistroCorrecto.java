package com.ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class VentanaRegistroCorrecto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRegistroCorrecto frame = new VentanaRegistroCorrecto();
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
	public VentanaRegistroCorrecto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGuardado = new JLabel("Guardado");
		lblGuardado.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		lblGuardado.setBounds(145, 23, 147, 30);
		contentPane.add(lblGuardado);
		
		JLabel lblSeGuardoCorrectamente = new JLabel("Se guardo correctamente");
		lblSeGuardoCorrectamente.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		lblSeGuardoCorrectamente.setBounds(30, 94, 383, 79);
		contentPane.add(lblSeGuardoCorrectamente);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCerrar.setBounds(150, 206, 123, 47);
		contentPane.add(btnCerrar);
	}

}
