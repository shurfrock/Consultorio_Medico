package com.ventanas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import com.constantes.*;

public class VentanaPrinSecretaria extends JFrame implements Listener ,Colores, Fonts, ConstantesComponentes {

	private static final long serialVersionUID = 1L;
	private JPanel panelContenidoMostrar;
	private InfoCuentaSecretaria infoCuenta;
	private JPanel panelLateral;
	private PanelMenuPrinSecretaria menuPrincipal;
	private PanelPacientes submenu;
	
	public VentanaPrinSecretaria() {
		
		/* Window's configuration */
		
		super("Secretaria");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 822, 520);
		setResizable(false);
		
		/* Here ends window's configuration */
		
		
		/* Visual components and panels */
				
		JPanel panelPrincipal = new JPanel();
		panelLateral = new JPanel();
		panelContenidoMostrar = new JPanel();
		PanelBienvenida bienvenida = new PanelBienvenida();
		menuPrincipal = new PanelMenuPrinSecretaria();
		submenu = new PanelPacientes();
		infoCuenta = new InfoCuentaSecretaria();
		
		panelPrincipal.setBorder(null);
		panelPrincipal.setLayout(new BorderLayout(0, 0));
				
		panelLateral.setPreferredSize(new Dimension(265, 0));
		panelLateral.setLayout(new BorderLayout(0, 0));
				
		mostrarMenuPrincipal();
				
		panelPrincipal.add(panelLateral, BorderLayout.WEST);
		panelPrincipal.add(panelContenidoMostrar, BorderLayout.CENTER);
		panelContenidoMostrar.setLayout(new BorderLayout(0, 0));
		
		panelContenidoMostrar.add(bienvenida);
		
		setContentPane(panelPrincipal);
		
		/* Here ends components's configuration */
		
		menuPrincipal.setSubMenuListener(this);
		submenu.setListener(this);
	}
	
	public void onOptionSelected(String opcion) { /* La ventana es la encargada de realizar todos los cambios solicitados por los menus*/
		switch(opcion) {
		case INFORMACION_CUENTA:
			mostrarInfoCuenta();
			break;
			
		case PACIENTES:
			mostrarSubmenu();
			break;
		
		case CITAS:
			break;
			
		case REGRESAR:
			mostrarMenuPrincipal();
			break;
			
		case SALIR:
			break;
			
		default:
			break;
		}
	}

	public PanelMenuPrinSecretaria getMenuPrincipal(){
		return menuPrincipal;
	}
	
	public void mostrarMenuPrincipal() {
		panelLateral.removeAll();
		panelLateral.add(menuPrincipal, BorderLayout.WEST);
		panelLateral.revalidate();
		panelLateral.repaint();
	}
	
	private void mostrarSubmenu() {		
		panelLateral.removeAll();
		panelLateral.add(submenu, BorderLayout.WEST);
		panelLateral.revalidate();
		panelLateral.repaint();
		
	}
	
	private void mostrarInfoCuenta() {
		panelContenidoMostrar.removeAll();
		panelContenidoMostrar.add(infoCuenta, BorderLayout.CENTER);
		panelContenidoMostrar.revalidate();
		panelContenidoMostrar.repaint();
	}
	
	private void regresarMenuPrincipal() {
		mostrarMenuPrincipal();
	}
}
