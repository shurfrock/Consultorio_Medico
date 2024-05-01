package com.ventanas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import com.constantes.ConstantesComponentes;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class VentanaPrinDoctor extends JFrame implements Listener, ConstantesComponentes {

	private static final long serialVersionUID = 1L;
	private JPanel panelPrincipal;
	private JPanel panelLateral;
	private JPanel panelContenidoCentral;
	private boolean clicked;
	private MenuPrinDoctor menuPrincipal;
	private PanelPacientes pacientes;
	private RegistrarPaciente registrarPaciente;
	private ConsultarPaciente consultarPaciente;
	private ListadoPacientes listadoPacientes;
	private Citas citas;
	private AgendarCita agendarCita;
	private ListadoCitas mostrarCitas;
	private InfoCuentaSecretaria infoCuenta;
	private CrearConsulta crearConsulta;
	
	public VentanaPrinDoctor() {
		
		/* Configuracion de la ventana principal */
		
		super("Doctor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 887, 621);
		panelPrincipal = new JPanel();
		panelPrincipal.setBorder(null);
		panelPrincipal.setLayout(new BorderLayout(0, 0));
		
		panelLateral = new JPanel();
		panelLateral.setPreferredSize(new Dimension(265, 10));
		panelLateral.setLayout(new BorderLayout(0, 0));
		panelPrincipal.add(panelLateral, BorderLayout.WEST);
		
		panelContenidoCentral = new JPanel();
		panelContenidoCentral.setLayout(new BorderLayout(0, 0));
		panelPrincipal.add(panelContenidoCentral, BorderLayout.CENTER);
		
		PanelBienvenida bienvenida = new PanelBienvenida();
		menuPrincipal = new MenuPrinDoctor();

		mostrarMenuLateral(menuPrincipal);
		mostrarContenidoPrincipal(bienvenida);
		
		setContentPane(panelPrincipal);
		
		clicked = false;
		pacientes = new PanelPacientes();
		citas = new Citas();
		registrarPaciente = new RegistrarPaciente();
		consultarPaciente = new ConsultarPaciente(MEDICO);
		listadoPacientes = new ListadoPacientes();
		agendarCita = new AgendarCita();
		mostrarCitas = new ListadoCitas();
		crearConsulta = new CrearConsulta();
		
		menuPrincipal.setListener(this);
		pacientes.setListener(this);
		citas.setListener(this);
		infoCuenta = new InfoCuentaSecretaria(MEDICO);
	}
	
	private void mostrarMenuLateral(JPanel panel) {
		panelLateral.removeAll();
		panelLateral.add(panel);
		panelLateral.revalidate();
		panelLateral.repaint();
	}
	
	private void mostrarContenidoPrincipal(JPanel panel) {
		panelContenidoCentral.removeAll();
		panelContenidoCentral.add(panel, BorderLayout.CENTER);
		panelContenidoCentral.revalidate();
		panelContenidoCentral.repaint();
	}
	
	private void ocultarBarraLateral() {
		if(!clicked) {
			panelLateral.setPreferredSize(new Dimension(55,0));
			clicked = true;
		}else {
			panelLateral.setPreferredSize(new Dimension(265,0));
			clicked = false;
		}
		
		panelLateral.revalidate();
		panelLateral.repaint();
	}

	public void onOptionSelected(String opcion) {
		
		switch(opcion) {
		
		case OCULTAR_MENU_LATERAL:
			ocultarBarraLateral();
			break;
		
		case INFORMACION_CUENTA:
			mostrarContenidoPrincipal(infoCuenta);
			break;
			
		case PACIENTES:
			mostrarMenuLateral(pacientes);
			break;
			
		case REGISTRAR_PACIENTE:
			mostrarContenidoPrincipal(registrarPaciente);
			break;
			
		case CONSULTAR_PACIENTE:
			mostrarContenidoPrincipal(consultarPaciente);
			break;
			
		case LISTAR_PACIENTES:
			mostrarContenidoPrincipal(listadoPacientes);
			break;
			
		case CITAS:
			mostrarMenuLateral(citas);
			break;
			
		case AGENDAR_CITA:
			mostrarContenidoPrincipal(agendarCita);
			break;
			
		case MOSTRAR_CITAS:
			mostrarContenidoPrincipal(mostrarCitas);
			break;
			
		case CREAR_CONSULTA:
			mostrarContenidoPrincipal(crearConsulta);
			break;
			
		case REGRESAR:
			mostrarMenuLateral(menuPrincipal);
			break;
			
		case SALIR:
			break;
			
		default:
			break;
		}
	}
}
