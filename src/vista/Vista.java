package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;


public class Vista {
	private JFrame frame;
	private JButton boton;
	private JTextField txtCorreo;
	private JPasswordField txtContrasenia;
	
	
	//Constructor de la vista donde se inicializa lo que se va a necesitar
	public Vista() {
		frame = new JFrame();
		frame.setSize(950, 700);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.gray);
		boton = new JButton();
		txtCorreo = new JTextField();
		txtContrasenia= new JPasswordField();
	}
	
	public JTextField getTxtCorreo() {
		return txtCorreo;
	}

	public JPasswordField getTxtContrasenia() {
		return txtContrasenia;
	}
	public JFrame getFrame() {
		return frame;
	}

	public void login() {
		//Creacion de paneles
		JPanel panelPrincipal= new JPanel();
		panelPrincipal.setLayout(new GridLayout(1,2,0,0));
		panelPrincipal.setBackground(Color.BLACK);
		frame.add(panelPrincipal);
		
		//PanelesLogin
		JPanel panelIzquierda= new JPanel();
		panelIzquierda.setBackground(Color.WHITE);
		panelIzquierda.setLayout(null);
		panelPrincipal.add(panelIzquierda);
		
		JPanel panelDerecha = new JPanel() {
			public void paintComponent(Graphics g) {
				int width = getWidth();
				int height = getHeight();
				Graphics2D g2d = (Graphics2D) g;
				g2d.setPaint(new GradientPaint(500.0f, -100.0f, new Color(2,27,121), width, height, new Color(0, 128, 255), true));
				g2d.fillRect(0, 0, width, height);
				g2d.setColor(getBackground());
			}
		};
		panelDerecha.setBackground(new Color(102,255,2,2));
		panelDerecha.setLayout(null);
		panelPrincipal.add(panelDerecha);
		
		//Label bienvenida
		JLabel lblBienvenida = new JLabel("¡Bienvenido!");
		lblBienvenida.setForeground(Color.WHITE);
		lblBienvenida.setBounds(110, 290, 260, 48);
		lblBienvenida.setFont(new Font("Tahoma", Font.BOLD, 40));
		panelDerecha.add(lblBienvenida);
		
		
		//Boton para iniciar sesion
		boton.setForeground(Color.WHITE);
		boton.setText("IniciarSesion");
		boton.setBackground(new Color(50,57,211));
		boton.setFont(new Font("Tahoma", Font.BOLD, 10));
		boton.setBounds(185,500,100,20);
		boton.setFocusPainted(false);
		panelIzquierda.add(boton);
		
		//lbl Iniciar sesion
		JLabel lblIniciarSesion = new JLabel("Iniciar Sesion");
		lblIniciarSesion.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblIniciarSesion.setForeground(Color.BLACK);
		lblIniciarSesion.setBounds(125, 84, 271, 54);
		panelIzquierda.add(lblIniciarSesion);
		
		//Text Fields con Labels
		txtCorreo.setBorder(new LineBorder(Color.GRAY, 2));
		txtCorreo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtCorreo.setBounds(80, 250, 300, 30);
		txtCorreo.setBackground(new Color(240,240,240));
		panelIzquierda.add(txtCorreo);
		JLabel lblCorreo = new JLabel("Correo Electronico");
		lblCorreo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCorreo.setBounds(80, 220, 300, 30);
		lblCorreo.setBackground(new Color(240,250,240));
		panelIzquierda.add(lblCorreo);
		
		txtContrasenia.setBorder(new LineBorder(Color.GRAY, 2));
		txtContrasenia.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtContrasenia.setBounds(80, 350, 300, 30);
		txtContrasenia.setBackground(new Color(240,240,240));
		panelIzquierda.add(txtContrasenia);
		JLabel lblContrasenia = new JLabel("Contraseña");
		lblContrasenia.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblContrasenia.setBounds(80, 320, 300, 30);
		lblContrasenia.setBackground(new Color(240,250,240));
		panelIzquierda.add(lblContrasenia);
		
		
		//AsignarActionListener a botones
		
		frame.revalidate();
		frame.repaint();
	}
	
	/*
	public void login() {
		//Creacion de paneles
		JPanel panelPrincipal= new JPanel();
		panelPrincipal.setLayout(new GridLayout(1,2,0,0));
		panelPrincipal.setBackground(Color.BLACK);
		frame.add(panelPrincipal);
		
		//PanelesLogin
		JPanel panelIzquierda= new JPanel();
		panelIzquierda.setBackground(Color.WHITE);
		panelIzquierda.setLayout(null);
		panelPrincipal.add(panelIzquierda);
		
		JPanel panelDerecha = new JPanel() {
			public void paintComponent(Graphics g) {
				int width = getWidth();
				int height = getHeight();
				Graphics2D g2d = (Graphics2D) g;
				g2d.setPaint(new GradientPaint(500.0f, -100.0f, new Color(2,27,121), width, height, new Color(0, 128, 255), true));
				g2d.fillRect(0, 0, width, height);
				g2d.setColor(getBackground());
			}
		};
		panelDerecha.setBackground(new Color(102,255,2,2));
		panelDerecha.setLayout(null);
		panelPrincipal.add(panelDerecha);
		
		//Label bienvenida
		JLabel lblBienvenida = new JLabel("¡Bienvenido!");
		lblBienvenida.setForeground(Color.WHITE);
		lblBienvenida.setBounds(110, 290, 260, 48);
		lblBienvenida.setFont(new Font("Tahoma", Font.BOLD, 40));
		panelDerecha.add(lblBienvenida);
		
		
		//Boton para iniciar sesion
		boton.setForeground(Color.WHITE);
		boton.setText("Registrarse");
		boton.setBackground(new Color(50,57,211));
		boton.setFont(new Font("Tahoma", Font.BOLD, 10));
		boton.setBounds(185,500,100,20);
		boton.setFocusPainted(false);
		panelIzquierda.add(boton);
		
		//lbl Iniciar sesion
		JLabel lblIniciarSesion = new JLabel("Crear Cuenta");
		lblIniciarSesion.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblIniciarSesion.setForeground(Color.BLACK);
		lblIniciarSesion.setBounds(125, 84, 271, 54);
		panelIzquierda.add(lblIniciarSesion);
		
		//Text Fields con Labels
		txtCorreo.setBorder(new LineBorder(Color.GRAY, 2));
		txtCorreo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtCorreo.setBounds(80, 250, 300, 30);
		txtCorreo.setBackground(new Color(240,240,240));
		panelIzquierda.add(txtCorreo);
		JLabel lblCorreo = new JLabel("Correo Electronico");
		lblCorreo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCorreo.setBounds(80, 220, 300, 30);
		lblCorreo.setBackground(new Color(240,250,240));
		panelIzquierda.add(lblCorreo);
		
		txtContrasenia.setBorder(new LineBorder(Color.GRAY, 2));
		txtContrasenia.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtContrasenia.setBounds(80, 350, 300, 30);
		txtContrasenia.setBackground(new Color(240,240,240));
		panelIzquierda.add(txtContrasenia);
		JLabel lblContrasenia = new JLabel("Contraseña");
		lblContrasenia.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblContrasenia.setBounds(80, 320, 300, 30);
		lblContrasenia.setBackground(new Color(240,250,240));
		panelIzquierda.add(lblContrasenia);
		
		
		//AsignarActionListener a botones
		
		frame.revalidate();
		frame.repaint();
	}
	*/
	
	//Metodo que asigna los action listeners a los botones que se utilizarán en los paneles
	public void asignarActListner(ActionListener listener) {
		boton.addActionListener(listener);
	}
	
}
