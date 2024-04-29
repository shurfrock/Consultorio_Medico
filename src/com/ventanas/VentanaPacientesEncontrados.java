package com.ventanas;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import com.componentes.Paciente;
import com.componentesVisuales.MyJButton;
import com.componentesVisuales.TableEditor;
import com.constantes.Colores;
import com.constantes.Fonts;
import javax.swing.border.LineBorder;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JScrollPane;

public class VentanaPacientesEncontrados extends JFrame implements Fonts, Colores {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int indice;

	public VentanaPacientesEncontrados(List<Paciente> pacientes) {
		super("Listado de pacientes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 869, 454);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		indice = 0;
		
		JLabel lblPacientesEncontrados = new JLabel("Pacientes Encontrados");
		lblPacientesEncontrados.setHorizontalAlignment(SwingConstants.CENTER);
		lblPacientesEncontrados.setFont(FUENTE_ENCABEZADO);
		lblPacientesEncontrados.setBounds(310, 11, 219, 30);
		contentPane.add(lblPacientesEncontrados);
		
		JButton btnAtras = new JButton("Regresar");
		btnAtras.setBounds(685, 368, 123, 36);
		contentPane.add(btnAtras);
		
		DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nombre completo");
        model.addColumn("Domicilio");
        model.addColumn("Action");
        
        for(Paciente paciente : pacientes) {
        	model.addRow(new Object[] {paciente.getNombre() + " " +paciente.getApellido(), paciente.getDomicilio()});
        }
        
        JTable table = new JTable(model);
        table.setFont(FUENTE_SECUNDARIA);
        table.setRowHeight(30);
        table.setRowMargin(10);
        table.setIntercellSpacing(new Dimension(10, 10));
        table.setBounds(26, 68, 802, 264);
        table.getColumn("Action").setCellRenderer(new MyJButton("Ver información"));
        table.getColumn("Action").setCellEditor(new TableEditor());
        //table.getColumn("Action").setCellEditor(new TableEditor(new JCheckBox()));
        //table.getColumn("Action").setcell
        
        JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(26, 68, 802, 264);
		contentPane.add(scrollPane);
        
		setContentPane(contentPane);
	}
}
