package com.componentesVisuales;

import javax.swing.JPasswordField;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;
import java.awt.Image;

public class MyJPasswordField extends JPasswordField {
	
	private static final long serialVersionUID = 1L;
	private Icon icono;	
	
	public MyJPasswordField() {
		icono = null;
	}
	
	public void setIcono(Icon icono) {
		this.icono = icono;
	}
	
	public Icon getIcono() {
		return this.icono;
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		paintIcono(g);
	}
	
	private void paintIcono(Graphics g) {
		
		if(icono != null) {
			Graphics2D g2d = (Graphics2D) g;
			Image imagen = ((ImageIcon)icono).getImage();
			int y = (this.getHeight() - icono.getIconHeight())/2;
			g2d.drawImage(imagen, 5, y, this);
			inicializarBorde();
		}
	}
	
	private void inicializarBorde() {
		this.setBorder(BorderFactory.createEmptyBorder(0,icono.getIconWidth()+7,0,0));
	}
}
