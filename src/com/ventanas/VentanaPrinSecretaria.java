package com.ventanas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

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
	private RegistrarPaciente registrarPaciente;
	private ConsultarPaciente consultarPaciente;
	private ListadoPacientes listadoPacientes;
	private Citas menuCitas;
	private AgendarCita agendarCita;
	private ListadoCitas mostrarCitas;
	private Boolean clicked;
	
	public VentanaPrinSecretaria() {
		
		/* Window's configuration */
		
		super("Secretaria");		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 822, 620);
		setResizable(true);
		
		/* Here ends window's configuration */
		
		
		/* Visual components and panels */
				
		JPanel panelPrincipal = new JPanel();
		panelLateral = new JPanel();
		panelContenidoMostrar = new JPanel();
		PanelBienvenida bienvenida = new PanelBienvenida();
		menuPrincipal = new PanelMenuPrinSecretaria();
		submenu = new PanelPacientes();
		infoCuenta = new InfoCuentaSecretaria(SECRETARIA);
		registrarPaciente = new RegistrarPaciente();
		consultarPaciente = new ConsultarPaciente(SECRETARIA);
		menuCitas = new Citas();
		agendarCita = new AgendarCita();
		mostrarCitas = new ListadoCitas();
		
		panelPrincipal.setBorder(null);
		panelPrincipal.setLayout(new BorderLayout(0, 0));
				
		panelLateral.setPreferredSize(new Dimension(265, 0));
		panelLateral.setLayout(new BorderLayout(0, 0));
				
		mostrarMenuLateral(menuPrincipal);
				
		panelPrincipal.add(panelLateral, BorderLayout.WEST);
		panelPrincipal.add(panelContenidoMostrar, BorderLayout.CENTER);
		panelContenidoMostrar.setLayout(new BorderLayout(0, 0));
		
		contenidoPrincipal(bienvenida);
		
		setContentPane(panelPrincipal);
		
		clicked = false;
		
		/* Here ends components's configuration */
		
		menuPrincipal.setSubMenuListener(this);
		submenu.setListener(this);
		menuCitas.setListener(this);
	}
	
	public void onOptionSelected(String opcion) { /* La ventana es la encargada de realizar todos los cambios solicitados por los menus*/
		switch(opcion) {
		case INFORMACION_CUENTA:
			contenidoPrincipal(infoCuenta);
			break;
			
		case PACIENTES:
			mostrarMenuLateral(submenu);
			break;
		
		case CITAS:
			mostrarMenuLateral(menuCitas);
			break;
			
		case AGENDAR_CITA:
			contenidoPrincipal(agendarCita);
			break;
			
		case MOSTRAR_CITAS:
			contenidoPrincipal(mostrarCitas);
			break;
			
		case REGISTRAR_PACIENTE:
			contenidoPrincipal(registrarPaciente);
			break;
			
		case CONSULTAR_PACIENTE:
			contenidoPrincipal(consultarPaciente);
			break;
			
		case LISTAR_PACIENTES:
			listadoPacientes = new ListadoPacientes(); /* Modificar esta parte */
			contenidoPrincipal(listadoPacientes);
			break;
			
		case REGRESAR:
			mostrarMenuLateral(menuPrincipal);
			break;
			
		case OCULTAR_MENU_LATERAL:
			ocultarMenuLateral();
			break;
			
		case SALIR:
			/* provisional */
			Inicio inicio = new Inicio();
			inicio.setVisible(true);
			VentanaPrinSecretaria.this.dispose(); /* Entrega los recursos al sistema operativo */
			break;
			
		default:
			break;
		}
	}
	
	private void mostrarMenuLateral(JPanel panel) {
		panelLateral.removeAll();
		panelLateral.add(panel, BorderLayout.WEST);
		panelLateral.revalidate();
		panelLateral.repaint();
	}
	
	private void ocultarMenuLateral() {
		if(!clicked) {
			panelLateral.setPreferredSize(new Dimension(55,0));
			clicked = true;
		}else {
			panelLateral.setPreferredSize(new Dimension(265,0));
			clicked = false;
		}
		
		SwingUtilities.updateComponentTreeUI(panelLateral);
	}
	
	private void contenidoPrincipal(JPanel panel) {
		panelContenidoMostrar.removeAll();
		panelContenidoMostrar.add(panel, BorderLayout.CENTER);
		panelContenidoMostrar.revalidate();
		panelContenidoMostrar.repaint();
	}
}
