package com.componentesVisuales;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventObject;

import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;


/* Clase que maneja los eventos del boton dentro de una celda */

public class TableEditor extends DefaultCellEditor {
	
	private static final long serialVersionUID = 1L;
	private JButton boton;

	public TableEditor() {
		super(new JCheckBox(""));
		
		boton = new JButton("ver info");
		boton.addActionListener(e -> {
			JTable table = (JTable) e.getSource();
            int row = table.convertRowIndexToModel(table.getEditingRow()); // Obtener la fila editada
            int column = table.convertColumnIndexToModel(table.getEditingColumn()); // Obtener la columna editada
            Object value = table.getModel().getValueAt(row, column); // Obtener el valor de la celda editada
            JOptionPane.showMessageDialog(table, "Información: " + value);
		});
	}

	@Override
	public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
		return boton;
	}

	
	
	
}