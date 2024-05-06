package com.ventanas;

import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JLabel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JOptionPane;
import com.componentes.Paciente;
import com.componentes.Signo;
import com.componentes.Sintoma;
import com.componentesVisuales.MyJButton;
import com.constantes.ConstantesComponentes;
import com.constantes.Fonts;
import com.dataAccessObject.PacienteDAOImplementacion;
import com.dataAccessObject.SignoDAOImplementacion;
import com.dataAccessObject.SintomaDAOImplementacion;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class CrearConsulta extends JPanel implements Fonts, ConstantesComponentes {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField campoSignosSeleccionados;
	private JTextField campoSintomasSeleccionados;
	private JTable tablePacientes;
	private DefaultTableModel modeloTabla;
	private JPopupMenu popUpMenuSignos;
	private JPopupMenu popUpMenuSintomas;
	private List<String> signosSeleccionados;
	private List<String> sintomasSeleccionados;

	public CrearConsulta() {
		setBackground(new Color(245, 245, 245));
		setLayout(null);
		
		JLabel lblCrearConsulta = new JLabel("Consulta Medica");
		lblCrearConsulta.setFont(FUENTE_SECUNDARIA);
		lblCrearConsulta.setBounds(401, 11, 178, 30);
		add(lblCrearConsulta);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(Color.BLACK);
		textField.setFont(FUENTE_SECUNDARIA);
		textField.setColumns(10);
		textField.setBounds(45, 79, 446, 31);
		add(textField);
		
		JLabel lblNombrePaciente = new JLabel("Nombre del Paciente");
		lblNombrePaciente.setFont(FUENTE_PRINCIPAL);
		lblNombrePaciente.setBounds(45, 50, 184, 25);
		add(lblNombrePaciente);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setForeground(Color.BLACK);
		btnBuscar.setFont(FUENTE_SECUNDARIA);		
		btnBuscar.setBounds(527, 79, 97, 31);
		add(btnBuscar);
		
		JLabel lblSigno = new JLabel("Signos");
		lblSigno.setFont(FUENTE_PRINCIPAL);
		lblSigno.setBounds(45, 313, 184, 19);
		add(lblSigno);
		
		JLabel lblSintoma = new JLabel("Sintomas");
		lblSintoma.setFont(FUENTE_PRINCIPAL);
		lblSintoma.setBounds(45, 376, 184, 19);
		add(lblSintoma);
		
		campoSignosSeleccionados = new JTextField();
		campoSignosSeleccionados.setEditable(false);
		campoSignosSeleccionados.setHorizontalAlignment(SwingConstants.CENTER);
		campoSignosSeleccionados.setForeground(Color.BLACK);
		campoSignosSeleccionados.setFont(FUENTE_SECUNDARIA);
		campoSignosSeleccionados.setColumns(10);
		campoSignosSeleccionados.setBackground(Color.WHITE);
		campoSignosSeleccionados.setBounds(45, 481, 567, 31);
		add(campoSignosSeleccionados);
		
		JLabel lblSignosSeleccionados = new JLabel("Signos Seleccionados");
		lblSignosSeleccionados.setFont(FUENTE_PRINCIPAL);
		lblSignosSeleccionados.setBounds(45, 451, 195, 19);
		add(lblSignosSeleccionados);
		
		campoSintomasSeleccionados = new JTextField();
		campoSintomasSeleccionados.setHorizontalAlignment(SwingConstants.CENTER);
		campoSintomasSeleccionados.setForeground(Color.BLACK);
		campoSintomasSeleccionados.setFont(FUENTE_SECUNDARIA);
		campoSintomasSeleccionados.setColumns(10);
		campoSintomasSeleccionados.setBackground(Color.WHITE);
		campoSintomasSeleccionados.setBounds(45, 553, 567, 31);
		add(campoSintomasSeleccionados);
		
		JLabel lblSintomasSeleccionados = new JLabel("Sintomas Seleccionados");
		lblSintomasSeleccionados.setFont(FUENTE_PRINCIPAL);
		lblSintomasSeleccionados.setBounds(45, 523, 221, 19);
		add(lblSintomasSeleccionados);
		
		JButton btnGenerarDiagnostico = new JButton("Generar Diagnostico");
		btnGenerarDiagnostico.setForeground(Color.BLACK);
		btnGenerarDiagnostico.setFont(FUENTE_SECUNDARIA);
		btnGenerarDiagnostico.setBackground(new Color(218, 218, 218));
		btnGenerarDiagnostico.setBounds(371, 613, 208, 39);
		add(btnGenerarDiagnostico);
		
		modeloTabla = new DefaultTableModel();
		inicializarModeloTabla();
		
		tablePacientes = new JTable(modeloTabla);
		tablePacientes.setFont(FUENTE_SECUNDARIA);
		tablePacientes.setRowHeight(30);
		tablePacientes.setRowMargin(10);
		tablePacientes.setIntercellSpacing(new Dimension(10,10));
		tablePacientes.getColumn("Action").setCellRenderer(new MyJButton("Seleccionar"));
		
		JScrollPane scrollPane = new JScrollPane(tablePacientes);
		scrollPane.setBounds(45, 121, 886, 181);
		add(scrollPane);
		
		JButton btnSignos = new JButton("Seleccionar signos");
		btnSignos.setBounds(45, 343, 208, 30);
		btnSignos.setFont(FUENTE_SECUNDARIA);
		add(btnSignos);
		
		popUpMenuSignos = new JPopupMenu();
		popUpMenuSignos.setFont(FUENTE_SECUNDARIA);
		signosSeleccionados = new ArrayList<>();
		inicializarSignos();
		
		JButton btnSintomas = new JButton("Seleccionar sintomas");
		btnSintomas.setBounds(45, 406, 208, 30);
		btnSintomas.setFont(FUENTE_SECUNDARIA);
		add(btnSintomas);

		popUpMenuSintomas = new JPopupMenu();
		sintomasSeleccionados = new ArrayList<>();
		inicializarSintomas();
		
		btnSignos.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				popUpMenuSignos.show(btnSignos, 0, btnSintomas.getHeight());
			}
		});
		
		btnSintomas.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				popUpMenuSintomas.show(btnSintomas, 0, btnSintomas.getHeight());
			}
		});
	}

	private void inicializarSignos() {
		
		try {
			List<Signo> signos;
			SignoDAOImplementacion DAO = new SignoDAOImplementacion();

			signos = DAO.consultarTodo();

			if(signos.size() > 0) {				
				for(Signo signo : signos) {
					
					JCheckBoxMenuItem item = new JCheckBoxMenuItem(signo.getNombre());
					
					item.addActionListener(new ActionListener() {
						
						public void actionPerformed(ActionEvent e) {
							
							JCheckBoxMenuItem item = (JCheckBoxMenuItem)e.getSource();
							
							if(item.getState()) { // es verdadero
								
								signosSeleccionados.add(item.getText());
								actualizarCampoSignosSeleccionados();
								
							}else { // es falso
								signosSeleccionados.remove(item.getText());
								actualizarCampoSignosSeleccionados();
							}
						}
					});
					
					popUpMenuSignos.add(item);
				}
				
			}else {
				// falta de implementar
			}
			
		}catch(SQLException e) {
			mostrarMensajeError(e);
		}
	}
	
	private void inicializarSintomas() {

		try {
			List<Sintoma> sintomas;
			SintomaDAOImplementacion DAO = new SintomaDAOImplementacion();
			
			sintomas = DAO.consultarTodo();
			
			if(sintomas.size() > 0) {
				
				for(Sintoma sintoma : sintomas) {
					
					JCheckBoxMenuItem item = new JCheckBoxMenuItem(sintoma.getNombre());
					
					item.addActionListener(new ActionListener() {
						
						public void actionPerformed(ActionEvent e) {
							
							JCheckBoxMenuItem item = (JCheckBoxMenuItem)e.getSource();
							
							if(item.getState()) { // es verdadero
								
								sintomasSeleccionados.add(item.getText());
								actualizarCampoSintomasSeleccionados();
								
							}else { // es falso
								sintomasSeleccionados.remove(item.getText());
								actualizarCampoSintomasSeleccionados();
							}
							
						}
					});
					
					popUpMenuSintomas.add(item);
				}
				
			}else {
				// falta de implementar
			}
			
		}catch(SQLException e) {
			mostrarMensajeError(e);
		}
	}
	
	private void inicializarModeloTabla() {
		
		modeloTabla.addColumn("Nombre completo");
		modeloTabla.addColumn("Edad");
		modeloTabla.addColumn("Sexo");
		modeloTabla.addColumn("CURP");
		modeloTabla.addColumn("Action");
		
		try {
			List<Paciente> pacientes;
			String sexo;
			char sexoX;
			PacienteDAOImplementacion DAO = new PacienteDAOImplementacion();
			
			pacientes = DAO.consultarTodo();
			
			for(Paciente p : pacientes) {
				sexoX = p.getSexo();
				if(sexoX == 'M') {
					sexo = "Masculino";
				}else if(sexoX == 'F') {
					sexo = "Femenino";
				}else {
					sexo = "Otro";
				}
				modeloTabla.addRow(new Object[] {p.getNombre() + " " + p.getApellido(), p.getEdad(), sexo, p.getCurp()});
			}
			
		}catch(SQLException e) {
			mostrarMensajeError(e);
		}
		
	}
	
	private void mostrarMensajeError(SQLException e) {
		JOptionPane.showMessageDialog(null, e.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
	}
	
	private void actualizarCampoSignosSeleccionados() {
		
		String texto;
		int n, i;
		texto = "";
		
		n = signosSeleccionados.size();
		i = 0;
		for(String signo : signosSeleccionados) {
			texto += signo;
			
			if(i < n-1) {
				texto += ", ";
			}
			
			i++;
		}
		
		campoSignosSeleccionados.setText(texto);
	}
	
	private void actualizarCampoSintomasSeleccionados() {
		
		String texto = "";
		int n, i;
		
		n = sintomasSeleccionados.size();
		i = 0;
		for(String s : sintomasSeleccionados) {
			texto += s;
			
			if(i < n-1) {
				texto += ", ";
			}
			i++;
		}
		
		campoSintomasSeleccionados.setText(texto);
	}
}