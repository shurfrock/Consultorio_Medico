package com.ventanas;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Cursor;
import com.constantes.*;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class PanelPacientes extends JPanel implements Fonts, Colores, ConstantesComponentes {

	private static final long serialVersionUID = 1L;
	private Listener listener;	
	private boolean clicked;

	public PanelPacientes() {
		setPreferredSize(new Dimension(265, 520));
		setLayout(new BorderLayout(0, 0));
		
		JPanel panelIconos = new JPanel();
		panelIconos.setPreferredSize(new Dimension(55, 520));
		panelIconos.setBackground(COLOR_BARRA_LATERAL);
		add(panelIconos, BorderLayout.WEST);
		panelIconos.setLayout(null);
		
		JPanel panelIconMenu = new JPanel();		
		setEstiloPanelIcon(panelIconMenu,0 ,0, 55, 39);
		panelIconos.add(panelIconMenu);
		
		JPanel panelIconRegistrar = new JPanel();
		setEstiloPanelIcon(panelIconRegistrar,0 ,49, 55, 39);
		panelIconos.add(panelIconRegistrar);
		
		JPanel panelIconConsultar = new JPanel();
		setEstiloPanelIcon(panelIconConsultar,0 ,98, 55, 39);
		panelIconos.add(panelIconConsultar);
		
		JPanel panelIconListar = new JPanel();
		setEstiloPanelIcon(panelIconListar,0 ,147, 55, 39);
		panelIconos.add(panelIconListar);
		
		JPanel panelIconRegresar = new JPanel();
		setEstiloPanelIcon(panelIconRegresar,0 ,196, 55, 39);
		
		JLabel iconoMenu = new JLabel("");
		iconoMenu.setIcon(new ImageIcon(PanelPacientes.class.getResource("/com/imagenes/menu.png")));
		iconoMenu.setHorizontalAlignment(SwingConstants.CENTER);
		panelIconMenu.add(iconoMenu, BorderLayout.CENTER);
		panelIconos.add(panelIconRegresar);
		
		JPanel panelMenu = new JPanel();
		panelMenu.setBackground(COLOR_PRINCIPAL);
		add(panelMenu, BorderLayout.CENTER);
		panelMenu.setLayout(null);
		
		JPanel panel_7 = new JPanel();		
		setEstilosPanelEtiq(panel_7, 0, 49, 210, 39);
		panelMenu.add(panel_7);		
		
		JLabel lblNewLabel = new JLabel("Registrar paciente");
		setEstilosEtiqueta(lblNewLabel);
		panel_7.add(lblNewLabel, BorderLayout.CENTER);
		
		JPanel panel_8 = new JPanel();
		setEstilosPanelEtiq(panel_8, 0, 98, 210, 39);
		panelMenu.add(panel_8);
		
		JLabel lblNewLabel_1 = new JLabel("Consultar paciente");
		setEstilosEtiqueta(lblNewLabel_1);
		panel_8.add(lblNewLabel_1, BorderLayout.CENTER);
		
		JPanel panel_9 = new JPanel();
		setEstilosPanelEtiq(panel_9, 0, 147, 210, 39);
		panelMenu.add(panel_9);
		
		JLabel lblNewLabel_2 = new JLabel("Listar pacientes");
		setEstilosEtiqueta(lblNewLabel_2);	
		panel_9.add(lblNewLabel_2, BorderLayout.CENTER);
		
		JPanel panel_10 = new JPanel();
		setEstilosPanelEtiq(panel_10, 0, 196, 210, 39);
		panelMenu.add(panel_10);
		
		JLabel lblNewLabel_3 = new JLabel("Regresar");
		setEstilosEtiqueta(lblNewLabel_3);		
		panel_10.add(lblNewLabel_3, BorderLayout.CENTER);
	
		clicked = false;
		
		/* Controladores de eventos */
		panel_7.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				resaltar(lblNewLabel, panel_7);
				actualizarCursor(panel_7);
			}
			
			public void mouseExited(MouseEvent e) {
				restaurar(lblNewLabel, panel_7);
				resetearCursor(panel_7);
			}
		});
		
		panel_8.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				resaltar(lblNewLabel_1, panel_8);
				actualizarCursor(panel_8);
			}
			
			public void mouseExited(MouseEvent e) {
				restaurar(lblNewLabel_1, panel_8);
				resetearCursor(panel_8);
			}
		});
		
		panel_9.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				resaltar(lblNewLabel_2, panel_9);
				actualizarCursor(panel_9);
			}
			
			public void mouseExited(MouseEvent e) {
				restaurar(lblNewLabel_2, panel_9);
				resetearCursor(panel_9);
			}
		});

		panel_10.addMouseListener(new MouseAdapter() {
		
			public void mouseEntered(MouseEvent e) {
				resaltar(lblNewLabel_3, panel_10);
				actualizarCursor(panel_10);
			}
			
			public void mouseExited(MouseEvent e) {
				restaurar(lblNewLabel_3, panel_10);
				resetearCursor(panel_10);
			}
			
			public void mouseClicked(MouseEvent e) {
				restaurar(lblNewLabel_3, panel_10);
				onOptionSelected(REGRESAR);
			}
		});
		
		panelIconMenu.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				actualizarCursor(panelIconMenu);
			}
			
			public void mouseExited(MouseEvent e) {
				resetearCursor(panelIconMenu);
			}
			
			public void mouseClicked(MouseEvent e) {
				
				Container padre = PanelPacientes.this.getParent();
				
				if(!clicked) {
					padre.setPreferredSize(new Dimension(55, 0));
					clicked = true;
				}else {
					padre.setPreferredSize(new Dimension(265,0));
					clicked = false;
				}
								
				padre.revalidate();
				padre.repaint();
			}
		});
	}
	
	public void setListener(Listener listener) {
		this.listener = listener;
	}
	
	private void onOptionSelected(String option) {
		if(listener != null) {
			this.listener.onOptionSelected(option);
		}
	}
	
	private void setEstilosEtiqueta(JLabel label) {
		label.setForeground(COLOR_FONDO);
		label.setFont(FUENTE_PRINCIPAL);
		label.setHorizontalAlignment(SwingConstants.CENTER);
	}
	
	private void setEstilosPanelEtiq(JPanel panel,int x, int y, int width, int height) {
		panel.setBounds(x, y, width, height);
		panel.setBackground(COLOR_PRINCIPAL);
		panel.setLayout(new BorderLayout(0, 0));
		
	}
	
	private void setEstiloPanelIcon(JPanel panel, int x, int y, int width, int height) {
		panel.setBounds(x, y, width, height);
		panel.setBackground(COLOR_BARRA_LATERAL);
		panel.setLayout(new BorderLayout(0, 0));
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
