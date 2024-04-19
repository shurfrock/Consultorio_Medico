package com.ventanas;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import com.constantes.*;

public class PanelMenuPrinSecretaria extends JPanel implements Fonts, Colores, ConstantesComponentes {

	private static final long serialVersionUID = 1L;
	VentanaPrinSecretaria ventana;
	private boolean clicked;
	private Listener listener;

	public PanelMenuPrinSecretaria() {
		
		setPreferredSize(new Dimension(265, 520));
		setLayout(new BorderLayout(0, 0));
	
		JPanel panelIconos = new JPanel();
		JPanel panelIconoMenu = new JPanel();
		JLabel iconoMenu = new JLabel();
		JPanel panelIconoInfoCuenta = new JPanel();
		JLabel iconoUsuario = new JLabel();
		JPanel panelIconoPacientes = new JPanel();
		JLabel iconoPacientes = new JLabel();
		JPanel panelIconoCitas = new JPanel();
		JLabel iconoCitas = new JLabel();
		JPanel panelIconoSalir = new JPanel();
		JLabel iconoSalir = new JLabel();
		JPanel ContenidoPanel = new JPanel();
		JPanel panelInfoCuenta = new JPanel();
		JLabel txtInfoCuenta = new JLabel("Información de la cuenta");
		JPanel panelPacientes = new JPanel();
		JLabel txtPacientes = new JLabel("Pacientes");
		JPanel panelCitas = new JPanel();
		JLabel txtCitas = new JLabel("Citas");
		JPanel panelSalir = new JPanel();
		JLabel txtSalir = new JLabel("Salir");
		clicked = false;
		
		panelIconos.setBackground(COLOR_BARRA_LATERAL);
		panelIconos.setPreferredSize(new Dimension(55, 0));
		panelIconos.setLayout(null);
		
		panelIconoMenu.setBackground(COLOR_BARRA_LATERAL);
		panelIconoMenu.setBounds(0, 0, 55, 39);
		panelIconoMenu.setLayout(new BorderLayout(0, 0));
		
		iconoMenu.setIcon(new ImageIcon(VentanaPrinSecretaria.class.getResource("/com/imagenes/menu.png")));
		iconoMenu.setHorizontalAlignment(SwingConstants.CENTER);
		panelIconoMenu.add(iconoMenu, BorderLayout.CENTER); /* agregar el icono de menu al panel */
		
		panelIconoInfoCuenta.setBackground(COLOR_BARRA_LATERAL);
		panelIconoInfoCuenta.setBounds(0, 49, 55, 39);
		panelIconoInfoCuenta.setLayout(new BorderLayout(0, 0));
		iconoUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		panelIconoInfoCuenta.add(iconoUsuario, BorderLayout.CENTER); /* agregar el icono del usuario al panel */
		
		panelIconoPacientes.setBackground(COLOR_BARRA_LATERAL);
		panelIconoPacientes.setBounds(0, 98, 55, 39);
		panelIconoPacientes.setLayout(new BorderLayout(0, 0));
		iconoPacientes.setHorizontalAlignment(SwingConstants.CENTER);
		panelIconoPacientes.add(iconoPacientes, BorderLayout.CENTER); /* agregar el icono del paciente al panel */
		
		panelIconoCitas.setBackground(COLOR_BARRA_LATERAL);
		panelIconoCitas.setBounds(0, 147, 55, 39);
		panelIconoCitas.setLayout(new BorderLayout(0, 0));
		iconoCitas.setHorizontalAlignment(SwingConstants.CENTER);
		panelIconoCitas.add(iconoCitas, BorderLayout.CENTER); /* agregar el icono de citas al panel */
		
		panelIconoSalir.setBackground(COLOR_BARRA_LATERAL);
		panelIconoSalir.setBounds(0, 196, 55, 39);
		panelIconoSalir.setLayout(new BorderLayout(0, 0));
		iconoSalir.setHorizontalAlignment(SwingConstants.CENTER);
		panelIconoSalir.add(iconoSalir, BorderLayout.CENTER); //  agregar el icono salir al panel 
		
		panelIconos.add(panelIconoMenu);				
		panelIconos.add(panelIconoInfoCuenta);		
		panelIconos.add(panelIconoPacientes);		
		panelIconos.add(panelIconoCitas);
		panelIconos.add(panelIconoSalir);
		
		add(panelIconos, BorderLayout.WEST);
		
		ContenidoPanel.setPreferredSize(new Dimension(250, 0));
		ContenidoPanel.setBackground(COLOR_PRINCIPAL);
		ContenidoPanel.setLayout(null);
		
		panelInfoCuenta.setBackground(COLOR_PRINCIPAL);
		panelInfoCuenta.setBounds(0, 49, 210, 39);
		panelInfoCuenta.setLayout(new BorderLayout(0, 0));
		
		txtInfoCuenta.setForeground(COLOR_FONDO);
		txtInfoCuenta.setHorizontalAlignment(SwingConstants.CENTER);
		txtInfoCuenta.setFont(FUENTE_PRINCIPAL);
		panelInfoCuenta.add(txtInfoCuenta, BorderLayout.CENTER);
		
		panelPacientes.setBackground(COLOR_PRINCIPAL);
		panelPacientes.setBounds(0, 98, 210, 39);
		panelPacientes.setLayout(new BorderLayout(0, 0));
		
		txtPacientes.setForeground(COLOR_FONDO);
		txtPacientes.setHorizontalAlignment(SwingConstants.CENTER);
		txtPacientes.setFont(FUENTE_PRINCIPAL);
		panelPacientes.add(txtPacientes, BorderLayout.CENTER);
		
		panelCitas.setBackground(COLOR_PRINCIPAL);
		panelCitas.setBounds(0, 147, 210, 39);
		panelCitas.setLayout(new BorderLayout(0, 0));
		
		txtCitas.setForeground(COLOR_FONDO);
		txtCitas.setHorizontalAlignment(SwingConstants.CENTER);
		txtCitas.setFont(FUENTE_PRINCIPAL);
		panelCitas.add(txtCitas, BorderLayout.CENTER);
		
		panelSalir.setBackground(COLOR_PRINCIPAL);
		panelSalir.setBounds(0, 196, 210, 39);
		panelSalir.setLayout(new BorderLayout(0, 0));
		
		txtSalir.setForeground(COLOR_FONDO);
		txtSalir.setHorizontalAlignment(SwingConstants.CENTER);
		txtSalir.setFont(FUENTE_PRINCIPAL);
		panelSalir.add(txtSalir, BorderLayout.CENTER);
		
		ContenidoPanel.add(panelInfoCuenta);
		ContenidoPanel.add(panelPacientes);
		ContenidoPanel.add(panelCitas);
		ContenidoPanel.add(panelSalir);
		
		add(ContenidoPanel, BorderLayout.CENTER);
		
		/* Event handlers */
		
		panelIconoMenu.addMouseListener(new MouseAdapter() {
		
			public void mouseClicked(MouseEvent e) {
				
				Container padre = PanelMenuPrinSecretaria.this.getParent();
				
				if(!clicked) {					
					padre.setPreferredSize(new Dimension(55,0));
					clicked = true;
				}else {
					padre.setPreferredSize(new Dimension(265, getHeight()));
					clicked = false;
				}
				SwingUtilities.updateComponentTreeUI(PanelMenuPrinSecretaria.this);
			}
			
			public void mouseEntered(MouseEvent e) {				
				actualizarCursor(panelIconoMenu);;
			}
			
			public void mouseExited(MouseEvent e) {				
				resetearCursor(panelIconoMenu);				
			}
		});
		
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
				onOptionSelected(INFORMACION_CUENTA);
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
				onOptionSelected(PACIENTES);
			}
		});
		
		panelCitas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {				
				resaltar(txtCitas, panelCitas);
				actualizarCursor(panelCitas);
			}
			
			public void mouseExited(MouseEvent e) {
				restaurar(txtCitas, panelCitas);
				resetearCursor(panelCitas);
			}
		});		
		
		panelSalir.addMouseListener(new MouseAdapter() {
			@Override
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
	
	public void setSubMenuListener(Listener listener) {
		this.listener = listener;
	}
	
	private void onOptionSelected(String option) {
		if(listener != null) {
			listener.onOptionSelected(option);
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
