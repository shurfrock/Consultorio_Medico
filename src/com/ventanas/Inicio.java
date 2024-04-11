package com.ventanas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.GridLayout;
import java.awt.FlowLayout;
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
		setBounds(100, 100, 1227, 658);
		
		/* Visual components and panels */
		
		JPanel panelPrincipal = new JPanel();
		JPanel panelIzquierdo = new JPanel();
		JLabel imgPanelIzq = new JLabel("");
		JPanel panelDerecho = new JPanel();
		JPanel panelSuperior = new JPanel();
		JLabel txtPrincipal = new JLabel("Inicio de Sesión");
		JPanel panelContenidoPrincipal = new JPanel();
		JLabel logoUsuario = new JLabel("");
		JPanel panelCamposEntrada = new JPanel();
		JLabel txtUsername = new JLabel("Username");
		MyJTextField campoUsername = new MyJTextField();
		JLabel txtPassword = new JLabel("Password");
		MyJPasswordField campoPassword = new MyJPasswordField();
		JPanel panelBoton = new JPanel();
		JPanel btnIngresar = new JPanel();
		JLabel txtBtnIngresar = new JLabel("Ingresar");
		JPanel panelInferior = new JPanel();
		
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
				
		panelDerecho.setLayout(new BorderLayout(0, 0));
		panelSuperior.setLayout(new BorderLayout(0, 0));
		panelSuperior.setBackground(COLOR_PRINCIPAL);
		panelSuperior.setPreferredSize(new Dimension(panelDerecho.getWidth(), 100));
		txtPrincipal.setForeground(COLOR_FONDO);
		txtPrincipal.setFont(FUENTE_TITULO);
		txtPrincipal.setHorizontalAlignment(SwingConstants.CENTER);
		panelSuperior.add(txtPrincipal, BorderLayout.CENTER);
		
		panelContenidoPrincipal.setLayout(new BorderLayout(0, 0));
		panelContenidoPrincipal.setBackground(COLOR_PRINCIPAL);
				
		logoUsuario.setIcon(new ImageIcon(Inicio.class.getResource("/com/imagenes/usuario(3).png")));
		logoUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		logoUsuario.setPreferredSize(new Dimension(200, 150));
		
		panelContenidoPrincipal.add(logoUsuario, BorderLayout.NORTH);
		
		panelCamposEntrada.setLayout(null);
		panelCamposEntrada.setBackground(COLOR_PRINCIPAL);
		txtUsername.setForeground(COLOR_FONDO);
		txtUsername.setFont(FUENTE_PRINCIPAL);
		txtUsername.setBounds(94, 36, 466, 29);
		panelCamposEntrada.add(txtUsername);
		
		campoUsername.setFont(FUENTE_SECUNDARIA);
		campoUsername.setEnabled(true);
		campoUsername.setEditable(true);
		campoUsername.setIcono(new ImageIcon(Inicio.class.getResource("/com/imagenes/usuario.png")));
		campoUsername.setToolTipText("Ingrese su nombre de usuario");
		campoUsername.setColumns(10);
		campoUsername.setBounds(94, 65, 501, 40);
		panelCamposEntrada.add(campoUsername);
		
		txtPassword.setForeground(COLOR_FONDO);
		txtPassword.setFont(FUENTE_PRINCIPAL);
		txtPassword.setBounds(94, 135, 466, 22);
		panelCamposEntrada.add(txtPassword);
		
		campoPassword.setEnabled(true);
		campoPassword.setEditable(true);
		campoPassword.setFont(FUENTE_SECUNDARIA);
		campoPassword.setIcono(new ImageIcon(Inicio.class.getResource("/com/imagenes/clave-de-usuario.png")));
		campoPassword.setToolTipText("Ingrese su contraseña");
		campoPassword.setBounds(94, 159, 501, 40);
		panelCamposEntrada.add(campoPassword);
		
		panelContenidoPrincipal.add(panelCamposEntrada, BorderLayout.CENTER);
		
		panelInferior.setBackground(COLOR_PRINCIPAL);
		panelInferior.setPreferredSize(new Dimension(50, 100));
		panelInferior.setLayout(new BorderLayout(0, 0));
				
		panelBoton.setBackground(COLOR_PRINCIPAL);
		panelBoton.setPreferredSize(new Dimension(450, 50));
		panelBoton.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnIngresar.setBorder(null);
		btnIngresar.setPreferredSize(new Dimension(120, 35));
		btnIngresar.setBackground(COLOR_FONDO);
		btnIngresar.setLayout(new BorderLayout(0, 0));
		
		txtBtnIngresar.setToolTipText("Presione para continuar");
		txtBtnIngresar.setForeground(COLOR_SECUNDARIO);
		txtBtnIngresar.setHorizontalAlignment(SwingConstants.CENTER);
		txtBtnIngresar.setFont(FUENTE_PRINCIPAL);
		btnIngresar.add(txtBtnIngresar, BorderLayout.CENTER);		
		
		panelBoton.add(btnIngresar);
		panelInferior.add(panelBoton, BorderLayout.NORTH);
		
		panelDerecho.add(panelSuperior, BorderLayout.NORTH);
		panelDerecho.add(panelContenidoPrincipal, BorderLayout.CENTER);
		panelDerecho.add(panelInferior, BorderLayout.SOUTH);
		
		panelPrincipal.add(panelIzquierdo);
		panelPrincipal.add(panelDerecho);
		setContentPane(panelPrincipal);
		
		/* End of component's configuration */
		
		
		/* Event handlers */

		txtBtnIngresar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnIngresar.setBackground(COLOR_MOUSE_OVER);				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				btnIngresar.setBackground(COLOR_FONDO);
			}
		});
	}	
}
