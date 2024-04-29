package com.ventanas;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.text.PlainDocument;

import com.componentes.Paciente;
import com.componentes.UpperCaseDocumentFilter;
import com.constantes.ConstantesComponentes;
import com.constantes.Fonts;
import com.dataAccessObject.PacienteDAOImplementacion;

import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;

import javax.swing.JSpinner;
import javax.swing.JComboBox;

public class RegistrarPaciente extends JPanel implements Fonts, ActionListener, ConstantesComponentes {

	private static final long serialVersionUID = 1L;
	private JTextField Nombre;
	private JTextField Apellidos;	
	private JSpinner spinnerEdad;
	private JCheckBox Masculino;
	private JCheckBox Femenino;
	private JCheckBox Otro;
	private char sexo;
	private JComboBox<String> comboBox;
	private JTextField domicilioPaciente;
	private JTextField curpPaciente;
	private boolean sexoSeleccionado;
	private boolean estadoCivilSeleccionado;

	public RegistrarPaciente() {
		setLayout(null);
		
		setPreferredSize(new Dimension(822, 620));
		Apellidos = new JTextField();
		Apellidos.setToolTipText("Ingrese los apellidos del paciente");
		Apellidos.setHorizontalAlignment(SwingConstants.CENTER);
		Apellidos.setFont(FUENTE_PRINCIPAL);
		Apellidos.setColumns(10);
		Apellidos.setBounds(95, 150, 560, 30);
		add(Apellidos);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido(s)");
		lblNewLabel_1.setFont(FUENTE_PRINCIPAL);
		lblNewLabel_1.setBounds(95, 122, 145, 22);
		add(lblNewLabel_1);
		
		JLabel lblRegistroDePaciente = new JLabel("Registro de Paciente");
		lblRegistroDePaciente.setFont(FUENTE_ENCABEZADO);
		lblRegistroDePaciente.setBounds(252, 11, 290, 30);
		add(lblRegistroDePaciente);
		
		Nombre = new JTextField();		
		Nombre.setToolTipText("Ingrese el nombre del paciente");
		Nombre.setHorizontalAlignment(SwingConstants.CENTER);
		Nombre.setFont(FUENTE_SECUNDARIA);
		Nombre.setColumns(10);
		Nombre.setBounds(95, 79, 560, 30);
		add(Nombre);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nombre del paciente");
		lblNewLabel_1_1.setFont(FUENTE_PRINCIPAL);
		lblNewLabel_1_1.setBounds(95, 51, 190, 22);
		add(lblNewLabel_1_1);		
		
		JLabel lblNewLabel_1_2 = new JLabel("Edad (minimo 0, máximo 100)");
		lblNewLabel_1_2.setFont(FUENTE_PRINCIPAL);
		lblNewLabel_1_2.setBounds(95, 190, 251, 22);
		add(lblNewLabel_1_2);
		
		SpinnerNumberModel model = new SpinnerNumberModel(0, 0, 100, 1);
		
		spinnerEdad = new JSpinner(model);
		spinnerEdad.setFont(FUENTE_SECUNDARIA);
		spinnerEdad.setBounds(95, 217, 72, 30);
		add(spinnerEdad);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setFont(FUENTE_PRINCIPAL);
		lblSexo.setBounds(95, 258, 145, 22);
		add(lblSexo);
		
		JLabel lblNewLabel_1_4 = new JLabel("Estado Civil");
		lblNewLabel_1_4.setFont(FUENTE_PRINCIPAL);
		lblNewLabel_1_4.setBounds(95, 326, 157, 22);
		add(lblNewLabel_1_4);
		
		String[] opciones = {"Seleccione una opción", "Soltero", "Casado", "Divorsiado", "Viudo"};
		comboBox = new JComboBox<>(opciones);
		comboBox.setBounds(95, 359, 202, 30);
		comboBox.setFont(FUENTE_SECUNDARIA);
		add(comboBox);
		
		domicilioPaciente = new JTextField();
		domicilioPaciente.setToolTipText("Ingrese el domicilio del paciente");
		domicilioPaciente.setHorizontalAlignment(SwingConstants.CENTER);
		domicilioPaciente.setFont(FUENTE_SECUNDARIA);
		domicilioPaciente.setColumns(10);
		domicilioPaciente.setBounds(95, 429, 560, 30);
		add(domicilioPaciente);
		
		JLabel lblNewLabel_1_5 = new JLabel("Domicilio del paciente");
		lblNewLabel_1_5.setFont(FUENTE_PRINCIPAL);
		lblNewLabel_1_5.setBounds(95, 401, 221, 22);
		add(lblNewLabel_1_5);
		
		curpPaciente = new JTextField();
        ((PlainDocument) curpPaciente.getDocument()).setDocumentFilter(new UpperCaseDocumentFilter());
		curpPaciente.setToolTipText("Ingrese la curp del paciente");
		curpPaciente.setHorizontalAlignment(SwingConstants.CENTER);
		curpPaciente.setFont(FUENTE_SECUNDARIA);
		curpPaciente.setColumns(10);
		curpPaciente.setBounds(95, 497, 560, 30);		
		add(curpPaciente);
		
		JLabel lblNewLabel_1_6 = new JLabel("CURP (18 caracteres)");
		lblNewLabel_1_6.setFont(FUENTE_PRINCIPAL);
		lblNewLabel_1_6.setBounds(95, 469, 190, 22);
		add(lblNewLabel_1_6);
		
		Masculino = new JCheckBox("Masculino");
		Masculino.setFont(FUENTE_PRINCIPAL);
		Masculino.setBounds(112, 286, 109, 21);
		add(Masculino);
		
		Femenino = new JCheckBox("Femenino");
		Femenino.setFont(FUENTE_PRINCIPAL);
		Femenino.setBounds(237, 287, 109, 21);
		add(Femenino);
		
		Otro = new JCheckBox("Otro");
		Otro.setFont(FUENTE_PRINCIPAL);
		Otro.setBounds(363, 286, 93, 21);
		add(Otro);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(332, 554, 119, 37);
		btnGuardar.setFont(FUENTE_PRINCIPAL);
		add(btnGuardar);
		
		sexoSeleccionado = false;
		estadoCivilSeleccionado = false;
		
		btnGuardar.addActionListener(this);		
		
		/* Events */
		
		comboBox.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(comboBox.getSelectedIndex() != 0) {
					estadoCivilSeleccionado = true;
				}else {
					estadoCivilSeleccionado = false;
				}
			}
		});
		
		Masculino.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					Femenino.setSelected(false);
					Otro.setSelected(false);
					sexo = 'M';
					sexoSeleccionado = true;
				}else {
					sexoSeleccionado = false;
				}
			}
		});
		
		Femenino.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					Masculino.setSelected(false);
					Otro.setSelected(false);
					sexo = 'F';
					sexoSeleccionado = true;
				}else {
					sexoSeleccionado  = false;
				}
			}
		});
		
		Otro.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					Masculino.setSelected(false);
					Femenino.setSelected(false);
					sexo = 'O';
					sexoSeleccionado = true;
				}else {
					sexoSeleccionado = false;
				}
			}
		});
	}
	
	private boolean camposLlenos() {
		
		boolean nombreValido, apellidoValido, domicilioValido, curpValida;
		
		nombreValido = !Nombre.getText().equals("");
		apellidoValido = !Apellidos.getText().equals("");
		domicilioValido = !domicilioPaciente.getText().equals("");
		curpValida = curpPaciente.getText().length() == TAM_CURP;
		
		if((nombreValido) && (apellidoValido) &&  (sexoSeleccionado) && (estadoCivilSeleccionado) && (domicilioValido) && (curpValida)) {
			return true;
		}
		
		return false;
	}
	
	private void limpiarCampos() {
		Nombre.setText("");
		Apellidos.setText("");
		spinnerEdad.setValue(0);
		Masculino.setSelected(false);
		Femenino.setSelected(false);
		Otro.setSelected(false);
		comboBox.setSelectedIndex(0);
		domicilioPaciente.setText("");
		curpPaciente.setText("");
		sexoSeleccionado = false;
		estadoCivilSeleccionado = false;
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(camposLlenos()) {
			String nombre, apellido, estadoCivil, domicilio, curp;
			short edad;
			
			nombre = Nombre.getText();
			apellido = Apellidos.getText();
			edad = Short.parseShort(spinnerEdad.getValue().toString());
			estadoCivil = comboBox.getSelectedItem().toString();
			domicilio = domicilioPaciente.getText();
			curp = curpPaciente.getText();
			
			Paciente paciente = new Paciente(nombre, apellido, edad, sexo, estadoCivil, domicilio, curp, null);
			
			PacienteDAOImplementacion DataAccessObject = new PacienteDAOImplementacion();
			
			try {
				DataAccessObject.insertar(paciente);
				limpiarCampos();
								
				JOptionPane.showMessageDialog(null, "Paciente registrado correctamente!", "Registro exitoso", JOptionPane.DEFAULT_OPTION);
				
			}catch(SQLException exception) {
				JOptionPane.showMessageDialog(null, exception.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
			}
						
		}else {
			
			JOptionPane.showMessageDialog(null, "Favor de llenar los campos correctamente!", "Error!", JOptionPane.INFORMATION_MESSAGE);
		}		
	}
}
