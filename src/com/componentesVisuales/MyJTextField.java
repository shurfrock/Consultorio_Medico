package com.componentesVisuales;

import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

public class MyJTextField extends JTextField { // crear un componente que se pueda reutilizar. Este componente es un TextField personalizado.
	// Le vamos a crear la posibilidad de tener un icono.
	
	private static final long serialVersionUID = 1L;	
	private Icon icono;
	
	public MyJTextField() {
		icono = null;		
	}
	
	public void setIcono(Icon icono) {
		this.icono = icono;
	}
	
	public Icon getIcono() {
		return this.icono;		
	}
	
	protected void paintComponent(Graphics g) { // metodo protegido.
		super.paintComponent(g);
		paintIcon(g);
	}
	
	private void paintIcon(Graphics g) { // metodo que se encarga de pintar el icono en el componente
		
		if(icono != null) {
			
			Graphics2D g2d = (Graphics2D) g; // casteo de tipo de dato
			Image imagen = ((ImageIcon)icono).getImage();
			int y = (this.getHeight() - icono.getIconHeight()) / 2;
			g2d.drawImage(imagen, 5, y, this);
			inicializarBorde();
		}
	}
	
	private void inicializarBorde() {
		this.setBorder(BorderFactory.createEmptyBorder(0,icono.getIconWidth()+5,0,0));
	}
}