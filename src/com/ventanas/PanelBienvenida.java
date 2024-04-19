package com.ventanas;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import com.constantes.Colores;
import com.constantes.Fonts;
import java.awt.Color;

public class PanelBienvenida extends JPanel implements Fonts, Colores{

	private static final long serialVersionUID = 1L;

	public PanelBienvenida() {
		setBackground(COLOR_FONDO);
		setLayout(new BorderLayout(0, 0));
		
		JLabel txtBienvenida = new JLabel("Bienvenido al sistema");
		txtBienvenida.setForeground(new Color(0, 0, 0));
		txtBienvenida.setHorizontalAlignment(SwingConstants.CENTER);
		txtBienvenida.setFont(FUENTE_PRINCIPAL);
		add(txtBienvenida, BorderLayout.CENTER);
	}
}
