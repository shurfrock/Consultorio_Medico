package com.ventanas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.border.SoftBevelBorder;

import com.componentesVisuales.MyJPasswordField;
import com.componentesVisuales.MyJTextField;
import com.dataAccessObject.*;
import com.mysql.cj.xdevapi.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InicioSesion extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;	

	public InicioSesion() {
		
		/* Ajustes de inicialización de la ventan principal */
		
		super("Inicio de sesión");

		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 780, 491);
		
		/* Declaración e Instanciacion de objetos */
		
		JPanel panelPrincipal = new JPanel();
		JPanel panelLateral = new JPanel();
		JPanel panelBoton = new JPanel();
		
		JLabel iconoLogin = new JLabel("");
		JLabel encabezado = new JLabel("Inicio de Sesión");
		JLabel txtUsername = new JLabel("Username");
		MyJTextField campoUsername = new MyJTextField();
		JLabel txtPassword = new JLabel("Password");
		MyJPasswordField campoPassword = new MyJPasswordField();		
		campoPassword.setIcono(new ImageIcon(InicioSesion.class.getResource("/com/imagenes/clave-de-usuario.png")));
		JLabel txtBoton = new JLabel("Ingresar");
				
		/* Ajustes visuales de los objetos */
		
					/** Panel principal **/
		panelPrincipal.setForeground(new Color(0, 0, 0));
		panelPrincipal.setBorder(new EmptyBorder(0, 0, 0, 0));
		panelPrincipal.setBackground(new Color(255, 255, 255));
		panelPrincipal.setLayout(null);
				
					/** Panel lateral**/
		panelLateral.setBackground(new Color(50, 81, 205));
		panelLateral.setBounds(368, 0, 396, 452);
		panelLateral.setLayout(null);		
		panelLateral.setBorder(null);
		
					/** Icono login **/
		iconoLogin.setHorizontalAlignment(SwingConstants.CENTER);
		iconoLogin.setIcon(new ImageIcon(InicioSesion.class.getResource("/com/imagenes/lock.png")));
		iconoLogin.setBounds(87, 103, 196, 245);
		
					/** texto encabezado **/
		encabezado.setBounds(105, 34, 196, 32);		
		encabezado.setForeground(Color.WHITE);
		encabezado.setFont(new Font("Roboto", Font.BOLD, 27));
		encabezado.setBackground(Color.WHITE);
		
					/** Texto Username **/
		txtUsername.setForeground(Color.BLACK);
		txtUsername.setBackground(Color.BLACK);
		txtUsername.setBounds(32, 117, 89, 29);
		txtUsername.setFont(new Font("Roboto", Font.PLAIN, 16));		
		
					/** Campo Username **/
		campoUsername.setBounds(32, 146, 326, 40);
		campoUsername.setIcono(new ImageIcon(InicioSesion.class.getResource("/com/imagenes/usuario.png")));
		campoUsername.setToolTipText("Ingrese su nombre de usuario");
		campoUsername.setColumns(10);
		
					/** Texto Password **/
		txtPassword.setForeground(Color.BLACK);
		txtPassword.setBounds(32, 216, 78, 22);
		txtPassword.setFont(new Font("Roboto", Font.PLAIN, 16));
		
					/** Campo Password **/
		campoPassword.setBounds(32, 240, 326, 40);
		campoPassword.setToolTipText("Ingrese su contraseña");
		
					/** Panel de boton **/
		panelBoton.setForeground(Color.BLACK);
		panelBoton.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelBoton.setBackground(Color.WHITE);
		panelBoton.setToolTipText("Presione el botón");
		panelBoton.setBounds(157, 356, 119, 34);
		panelBoton.setLayout(null);
			
					/** Texto del boton **/
		txtBoton.setHorizontalAlignment(SwingConstants.CENTER);
		txtBoton.setBackground(Color.WHITE);
		txtBoton.setForeground(Color.BLACK);
		txtBoton.setBounds(20, 0, 77, 32);
		txtBoton.setFont(new Font("Roboto", Font.PLAIN, 16));
		
		/* Asignación de objetos a los paneles */
		
		panelPrincipal.add(panelLateral);
		panelPrincipal.add(iconoLogin);
		panelLateral.add(encabezado);		
		panelLateral.add(txtUsername);
		panelLateral.add(campoUsername);
		panelLateral.add(txtPassword);
		panelLateral.add(campoPassword);		
		panelLateral.add(panelBoton);
		panelBoton.add(txtBoton);
		setContentPane(panelPrincipal);	
		
		panelBoton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panelBoton.setBackground(new Color(157,197,255));
				panelBoton.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
			}
			@Override
			public void mouseExited(MouseEvent e) {				
				panelBoton.setBackground(new Color(255,255,255));
				panelBoton.setBorder(null);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String username ="", contrasena ="", tipo ="", uInt, cInt;
				boolean bandera = false;
				Connection con = ConectarDB();
				
				uInt = campoUsername.getText();
				cInt = campoPassword.getText();
				
				System.out.println("Username: " + uInt + " Password: " + cInt);
				
				String sql = "select u.username, u.contrasena, u.tipo from usuario u;";
				java.sql.Statement stmt;
				ResultSet rs;
				
				try {
					stmt = con.createStatement();
					rs = stmt.executeQuery(sql);
					
					while(rs.next()) {
						username = rs.getString("username");
						contrasena = rs.getString("contrasena");
						tipo = rs.getString("tipo");
						
						if(username.equals(uInt) && contrasena.equals(cInt)){
							bandera = true;
							break;
						}
						
						//System.out.println("User: " + username + ", Contrasena: " + contrasena + ", Tipo: " + tipo);
					}
					
					if(bandera) {
						switch(tipo.toLowerCase()) {
						case "a":
							VentanaAdmin vNueva = new VentanaAdmin() {
								public void dispose() {
									getFrame().setVisible(true);
									super.dispose();
								}
							};
							
							vNueva.setVisible(true);
							dispose();
							break;
						case "d":
							System.out.println("Doctor");
							break;
						case "s":
							System.out.println("Secretaria");
							break;
						}
					}
					else {
						System.out.println("Usuario no registrado");
					}
					
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
			}
		});
	}
	
	public static Connection ConectarDB() {
Database bd = new Database();
		
		try {
			Connection conexion = bd.getConnection();
			//System.out.println("Conexion exitosa");
			return conexion;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	private JFrame getFrame() {
		return this;
	}
	
	public void actionPerformed(ActionEvent e){
		
	}
}
