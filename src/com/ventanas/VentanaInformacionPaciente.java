package com.ventanas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.componentes.Paciente;
import com.constantes.ConstantesComponentes;
import com.constantes.Fonts;
import javax.swing.JLabel;
import javax.swing.JButton;

public class VentanaInformacionPaciente extends JFrame implements ActionListener, Fonts, ConstantesComponentes {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public VentanaInformacionPaciente(String usuario, Paciente paciente) {
		super("Información del paciente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 714, 493);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEncabezado = new JLabel("Información del paciente");
		lblEncabezado.setBounds(239, 11, 244, 20);
		lblEncabezado.setFont(FUENTE_ENCABEZADO);
		contentPane.add(lblEncabezado);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(64, 69, 83, 20);
		lblNombre.setFont(FUENTE_PRINCIPAL);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido(s):");
		lblApellido.setBounds(64, 115, 103, 20);
		lblApellido.setFont(FUENTE_PRINCIPAL);
		contentPane.add(lblApellido);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(64, 160, 46, 20);
		lblSexo.setFont(FUENTE_PRINCIPAL);
		contentPane.add(lblSexo);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setBounds(64, 205, 46, 20);
		lblEdad.setFont(FUENTE_PRINCIPAL);
		contentPane.add(lblEdad);
		
		JLabel lblEstadoCivil = new JLabel("Estado civil:");
		lblEstadoCivil.setBounds(64, 251, 103, 20);
		lblEstadoCivil.setFont(FUENTE_PRINCIPAL);
		contentPane.add(lblEstadoCivil);
		
		JLabel lblDomicilio = new JLabel("Domicilio:");
		lblDomicilio.setBounds(64, 296, 83, 20);
		lblDomicilio.setFont(FUENTE_PRINCIPAL);
		contentPane.add(lblDomicilio);
		
		JLabel lblCurp = new JLabel("CURP:");
		lblCurp.setBounds(64, 345, 59, 20);
		lblCurp.setFont(FUENTE_PRINCIPAL);
		contentPane.add(lblCurp);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(599, 409, 89, 33);
		btnCerrar.setFont(FUENTE_SECUNDARIA);
		contentPane.add(btnCerrar);		
		
		JLabel txtNombre = new JLabel(paciente.getNombre());
		txtNombre.setBounds(148, 69, 274, 20);
		txtNombre.setFont(FUENTE_PRINCIPAL);
		contentPane.add(txtNombre);
		
		JLabel txtApellido = new JLabel(paciente.getApellido());
		txtApellido.setBounds(167, 115, 255, 20);
		txtApellido.setFont(FUENTE_PRINCIPAL);
		contentPane.add(txtApellido);
		
		String sexo;
		
		if(paciente.getSexo() == 'M') {
			sexo = "Masculino";
		}else if(paciente.getSexo() == 'F') {
			sexo = "Femenino";
		}else {
			sexo = "Otro";
		}
		
		JLabel txtSexo = new JLabel(sexo);
		txtSexo.setBounds(120, 160, 120, 20);
		txtSexo.setFont(FUENTE_PRINCIPAL);
		contentPane.add(txtSexo);
		
		JLabel txtEdad = new JLabel(Short.toString(paciente.getEdad()) + " años");
		txtEdad.setBounds(121, 205, 89, 20);
		txtEdad.setFont(FUENTE_PRINCIPAL);
		contentPane.add(txtEdad);
		
		JLabel txtEstadoCivil = new JLabel(paciente.getEstadoCivil());
		txtEstadoCivil.setBounds(177, 251, 162, 20);
		txtEstadoCivil.setFont(FUENTE_PRINCIPAL);
		contentPane.add(txtEstadoCivil);
		
		JLabel txtDomicilio = new JLabel(paciente.getDomicilio());
		txtDomicilio.setBounds(157, 296, 344, 20);
		txtDomicilio.setFont(FUENTE_PRINCIPAL);
		contentPane.add(txtDomicilio);
		
		JLabel txtCurp = new JLabel(paciente.getCurp());
		txtCurp.setBounds(121, 345, 362, 20);
		txtCurp.setFont(FUENTE_PRINCIPAL);
		contentPane.add(txtCurp);
		
		btnCerrar.addActionListener(this);
		
		if(usuario.equals(MEDICO)) {
			JButton btnVerHistorial = new JButton("Ver historial médico");
			btnVerHistorial.setBounds(64, 409, 200, 33);
			btnVerHistorial.setFont(FUENTE_SECUNDARIA);
			contentPane.add(btnVerHistorial);
			
			btnVerHistorial.addActionListener(this);
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		
		switch(e.getActionCommand()) {
			
		case CERRAR:
			VentanaInformacionPaciente.this.dispose();
			break;
			
		case VER_HISTORIAL_MEDICO:
			// pendiente de implementar
			break;
			
		default:
			break;
		}
		
	}
}
