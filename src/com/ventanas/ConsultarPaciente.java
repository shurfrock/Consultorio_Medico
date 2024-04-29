package com.ventanas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.PlainDocument;

import com.componentes.Paciente;
import com.componentes.UpperCaseDocumentFilter;
import com.constantes.ConstantesComponentes;
import com.constantes.Fonts;
import com.dataAccessObject.PacienteDAOImplementacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JButton;

public class ConsultarPaciente extends JPanel implements Fonts, ActionListener, ConstantesComponentes {
	
	private static final long serialVersionUID = 1L;
	private JTextField campoNombre;
	private JTextField campoCurp;
	private String usuario;

	public ConsultarPaciente(String usuario) {
		setLayout(null);
		
		this.usuario = usuario;
		JLabel lblConsultaDePaciente = new JLabel("Consulta de Paciente");
		lblConsultaDePaciente.setBounds(226, 11, 214, 30);
		lblConsultaDePaciente.setFont(FUENTE_ENCABEZADO);
		add(lblConsultaDePaciente);
		
		JLabel lblNota = new JLabel("Nota: Solo uno de los campos debe ser llenado");
		lblNota.setFont(FUENTE_NOTAS);
		lblNota.setHorizontalAlignment(SwingConstants.LEFT);
		lblNota.setBounds(144, 66, 341, 42);
		add(lblNota);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(256, 311, 123, 36);
		btnConsultar.setFont(FUENTE_PRINCIPAL);
		add(btnConsultar);
		
		campoNombre = new JTextField();
		campoNombre.setHorizontalAlignment(SwingConstants.CENTER);
		campoNombre.setColumns(10);
		campoNombre.setBounds(97, 158, 445, 30);
		campoNombre.setFont(FUENTE_SECUNDARIA);
		add(campoNombre);		
		
		campoCurp = new JTextField();
		((PlainDocument) campoCurp.getDocument()).setDocumentFilter(new UpperCaseDocumentFilter());
		campoCurp.setHorizontalAlignment(SwingConstants.CENTER);
		campoCurp.setColumns(10);
		campoCurp.setBounds(97, 250, 445, 30);
		campoCurp.setFont(FUENTE_SECUNDARIA);
		add(campoCurp);
		
		JLabel lblNombrePaciente = new JLabel("Nombre del paciente");
		lblNombrePaciente.setFont(FUENTE_PRINCIPAL);
		lblNombrePaciente.setBounds(97, 130, 177, 22);
		add(lblNombrePaciente);
		
		JLabel lblCurpPaciente = new JLabel("CURP del paciente");
		lblCurpPaciente.setFont(FUENTE_PRINCIPAL);
		lblCurpPaciente.setBounds(97, 224, 177, 22);
		add(lblCurpPaciente);
		
		JLabel lblExtra = new JLabel("ó");
		lblExtra.setHorizontalAlignment(SwingConstants.CENTER);
		lblExtra.setFont(FUENTE_PRINCIPAL);
		lblExtra.setBounds(276, 209, 59, 13);
		add(lblExtra);
		
		btnConsultar.addActionListener(this);
	}
	
	private boolean camposLlenos() {
		if(!campoNombre.getText().equals("") && !campoCurp.getText().equals("")) {
			return true;
		}
		
		return false;
	}
	
	private boolean camposVacios() {
		if(campoNombre.getText().equals("") && campoCurp.getText().equals("")) {
			return true;
		}
		
		return false;
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(camposLlenos()) {
			JOptionPane.showMessageDialog(null, "Solo uno de los campos debe de ser llenado!", "Error", JOptionPane.ERROR_MESSAGE);
		
		}else if(camposVacios()) {
			JOptionPane.showMessageDialog(null, "Para continuar, ingrese datos en uno de los campos", "Importante", JOptionPane.INFORMATION_MESSAGE);
		
		}else if(!campoNombre.getText().equals("") && campoCurp.getText().equals("")) {
			
			List<Paciente> pacientes;
			
			PacienteDAOImplementacion DAO = new PacienteDAOImplementacion();
			
			try {
				
				pacientes = DAO.buscarPaciente(campoNombre.getText());
				
				if(pacientes.size() > FALSO) {
					VentanaPacientesEncontrados ventana = new VentanaPacientesEncontrados(pacientes);
					ventana.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "No se encontraron coincidencias", "Importante", JOptionPane.INFORMATION_MESSAGE);
				}
				
			}catch(SQLException exception) {
				JOptionPane.showMessageDialog(null, exception.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
			}
		}else {
			
			if(campoCurp.getText().length() == TAM_CURP) {
				
				Paciente paciente;
				PacienteDAOImplementacion DAO = new PacienteDAOImplementacion();
				
				try {
					paciente = DAO.consultar(campoCurp.getText());
					if(paciente != null) {
						campoCurp.setText("");
						VentanaInformacionPaciente infoPaciente = new VentanaInformacionPaciente(usuario, paciente);
						infoPaciente.setVisible(true);
					}else {
						JOptionPane.showMessageDialog(null, "No existe ningún paciente con esa CURP!", "Importante", JOptionPane.INFORMATION_MESSAGE);
					}
					
				}catch(SQLException exception) {
					JOptionPane.showMessageDialog(null, exception.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
				}
				
				
			}else {
				JOptionPane.showMessageDialog(null, "La curp ingresada no es válida", "Importante", JOptionPane.INFORMATION_MESSAGE);
			}
			
		}
	}
}
