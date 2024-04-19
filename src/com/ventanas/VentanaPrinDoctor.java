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
import javax.swing.SwingUtilities;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class VentanaPrinDoctor extends JFrame implements Colores, Fonts{

	private static final long serialVersionUID = 1L;
	private JPanel panelPrincipal;
	private boolean clicked;
	
	public VentanaPrinDoctor() {
		
		/* Configuracion de la ventana principal */
		
		super("Doctor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 887, 621);
		panelPrincipal = new JPanel();
		panelPrincipal.setBorder(null);

		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(new BorderLayout(0, 0));
		
		JPanel panelLateral = new JPanel();
		panelLateral.setPreferredSize(new Dimension(300, 10));
		panelPrincipal.add(panelLateral, BorderLayout.WEST);
		panelLateral.setLayout(new BorderLayout(0, 0));
		
		JPanel panelIconos = new JPanel();
		panelIconos.setPreferredSize(new Dimension(55, 20));
		panelIconos.setBackground(COLOR_BARRA_LATERAL);
		panelLateral.add(panelIconos, BorderLayout.WEST);
		panelIconos.setLayout(null);
		
		JPanel panelIconoMenu = new JPanel();
		
		
		panelIconoMenu.setBackground(COLOR_BARRA_LATERAL);
		panelIconoMenu.setBounds(0, 5, 55, 55);
		panelIconos.add(panelIconoMenu);
		panelIconoMenu.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(VentanaPrinDoctor.class.getResource("/com/imagenes/1486564398-menu2_81519.png")));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panelIconoMenu.add(lblNewLabel, BorderLayout.CENTER);
		
		JPanel panelIconoInfoCuenta = new JPanel();
		panelIconoInfoCuenta.setBackground(COLOR_BARRA_LATERAL);
		panelIconoInfoCuenta.setBounds(0, 65, 55, 55);
		panelIconos.add(panelIconoInfoCuenta);
		panelIconoInfoCuenta.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("");
		
		lblNewLabel_1.setIcon(new ImageIcon(VentanaPrinDoctor.class.getResource("/com/imagenes/avatardefault_92824.png")));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panelIconoInfoCuenta.add(lblNewLabel_1, BorderLayout.CENTER);
		
		JPanel panelIconoPacientes = new JPanel();
		
		panelIconoPacientes.setBackground(COLOR_BARRA_LATERAL);
		panelIconoPacientes.setBounds(0, 125, 55, 55);
		panelIconos.add(panelIconoPacientes);
		panelIconoPacientes.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(VentanaPrinDoctor.class.getResource("/com/imagenes/crowd_patient_patients_icon_140474(1).png")));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panelIconoPacientes.add(lblNewLabel_2, BorderLayout.CENTER);
		
		JPanel panelIconoCitas = new JPanel();
		panelIconoCitas.setBackground(COLOR_BARRA_LATERAL);
		panelIconoCitas.setBounds(0, 185, 55, 55);
		panelIconos.add(panelIconoCitas);
		panelIconoCitas.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(VentanaPrinDoctor.class.getResource("/com/imagenes/calendar-icon_34471.png")));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panelIconoCitas.add(lblNewLabel_3, BorderLayout.CENTER);
		
		JPanel panelIconoConsultas = new JPanel();
		panelIconoConsultas.setBackground(COLOR_BARRA_LATERAL);
		panelIconoConsultas.setBounds(0, 245, 55, 55);
		panelIconos.add(panelIconoConsultas);
		panelIconoConsultas.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(VentanaPrinDoctor.class.getResource("/com/imagenes/medical-11_icon-icons.com_73929.png")));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panelIconoConsultas.add(lblNewLabel_4, BorderLayout.CENTER);
		
		JPanel panelIconoSalir = new JPanel();
		panelIconoSalir.setBackground(COLOR_BARRA_LATERAL);
		panelIconoSalir.setBounds(0, 305, 55, 55);
		panelIconos.add(panelIconoSalir);
		panelIconoSalir.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(VentanaPrinDoctor.class.getResource("/com/imagenes/4115235-exit-logout-sign-out_114030.png")));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		panelIconoSalir.add(lblNewLabel_5, BorderLayout.CENTER);
		
		JPanel fondo_1 = new JPanel();
		fondo_1.setBounds(0, 0, 55, 5);
		fondo_1.setBackground(COLOR_BARRA_LATERAL);
		panelIconos.add(fondo_1);
		
		JPanel fondo_2 = new JPanel();
		fondo_2.setBounds(0, 60, 55, 5);
		fondo_2.setBackground(COLOR_BARRA_LATERAL);
		panelIconos.add(fondo_2);
		
		JPanel fondo_3 = new JPanel();
		fondo_3.setBounds(0, 120, 55, 5);
		fondo_3.setBackground(COLOR_BARRA_LATERAL);
		panelIconos.add(fondo_3);
		
		JPanel fondo_4 = new JPanel();
		fondo_4.setBounds(0, 180, 55, 5);
		fondo_4.setBackground(COLOR_BARRA_LATERAL);
		panelIconos.add(fondo_4);
		
		JPanel fondo_5 = new JPanel();
		fondo_5.setBounds(0, 240, 55, 5);
		fondo_5.setBackground(COLOR_BARRA_LATERAL);
		panelIconos.add(fondo_5);
		
		JPanel fondo_6 = new JPanel();
		fondo_6.setBounds(0, 300, 55, 5);
		fondo_6.setBackground(COLOR_BARRA_LATERAL);
		panelIconos.add(fondo_6);
		
		JPanel contenidoPanel = new JPanel();
		contenidoPanel.setBackground(COLOR_PRINCIPAL);
		panelLateral.add(contenidoPanel, BorderLayout.CENTER);
		contenidoPanel.setLayout(null);
		
		JPanel panelInfoCuenta = new JPanel();
		panelInfoCuenta.setBackground(COLOR_PRINCIPAL);
		panelInfoCuenta.setBounds(0, 70, 245, 45);
		contenidoPanel.add(panelInfoCuenta);
		panelInfoCuenta.setLayout(new BorderLayout(0, 0));
		
		JLabel txtInfoCuenta = new JLabel("Información de la cuenta");
		txtInfoCuenta.setForeground(COLOR_FONDO);
		txtInfoCuenta.setFont(FUENTE_PRINCIPAL);
		txtInfoCuenta.setHorizontalAlignment(SwingConstants.CENTER);
		panelInfoCuenta.add(txtInfoCuenta, BorderLayout.CENTER);
		
		JPanel panelPacientes = new JPanel();
		panelPacientes.setBackground(COLOR_PRINCIPAL);
		panelPacientes.setBounds(0, 130, 245, 45);
		contenidoPanel.add(panelPacientes);
		panelPacientes.setLayout(new BorderLayout(0, 0));
		
		JLabel txtPacientes = new JLabel("Pacientes");
		txtPacientes.setForeground(COLOR_FONDO);
		txtPacientes.setFont(FUENTE_PRINCIPAL);
		txtPacientes.setHorizontalAlignment(SwingConstants.CENTER);
		panelPacientes.add(txtPacientes, BorderLayout.CENTER);
		
		JPanel panelCitas = new JPanel();
		panelCitas.setBackground(COLOR_PRINCIPAL);
		panelCitas.setBounds(0, 190, 245, 45);
		contenidoPanel.add(panelCitas);
		panelCitas.setLayout(new BorderLayout(0, 0));
		
		JLabel txtCitas = new JLabel("Citas");
		txtCitas.setForeground(COLOR_FONDO);
		txtCitas.setFont(FUENTE_PRINCIPAL);
		txtCitas.setHorizontalAlignment(SwingConstants.CENTER);
		panelCitas.add(txtCitas, BorderLayout.CENTER);
		
		JPanel panelConsultas = new JPanel();
		panelConsultas.setBackground(COLOR_PRINCIPAL);
		panelConsultas.setBounds(0, 250, 245, 45);
		contenidoPanel.add(panelConsultas);
		panelConsultas.setLayout(new BorderLayout(0, 0));
		
		JLabel txtConsultas = new JLabel("Crear consulta");
		txtConsultas.setForeground(COLOR_FONDO);
		txtConsultas.setFont(FUENTE_PRINCIPAL);
		txtConsultas.setHorizontalAlignment(SwingConstants.CENTER);
		panelConsultas.add(txtConsultas, BorderLayout.CENTER);
		
		JPanel panelSalir = new JPanel();
		panelSalir.setBackground(COLOR_PRINCIPAL);
		panelSalir.setBounds(0, 310, 245, 45);
		contenidoPanel.add(panelSalir);
		panelSalir.setLayout(new BorderLayout(0, 0));
		
		JLabel txtSalir = new JLabel("Salir");
		txtSalir.setForeground(COLOR_FONDO);
		txtSalir.setFont(FUENTE_PRINCIPAL);
		txtSalir.setHorizontalAlignment(SwingConstants.CENTER);
		panelSalir.add(txtSalir, BorderLayout.CENTER);
		
		PanelBienvenida bienvenida = new PanelBienvenida();		
		JPanel panelContenidoCentral = new JPanel();
		panelContenidoCentral.setLayout(new BorderLayout(0, 0));
		panelContenidoCentral.removeAll();
		panelContenidoCentral.add(bienvenida);
		panelContenidoCentral.revalidate();
		panelContenidoCentral.repaint();		
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
						
			public void mouseClicked(MouseEvent e) {
				InfoCuentaSecretaria infoCuenta = new InfoCuentaSecretaria();
				
				panelContenidoCentral.removeAll();
				panelContenidoCentral.add(infoCuenta);
				panelContenidoCentral.revalidate();
				panelContenidoCentral.repaint();
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
		
		panelIconoMenu.addMouseListener(new MouseAdapter() {			
			public void mouseEntered(MouseEvent e) {				
				resaltarFondo(fondo_1);
				actualizarCursor(panelIconoMenu);				
			}
			
			public void mouseExited(MouseEvent e) {
				resetearFondo(fondo_1);
			}
			
			public void mouseClicked(MouseEvent e) {
				if(!clicked) { // ocultar barra lateral 
					panelLateral.setPreferredSize(new Dimension(55, getHeight()));					
					clicked = true;
				}else { // mostrar barra lateral 
					panelLateral.setPreferredSize(new Dimension(300, getHeight()));
					clicked = false;
				}
				SwingUtilities.updateComponentTreeUI(panelLateral);	
			}
		});
		
		panelIconoInfoCuenta.addMouseListener(new MouseAdapter() {			
			public void mouseEntered(MouseEvent e) {
				resaltarFondo(fondo_2);
			}
			
			public void mouseExited(MouseEvent e) {
				resetearFondo(fondo_2);
			}
		});
		
		panelIconoPacientes.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				resaltarFondo(fondo_3);
			}
			
			public void mouseExited(MouseEvent e) {
				resetearFondo(fondo_3);
			}
		});
		
		panelIconoCitas.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				resaltarFondo(fondo_4);
			}
			
			public void mouseExited(MouseEvent e) {
				resetearFondo(fondo_4);
			}
		});
		
		panelIconoConsultas.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				resaltarFondo(fondo_5);
			}
			
			public void mouseExited(MouseEvent e) {
				resetearFondo(fondo_5);
			}
		});
		
		panelIconoSalir.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				resaltarFondo(fondo_6);
			}
			
			public void mouseExited(MouseEvent e) {
				resetearFondo(fondo_6);
			}
		});
	}
	
	private void resaltarFondo(JPanel fondo) {
		fondo.setBackground(COLOR_MOUSE_OVER);
	}
	
	private void resetearFondo(JPanel fondo) {
		fondo.setBackground(COLOR_BARRA_LATERAL);
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
