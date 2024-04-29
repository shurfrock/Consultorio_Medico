package com.componentesVisuales;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

import com.constantes.Fonts;

/* Este boton cuenta con la propiedad o caracteristica de poder ser mostrado sobre una columna de una celda */

public class MyJButton extends JButton implements TableCellRenderer, Fonts{
	
	private static final long serialVersionUID = 1L;
	
	public MyJButton(String nombre) {
		super(nombre);
		setFont(FUENTE_SECUNDARIA);
		
		super.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				System.out.println("Holaaaa");
			}
		});
	}
	
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		return this;
	}
}