package com.ventanas;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import com.componentes.Doctor;
import com.componentes.Paciente;
import com.componentesVisuales.MyJButton;
import com.constantes.ConstantesComponentes;
import com.constantes.Fonts;
import com.dataAccessObject.DoctorDAOImplementacion;
import com.dataAccessObject.PacienteDAOImplementacion;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Dimension;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgendarCita extends JPanel implements ActionListener, Fonts, ConstantesComponentes{

	private static final long serialVersionUID = 1L;
	private JTextField campoNombre;
	private JTable table;
	private List<Paciente> pacientes;
	private List<Doctor> medicos;
	private DefaultTableModel modelo;
	private DefaultComboBoxModel<String> comboBoxModel;
	private DefaultComboBoxModel<String> horario;
	private boolean clickedBuscar;

	public AgendarCita() {
		setBackground(new Color(245, 245, 245));
		setLayout(null);
		
		clickedBuscar = false;
		JLabel lblNewLabel = new JLabel("Agendar Cita");
		lblNewLabel.setBounds(447, 11, 128, 30);
		lblNewLabel.setFont(FUENTE_ENCABEZADO);
		add(lblNewLabel);
		
		campoNombre = new JTextField();
		campoNombre.setToolTipText("Ingrese el nombre del paciente");
		campoNombre.setForeground(new Color(0, 0, 0));
		campoNombre.setBackground(new Color(255, 255, 255));
		campoNombre.setFont(FUENTE_SECUNDARIA);
		campoNombre.setHorizontalAlignment(SwingConstants.CENTER);
		campoNombre.setBounds(106, 71, 550, 31);
		add(campoNombre);
		campoNombre.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre del Paciente");
		lblNewLabel_1.setFont(FUENTE_PRINCIPAL);
		lblNewLabel_1.setBounds(106, 47, 184, 22);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Seleccionar Doctor");
		lblNewLabel_1_1.setFont(FUENTE_PRINCIPAL);
		lblNewLabel_1_1.setBounds(106, 301, 184, 22);
		add(lblNewLabel_1_1);
		
		comboBoxModel = new DefaultComboBoxModel<>();
		inicializarMedicos();
		
		JComboBox<String> comboBox = new JComboBox<>(comboBoxModel);
		comboBox.setBounds(106, 334, 706, 30);
		comboBox.setFont(FUENTE_SECUNDARIA);
		add(comboBox);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Seleccionar Fecha");
		lblNewLabel_1_1_1.setFont(FUENTE_PRINCIPAL);
		lblNewLabel_1_1_1.setBounds(106, 384, 184, 22);
		add(lblNewLabel_1_1_1);
		
		JDateChooser fecha = new JDateChooser();
		fecha.setBounds(106, 417, 194, 30);
		fecha.setFont(FUENTE_NOTAS);
		add(fecha);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Seleccionar Horario");
		lblNewLabel_1_1_1_1.setFont(FUENTE_PRINCIPAL);
		lblNewLabel_1_1_1_1.setBounds(105, 475, 184, 22);
		add(lblNewLabel_1_1_1_1);
		
		horario = new DefaultComboBoxModel<>();
		inicializarHorario();
		
		JComboBox<String> comboBox_1 = new JComboBox<>(horario);
		comboBox_1.setBounds(106, 516, 194, 30);
		comboBox_1.setFont(FUENTE_SECUNDARIA);
		add(comboBox_1);
		
		JButton btnAgendar = new JButton("Agendar");
		btnAgendar.setForeground(Color.BLACK);
		btnAgendar.setFont(FUENTE_SECUNDARIA);
		btnAgendar.setBackground(new Color(218, 218, 218));
		btnAgendar.setBounds(467, 559, 108, 30);
		add(btnAgendar);
		
		modelo = new DefaultTableModel();
		modelo.addColumn("Nombre completo");
		modelo.addColumn("Edad");
		modelo.addColumn("Sexo");
		modelo.addColumn("CURP");
		modelo.addColumn("Action");
		
		table = new JTable(modelo);
		table.setBounds(106, 127, 706, 163);
		table.setFont(FUENTE_SECUNDARIA);
		table.setRowHeight(30);
		table.setRowMargin(10);
		table.setIntercellSpacing(new Dimension(10,10));
		table.getColumn("Action").setCellRenderer(new MyJButton("Seleccionar"));
		add(table);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(106, 127, 887, 163);
		scrollPane.createVerticalScrollBar();
		add(scrollPane);
		
		JButton btnBuscar = new JButton(BUSCAR);
		btnBuscar.setBounds(684, 71, 89, 31);
		btnBuscar.setFont(FUENTE_SECUNDARIA);
		add(btnBuscar);
		
		JButton btnMostrarTodo = new JButton(MOSTRAR_TODO);
		btnMostrarTodo.setBounds(802, 71, 153, 31);
		btnMostrarTodo.setFont(FUENTE_SECUNDARIA);
		add(btnMostrarTodo);
		
		inicializarPacientes();
		
		btnBuscar.addActionListener(this);
		btnMostrarTodo.addActionListener(this);
	}
	
	private void inicializarPacientes() {
		PacienteDAOImplementacion DAO = new PacienteDAOImplementacion();
		
		try {
			pacientes = DAO.consultarTodo();
			
			if(pacientes.size() > FALSO) {
				clickedBuscar = true;
				mostrarTodo();
			}
			
		}catch(SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private void inicializarHorario() {
		
		int hora, minutos;
		String horario, horaInicio, horaFin;
		
		this.horario.addElement("Seleccione un horario");
		
		hora = 8;
		minutos = 0;
		horaInicio = "";
		horaFin = "";
		while(hora < 13) {
			
			horaInicio = Integer.toString(hora);
			
			if(minutos == 0) {
				horaInicio += ":00";
			}else {
				horaInicio += ":" + Integer.toString(minutos);
			}			
			
			if((minutos += 30) == 60) {
				hora++;
				horaFin = Integer.toString(hora);
				horaFin += ":00";
				minutos = 0;
			}else {
				horaFin = Integer.toString(hora);
				horaFin += ":" + Integer.toString(minutos);
			}
			
			horario = horaInicio + " - " + horaFin;
			
			this.horario.addElement(horario);
		}
		
		hora = 15;
		horaInicio = "";
		horaFin = "";
		minutos = 0;
		while(hora < 18) {
			
			horaInicio = Integer.toString(hora);
			
			if(minutos == 0) {
				horaInicio += ":00";
			}else {
				horaInicio += ":" + Integer.toString(minutos);
			}			
			
			if((minutos += 30) == 60) {
				hora++;
				horaFin = Integer.toString(hora);
				horaFin += ":00";
				minutos = 0;
			}else {
				horaFin = Integer.toString(hora);
				horaFin += ":" + Integer.toString(minutos);
			}
			
			horario = horaInicio + " - " + horaFin;
			
			this.horario.addElement(horario);
		}
	}
	
	private void inicializarMedicos() {
		
		DoctorDAOImplementacion DAO = new DoctorDAOImplementacion();
		
		try {
			String datosMedico;
			medicos = DAO.consultarTodo();
			
			comboBoxModel.addElement("Seleccione un médico");
			for(Doctor medico : medicos) {
				datosMedico = "";
				datosMedico += "Nombre: " + medico.getNombre() + " " + medico.getApellido() + " " + " Cedula: " + medico.getCedulaProfesional();
				comboBoxModel.addElement(datosMedico);
			}
			
		}catch(SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void actionPerformed(ActionEvent e) {
		
		switch(e.getActionCommand()) {
		case BUSCAR:
			actualizarModelo();
		break;
		
		case MOSTRAR_TODO:
			mostrarTodo();
		break;
		
		default:
			break;
		}
	}
	
	private void actualizarModelo() {
		String nombre = campoNombre.getText();
		
		if(!nombre.equals("")) {
			int i = 0;
			for(Paciente p : pacientes) {
				if(!p.getNombre().contains(nombre) && !p.getApellido().contains(nombre)) {
					modelo.removeRow(i);
				}else {
					i++;
				}
			}
			
			clickedBuscar = true;
			campoNombre.setText("");
			
		}else {
			JOptionPane.showMessageDialog(null, "Ingrese datos para continuar", "Importante", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	private void mostrarTodo() {
		
		if(clickedBuscar) {
			String sexo;
			char sexoX;
			
			eliminarDatosModelo();
			for(Paciente p : pacientes) {
				sexoX = p.getSexo();
				if(sexoX == 'M') {
					sexo = "Masculino";
				}else if(sexoX == 'F') {
					sexo = "Femenino";
				}else {
					sexo = "Otro";
				}
				
				modelo.addRow(new Object[] {p.getNombre() + " " + p.getApellido(), p.getEdad(), sexo, p.getCurp()});
			}
			
			clickedBuscar = false;
		}
	}
	
	private void eliminarDatosModelo() {
		int i, n;
		
		n = modelo.getRowCount();
		i = 0;
		
		System.out.println("Row count: " + n);
		
		while(i < n) {
			modelo.removeRow(0);
			i++;
		}
	}
}
