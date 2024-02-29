package ventana;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Panel;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.plaf.ColorChooserUI;

public class Login extends JFrame{
	
	public Login() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1000, 650);
		this.setLocationRelativeTo(null);
		this.setTitle("Login");
		this.setResizable(true);
		this.setMinimumSize(new Dimension(200, 200));
		this.setLayout(null);
		componentes();
		this.setVisible(true);
//		this.componentes();
//		componentes();
	}
	
	public void componentes() {
		JMenuBar menuBar = menu();
		this.setJMenuBar(menuBar);
		this.login();
//		this.registro();
//		this.admin();
	}
	public JMenuBar menu() {
		JMenuBar menuBar = new JMenuBar();
		
		JMenu menu = new JMenu("Archivo");
		JMenu menu2 = new JMenu("Ayuda");
		JMenu menu3 = new JMenu("Salir");
		
		JMenuItem item1 = new JMenuItem("Abrir archivo");
		JMenuItem item2 = new JMenuItem("Nuevo");
		JMenuItem item3 = new JMenuItem("Cerrar Programa");
		JMenuItem item4 = new JMenuItem("Acerca de");
		JMenuItem item5 = new JMenuItem("Refrescar");
		JMenuItem item6 = new JMenuItem("Buscar Ayuda");
		
		menu.add(item1);
		menu.add(item2);
		menu.add(item5);
		menu2.add(item6);
		menu2.add(item4);
		menu3.add(item3);
		
		menuBar.add(menu);
		menuBar.add(menu2);
		menuBar.add(menu3);
		
		return menuBar;
		
	}
	
	
	public void login() {
		JPanel panel = new JPanel();
		panel.setSize(this.getWidth()/2, this.getHeight());
		panel.setLocation(0,0);
		panel.setLayout(null);
		panel.setBackground(Color.GRAY);
		this.getContentPane().add(panel);
		
		JLabel etiqueta = new JLabel();
		etiqueta.setText("User Login");
		etiqueta.setBounds(150, 30, 480, 60);
		etiqueta.setFont(new Font("Arial Black",Font.ITALIC,30));
		etiqueta.setForeground(Color.WHITE);
		panel.add(etiqueta);
		
		JLabel etiqueta2 = new JLabel();
		etiqueta2.setText("Enter Your Username");
		etiqueta2.setBounds(100, 250, 200, 40);
		etiqueta2.setFont(new Font("Arial Black",Font.PLAIN,10));
		etiqueta2.setForeground(Color.white);
		panel.add(etiqueta2);
		
		JLabel etiqueta3 = new JLabel();
		etiqueta3.setText("Enter Your Password");
		etiqueta3.setBounds(100, 320, 200, 40);
		etiqueta3.setFont(new Font("Arial Black",Font.PLAIN,10));
		etiqueta3.setForeground(Color.white);
		panel.add(etiqueta3);
		
		JLabel etiqueta4 = new JLabel();
		etiqueta4.setText("My Account");
		etiqueta4.setBounds(110, 175, 480, 60);
		etiqueta4.setFont(new Font("Arial Black",Font.ITALIC,40));
		etiqueta4.setForeground(new Color(255,255,145));
		panel.add(etiqueta4);
		
		JLabel etiqueta5 = new JLabel();
		etiqueta5.setText("Don't have a account?");
		etiqueta5.setBounds(185, 455, 150, 60);
		etiqueta5.setFont(new Font("Arial Black",Font.ITALIC,10));
		etiqueta5.setForeground(Color.white);
		panel.add(etiqueta5);
		
		JTextField cajaTexto = new JTextField();
		cajaTexto.setBounds(100, 280, 300, 30);
		panel.add(cajaTexto);
		
		JPasswordField cajaTexto2 = new JPasswordField();
		cajaTexto2.setBounds(100, 350, 300, 30);
		panel.add(cajaTexto2);
		
		JButton boton = new JButton();
		boton.setText("Login");
		boton.setBounds(177, 401, 130, 40);
		boton.setBackground(new Color(255,255,145));
		boton.setForeground(Color.black);
		boton.setFont(new Font("Arial Black",Font.BOLD,12));
		panel.add(boton);
		
		JButton boton2 = new JButton();
		boton2.setText("Sign Up");
		boton2.setBounds(195, 501, 100, 40);
		boton2.setBackground(new Color(255,255,145));
		boton2.setForeground(Color.black);
		boton2.setFont(new Font("Arial Black",Font.BOLD,12));
		panel.add(boton2);
		
		//Imagen
		JLabel img = new JLabel();
//		img.setIcon(new ImageIcon("instagram.png"));
		img.setIcon(new ImageIcon(getClass().getResource("user.png")));
		img.setBounds(70, 282, 24, 24);
		img.setOpaque(true);
		panel.add(img);
		//User-2daImagen
		JLabel img2 = new JLabel();
		img2.setIcon(new ImageIcon(getClass().getResource("user.png")));
		img2.setBounds(70, 352, 24, 24);
		img2.setOpaque(true);
		panel.add(img2);
		
		//Fondo1
		JLabel fondo2 = new JLabel();
		fondo2.setIcon(new ImageIcon(getClass().getResource("fondo2.png")));
		fondo2.setBounds(30, 150, 435, 311);
		panel.add(fondo2);
		JLabel fondo1 = new JLabel();
		fondo1.setIcon(new ImageIcon(getClass().getResource("fondo1.png")));
		fondo1.setBounds(0, 0, 500, 650);
		panel.add(fondo1);
		//Fondo2
		
		
		
		
		this.add(panel);
	}
	
	public void registro() {

		
		JPanel registro = new JPanel();
		registro.setSize(this.getWidth()/2, this.getHeight());
		registro.setLocation(this.getWidth()/2,0);
		registro.setLayout(null);
		registro.setBackground(Color.black);
		this.getContentPane().add(registro);
		
		
		JLabel etiquetaR = new JLabel("Registro",SwingConstants.CENTER);
		etiquetaR.setFont(new Font("Winter Drink",Font.BOLD,40));
		etiquetaR.setBackground(Color.WHITE);
		etiquetaR.setBounds(180, 20, 150, 50);
		etiquetaR.setOpaque(true);
		registro.add(etiquetaR);
		
		JLabel etiquetaR2 = new JLabel("Nombre Completo",SwingConstants.CENTER);
		etiquetaR2.setFont(new Font("Winter Drink",Font.BOLD,15));
		etiquetaR2.setBackground(Color.WHITE);
		etiquetaR2.setBounds(50, 100, 130, 18);
		etiquetaR2.setOpaque(true);
		registro.add(etiquetaR2);
		
		JLabel etiquetaR3 = new JLabel("Correo Electronico",SwingConstants.CENTER);
		etiquetaR3.setFont(new Font("Winter Drink",Font.BOLD,15));
		etiquetaR3.setBackground(Color.WHITE);
		etiquetaR3.setBounds(50, 160, 130, 18);
		etiquetaR3.setOpaque(true);
		registro.add(etiquetaR3);
		
		JLabel etiquetaR4 = new JLabel("Género",SwingConstants.CENTER);
		etiquetaR4.setFont(new Font("Winter Drink",Font.BOLD,15));
		etiquetaR4.setBackground(Color.WHITE);
		etiquetaR4.setBounds(50, 220, 50, 18);
		etiquetaR4.setOpaque(true);
		registro.add(etiquetaR4);
		
		JLabel etiquetaR5 = new JLabel("Contraseña",SwingConstants.CENTER);
		etiquetaR5.setFont(new Font("Winter Drink",Font.BOLD,15));
		etiquetaR5.setBackground(Color.WHITE);
		etiquetaR5.setBounds(50, 280, 80, 18);
		etiquetaR5.setOpaque(true);
		registro.add(etiquetaR5);
		
		JLabel etiquetaR6 = new JLabel("Confirmar contraseña",SwingConstants.CENTER);
		etiquetaR6.setFont(new Font("Winter Drink",Font.BOLD,15));
		etiquetaR6.setBackground(Color.WHITE);
		etiquetaR6.setBounds(50, 340, 150, 18);
		etiquetaR6.setOpaque(true);
		registro.add(etiquetaR6);
		
		JTextField cajaTextoR = new JTextField();
		cajaTextoR.setFont(new Font("Winter Drink",Font.PLAIN,20));
		cajaTextoR.setBounds(50, 120, 200, 25);
		registro.add(cajaTextoR);
		
		JTextField cajaTextoR2 = new JTextField();
		cajaTextoR2.setFont(new Font("Winter Drink",Font.PLAIN,20));
		cajaTextoR2.setBounds(50, 180, 200, 25);
		registro.add(cajaTextoR2);
		
		JPasswordField cajaTextoR3 = new JPasswordField();
		cajaTextoR3.setBounds(50, 300, 200, 25);
		registro.add(cajaTextoR3);
		
		JPasswordField cajaTextoR4 = new JPasswordField();
		cajaTextoR4.setBounds(50, 360, 200, 25);
		registro.add(cajaTextoR4);
		
		JCheckBox gusto1 = new JCheckBox("Deseo suscribirme a su lista de correo");
		gusto1.setFont(new Font("Winter Drink",Font.PLAIN,15));
		gusto1.setBounds(50, 450, 280, 20);
		registro.add(gusto1);
		
		JRadioButton type = new JRadioButton("Masculino");
		type.setFont(new Font("Winter Drink",Font.PLAIN,15));
		type.setBounds(50, 240, 100, 20);
		registro.add(type);
		
		JRadioButton type2 = new JRadioButton("Femenino");
		type2.setFont(new Font("Winter Drink",Font.PLAIN,15));		
		type2.setBounds(150, 240, 100, 20);
		registro.add(type2);
		
		JRadioButton type3 = new JRadioButton("Prefiero no decirlo");
		type3.setFont(new Font("Winter Drink",Font.PLAIN,15));
		type3.setBounds(250, 240, 150, 20);
		registro.add(type3);
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(type);
		grupo.add(type2);
		grupo.add(type3);
		
//		JTextArea bio = new JTextArea(10,10);
//		bio.setLocation(50, 330);
//		bio.setSize(200, 100);
//		registro.add(bio);
		
		String paises[] = {"Pais Residencia", "Mexico","Colombia","Brazil","Argentina"};
		JComboBox paisRes = new JComboBox(paises);
		paisRes.setFont(new Font("Winter Drink",Font.PLAIN,20));
		paisRes.setVisible(true);
		paisRes.setBounds(50, 400, 130, 30);
		registro.add(paisRes);
		
		JButton botonR = new JButton();
		botonR.setText("Registrar");
		botonR.setBounds(200, 500, 120, 40);
		botonR.setFont(new Font("Winter Drink",Font.BOLD,20));
		botonR.setBackground(Color.green);
		registro.add(botonR);
		
		
		this.repaint();
	}
	public void admin() {
		JPanel panel2 = new JPanel();
		panel2.setSize(this.getWidth(), this.getHeight());
		panel2.setLayout(null);
		panel2.setBackground(Color.LIGHT_GRAY);
		this.getContentPane().add(panel2);
		
		JLabel etiquetaA = new JLabel("Registro Usuarios", 0);
		etiquetaA.setBounds(350, 0, 320, 60);
		etiquetaA.setFont(new Font("Winter Drink",Font.BOLD,40));
		etiquetaA.setOpaque(true);
		panel2.add(etiquetaA);
		
		JLabel widget = new JLabel("Estudiantes", 0);
		widget.setBounds(800, 70, 140, 60);
		widget.setFont(new Font("Winter Drink",Font.BOLD,20));
		widget.setForeground(Color.white);
		panel2.add(widget);
		
		JLabel widget3 = new JLabel("127", 0);
		widget3.setBounds(800, 100, 140, 60);
		widget3.setFont(new Font("Winter Drink",Font.BOLD,30));
		widget3.setForeground(Color.white);
		panel2.add(widget3);
		
		JLabel widget2 = new JLabel("", 0);
		widget2.setBounds(800, 80, 140, 60);
		widget2.setFont(new Font("Winter Drink",Font.BOLD,30));
		widget2.setOpaque(true);
		widget2.setBackground(Color.BLUE);
		panel2.add(widget2);
		
		
		String titulos[] = {"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"};
		String datos[][] = {
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
				{"No. Identificación","Nombre","Apellido","Promedio","Ciudad","Color Favorito"},
		};
		
		JTable tabla = new JTable(datos, titulos);
		JScrollPane scrollPane = new JScrollPane(tabla);
		scrollPane.setBounds(250, 160, 500, 500);
		panel2.add(scrollPane);
		
	}
		
}
	
