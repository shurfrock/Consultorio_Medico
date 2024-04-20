package com.ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class EnfermedadRegistrada extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EnfermedadRegistrada frame = new EnfermedadRegistrada();
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
	public EnfermedadRegistrada() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 685, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRegistroDeEnfermedades = new JLabel("Registro de Enfermedades");
		lblRegistroDeEnfermedades.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		lblRegistroDeEnfermedades.setBounds(180, 10, 316, 30);
		contentPane.add(lblRegistroDeEnfermedades);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enfermedad:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(10, 53, 145, 22);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Signos:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(10, 93, 145, 30);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Sintomas:");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1_1_1.setBounds(10, 185, 145, 30);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnModificar.setBounds(377, 326, 119, 37);
		contentPane.add(btnModificar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEliminar.setBounds(542, 326, 119, 37);
		contentPane.add(btnEliminar);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Enfermedad");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_2.setBounds(153, 53, 464, 22);
		contentPane.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("signos");
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_2_1.setBounds(10, 125, 651, 58);
		contentPane.add(lblNewLabel_1_1_2_1);
		
		JLabel lblNewLabel_1_1_2_1_1 = new JLabel("sintomas");
		lblNewLabel_1_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_2_1_1.setBounds(10, 214, 651, 58);
		contentPane.add(lblNewLabel_1_1_2_1_1);
	}
}
