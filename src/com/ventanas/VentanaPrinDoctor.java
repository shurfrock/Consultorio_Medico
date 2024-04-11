package com.ventanas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import com.constantes.Colores;
import com.constantes.Fonts;
import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaPrinDoctor extends JFrame implements Colores, Fonts{

	private static final long serialVersionUID = 1L;
	private JPanel panelPrincipal;

	public VentanaPrinDoctor() {
		
		/* Configuracion de la ventana principal */
		
		super("Doctor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 709, 477);
		panelPrincipal = new JPanel();
		panelPrincipal.setBorder(null);

		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(new BorderLayout(0, 0));
		
		JPanel panelLateral = new JPanel();
		panelLateral.setPreferredSize(new Dimension(265, 10));
		panelPrincipal.add(panelLateral, BorderLayout.WEST);
		panelLateral.setLayout(new BorderLayout(0, 0));
		
		JPanel panelIconos = new JPanel();
		panelIconos.setPreferredSize(new Dimension(55, 20));
		panelIconos.setBackground(COLOR_BARRA_LATERAL);
		panelLateral.add(panelIconos, BorderLayout.WEST);
		panelIconos.setLayout(null);
		
		JPanel panelIconoMenu = new JPanel();
		panelIconoMenu.setBackground(COLOR_BARRA_LATERAL);
		panelIconoMenu.setBounds(0, 0, 55, 39);
		panelIconos.add(panelIconoMenu);
		panelIconoMenu.setLayout(new BorderLayout(0, 0));
		
		JPanel panelIconoInfoCuenta = new JPanel();
		panelIconoInfoCuenta.setBackground(COLOR_BARRA_LATERAL);
		panelIconoInfoCuenta.setBounds(0, 49, 55, 39);
		panelIconos.add(panelIconoInfoCuenta);
		panelIconoInfoCuenta.setLayout(new BorderLayout(0, 0));
		
		JPanel panelIconoPacientes = new JPanel();
		panelIconoPacientes.setBackground(COLOR_BARRA_LATERAL);
		panelIconoPacientes.setBounds(0, 98, 55, 39);
		panelIconos.add(panelIconoPacientes);
		panelIconoPacientes.setLayout(new BorderLayout(0, 0));
		
		JPanel panelIconoCitas = new JPanel();
		panelIconoCitas.setBackground(COLOR_BARRA_LATERAL);
		panelIconoCitas.setBounds(0, 147, 55, 39);
		panelIconos.add(panelIconoCitas);
		panelIconoCitas.setLayout(new BorderLayout(0, 0));
		
		JPanel panelIconoConsultas = new JPanel();
		panelIconoConsultas.setBackground(COLOR_BARRA_LATERAL);
		panelIconoConsultas.setBounds(0, 196, 55, 39);
		panelIconos.add(panelIconoConsultas);
		panelIconoConsultas.setLayout(new BorderLayout(0, 0));
		
		JPanel panelIconoSalir = new JPanel();
		panelIconoSalir.setBackground(COLOR_BARRA_LATERAL);
		panelIconoSalir.setBounds(0, 245, 55, 39);
		panelIconos.add(panelIconoSalir);
		panelIconoSalir.setLayout(new BorderLayout(0, 0));
		
		JPanel contenidoPanel = new JPanel();
		contenidoPanel.setBackground(COLOR_PRINCIPAL);
		panelLateral.add(contenidoPanel, BorderLayout.CENTER);
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
		
		JPanel panelContenidoCentral = new JPanel();
		panelPrincipal.add(panelContenidoCentral, BorderLayout.CENTER);
		
		
		/* Event handlers */
		
		panelInfoCuenta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				resaltar(txtInfoCuenta, panelInfoCuenta);
				actualizarCursor(panelInfoCuenta);
			}
			
			public void mouseExited(MouseEvent e) {
				restaurar(txtInfoCuenta, panelInfoCuenta);
				resetearCursor(panelInfoCuenta);
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
		});
		
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
