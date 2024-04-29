package com.ventanas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Cursor;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import com.componentesVisuales.MyJPasswordField;
import com.componentesVisuales.MyJTextField;
import com.constantes.Colores;
import com.constantes.Fonts;

public class Inicio extends JFrame implements Colores, Fonts{

	private static final long serialVersionUID = 1L;

	public Inicio() {
		
		/* Initial frame configuration */
		
		super("Inicio de sesión");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 874, 533);
		setResizable(false);
		
		/* Visual components and panels */
		
		JPanel panelPrincipal = new JPanel();
		JPanel panelIzquierdo = new JPanel();
		JLabel imgPanelIzq = new JLabel("");
		JPanel panelDerecho = new JPanel();
		MyJTextField campoUsername = new MyJTextField();
		campoUsername.setIcono(new ImageIcon(Inicio.class.getResource("/com/imagenes/usuarioIcon.png")));
		campoUsername.setToolTipText("Ingrese su username");
		campoUsername.setBounds(76, 160, 293, 35);
		campoUsername.setFont(FUENTE_SECUNDARIA);
		campoUsername.setForeground(COLOR_SECUNDARIO);
		MyJPasswordField compoPassword = new MyJPasswordField();
		compoPassword.setIcono(new ImageIcon(Inicio.class.getResource("/com/imagenes/passwordIcon.png")));
		compoPassword.setToolTipText("Ingrese su contraseña");
		compoPassword.setBounds(76, 259, 293, 35);
		compoPassword.setFont(FUENTE_SECUNDARIA);
		compoPassword.setForeground(COLOR_SECUNDARIO);
		
		/* End components */
		
		
		/* components's configuration */
		
		panelPrincipal.setBackground(COLOR_FONDO);
		panelPrincipal.setBorder(null);
		panelPrincipal.setLayout(new GridLayout(1, 2));
		
		panelIzquierdo.setBackground(COLOR_FONDO);
		panelIzquierdo.setLayout(new BorderLayout(0, 0));
		imgPanelIzq.setIcon(new ImageIcon(Inicio.class.getResource("/com/imagenes/lock.png")));
		imgPanelIzq.setHorizontalAlignment(SwingConstants.CENTER);
		panelIzquierdo.add(imgPanelIzq, BorderLayout.CENTER);
		panelDerecho.setBackground(COLOR_PRINCIPAL);
		
		panelPrincipal.add(panelIzquierdo);
		panelPrincipal.add(panelDerecho);
		panelDerecho.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Inicio de sesión");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(93, 41, 251, 52);
		lblNewLabel.setFont(FUENTE_TITULO);
		lblNewLabel.setForeground(COLOR_FONDO);
		panelDerecho.add(lblNewLabel);
		
		panelDerecho.add(campoUsername);
		panelDerecho.add(compoPassword);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(76, 127, 107, 22);
		lblNewLabel_1.setFont(FUENTE_PRINCIPAL);
		lblNewLabel_1.setForeground(COLOR_FONDO);
		panelDerecho.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(76, 226, 107, 22);
		lblNewLabel_2.setFont(FUENTE_PRINCIPAL);
		lblNewLabel_2.setForeground(COLOR_FONDO);
		panelDerecho.add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				panel.setBackground(COLOR_MOUSE_OVER);
				panel.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			
			public void mouseExited(MouseEvent e) {
				panel.setBackground(COLOR_FONDO);
			}
		});
		panel.setBounds(161, 374, 135, 33);
		panel.setBackground(COLOR_FONDO);
		panelDerecho.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_3 = new JLabel("Ingresar");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(COLOR_SECUNDARIO);
		lblNewLabel_3.setFont(FUENTE_PRINCIPAL);
		panel.add(lblNewLabel_3, BorderLayout.CENTER);
		
		
		setContentPane(panelPrincipal);
	}	
}
