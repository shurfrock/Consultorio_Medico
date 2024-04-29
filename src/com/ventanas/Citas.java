package com.ventanas;

import java.awt.Dimension;
import javax.swing.JPanel;
import com.constantes.*;
import java.awt.BorderLayout;
import java.awt.Cursor;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Citas extends JPanel implements Colores, Fonts, ConstantesComponentes {

	private static final long serialVersionUID = 1L;
	private Listener listener;

	public Citas() {
		setPreferredSize(new Dimension(265, 520));
		setLayout(new BorderLayout(0, 0));
		
		JPanel panelIconos = new JPanel();
		panelIconos.setBackground(COLOR_BARRA_LATERAL);
		panelIconos.setPreferredSize(new Dimension(55, 520));
		add(panelIconos, BorderLayout.WEST);
		panelIconos.setLayout(null);
		
		JPanel panelIconoMenu = new JPanel();
		panelIconoMenu.setBounds(0, 0, 55, 39);
		panelIconoMenu.setBackground(COLOR_BARRA_LATERAL);
		panelIconos.add(panelIconoMenu);
		panelIconoMenu.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Citas.class.getResource("/com/imagenes/menu-bar.png")));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panelIconoMenu.add(lblNewLabel, BorderLayout.CENTER);
		
		JPanel panelIconoAgendarCita = new JPanel();
		panelIconoAgendarCita.setBounds(0, 49, 55, 39);
		panelIconoAgendarCita.setBackground(COLOR_BARRA_LATERAL);
		panelIconos.add(panelIconoAgendarCita);
		panelIconoAgendarCita.setLayout(new BorderLayout(0, 0));
		
		JLabel iconoAgendarCita = new JLabel("");
		iconoAgendarCita.setIcon(new ImageIcon(Citas.class.getResource("/com/imagenes/medical-report.png")));
		iconoAgendarCita.setHorizontalAlignment(SwingConstants.CENTER);
		panelIconoAgendarCita.add(iconoAgendarCita, BorderLayout.CENTER);
		
		JPanel panelIconoMostrarCitas = new JPanel();
		panelIconoMostrarCitas.setBounds(0, 98, 55, 39);
		panelIconoMostrarCitas.setBackground(COLOR_BARRA_LATERAL);
		panelIconos.add(panelIconoMostrarCitas);
		panelIconoMostrarCitas.setLayout(new BorderLayout(0, 0));
		
		JLabel iconoMostrarCitas = new JLabel("");
		iconoMostrarCitas.setIcon(new ImageIcon(Citas.class.getResource("/com/imagenes/checklist.png")));
		iconoMostrarCitas.setHorizontalAlignment(SwingConstants.CENTER);
		panelIconoMostrarCitas.add(iconoMostrarCitas, BorderLayout.CENTER);
		
		JPanel panelIconoRegresar = new JPanel();
		panelIconoRegresar.setBounds(0, 147, 55, 39);
		panelIconoRegresar.setBackground(COLOR_BARRA_LATERAL);
		panelIconos.add(panelIconoRegresar);
		panelIconoRegresar.setLayout(new BorderLayout(0, 0));
		
		JLabel iconoRegresar = new JLabel("");
		iconoRegresar.setIcon(new ImageIcon(Citas.class.getResource("/com/imagenes/previous.png")));
		iconoRegresar.setHorizontalAlignment(SwingConstants.CENTER);
		panelIconoRegresar.add(iconoRegresar, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(COLOR_PRINCIPAL);
		add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JPanel panel_3 = new JPanel();		
		panel_3.setBounds(0, 49, 210, 39);
		panel_3.setBackground(COLOR_PRINCIPAL);
		panel_1.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Agendar cita");
		lblNewLabel_1.setForeground(COLOR_FONDO);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(FUENTE_PRINCIPAL);
		panel_3.add(lblNewLabel_1, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(0, 98, 210, 39);
		panel_4.setBackground(COLOR_PRINCIPAL);
		panel_1.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("Mostrar citas");
		lblNewLabel_2.setForeground(COLOR_FONDO);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(FUENTE_PRINCIPAL);
		panel_4.add(lblNewLabel_2, BorderLayout.CENTER);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(0, 147, 210, 39);
		panel_5.setBackground(COLOR_PRINCIPAL);
		panel_1.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_3 = new JLabel("Regresar");
		lblNewLabel_3.setForeground(COLOR_FONDO);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(FUENTE_PRINCIPAL);
		panel_5.add(lblNewLabel_3, BorderLayout.CENTER);
		
		/* Controladores de eventos */
		
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
		
		panel_3.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				resaltar(lblNewLabel_1, panel_3);
				actualizarCursor(panel_3);
			}
			
			public void mouseExited(MouseEvent e) {
				restaurar(lblNewLabel_1, panel_3);
				resetearCursor(panel_3);
			}
			
			public void mouseClicked(MouseEvent e) {
				opcionSeleccionada(AGENDAR_CITA);
			}
		});
		
		panel_4.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				resaltar(lblNewLabel_2, panel_4);
				actualizarCursor(panel_4);
			}
			
			public void mouseExited(MouseEvent e) {
				restaurar(lblNewLabel_2, panel_4);
				resetearCursor(panel_4);
			}
			
			public void mouseClicked(MouseEvent e) {
				opcionSeleccionada(MOSTRAR_CITAS);
			}
		});

		panel_5.addMouseListener(new MouseAdapter() {
	
			public void mouseEntered(MouseEvent e) {
				resaltar(lblNewLabel_3, panel_5);
				actualizarCursor(panel_5);
			}
			
			public void mouseExited(MouseEvent e) {
				restaurar(lblNewLabel_3, panel_5);
				resetearCursor(panel_5);
			}
			
			public void mouseClicked(MouseEvent e) {
				opcionSeleccionada(REGRESAR);
			}
		});
	}
	
	public void setListener(Listener listener) {
		this.listener = listener;
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
