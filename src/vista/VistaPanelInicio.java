package vista;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import vista.recursos.componentesPersonalizados.*;


public class VistaPanelInicio {
	JFrame frame = new JFrame();
	private JButton boton;
	private RoundedBorder btnCerrarSesion;
	
	public VistaPanelInicio() {
		frame = new JFrame();
		frame.setSize(950, 700);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.gray);
		
		this.boton = new JButton("Vehiculos");
		btnCerrarSesion = new RoundedBorder(20, false); 
		
	}
	
	public void panelPrincipal() {
		
		// Creacion paneles
		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setBackground(new Color(33, 147, 246));
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelPrincipal.setLayout(null);
		frame.add(panelPrincipal);
		
		RoundedPanel panelCentral = new RoundedPanel(30);
		panelCentral.setBackground(new Color(255, 255, 255));
		panelCentral.setBounds(10, 11, 914, 639);
		panelPrincipal.add(panelCentral);
		panelCentral.setLayout(null);
		
		// Imagen Blazer
		ImageIcon blazerImg = new ImageIcon(getClass().getResource("/vista/recursos/imagenes/blazerG.png"));
		JLabel lblBlazer = new JLabel(blazerImg);
		lblBlazer.setBounds(270, 140, 655, 317);
		panelCentral.add(lblBlazer);
		
		JPanel elementosParteSuperior = new JPanel();
		elementosParteSuperior.setBackground(new Color(255, 255, 255));
		elementosParteSuperior.setBounds(10, 11, 904, 80);
		panelCentral.add(elementosParteSuperior);
		elementosParteSuperior.setLayout(null);
		
		// Imagen logo pagina
		ImageIcon iconoLogo = new ImageIcon(getClass().getResource("/vista/recursos/imagenes/logo.png"));
		JLabel imagenLogo = new JLabel(iconoLogo);
		imagenLogo.setBounds(0, 0, 89, 80);
		elementosParteSuperior.add(imagenLogo);
		
		// Botones acciones en la parte superior, asignados a un panel
		btnCerrarSesion.setText("Cerrar Sesión");
		btnCerrarSesion.setBackground(new Color(33, 147, 246));
		btnCerrarSesion.setForeground(new Color(255, 255, 255));
		btnCerrarSesion.setFont(new Font("Inter", Font.BOLD, 13));
		btnCerrarSesion.setBounds(703, 25, 129, 23);
		btnCerrarSesion.setFocusPainted(false);
		btnCerrarSesion.setFocusPainted(false);
		btnCerrarSesion.setBorderPainted(false);
		btnCerrarSesion.setContentAreaFilled(false);
		btnCerrarSesion.setFocusPainted(false);
		elementosParteSuperior.add(btnCerrarSesion);
		
		JButton btnClientes = new JButton("Clientes");
		btnClientes.setBackground(new Color(255, 255, 255));
		btnClientes.setFont(new Font("Inter", Font.BOLD, 13));
		btnClientes.setBounds(608, 25, 89, 23);
		btnClientes.setOpaque(false);
		btnClientes.setBorderPainted(false);
		btnClientes.setFocusPainted(false);
		elementosParteSuperior.add(btnClientes);
		
		JButton btnVehiculos = new JButton("Vehiculos");
		btnVehiculos.setBackground(new Color(255, 255, 255));
		btnVehiculos.setFont(new Font("Inter", Font.BOLD, 13));
		btnVehiculos.setBounds(492, 25, 114, 23);
		btnVehiculos.setOpaque(false);
		btnVehiculos.setBorderPainted(false);
		btnVehiculos.setFocusPainted(false);
		elementosParteSuperior.add(btnVehiculos);
		
		JButton btnRentas = new JButton("Rentas");
		btnRentas.setBackground(new Color(255, 255, 255));
		btnRentas.setFont(new Font("Inter", Font.BOLD, 13));
		btnRentas.setBounds(410, 25, 89, 23);
		btnRentas.setOpaque(false);
		btnRentas.setBorderPainted(false);
		btnRentas.setFocusPainted(false);
		elementosParteSuperior.add(btnRentas);
		
		JButton btnCategorias = new JButton("Categorias");
		btnCategorias.setBackground(new Color(255, 255, 255));
		btnCategorias.setFont(new Font("Inter", Font.BOLD, 13));
		btnCategorias.setBounds(297, 25, 114, 23);
		btnCategorias.setOpaque(false);
		btnCategorias.setBorderPainted(false);
		btnCategorias.setFocusPainted(false);
		elementosParteSuperior.add(btnCategorias);
		
		JButton btnMarcas = new JButton("Marcas");
		btnMarcas.setBackground(new Color(255, 255, 255));
		btnMarcas.setFont(new Font("Inter", Font.BOLD, 13));
		btnMarcas.setBounds(198, 25, 89, 23);
		btnMarcas.setOpaque(false);
		btnMarcas.setBorderPainted(false);
		btnMarcas.setFocusPainted(false);
		elementosParteSuperior.add(btnMarcas);
		
		JButton btnInicio = new JButton("Inicio");
		btnInicio.setForeground(new Color(33, 147, 246));
		btnInicio.setBackground(new Color(255, 255, 255));
		btnInicio.setFont(new Font("Inter", Font.BOLD, 13));
		btnInicio.setBounds(99, 25, 89, 23);
		btnInicio.setOpaque(false);
		btnInicio.setBorderPainted(false);
		btnInicio.setFocusPainted(false);
		elementosParteSuperior.add(btnInicio);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 489, 894, 90);
		panelCentral.add(panel);
		
		JLabel lblNewLabel = new JLabel("Encuentra y renta el auto");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Inter", Font.BOLD, 36));
		lblNewLabel.setBounds(27, 161, 447, 44);
		panelCentral.add(lblNewLabel);
		
		JLabel lblDeTusSueos = new JLabel("de tus sueños en");
		lblDeTusSueos.setForeground(new Color(0, 0, 0));
		lblDeTusSueos.setFont(new Font("Inter", Font.BOLD, 36));
		lblDeTusSueos.setBounds(27, 205, 447, 44);
		panelCentral.add(lblDeTusSueos);
		
		JPanel lineaCentro = new JPanel();
		lineaCentro.setBackground(new Color(33, 147, 246));
		lineaCentro.setBounds(0, 249, 914, 101);
		panelCentral.add(lineaCentro);
		lineaCentro.setLayout(null);
		
		JLabel lblDeTusSueos_1 = new JLabel("sencillos pasos.");
		lblDeTusSueos_1.setForeground(new Color(255, 255, 255));
		lblDeTusSueos_1.setBounds(27, 0, 297, 44);
		lineaCentro.add(lblDeTusSueos_1);
		lblDeTusSueos_1.setFont(new Font("Inter", Font.BOLD, 36));
	}
	
	public void asignarActListner(ActionListener listener) {
		btnCerrarSesion.addActionListener(listener);
	}
	
	// Getters
	public JFrame getFrame() {
		return frame;
	}
	
	
	// Setters
	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
	
	
		
}
