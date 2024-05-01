package com.ventanas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class VentanaPrinAdministrador extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panelLateral;
	private JPanel panelContenidoPrincipal;
	private PanelMenuPrinAdministrador menuPrincipal;
	
	
	public VentanaPrinAdministrador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 802, 504);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panelLateral = new JPanel();
		panelLateral.setPreferredSize(new Dimension(265, 0));
		contentPane.add(panelLateral, BorderLayout.WEST);
		
		panelContenidoPrincipal = new JPanel();
		contentPane.add(panelContenidoPrincipal, BorderLayout.CENTER);
		
		menuPrincipal = new PanelMenuPrinAdministrador();
	
		cambiarContenidoPanel(panelLateral, menuPrincipal);
	
	
		setContentPane(contentPane);
	}
	
	private void cambiarContenidoPanel(JPanel panel, JPanel contenido) {
		panel.removeAll();
		panel.add(contenido);
		panel.revalidate();
		panel.repaint();
	}
}
