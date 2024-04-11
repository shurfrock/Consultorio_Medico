package com.ventanas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import com.constantes.Colores;
import com.constantes.Fonts;

public class VentanaPrinSecretaria extends JFrame implements Colores, Fonts{

	private static final long serialVersionUID = 1L;	
	private boolean clicked;
	
	public VentanaPrinSecretaria() {
		
		/* Window's configuration */
		
		super("Secretaria");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		
		
		/* Here ends window's configuration */
		
		
		/* Visual components and panels */
				
		JPanel panelPrincipal = new JPanel();
		JPanel panelLateral = new JPanel();
		JPanel panelIconos = new JPanel();
		JPanel panelIconoMenu = new JPanel();
		JLabel iconoMenu = new JLabel("");
		JPanel panelIconoInfoCuenta = new JPanel();
		JLabel iconoUsuario = new JLabel("");
		JPanel panelIconoPacientes = new JPanel();
		JLabel iconoPacientes = new JLabel("");
		JPanel panelIconoCitas = new JPanel();
		JLabel iconoCitas = new JLabel("");
		JPanel panelIconoSalir = new JPanel();
		JLabel iconoSalir = new JLabel("");
		JPanel ContenidoPanel = new JPanel();
		JPanel panelInfoCuenta = new JPanel();
		JLabel txtInfoCuenta = new JLabel("Información de la cuenta");
		JPanel panelPacientes = new JPanel();
		JLabel txtPacientes = new JLabel("Pacientes");
		JPanel panelCitas = new JPanel();
		JLabel txtCitas = new JLabel("Citas");
		JPanel panelSalir = new JPanel();
		JLabel txtSalir = new JLabel("Salir");
		JPanel panelContenidoMostrar = new JPanel();		
		JLabel lblNewLabel = new JLabel("Sistema Médico");
		clicked = false;
		
		/* Here ends component's declaration */
		
		
		/* components's configuration */
				
		panelPrincipal.setBorder(null);
		panelPrincipal.setLayout(new BorderLayout(0, 0));
				
		panelLateral.setPreferredSize(new Dimension(265, 0));
		panelLateral.setLayout(new BorderLayout(0, 0));
		
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
		
		iconoUsuario.setIcon(new ImageIcon(VentanaPrinSecretaria.class.getResource("/com/imagenes/usuario.png")));
		iconoUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		panelIconoInfoCuenta.add(iconoUsuario, BorderLayout.CENTER); /* agregar el icono del usuario al panel */
		
		panelIconoPacientes.setBackground(COLOR_BARRA_LATERAL);
		panelIconoPacientes.setBounds(0, 98, 55, 39);
		panelIconoPacientes.setLayout(new BorderLayout(0, 0));
		
		iconoPacientes.setIcon(new ImageIcon(VentanaPrinSecretaria.class.getResource("/com/imagenes/paciente.png")));
		iconoPacientes.setHorizontalAlignment(SwingConstants.CENTER);
		panelIconoPacientes.add(iconoPacientes, BorderLayout.CENTER); /* agregar el icono del paciente al panel */
		
		panelIconoCitas.setBackground(COLOR_BARRA_LATERAL);
		panelIconoCitas.setBounds(0, 147, 55, 39);
		panelIconoCitas.setLayout(new BorderLayout(0, 0));
		
		iconoCitas.setIcon(new ImageIcon(VentanaPrinSecretaria.class.getResource("/com/imagenes/calendario.png")));
		iconoCitas.setHorizontalAlignment(SwingConstants.CENTER);
		panelIconoCitas.add(iconoCitas, BorderLayout.CENTER); /* agregar el icono de citas al panel */
		
		panelIconoSalir.setBackground(COLOR_BARRA_LATERAL);
		panelIconoSalir.setBounds(0, 196, 55, 39);
		panelIconoSalir.setLayout(new BorderLayout(0, 0));
		
		iconoSalir.setIcon(new ImageIcon(VentanaPrinSecretaria.class.getResource("/com/imagenes/salida.png")));
		iconoSalir.setHorizontalAlignment(SwingConstants.CENTER);
		panelIconoSalir.add(iconoSalir, BorderLayout.CENTER); //  agregar el icono salir al panel 
		
		panelIconos.add(panelIconoMenu);				
		panelIconos.add(panelIconoInfoCuenta);		
		panelIconos.add(panelIconoPacientes);		
		panelIconos.add(panelIconoCitas);
		panelIconos.add(panelIconoSalir);
		
		panelLateral.add(panelIconos, BorderLayout.WEST);
		
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
		
		panelLateral.add(ContenidoPanel, BorderLayout.CENTER);		
		panelPrincipal.add(panelLateral, BorderLayout.WEST);

		panelContenidoMostrar.setLayout(new BorderLayout(0, 0));
		panelContenidoMostrar.setBackground(COLOR_FONDO);
		
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Roboto", Font.PLAIN, 20));
		panelContenidoMostrar.add(lblNewLabel, BorderLayout.CENTER);
		
		panelPrincipal.add(panelContenidoMostrar, BorderLayout.CENTER);
		
		setContentPane(panelPrincipal);		
		
		/* Here ends components's configuration */
		
		
		/* Event handlers */
		
		panelIconoMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!clicked) { // ocultar barra lateral 
					panelLateral.setPreferredSize(new Dimension(55, getHeight()));					
					clicked = true;
				}else { // mostrar barra lateral 
					panelLateral.setPreferredSize(new Dimension(265, getHeight()));
					clicked = false;
				}
				SwingUtilities.updateComponentTreeUI(panelLateral);				
			}
			
			public void mouseEntered(MouseEvent e) {				
				actualizarCursor(panelIconoMenu);;
			}
			
			public void mouseExited(MouseEvent e) {				
				resetearCursor(panelIconoMenu);				
			}
		});
		
		panelInfoCuenta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				resaltar(txtInfoCuenta, panelInfoCuenta);
				actualizarCursor(panelInfoCuenta);
			}
		
			@Override
			public void mouseExited(MouseEvent e) {
				restaurar(txtInfoCuenta, panelInfoCuenta);
				resetearCursor(panelInfoCuenta);
			}
		});
		
		panelPacientes.addMouseListener(new MouseAdapter() {
			@Override
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
