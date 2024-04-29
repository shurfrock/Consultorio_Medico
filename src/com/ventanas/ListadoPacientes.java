package com.ventanas;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import com.componentes.Paciente;
import com.constantes.ConstantesComponentes;
import com.constantes.Fonts;
import com.dataAccessObject.PacienteDAOImplementacion;

import javax.swing.JScrollPane;

public class ListadoPacientes extends JPanel implements Fonts, ConstantesComponentes{

	private static final long serialVersionUID = 1L;
	private JTable table;

	public ListadoPacientes() {
		setLayout(null);
		
		try {
			List<Paciente> pacientes;
			
			PacienteDAOImplementacion DAO = new PacienteDAOImplementacion();
			
			pacientes = DAO.consultarTodo();
			
			if(pacientes.size() > FALSO) {
				
				JLabel lblNewLabel = new JLabel("Listado de pacientes");
				lblNewLabel.setBounds(520, 25, 200, 26);
				lblNewLabel.setFont(FUENTE_ENCABEZADO);
				add(lblNewLabel);
				
				DefaultTableModel modelo = new DefaultTableModel();
				
				modelo.addColumn("Nombre(s)");
				modelo.addColumn("Apellido(s)");
				modelo.addColumn("Edad en años");
				modelo.addColumn("Sexo");
				modelo.addColumn("Estado civil");
				modelo.addColumn("Domicilio");
				modelo.addColumn("CURP");
				String sexo;
				char sexoX;
				
				for(Paciente paciente : pacientes) {
					sexoX = paciente.getSexo();
					
					if(sexoX == MASCULINO) {
						sexo = "Masculino";
					}else if(sexoX == FEMENINO) {
						sexo = "Femenino";
					}else {
						sexo = "Otro";
					}
					modelo.addRow(new Object[] {paciente.getNombre(), paciente.getApellido(), paciente.getEdad(), sexo,
							paciente.getEstadoCivil(), paciente.getDomicilio(), paciente.getCurp()});
				}
				
				table = new JTable(modelo);
				table.setBounds(46, 78, 1200, 500);
				table.setFont(FUENTE_SECUNDARIA);
				table.setRowHeight(30);
				table.setRowMargin(10);
				table.setIntercellSpacing(new Dimension(10, 10));
				
				JScrollPane scrollPane = new JScrollPane(table);
				scrollPane.setBounds(46, 78, 1200, 500);
				scrollPane.createVerticalScrollBar();
				add(scrollPane);
				
			}else {
				JOptionPane.showMessageDialog(null, "No hay pacientes registrados en el sistema", "Importante", JOptionPane.INFORMATION_MESSAGE);
			}
			
		}catch(SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
}
