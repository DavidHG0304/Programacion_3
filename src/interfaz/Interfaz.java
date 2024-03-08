package interfaz;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Interfaz extends JFrame{
	
	public Interfaz() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);
		this.setTitle("");
//		this.setLayout(null);
//		this.setResizable(false);
		this.loadComponents();
		this.setVisible(true);
	}
	
	public void loadComponents() {
//		panelInterfaz();
//		registroUsuarios();
	}
	
	public void panelInterfaz() {

		
		JPanel interfaz = new JPanel();
		interfaz.setSize(this.getWidth(), this.getHeight());
		interfaz.setLocation(0, 0);
		interfaz.setLayout(new BorderLayout());
		interfaz.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		interfaz.setBackground(Color.WHITE);
		this.add(interfaz);
		
		JLabel input = new JLabel("Interés", 2);
		input.setForeground(Color.red);
		input.setFont(new Font("Arial", Font.ITALIC, 20));
		interfaz.add(input, BorderLayout.NORTH);
		
		JPanel cuadroNo1 = new JPanel(new FlowLayout());
		cuadroNo1.setSize(this.getWidth(), this.getHeight());
		cuadroNo1.setLocation(0, 0);
		cuadroNo1.setLayout(new GridLayout(5, 1, 10, 10));
		cuadroNo1.setBackground(new Color(142, 255, 133 ));
		cuadroNo1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		interfaz.add(cuadroNo1, BorderLayout.CENTER);
		
		
		JLabel calcularInteres = new JLabel("Calcular Interes: ", 2);
		calcularInteres.setFont(new Font("Arial Black", Font.BOLD, 14));
		cuadroNo1.add(calcularInteres);
		
		JLabel espacio = new JLabel("",4);
		espacio.setFont(new Font("Arial", Font.BOLD, 14));
		cuadroNo1.add(espacio);
		
		
		JLabel capital = new JLabel("Capital: ",2);
		capital.setFont(new Font("Arial", Font.BOLD, 14));
		JTextField cuadroTexto3 = new JTextField();
		cuadroTexto3.setSize(100,25);
		cuadroNo1.add(capital);
		cuadroNo1.add(cuadroTexto3);
		
		JLabel tiempo = new JLabel("Tiempo: ",2);
		tiempo.setFont(new Font("Arial", Font.BOLD, 14));
		JTextField cuadroTexto4 = new JTextField();
		cuadroTexto4.setSize(100,25);
		cuadroNo1.add(tiempo);
		cuadroNo1.add(cuadroTexto4);
		
		JLabel tasaDeInteres = new JLabel("Tasa de Interes: ",2);
		tasaDeInteres.setFont(new Font("Arial", Font.BOLD, 14));
		JTextField cuadroTexto5 = new JTextField();
		cuadroTexto5.setSize(100,25);
		cuadroNo1.add(tasaDeInteres);
		cuadroNo1.add(cuadroTexto5);
		
		JButton calcular = new JButton("Calcular");
		calcular.setFont(new Font("Arial", Font.BOLD, 14));
		calcular.setBackground(Color.gray);
		calcular.setForeground(Color.WHITE);
		JLabel img = new JLabel();
		img.setIcon(new ImageIcon(getClass().getResource("calculadora.png")));
		img.setBounds(70, 282, 24, 24);
		img.setOpaque(true);
		calcular.add(img);
		cuadroNo1.add(calcular);
		
		JButton cancelar = new JButton("Cancelar");
		cancelar.setFont(new Font("Arial", Font.BOLD, 14));
		cancelar.setBackground(Color.gray);
		cancelar.setForeground(Color.WHITE);
		JLabel img2 = new JLabel();
		img2.setIcon(new ImageIcon(getClass().getResource("boton-eliminar.png")));
		img2.setBounds(70, 282, 24, 24);
		img2.setOpaque(true);
		cancelar.add(img2);
		cuadroNo1.add(cancelar);
		
		JPanel cuadroNo2 = new JPanel(new FlowLayout());
		cuadroNo2.setBackground(new Color(255, 133, 133 ));
		cuadroNo2.setLayout(new GridLayout(2, 1, 10, 10));
		cuadroNo2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		interfaz.add(cuadroNo2, BorderLayout.SOUTH);
		
		JLabel interes = new JLabel("Interés:", 2);
		JTextField cuadroTexto1 = new JTextField("315.0000000000002");
		interes.setFont(new Font("Arial", Font.BOLD, 14));
		cuadroTexto1.setSize(200, 20);
		cuadroTexto1.setFont(new Font("Arial", Font.BOLD, 14));
		cuadroNo2.add(interes);
		cuadroNo2.add(cuadroTexto1);


		JLabel monto = new JLabel("Monto:", 2);
		JTextField cuadroTexto2 = new JTextField("1815.0000000000002");
		monto.setFont(new Font("Arial", Font.BOLD, 14));
		cuadroTexto2.setSize(200, 20);
		cuadroTexto2.setFont(new Font("Arial", Font.BOLD, 14));
		cuadroNo2.add(monto);
		cuadroNo2.add(cuadroTexto2);
		

	}

	public void registroUsuarios() {
		this.setSize(600, 650);
		
		JPanel panelRegistro = new JPanel();
		panelRegistro.setSize(this.getWidth(), this.getHeight());
		panelRegistro.setLocation(0, 0);
		panelRegistro.setLayout(new BorderLayout());
		panelRegistro.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panelRegistro.setBackground(Color.GREEN);
		this.add(panelRegistro);
		
		JLabel input = new JLabel("Registro Usuarios", 2);
		input.setForeground(Color.red);
		input.setFont(new Font("Arial Black", Font.ITALIC, 20));
		panelRegistro.add(input, BorderLayout.NORTH);
		
		//Cuadro Separación entre Datos Generales y Perfil de Usuario
		JPanel cuadroAux = new JPanel(new FlowLayout());
		cuadroAux.setSize(this.getWidth(), this.getHeight());
		cuadroAux.setLocation(0, 0);
		cuadroAux.setLayout(new GridLayout(1, 2, 10, 10));
		cuadroAux.setBackground(Color.GREEN);
		cuadroAux.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panelRegistro.add(cuadroAux, BorderLayout.CENTER);
		
		//Panel Datos Generales
		JPanel datosGenerales = new JPanel(new FlowLayout());
		datosGenerales.setSize(this.getWidth(), this.getHeight());
		datosGenerales.setBackground(new Color(133, 255, 210 ));
		datosGenerales.setLayout(new BorderLayout());
		datosGenerales.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		cuadroAux.add(datosGenerales, BorderLayout.EAST);
		
		
		JLabel tituloVentana= new JLabel("Datos Generales", 2);
		tituloVentana.setFont(new Font("Arial Black", Font.PLAIN, 10));
		datosGenerales.add(tituloVentana, BorderLayout.NORTH);
//		JLabel vacioAux= new JLabel("", 2);
//		vacioAux.setFont(new Font("Arial Black", Font.PLAIN, 10));
//		datosGenerales.add(vacioAux, BorderLayout.NORTH);
		
		//Marco auxiliar para Datos Generales
		JTextField marcoAux = new JTextField("");
		marcoAux.setBackground(new Color(133, 255, 210 ));
		marcoAux.setLayout(new GridLayout(7, 2, 10, 5));
		marcoAux.setEditable(false);
		datosGenerales.add(marcoAux, BorderLayout.CENTER);
		
		JLabel nombres = new JLabel("Nombres: ", 0);
		nombres.setFont(new Font("Arial", Font.PLAIN, 10));
		marcoAux.add(nombres);
		JTextField cuadroTexto1 = new JTextField("Juan Carlos");
		cuadroTexto1.setFont(new Font("Arial", Font.PLAIN, 10));
		marcoAux.add(cuadroTexto1);
		
		JLabel apellidoP = new JLabel("Apellido Paterno: ", 2);
		apellidoP.setFont(new Font("Arial", Font.PLAIN, 10));
		marcoAux.add(apellidoP);
		JTextField cuadroTexto2 = new JTextField("Arcila");
		cuadroTexto2.setFont(new Font("Arial", Font.PLAIN, 10));
		marcoAux.add(cuadroTexto2);
		
		JLabel apellidoM = new JLabel("Apellido Materno: ", 2);
		apellidoM.setFont(new Font("Arial", Font.PLAIN, 10));
		marcoAux.add(apellidoM);
		JTextField cuadroTexto3 = new JTextField("Diaz");
		cuadroTexto3.setFont(new Font("Arial", Font.PLAIN, 10));
		marcoAux.add(cuadroTexto3);
		
		JLabel fechaN = new JLabel("Fecha Nacimiento: ", 2);
		fechaN.setFont(new Font("Arial", Font.PLAIN, 10));
		marcoAux.add(fechaN);
		
		JPanel cuadroTexto4 = new JPanel();
		cuadroTexto4.setLayout(new GridLayout (1, 2));
		marcoAux.add(cuadroTexto4);
		
		JTextField fechaNacimiento = new JTextField("07/01/1990 ", 2);
		fechaNacimiento.setFont(new Font("Arial", Font.PLAIN, 10));
		fechaNacimiento.setForeground(Color.BLACK);
		cuadroTexto4.add(fechaNacimiento, BorderLayout.EAST);

		JButton auxBoton = new JButton("");
//		auxBoton.setBackground(Color.black);
		auxBoton.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		JLabel calendarioImg = new JLabel();
		calendarioImg.setIcon(new ImageIcon(getClass().getResource("calendario.png")));
		auxBoton.add(calendarioImg);
		cuadroTexto4.add(auxBoton, BorderLayout.WEST);
		
		JLabel sexo = new JLabel("Sexo: ", 2);
		sexo.setFont(new Font("Arial", Font.PLAIN, 10));
		marcoAux.add(sexo);
		JRadioButton eleccionS = new JRadioButton("Masculino", true);
		eleccionS.setOpaque(false);
		marcoAux.add(eleccionS);
		JLabel vacioAux2= new JLabel("", 2);
		vacioAux2.setFont(new Font("Arial Black", Font.PLAIN, 10));
		marcoAux.add(vacioAux2);
		JRadioButton eleccionS2 = new JRadioButton("Femenino", false);
		eleccionS2.setOpaque(false);
		marcoAux.add(eleccionS2);
		
		JLabel nacionalidad = new JLabel("Nacionalidad: ", 2);
		nacionalidad.setFont(new Font("Arial", Font.PLAIN, 10));
		marcoAux.add(nacionalidad);
		
		String lista[] =  {"Perú", "México", "Chile", "Estados Unidos", "Bolivia"};
		
		JComboBox paises = new JComboBox(lista);
		marcoAux.add(paises);
			
		
		
		
		//Panel Perfil del Usuario
		JPanel perfilUsuario = new JPanel(new FlowLayout());
		perfilUsuario.setSize(this.getWidth(), this.getHeight());
		perfilUsuario.setBackground(new Color(255, 133, 133));
		perfilUsuario.setLayout(new BorderLayout());
		perfilUsuario.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		cuadroAux.add(perfilUsuario, BorderLayout.WEST);
		
		JLabel tituloVentana2= new JLabel("Perfil Usuario", 2);
		tituloVentana2.setFont(new Font("Arial Black", Font.PLAIN, 10));
		tituloVentana2.setLayout(new BorderLayout());
		perfilUsuario.add(tituloVentana2, BorderLayout.NORTH);

		//Cuadro auxiliar para marco de perfil de usuario
		JTextField auxCuadro = new JTextField("");
		auxCuadro.setBackground(new Color(255, 133, 133));
		auxCuadro.setLayout(new BorderLayout());
		auxCuadro.setEditable(false);
//		auxCuadro.setLayout(new BorderLayout());
		perfilUsuario.add(auxCuadro, BorderLayout.CENTER);
				
		JLabel userImg = new JLabel();
		userImg.setSize(300, 300);
		userImg.setIcon(new ImageIcon(getClass().getResource("hombre.png")));
		auxCuadro.add(userImg, BorderLayout.NORTH);
		
		//Panel adicional para agregar los CheckBoxes
		JPanel auxCheckBoxes = new JPanel();
		auxCheckBoxes.setLayout(new GridLayout(2, 1, 10, 10));
		auxCheckBoxes.setBorder(BorderFactory.createEmptyBorder(0, 40, 40, 10));
		auxCheckBoxes.setOpaque(false);
		auxCuadro.add(auxCheckBoxes);
		
		JCheckBox mostrar1 = new JCheckBox("Mostrar Foto de Perfil", true);
		mostrar1.setOpaque(false);
		auxCheckBoxes.add(mostrar1);
		JCheckBox mostrar2 = new JCheckBox("Mostrar Fecha de Nacimiento", true);
		mostrar2.setOpaque(false);
		auxCheckBoxes.add(mostrar2);
		
		
		
		
		//Cuadro Datos Opcionales
		JPanel cuadroAux2 = new JPanel(new FlowLayout());
		cuadroAux2.setPreferredSize(new Dimension(150, 200));
		cuadroAux2.setLocation(0, 0);
		cuadroAux2.setLayout(new GridLayout(1, 2, 10, 10));
		cuadroAux2.setBackground(Color.GREEN);
		cuadroAux2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panelRegistro.add(cuadroAux2, BorderLayout.SOUTH);
		
		//Crear Panel Auxiliar para separar Datos Opcionales de los botones de acciones	
		JPanel datosOpcionales = new JPanel(new FlowLayout());
		datosOpcionales.setPreferredSize(new Dimension(300, 170));
		datosOpcionales.setBackground(new Color(255, 89, 89));
		datosOpcionales.setLayout(new BorderLayout());
		datosOpcionales.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		cuadroAux2.add(datosOpcionales, BorderLayout.WEST);
		
		//Titulo Panel - Datos Opcionales
		JLabel tituloPanel = new JLabel("Datos Opcionales");
		tituloPanel.setFont(new Font("Arial Black", Font.PLAIN, 10));
		datosOpcionales.add(tituloPanel, BorderLayout.NORTH);
		
		//Marco auxiliar para Datos Generales
		JTextField marcoAux2 = new JTextField("");
		marcoAux2.setBackground(new Color(255, 89, 89));
		marcoAux2.setPreferredSize(new Dimension(150, 140));
		marcoAux2.setLayout(new GridLayout(2, 2, 10, -5));
		marcoAux2.setEditable(false);
		datosOpcionales.add(marcoAux2, BorderLayout.SOUTH);
		
		JLabel descripcion = new JLabel("Descripcion: ", 2);
		descripcion.setFont(new Font("Arial", Font.PLAIN, 10));
		marcoAux2.add(descripcion);
		
		JLabel preferencias = new JLabel("Preferencias: ", 2);
		preferencias.setFont(new Font("Arial", Font.PLAIN, 10));
		marcoAux2.add(preferencias);
		
		JTextArea textoDescripcion = new JTextArea("Hola amigos de youtube muchas gracias por compartir mis videos.");
		textoDescripcion.setWrapStyleWord(true);
		textoDescripcion.setFont(new Font("Arial", Font.PLAIN, 13));
		textoDescripcion.setLineWrap(true);
		textoDescripcion.setEditable(false);
//		marcoAux2.add(textoDescripcion);
		JScrollPane scrollPaneDescripcion = new JScrollPane(textoDescripcion);
		scrollPaneDescripcion.setPreferredSize(new Dimension(200, 100));
		marcoAux2.add(scrollPaneDescripcion);
		
		String listaPreferencia[] = {"Cantar","Escuchar Música","Leer","Deportes","Otros"};
		JList listaPref = new JList(listaPreferencia);
		listaPref.setFont(new Font("Arial", Font.PLAIN, 13));
//		marcoAux2.add(listaPref);
		JScrollPane scrollPaneLista = new JScrollPane(listaPref);
		scrollPaneLista.setPreferredSize(new Dimension(200, 100));
		marcoAux2.add(scrollPaneLista);
		
		
		//Panel Para botones de Acciones
		JPanel botonesAcciones = new JPanel(new FlowLayout());
		botonesAcciones.setBackground(new Color(133, 255, 210 ));
		botonesAcciones.setLayout(new GridLayout(3, 1, 10, 10));
		botonesAcciones.setBorder(BorderFactory.createEmptyBorder(50, 50, 30, 50));
		cuadroAux2.add(botonesAcciones, BorderLayout.EAST);
		
		JButton botonNuevo = new JButton("Nuevo");
		botonNuevo.setFont(new Font("Arial", Font.BOLD, 14));
		botonNuevo.setBackground(Color.DARK_GRAY);
		botonNuevo.setForeground(Color.WHITE);
		JLabel imgNuevo = new JLabel();
		imgNuevo.setIcon(new ImageIcon(getClass().getResource("boton-eliminar.png")));
		imgNuevo.setOpaque(false);
		botonNuevo.add(imgNuevo);
		botonesAcciones.add(botonNuevo);
		
		JButton botonGuardar = new JButton("Guardar");
		botonGuardar.setFont(new Font("Arial", Font.BOLD, 14));
		botonGuardar.setBackground(Color.DARK_GRAY);
		botonGuardar.setForeground(Color.WHITE);
		JLabel imgGuardar = new JLabel();
		imgGuardar.setIcon(new ImageIcon(getClass().getResource("disco-flexible.png")));
		imgGuardar.setOpaque(false);
		botonGuardar.add(imgGuardar);
		botonesAcciones.add(botonGuardar);
		
		JButton botonSalir = new JButton("Salir");
		botonSalir.setFont(new Font("Arial", Font.BOLD, 14));
		botonSalir.setBackground(Color.DARK_GRAY);
		botonSalir.setForeground(Color.WHITE);
		JLabel imgSalir = new JLabel();
		imgSalir.setIcon(new ImageIcon(getClass().getResource("casa.png")));
		imgSalir.setOpaque(false);
		botonSalir.add(imgSalir);
		botonesAcciones.add(botonSalir);
		
	}
	/* Graphics para Casa
	public void paint(Graphics g) {
		this.setSize(800,600);
		
		super.paint(g);
		
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setStroke(new BasicStroke(3));
		
		g2d.setColor(new Color(69, 194, 252));
		g2d.drawRect(0, 0, 800, 450);
		g2d.fillRect(0, 0, 800, 450);
		g2d.setColor(Color.black);
		
		g2d.setColor(new Color(80, 146, 40));
		g2d.drawRect(0, 450, 800, 150);
		g2d.fillRect(0, 450, 800, 150);
		g2d.setColor(Color.black);
		
//		intento de nubes
		g2d.setColor(new Color(255,255,255));
		g2d.fillOval(-30, 0, 140, 140);
		g2d.fillOval(70, -50, 140, 140);
		g2d.fillOval(180, -70, 140, 140);
		
		g2d.fillOval(700, 0, 140, 140);
		g2d.fillOval(700, -50, 140, 140);
		g2d.fillOval(750, 70, 140, 140);
		g2d.setColor(Color.black);
		

		//		Color Techo
//		g2d.setStroke(new BasicStroke(5));
//		g2d.drawRect(250, 150, 300, 150);
		g2d.setColor(new Color(205, 92, 92));
		g2d.fillRect(250, 150, 300, 150);
		int x1[] = {200, 250, 250};
		int y1[] = {300, 150, 300};
//		g2d.drawPolygon(x1,y1, 3);
		g2d.fillPolygon(x1, y1, 3);
		
		int x2[] = {550, 550, 600};
		int y2[] = {300, 150, 300};
		g2d.fillPolygon(x2, y2, 3);
		g2d.setColor(Color.black);
		
//		Color pared atico
		g2d.setColor(new Color(255, 236, 176));
		g2d.fillRect(300, 150, 200, 110);
		
		g2d.setColor(new Color(205, 92, 92));
//		g2d.drawRect(300, 150, 60, 75);
		g2d.fillRect(300, 150, 60, 75);
//		g2d.drawRect(440, 150, 60, 75);
		g2d.fillRect(440, 150, 60, 75);
		g2d.setColor(Color.black);
		
		
		g2d.setColor(new Color(255, 236, 176));
		int x6[] = {360, 360, 310};
		int y6[] = {225, 150, 225};
		g2d.drawPolygon(x6,y6, 3);
		g2d.fillPolygon(x6, y6, 3);
		
		int x7[] = {500, 440, 440};
		int y7[] = {225, 150, 225};
		g2d.drawPolygon(x7,y7, 3);
		g2d.fillPolygon(x7, y7, 3);
		
		
		
		g2d.setColor(Color.black);
		
		
		
//		Color Cera
//		g2d.setStroke(new BasicStroke(5));
		g2d.setColor(new Color(191, 189, 187));
		g2d.drawRect(360, 450, 80, 150);
		g2d.fillRect(360, 450, 80, 150);
//		g2d.setStroke(new BasicStroke(4));
		int x4[] = {330, 360, 360};
		int y4[] = {600, 450, 600};
//		g2d.drawPolygon(x4,y4, 3);
		g2d.fillPolygon(x4, y4, 3);
		
		int x5[] = {440, 440, 480};
		int y5[] = {600, 450, 600};
//		g2d.drawPolygon(x5,y5, 3);
		g2d.fillPolygon(x5, y5, 3);
		g2d.setColor(Color.black);
		
		
//		g2d.setColor(new Color(113, 113, 113));
		g2d.drawLine(0, 600, 790, 600);
//		Lineas divisoras de la cera
		g2d.drawLine(350, 500, 450, 500);
		g2d.drawLine(360, 450, 440, 450);
//		Lineas transversales cera del jardin a la casa
		g2d.drawLine(330, 600, 360, 450);
		g2d.drawLine(480, 600, 440, 450);
//		Lineas bases de la casa
		g2d.drawLine(250, 450, 550, 450);
//		Lineas pared casa
		g2d.drawLine(250, 450, 250, 300);
		g2d.drawLine(550, 450, 550, 300);
//		Lineas horizontales techo casa
		g2d.drawLine(200, 300, 600, 300);
		g2d.drawLine(250, 150, 550, 150);
//		Lineas verticales techo casa (diagonales)
		g2d.drawLine(200, 300, 250, 150);
		g2d.drawLine(600, 300, 550, 150);
//		Lineas ático casa(?) (verticales)
		g2d.drawLine(500, 230, 500, 260);
		g2d.drawLine(300, 230, 300, 260);
		
		
//		Color Atico
		g2d.setStroke(new BasicStroke(15));
		g2d.setColor(new Color(188, 95, 55));
		g2d.drawLine(290, 250, 400, 115);
		g2d.setStroke(new BasicStroke(3));
		g2d.setColor(Color.BLACK);
		g2d.setStroke(new BasicStroke(3));
		
		g2d.setStroke(new BasicStroke(16));
		g2d.setColor(new Color(188, 95, 55));
		g2d.drawLine(510, 250, 400, 115);
		g2d.setStroke(new BasicStroke(3));
		g2d.setColor(Color.BLACK);
		
		g2d.setColor(new Color(255, 236, 176));
		int x8[] = {380, 400, 420};
		int y8[] = {150, 125, 150};
		g2d.drawPolygon(x8,y8, 3);
		g2d.fillPolygon(x8, y8, 3);
		g2d.setColor(Color.black);
		
		
//		Lineas ático casa (horizontal)
		g2d.drawLine(300, 260, 500, 260);
		g2d.drawLine(280, 250, 290, 260);
		g2d.drawLine(510, 260, 520, 250);
		
//		Lineas ático casa (Diagonal)
		g2d.drawLine(280, 250, 400, 100);
		g2d.drawLine(290, 260, 400, 125);
		g2d.drawLine(520, 250, 400, 100);
		g2d.drawLine(510, 260, 400, 125);
		
//		Color pared casa
		g2d.setStroke(new BasicStroke(5));
		g2d.drawRect(250, 301, 300, 150);
		g2d.setColor(new Color(255, 236, 176));
		g2d.fillRect(250, 300, 300, 150);
		g2d.setColor(Color.black);
		g2d.setStroke(new BasicStroke(3));

		
		
//		Ventana Atico
		g2d.setStroke(new BasicStroke(5));
		g2d.drawOval(375, 190, 50, 50);
		g2d.setColor(new Color(255, 255, 255));
		g2d.fillOval (375, 190, 50, 50);
		g2d.setColor(Color.black);
//		g2d.setColor(new Color(188, 95, 55));
		g2d.setStroke(new BasicStroke(10));
		g2d.drawLine(420, 215, 380, 215);
		g2d.drawLine(400, 195, 400, 235);
		g2d.setColor(Color.black);
		g2d.setStroke(new BasicStroke(3));
		
		
		
//		Puerta
		g2d.drawRect(365, 350, 70, 100);
		g2d.setColor(new Color(79, 61, 41));
		g2d.fillRect(365, 350, 70, 100);
		g2d.setColor(Color.black);
		
		g2d.setStroke(new BasicStroke(5));
		g2d.drawOval(375, 400, 10, 10);
		g2d.setColor(new Color(255,245,196));
		g2d.fillOval (375, 400, 10, 10);
		g2d.setColor(Color.black);
		
//		Ventanas
		g2d.setStroke(new BasicStroke(7));
		g2d.drawRect(275, 330, 70, 70);
		g2d.drawRect(455, 330, 70, 70);
		g2d.setStroke(new BasicStroke(3));
		g2d.drawRect(275, 360, 70, 10);
		g2d.drawRect(305, 330, 10, 70);
		
		g2d.drawRect(455, 360, 70, 10);
		g2d.drawRect(485, 330, 10, 70);
		
		g2d.setColor(Color.white);
		g2d.fillRect(275, 330, 70, 70);
		g2d.fillRect(455, 330, 70, 70);
		g2d.setColor(Color.BLACK);
		
		
		g2d.fillRect(275, 360, 70, 10);
		g2d.fillRect(305, 330, 10, 70);
		g2d.fillRect(455, 360, 70, 10);
		g2d.fillRect(485, 330, 10, 70);
		
//		Cerca
		g2d.setColor(new Color(119, 78, 31));
		g2d.drawRect(20, 500, 25, 100);
		g2d.drawRect(60, 500, 25, 100);
		g2d.drawRect(100, 500, 25, 100);
		g2d.drawRect(140, 500, 25, 100);
		g2d.drawRect(180, 500, 25, 100);
		g2d.drawRect(220, 500, 25, 100);
		g2d.drawRect(260, 500, 25, 100);
		
		g2d.drawRect(520, 500, 25, 100);
		g2d.drawRect(560, 500, 25, 100);
		g2d.drawRect(600, 500, 25, 100);
		g2d.drawRect(640, 500, 25, 100);
		g2d.drawRect(680, 500, 25, 100);
		g2d.drawRect(720, 500, 25, 100);
		g2d.drawRect(760, 500, 25, 100);
		
		g2d.drawRect(300, 480, 30, 120);
		g2d.drawRect(480, 480, 30, 120);
		g2d.setColor(Color.BLACK);
		
		g2d.drawRect(0, 520, 300, 10);
		g2d.drawRect(0, 580, 300, 10);
		
		g2d.drawRect(500, 520, 300, 10);
		g2d.drawRect(500, 580, 300, 10);
		g2d.drawRect(500, 520, 300, 10);
		g2d.drawRect(500, 580, 300, 10);
		
		g2d.setColor(new Color(96, 60, 20));
		g2d.fillRect(0, 520, 300, 10);
		g2d.fillRect(0, 580, 300, 10);
		g2d.fillRect(500, 520, 300, 10);
		g2d.fillRect(500, 580, 300, 10);
		g2d.setColor(Color.BLACK);
		
		g2d.setColor(new Color(162, 102, 35));
		g2d.fillRect(20, 500, 25, 100);
		g2d.fillRect(60, 500, 25, 100);
		g2d.fillRect(100, 500, 25, 100);
		g2d.fillRect(140, 500, 25, 100);
		g2d.fillRect(180, 500, 25, 100);
		g2d.fillRect(220, 500, 25, 100);
		g2d.fillRect(260, 500, 25, 100);
		
		g2d.fillRect(520, 500, 25, 100);
		g2d.fillRect(560, 500, 25, 100);
		g2d.fillRect(600, 500, 25, 100);
		g2d.fillRect(640, 500, 25, 100);
		g2d.fillRect(680, 500, 25, 100);
		g2d.fillRect(720, 500, 25, 100);
		g2d.fillRect(760, 500, 25, 100);
		
		g2d.fillRect(300, 480, 30, 120);
		g2d.fillRect(480, 480, 30, 120);
		g2d.setColor(Color.BLACK);
		
		
//		Barda
		g2d.drawRect(0, 420, 250, 30);
		g2d.drawRect(0, 400, 250, 20);
		
		g2d.drawRect(550, 420, 250, 30);
		g2d.drawRect(550, 400, 250, 20);
		
		g2d.setColor(new Color(109, 109, 109));
		g2d.fillRect(0, 420, 250, 30);
		g2d.fillRect(550, 420, 250, 30);
		g2d.setColor(new Color(210, 210, 210));
		g2d.fillRect(0, 400, 250, 20);
		g2d.fillRect(550, 400, 250, 20);
		g2d.setColor(Color.BLACK);
		
		
		g2d.drawLine(80, 420, 80, 450);
		g2d.drawLine(160, 420, 160, 450);
		
		g2d.drawLine(0, 420, 250, 420);
		g2d.drawLine(550, 420, 800, 420);
		g2d.setColor(Color.WHITE);
		g2d.drawLine(0, 400, 248, 400);
		g2d.drawLine(550, 400, 800, 400);
		g2d.setColor(Color.BLACK);
		g2d.drawLine(640, 420, 640, 450);
		g2d.drawLine(720, 420, 720, 450);
		
		
//		Test
		g2d.setStroke(new BasicStroke(10));
		g2d.setColor(new Color(0,0,0,60));
		g2d.drawLine(500, 250, 400, 130);
		
		g2d.setColor(new Color(0,0,0,10));
		g2d.setStroke(new BasicStroke(50));
		g2d.drawLine(0, 580, 310, 580);
		g2d.drawLine(505, 580, 800, 580);
		
		g2d.setColor(new Color(0,0,0,60));
		int x9[] = {250, 550, 550};
		int y9[] = {300, 300, 370};
		g2d.fillPolygon(x9, y9, 3);
		
		int x10[] = {0, 250, 250};
		int y10[] = {420, 420, 435};
		g2d.fillPolygon(x10, y10, 3);
		
		int x11[] = {550, 800, 800};
		int y11[] = {420, 420, 435};
		g2d.fillPolygon(x11, y11, 3);
		
//		int x12[] = {300, 800, 800};
//		int y12[] = {600, 600, 550};
//		g2d.fillPolygon(x12, y12, 3);
		
		
		
		g2d.setStroke(new BasicStroke(3));
		g2d.setColor(Color.black);
	}

	*/
	
	
	public void paint(Graphics g) {
		this.setSize(700,375);
		
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		
		//Fondo
		g2d.setColor(new Color(179, 238, 254));
		g2d.fillRect(0, 0, 700, 400);
		g2d.setColor(Color.BLACK);
		
		//Plataformas
		g2d.setStroke(new BasicStroke(3));
		
		//Sombra Rectangulo
		g2d.fillRect(250, 123, 150, 225);
		//Rectangulo Azul
		g2d.setColor(new Color(132, 192, 252));
		g2d.fillRect(225, 98, 150, 225);
		g2d.setColor(Color.BLACK);
		g2d.drawRect(225, 98, 150, 225);
		
		//Sombra Caja Rosa
		g2d.fillRect(150, 197, 150, 150);
		//Caja Rosa
		g2d.setColor(new Color(255, 196, 184));
		g2d.fillRect(125, 173, 150, 150);
		g2d.setColor(Color.BLACK);
		g2d.drawRect(125, 173, 150, 150);
		
		//Caja Verde		
		g2d.setColor(new Color(81, 217, 107));
		g2d.fillRect(575, 173, 150, 150);
		g2d.setColor(Color.BLACK);
		g2d.drawRect(575, 173, 150, 150);
		
		
		ImageIcon image2 = new ImageIcon(getClass().getResource("planta.png"));
		g2d.drawImage(image2.getImage(), 465, 98, 45, 80, this);
		
		//Tubo
		g2d.setColor(new Color(38, 128, 14));
		g2d.fillRect(450, 213, 80, 110);
		g2d.fillRect(442, 173, 95, 40);
		g2d.setColor(Color.BLACK);
		g2d.drawRect(450, 213, 80, 110);
		g2d.setStroke(new BasicStroke(4));
		g2d.drawRect(442, 173, 95, 40);
		
		//Sombras/Luces Tubo
		g2d.setStroke(new BasicStroke(2));
		g2d.setColor(new Color(107,204,133));
		g2d.drawLine(445, 176, 534, 176);
		g2d.setColor(new Color(79,217,105));
		g2d.drawLine(460, 321, 460, 216);
		g2d.setStroke(new BasicStroke(3));
		g2d.drawLine(480, 320, 480, 216);
		g2d.setStroke(new BasicStroke(5));
		g2d.drawLine(500, 319, 500, 217);
		g2d.setStroke(new BasicStroke(10));
		g2d.drawLine(468, 317, 468, 220);
		g2d.setStroke(new BasicStroke(4));
		g2d.drawLine(455, 209, 455, 177);
		g2d.setStroke(new BasicStroke(10));
		g2d.drawLine(464, 206, 464, 180);
		g2d.setStroke(new BasicStroke(2));
		g2d.drawLine(475, 210, 475, 177);
		g2d.drawLine(505, 210, 505, 177);
		
		
		
		g2d.setColor(Color.BLACK);
		g2d.setStroke(new BasicStroke(15));
		g2d.drawLine(520, 317, 520, 220);
		g2d.setStroke(new BasicStroke(10));
		g2d.drawLine(525, 210, 525, 182);
		g2d.setStroke(new BasicStroke(5));
		g2d.drawLine(508, 210, 508, 179);
		g2d.setStroke(new BasicStroke(5));
		g2d.drawLine(533, 210, 533, 179);
		g2d.setStroke(new BasicStroke(2));
		g2d.drawLine(502, 321, 502, 215);
		g2d.drawLine(511, 321, 511, 215);
		g2d.drawLine(513, 210, 513, 178);
		
		
		
		
		
		//Lineas Sombras
		g2d.setStroke(new BasicStroke(5));
		g2d.setColor(new Color(241,153,113));
		g2d.drawLine(271, 177, 271, 319);
		g2d.drawLine(129, 319, 271, 319);
		g2d.setColor(Color.BLACK);
		g2d.setColor(new Color(31,128,48));
		g2d.drawLine(579, 319, 700, 319);
		g2d.setColor(Color.BLACK);
		g2d.setColor(new Color(39, 142, 219));		
		g2d.drawLine(302, 319, 370, 319);
		g2d.drawLine(372, 319, 372, 102);
		g2d.setColor(Color.BLACK);
		
		
		//Bolitas
		g2d.setStroke(new BasicStroke(2));
		g2d.setColor(new Color(219,229,239));
		g2d.fillOval(361, 308, 11, 11);
		g2d.fillOval(361, 104, 11, 11);
		g2d.fillOval(228, 104, 11, 11);
		g2d.fillOval(261, 308, 11, 11);
		g2d.fillOval(131, 308, 11, 11);
		g2d.fillOval(131, 178, 11, 11);
		g2d.fillOval(261, 178, 11, 11);
		g2d.fillOval(581, 178, 11, 11);
		g2d.fillOval(581, 308, 11, 11);
		g2d.setColor(Color.BLACK);
		g2d.drawOval(361, 308, 11, 11);
		g2d.drawOval(361, 104, 11, 11);
		g2d.drawOval(228, 104, 11, 11);
		g2d.drawOval(261, 308, 11, 11);
		g2d.drawOval(131, 308, 11, 11);
		g2d.drawOval(131, 178, 11, 11);
		g2d.drawOval(261, 178, 11, 11);
		g2d.drawOval(581, 178, 11, 11);
		g2d.drawOval(581, 308, 11, 11);
		
		
		
		
		
		//Suelo
		g2d.setStroke(new BasicStroke(2));
		g2d.setColor(new Color(255, 196, 186));
		g2d.fillRect(0, 325, 700,15);
		g2d.setColor(Color.BLACK);
		g2d.drawRect(0, 325, 700, 15);
		g2d.setColor(new Color(239, 161, 112));
		g2d.fillRect(0, 340, 700, 50);
		g2d.setColor(new Color(110,72,59));
		g2d.drawRect(0, 340, 700, 50);
		g2d.setColor(Color.BLACK);
		
		//Lineas Suelo
		g2d.drawArc(10, 355, 30, 30, 390, 70);
		g2d.drawArc(40, 355, 30, 30, 390, 70);
		g2d.drawArc(70, 355, 30, 30, 390, 70);
		g2d.drawArc(100, 355, 30, 30, 390, 70);
		g2d.drawArc(130, 355, 30, 30, 390, 70);
		g2d.drawArc(160, 355, 30, 30, 390, 70);
		g2d.drawArc(190, 355, 30, 30, 390, 70);
		g2d.drawArc(220, 355, 30, 30, 390, 70);
		g2d.drawArc(250, 355, 30, 30, 390, 70);
		g2d.drawArc(280, 355, 30, 30, 390, 70);
		g2d.drawArc(310, 355, 30, 30, 390, 70);
		g2d.drawArc(340, 355, 30, 30, 390, 70);
		g2d.drawArc(370, 355, 30, 30, 390, 70);
		g2d.drawArc(400, 355, 30, 30, 390, 70);
		g2d.drawArc(430, 355, 30, 30, 390, 70);
		g2d.drawArc(460, 355, 30, 30, 390, 70);
		g2d.drawArc(490, 355, 30, 30, 390, 70);
		g2d.drawArc(520, 355, 30, 30, 390, 70);
		g2d.drawArc(550, 355, 30, 30, 390, 70);
		g2d.drawArc(580, 355, 30, 30, 390, 70);
		g2d.drawArc(610, 355, 30, 30, 390, 70);
		g2d.drawArc(640, 355, 30, 30, 390, 70);
		g2d.drawArc(670, 355, 30, 30, 390, 70);
		g2d.drawArc(700, 355, 30, 30, 390, 70);
		
		g2d.drawArc(8, 355, 30, 30, 390, 70);
		g2d.drawArc(38, 355, 30, 30, 390, 70);
		g2d.drawArc(68, 355, 30, 30, 390, 70);
		g2d.drawArc(98, 355, 30, 30, 390, 70);
		g2d.drawArc(128, 355, 30, 30, 390, 70);
		g2d.drawArc(158, 355, 30, 30, 390, 70);
		g2d.drawArc(188, 355, 30, 30, 390, 70);
		g2d.drawArc(218, 355, 30, 30, 390, 70);
		g2d.drawArc(248, 355, 30, 30, 390, 70);
		g2d.drawArc(278, 355, 30, 30, 390, 70);
		g2d.drawArc(308, 355, 30, 30, 390, 70);
		g2d.drawArc(338, 355, 30, 30, 390, 70);
		g2d.drawArc(368, 355, 30, 30, 390, 70);
		g2d.drawArc(398, 355, 30, 30, 390, 70);
		g2d.drawArc(428, 355, 30, 30, 390, 70);
		g2d.drawArc(458, 355, 30, 30, 390, 70);
		g2d.drawArc(488, 355, 30, 30, 390, 70);
		g2d.drawArc(518, 355, 30, 30, 390, 70);
		g2d.drawArc(548, 355, 30, 30, 390, 70);
		g2d.drawArc(578, 355, 30, 30, 390, 70);
		g2d.drawArc(608, 355, 30, 30, 390, 70);
		g2d.drawArc(638, 355, 30, 30, 390, 70);
		g2d.drawArc(668, 355, 30, 30, 390, 70);
		g2d.drawArc(698, 355, 30, 30, 390, 70);
		
		g2d.setStroke(new BasicStroke(5));
		g2d.setColor(new Color(237, 190, 182));
		g2d.drawArc(10, 350, 30, 30, 440, 20);
		g2d.drawArc(40, 350, 30, 30, 440, 20);
		g2d.drawArc(70, 350, 30, 30, 440, 20);
		g2d.drawArc(100, 350, 30, 30, 440, 20);
		g2d.drawArc(130, 350, 30, 30, 440, 20);
		g2d.drawArc(160, 350, 30, 30, 440, 20);
		g2d.drawArc(180, 350, 30, 30, 440, 20);
		g2d.drawArc(210, 350, 30, 30, 440, 20);
		g2d.drawArc(240, 350, 30, 30, 440, 20);
		g2d.drawArc(270, 350, 30, 30, 440, 20);
		g2d.drawArc(300, 350, 30, 30, 440, 20);
		g2d.drawArc(330, 350, 30, 30, 440, 20);
		g2d.drawArc(360, 350, 30, 30, 440, 20);
		g2d.drawArc(380, 350, 30, 30, 440, 20);
		g2d.drawArc(410, 350, 30, 30, 440, 20);
		g2d.drawArc(440, 350, 30, 30, 440, 20);
		g2d.drawArc(470, 350, 30, 30, 440, 20);
		g2d.drawArc(500, 350, 30, 30, 440, 20);
		g2d.drawArc(530, 350, 30, 30, 440, 20);
		g2d.drawArc(560, 350, 30, 30, 440, 20);
		g2d.drawArc(580, 350, 30, 30, 440, 20);
		g2d.drawArc(610, 350, 30, 30, 440, 20);
		g2d.drawArc(640, 350, 30, 30, 440, 20);
		g2d.drawArc(670, 350, 30, 30, 440, 20);
		g2d.drawArc(700, 350, 30, 30, 440, 20);
		
		g2d.setColor(Color.black);
		g2d.setStroke(new BasicStroke(2));
		g2d.drawLine(139, 310, 132, 317);
		g2d.drawLine(139, 180, 132, 187);
		
		g2d.drawLine(269, 310, 262, 317);
		g2d.drawLine(269, 180, 262, 187);
		
		g2d.drawLine(369, 310, 362, 317);
		g2d.drawLine(369, 106, 362, 113);
		g2d.drawLine(236, 106, 229, 113);
		
		g2d.drawLine(590, 310, 583, 317);
		g2d.drawLine(590, 180, 583, 187);
		
		
		ImageIcon image = new ImageIcon(getClass().getResource("bushSMB3.png"));
		g2d.drawImage(image.getImage(), 9, 285, 40, 40, this);
		
		ImageIcon image3 = new ImageIcon(getClass().getResource("bolita.png"));
		g2d.drawImage(image3.getImage(), 408, 170, 20, 22, this);
		g2d.drawImage(image3.getImage(), 350, 235, 20, 22, this);
		
		ImageIcon image4 = new ImageIcon(getClass().getResource("mariochiquito.png"));
		g2d.drawImage(image4.getImage(), 340, 240, 35, 32, this);
		
		ImageIcon image5 = new ImageIcon(getClass().getResource("bloque2.png"));
		g2d.drawImage(image5.getImage(), 640, 89, 40, 40, this);
		
		ImageIcon image6 = new ImageIcon(getClass().getResource("bloqueVacio.png"));
		
		g2d.drawImage(image6.getImage(), 9, 130, 40, 40, this);
		g2d.drawImage(image5.getImage(), 90, 35, 40, 40, this);
		g2d.drawImage(image6.getImage(), 130, 35, 40, 40, this);
		
		
		
	}
	
}
