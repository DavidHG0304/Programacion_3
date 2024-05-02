package panelesInterfaz;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;

public class Paneles extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField_1;
	static Paneles frame = new Paneles();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					frame.setVisible(true);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Paneles() {
		this.login(frame);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Cuenta");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Login");
		mnNewMenu.add(mntmNewMenuItem);
		mntmNewMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				contentPane.repaint();
				contentPane.revalidate();
				login(frame);
				
			}
		});
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Registro");
		mnNewMenu.add(mntmNewMenuItem_1);
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				contentPane.repaint();
				contentPane.revalidate();
				registro(frame);
				
			}
		});
		
		JMenuItem itemRecuperacion = new JMenuItem("Recuperacion de cuenta");
		mnNewMenu.add(itemRecuperacion);
		itemRecuperacion.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				contentPane.repaint();
				contentPane.revalidate();
				recuperacionCuenta(frame);
			}
		});
		
		JMenu menuUsuarios = new JMenu("Usuarios");
		menuBar.add(menuUsuarios);
		
		JMenuItem menuAlta = new JMenuItem("Alta");
		menuUsuarios.add(menuAlta);
		menuAlta.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				contentPane.repaint();
				contentPane.revalidate();
				altaCuenta(frame);
			}
		});
		
		
		JMenuItem menuBaja = new JMenuItem("Baja");
		menuUsuarios.add(menuBaja);

		JMenuItem menuConsultar = new JMenuItem("Consultar");
		menuUsuarios.add(menuConsultar);
		
		
		JMenu menuAyuda = new JMenu("Ayuda");
		menuBar.add(menuAyuda);
		
		JMenuItem menuPregunta1 = new JMenuItem("¿Cómo crear un usuario?");
		menuAyuda.add(menuPregunta1);
		
		JMenuItem menuPregunta2 = new JMenuItem("¿Cómo acceder al sistema?");
		menuAyuda.add(menuPregunta2);
		
		JMenuItem menuPregunta3 = new JMenuItem("¿Qué pasa si olvidé mi contraseña?");
		menuAyuda.add(menuPregunta3);
		
	}
	
	public void login(JFrame frame) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 507, 613);
		
		
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelLogin = new JPanel();
		panelLogin.setBackground(new Color(111, 111, 111));
		contentPane.add(panelLogin, BorderLayout.CENTER);
		panelLogin.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Iniciar Sesion");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 39));
		lblNewLabel.setBounds(82, 23, 315, 116);
		panelLogin.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(82, 181, 315, 45);
		panelLogin.add(textField);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(82, 280, 315, 45);
		panelLogin.add(passwordField);
		
		JLabel label = new JLabel("New label");
		label.setBounds(82, 184, 315, -33);
		panelLogin.add(label);
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese el nombre de usuario");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBackground(Color.BLACK);
		lblNewLabel_1.setBounds(82, 162, 315, 20);
		panelLogin.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ingrese su contraseña");
		lblNewLabel_1_1.setOpaque(true);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBackground(Color.BLACK);
		lblNewLabel_1_1.setBounds(82, 261, 315, 20);
		panelLogin.add(lblNewLabel_1_1);
		
		JButton botonCambiar = new JButton("Crear Cuenta");
		botonCambiar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		botonCambiar.setBounds(137, 440, 193, 28);
		panelLogin.add(botonCambiar);
		
		botonCambiar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//removeAll con JmenuBar
				//recover con JMenuBar
				contentPane.remove(panelLogin);
				contentPane.repaint();
				contentPane.revalidate();
				registro(frame);
			}
		});
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.setBounds(137, 360, 193, 68);
		panelLogin.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//System.out.println("hola");
				JOptionPane.showMessageDialog(null, "Error al ingresar las credenciales", "Alerta", JOptionPane.WARNING_MESSAGE);
			}
		});
	}

	public void registro(JFrame frame) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 507, 613);
		
	
		
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelRegistro = new JPanel();
		panelRegistro.setBackground(new Color(85, 0, 170));
		contentPane.add(panelRegistro, BorderLayout.CENTER);
		panelRegistro.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registrarse");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 31));
		lblNewLabel.setForeground(new Color(247, 210, 9));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(109, 84, 271, 54);
		panelRegistro.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ingresa tu nombre");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(85, 159, 105, 14);
		panelRegistro.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(85, 174, 149, 28);
		panelRegistro.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(242, 174, 138, 28);
		panelRegistro.add(textField_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ingresa tu apellido");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setBounds(275, 159, 105, 14);
		panelRegistro.add(lblNewLabel_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(109, 240, 237, 28);
		panelRegistro.add(textField_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("Correo electrónico");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setBounds(109, 224, 105, 14);
		panelRegistro.add(lblNewLabel_1_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(109, 304, 237, 28);
		panelRegistro.add(passwordField);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Contraseña");
		lblNewLabel_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1.setBounds(109, 289, 105, 14);
		panelRegistro.add(lblNewLabel_1_2_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(109, 365, 237, 28);
		panelRegistro.add(passwordField_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Confirmar contraseña");
		lblNewLabel_1_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1_1.setBounds(109, 350, 135, 14);
		panelRegistro.add(lblNewLabel_1_2_1_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Acepto los términos y condiciones, vendo mi alma al diablo.");
		chckbxNewCheckBox.setForeground(new Color(255, 255, 255));
		chckbxNewCheckBox.setBounds(85, 413, 330, 42);
		chckbxNewCheckBox.setOpaque(false);
		
		panelRegistro.add(chckbxNewCheckBox);
		
		JButton btnNewButton = new JButton("Registrarse");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton botonCambiar = new JButton("Volver a login");
		botonCambiar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		botonCambiar.setBounds(137, 485, 193, 28);
		panelRegistro.add(botonCambiar);
		
		botonCambiar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//removeAll con JmenuBar
				contentPane.remove(panelRegistro);
				contentPane.repaint();
				contentPane.revalidate();
				login(frame);
			}
		});
		
		btnNewButton.setBackground(new Color(237, 198, 107));
		btnNewButton.setBounds(162, 450, 149, 28);
		panelRegistro.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String contrasenia = new String(passwordField.getPassword());
				String contraseniaConfirmar= new String(passwordField_1.getPassword());
				if((contrasenia.equals(contraseniaConfirmar))&&(!contrasenia.equals(""))&&(contrasenia.length() >=8 && contraseniaConfirmar.length() >= 8)) {
					JOptionPane.showMessageDialog(null, "Success", "Se ha registrado con exito", JOptionPane.INFORMATION_MESSAGE);
				}else if(contrasenia.isEmpty() && contraseniaConfirmar.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Escriba una contraseña", "Alerta", JOptionPane.WARNING_MESSAGE);
				}else if(contrasenia.length() < 8 && contraseniaConfirmar.length() < 8) {
					JOptionPane.showMessageDialog(null, "Su contraseña debe ser mayor a 8 caracteres", "Error", JOptionPane.ERROR_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
	}
	
	public void recuperacionCuenta(JFrame frame) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 507, 613);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelEnPanalla = new JPanel();
		panelEnPanalla.setBackground(new Color(108, 20, 72));
		contentPane.add(panelEnPanalla, BorderLayout.CENTER);
		panelEnPanalla.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Recuperación");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 39));
		lblNewLabel.setBounds(82, 23, 315, 116);
		panelEnPanalla.add(lblNewLabel);
	}
	
	public void altaCuenta(JFrame frame) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 507, 613);
		
		
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelEnPanalla = new JPanel();
		panelEnPanalla.setBackground(new Color(72, 20, 108));
		contentPane.add(panelEnPanalla, BorderLayout.CENTER);
		panelEnPanalla.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Alta");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 39));
		lblNewLabel.setBounds(82, 23, 315, 116);
		panelEnPanalla.add(lblNewLabel);
		
	}
	
	
	
	
	
	
	
	
}