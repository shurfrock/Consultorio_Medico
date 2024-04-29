package com.ventanas;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import com.constantes.*;
import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MenuPrinDoctor extends JPanel implements Fonts, ConstantesComponentes, Colores {

	private static final long serialVersionUID = 1L;
	private Listener listener;

	public MenuPrinDoctor() {
		setLayout(new BorderLayout(0, 0));
		this.setBounds(100, 100, 265, 621);
		
		JPanel panelIconos = new JPanel();
		panelIconos.setPreferredSize(new Dimension(55, 20));
		panelIconos.setBackground(COLOR_BARRA_LATERAL);
		MenuPrinDoctor.this.add(panelIconos, BorderLayout.WEST);
		panelIconos.setLayout(null);
		
		JPanel panelIconoMenu = new JPanel();
		
		panelIconoMenu.setBackground(COLOR_BARRA_LATERAL);
		panelIconoMenu.setBounds(0, 0, 55, 39);
		panelIconos.add(panelIconoMenu);
		panelIconoMenu.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(VentanaPrinDoctor.class.getResource("/com/imagenes/menu-bar.png")));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panelIconoMenu.add(lblNewLabel, BorderLayout.CENTER);
		
		JPanel panelIconoInfoCuenta = new JPanel();
		panelIconoInfoCuenta.setBackground(COLOR_BARRA_LATERAL);
		panelIconoInfoCuenta.setBounds(0, 49, 55, 39);
		panelIconos.add(panelIconoInfoCuenta);
		panelIconoInfoCuenta.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(VentanaPrinDoctor.class.getResource("/com/imagenes/userIcon.png")));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panelIconoInfoCuenta.add(lblNewLabel_1, BorderLayout.CENTER);
		
		JPanel panelIconoPacientes = new JPanel();
		
		panelIconoPacientes.setBackground(COLOR_BARRA_LATERAL);
		panelIconoPacientes.setBounds(0, 98, 55, 39);
		panelIconos.add(panelIconoPacientes);
		panelIconoPacientes.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(VentanaPrinDoctor.class.getResource("/com/imagenes/pacientesIcon.png")));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panelIconoPacientes.add(lblNewLabel_2, BorderLayout.CENTER);
		
		JPanel panelIconoCitas = new JPanel();
		panelIconoCitas.setBackground(COLOR_BARRA_LATERAL);
		panelIconoCitas.setBounds(0, 147, 55, 39);
		panelIconos.add(panelIconoCitas);
		panelIconoCitas.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(VentanaPrinDoctor.class.getResource("/com/imagenes/calendar.png")));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panelIconoCitas.add(lblNewLabel_3, BorderLayout.CENTER);
		
		JPanel panelIconoConsultas = new JPanel();
		panelIconoConsultas.setBackground(COLOR_BARRA_LATERAL);
		panelIconoConsultas.setBounds(0, 196, 55, 39);
		panelIconos.add(panelIconoConsultas);
		panelIconoConsultas.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(VentanaPrinDoctor.class.getResource("/com/imagenes/medical-report.png")));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panelIconoConsultas.add(lblNewLabel_4, BorderLayout.CENTER);
		
		JPanel panelIconoSalir = new JPanel();
		panelIconoSalir.setBackground(COLOR_BARRA_LATERAL);
		panelIconoSalir.setBounds(0, 245, 55, 39);
		panelIconos.add(panelIconoSalir);
		panelIconoSalir.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(VentanaPrinDoctor.class.getResource("/com/imagenes/salirIcon.png")));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		panelIconoSalir.add(lblNewLabel_5, BorderLayout.CENTER);
		
		JPanel contenidoPanel = new JPanel();
		contenidoPanel.setBackground(COLOR_PRINCIPAL); /* posible error: setBounds */
		MenuPrinDoctor.this.add(contenidoPanel, BorderLayout.CENTER);
		contenidoPanel.setLayout(null);
		
		JPanel panelInfoCuenta = new JPanel();
		panelInfoCuenta.setBackground(COLOR_PRINCIPAL);
		panelInfoCuenta.setBounds(0, 49, 210, 39);
		contenidoPanel.add(panelInfoCuenta);
		panelInfoCuenta.setLayout(new BorderLayout(0, 0));
		
		JLabel txtInfoCuenta = new JLabel("Información de la cuenta");
		txtInfoCuenta.setForeground(COLOR_FONDO);
		txtInfoCuenta.setFont(FUENTE_PRINCIPAL);
		txtInfoCuenta.setHorizontalAlignment(SwingConstants.CENTER);
		panelInfoCuenta.add(txtInfoCuenta, BorderLayout.CENTER);
		
		JPanel panelPacientes = new JPanel();
		panelPacientes.setBackground(COLOR_PRINCIPAL);
		panelPacientes.setBounds(0, 98, 210, 39);
		contenidoPanel.add(panelPacientes);
		panelPacientes.setLayout(new BorderLayout(0, 0));
		
		JLabel txtPacientes = new JLabel("Pacientes");
		txtPacientes.setForeground(COLOR_FONDO);
		txtPacientes.setFont(FUENTE_PRINCIPAL);
		txtPacientes.setHorizontalAlignment(SwingConstants.CENTER);
		panelPacientes.add(txtPacientes, BorderLayout.CENTER);
		
		JPanel panelCitas = new JPanel();
		panelCitas.setBackground(COLOR_PRINCIPAL);
		panelCitas.setBounds(0, 147, 210, 39);
		contenidoPanel.add(panelCitas);
		panelCitas.setLayout(new BorderLayout(0, 0));
		
		JLabel txtCitas = new JLabel("Citas");
		txtCitas.setForeground(COLOR_FONDO);
		txtCitas.setFont(FUENTE_PRINCIPAL);
		txtCitas.setHorizontalAlignment(SwingConstants.CENTER);
		panelCitas.add(txtCitas, BorderLayout.CENTER);
		
		JPanel panelConsultas = new JPanel();
		panelConsultas.setBackground(COLOR_PRINCIPAL);
		panelConsultas.setBounds(0, 196, 210, 39);
		contenidoPanel.add(panelConsultas);
		panelConsultas.setLayout(new BorderLayout(0, 0));
		
		JLabel txtConsultas = new JLabel("Crear consulta");
		txtConsultas.setForeground(COLOR_FONDO);
		txtConsultas.setFont(FUENTE_PRINCIPAL);
		txtConsultas.setHorizontalAlignment(SwingConstants.CENTER);
		panelConsultas.add(txtConsultas, BorderLayout.CENTER);
		
		JPanel panelSalir = new JPanel();
		panelSalir.setBackground(COLOR_PRINCIPAL);
		panelSalir.setBounds(0, 245, 210, 39);
		contenidoPanel.add(panelSalir);
		panelSalir.setLayout(new BorderLayout(0, 0));
		
		JLabel txtSalir = new JLabel("Salir");
		txtSalir.setForeground(COLOR_FONDO);
		txtSalir.setFont(FUENTE_PRINCIPAL);
		txtSalir.setHorizontalAlignment(SwingConstants.CENTER);
		panelSalir.add(txtSalir, BorderLayout.CENTER);
		
						/* Event handlers */
		
		panelInfoCuenta.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				resaltar(txtInfoCuenta, panelInfoCuenta);
				actualizarCursor(panelInfoCuenta);
			}
			
			public void mouseExited(MouseEvent e) {
				restaurar(txtInfoCuenta, panelInfoCuenta);
				resetearCursor(panelInfoCuenta);
			}
						
			public void mouseClicked(MouseEvent e) {
				opcionSeleccionada(INFORMACION_CUENTA);
			}			
		});
		
		panelPacientes.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				resaltar(txtPacientes, panelPacientes);
				actualizarCursor(panelPacientes);
			}
			
			public void mouseExited(MouseEvent e) {
				restaurar(txtPacientes, panelPacientes);
				resetearCursor(panelPacientes);
			}
			
			public void mouseClicked(MouseEvent e) {
				restaurar(txtPacientes, panelPacientes);
				opcionSeleccionada(PACIENTES);
			}
		});
		
		panelCitas.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e ) {
				resaltar(txtCitas, panelCitas);
				actualizarCursor(panelCitas);
			}
			
			public void mouseExited(MouseEvent e) {
				restaurar(txtCitas, panelCitas);
				resetearCursor(panelCitas);
			}
			
			public void mouseClicked(MouseEvent e) {
				restaurar(txtCitas, panelCitas);
				opcionSeleccionada(CITAS);
			}
		});
		
		panelConsultas.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				resaltar(txtConsultas, panelConsultas);
				actualizarCursor(panelConsultas);
			}
			
			public void mouseExited(MouseEvent e) {
				restaurar(txtConsultas, panelConsultas);
				resetearCursor(panelConsultas);
			}
			
			public void mouseClicked(MouseEvent e) {
				opcionSeleccionada(CREAR_CONSULTA);
			}
		});
		
		panelSalir.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				resaltar(txtSalir, panelSalir);
				actualizarCursor(panelSalir);
			}
			
			public void mouseExited(MouseEvent e) {
				restaurar(txtSalir, panelSalir);
				resetearCursor(panelSalir);
			}
			
			public void mouseClicked(MouseEvent e) {
				opcionSeleccionada(SALIR);
			}
		});
		
		panelIconoMenu.addMouseListener(new MouseAdapter() {			
			public void mouseEntered(MouseEvent e) {				
				actualizarCursor(panelIconoMenu);				
			}
			
			public void mouseExited(MouseEvent e) {
				resetearCursor(panelIconoMenu);
			}
			
			public void mouseClicked(MouseEvent e) {
				opcionSeleccionada(OCULTAR_MENU_LATERAL);
			}
		});
	}
	
	public void setListener(Listener listener) {
		this.listener = listener; // establecer el objecto que va a escuchar al actual componente
	}
	
	private void opcionSeleccionada(String opcion) {
		if(listener != null) {
			listener.onOptionSelected(opcion);
		}
	}
	
	private void resaltar(JLabel texto, JPanel panel) {
		texto.setForeground(COLOR_SECUNDARIO);
		panel.setBackground(COLOR_MOUSE_OVER);		
	}
	
	private void restaurar(JLabel texto, JPanel panel) {
		texto.setForeground(COLOR_FONDO);
		panel.setBackground(COLOR_PRINCIPAL);		
	}
	
	private void actualizarCursor(JPanel panel) {
		panel.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
	}
	
	private void resetearCursor(JPanel panel) {
		panel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	}
}
