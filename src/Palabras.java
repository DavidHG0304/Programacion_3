<<<<<<< HEAD
<<<<<<< HEAD
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Palabras extends JFrame implements KeyListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Palabras frame = new Palabras();
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
	public Palabras() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 918, 477);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelCentral = new JPanel();
		panelCentral.setBackground(new Color(21, 57, 98));
		contentPane.add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(null);
		
		JPanel panelAlfanumerico = new JPanel();
		panelAlfanumerico.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelAlfanumerico.setBackground(new Color(49, 60, 70));
		panelAlfanumerico.setBounds(80, 127, 575, 236);
		panelCentral.add(panelAlfanumerico);
		panelAlfanumerico.setLayout(new GridLayout(3, 0, 10, 10));
		
		JPanel panelTeclasAcciones = new JPanel();
		panelTeclasAcciones.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelTeclasAcciones.setBackground(new Color(49, 60, 70));
		panelTeclasAcciones.setBounds(665, 127, 137, 236);
		panelCentral.add(panelTeclasAcciones);
		panelTeclasAcciones.setLayout(new GridLayout(2, 0, 20, 10));
		
		JLabel teclaBorrar = new JLabel("Borrar", 0);
		teclaBorrar.setOpaque(true);
		teclaBorrar.setBackground(new Color(85,97,106));
		teclaBorrar.setForeground(Color.white);
		panelTeclasAcciones.add(teclaBorrar);
		
		JLabel teclaEnter = new JLabel("Enter", 0);
		teclaEnter.setOpaque(true);
		teclaEnter.setBackground(new Color(85,97,106));
		teclaEnter.setForeground(Color.white);
		panelTeclasAcciones.add(teclaEnter);
		
		JPanel panelEspacio = new JPanel();
		panelEspacio.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelEspacio.setBackground(new Color(49, 60, 70));
		panelEspacio.setBounds(156, 370, 420, 30);
		panelCentral.add(panelEspacio);
		panelEspacio.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel espacioTecla = new JLabel("Espacio", 0);
		espacioTecla.setOpaque(true);
		espacioTecla.setBackground(new Color(85,97,106));
		espacioTecla.setForeground(Color.white);
		panelEspacio.add(espacioTecla);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(211, 211, 211));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(80, 11, 722, 105);
		panelCentral.add(panel);
		panel.setLayout(new GridLayout(1, 3, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(2, 0, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("   Escribir Palabra:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("   Pescado");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_1.add(lblNewLabel);
		
		JLabel lblEscrito = new JLabel("P", 0);
		lblEscrito.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lblEscrito);
		
		JLabel Tiempo = new JLabel("0 ", 4);
		Tiempo.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel.add(Tiempo);
		
		JPanel panelSuperior = new JPanel();
		panelSuperior.setBackground(new Color(0, 0, 0));
		contentPane.add(panelSuperior, BorderLayout.NORTH);
		
		JPanel panelInferior = new JPanel();
		panelInferior.setBackground(new Color(0, 0, 0));
		contentPane.add(panelInferior, BorderLayout.SOUTH);
		
		JLabel teclas[] = new JLabel[27];
		
		char auxNum = 'A';
		//Crear labels teclado numérico
		for(int i = 0; i<27; i++) {
			teclas[i] = new JLabel(""+(auxNum), 0);
			++auxNum;
			teclas[i].setOpaque(true);
			teclas[i].setBackground(new Color(85,97,106));
			teclas[i].setForeground(Color.white);
			panelAlfanumerico.add(teclas[i]);
		}
		
		
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
				
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
=======
=======
>>>>>>> 7b4e555 (unidad 3: ejercicio 16)
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.border.LineBorder;
import java.awt.Font;

public class Palabras extends JFrame implements KeyListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JLabel teclas[] = new JLabel[27];
	public JLabel espacioTecla = new JLabel();
	public JLabel lblEscrito = new JLabel();
	public String palabras[] = {
		    "Agua", "Boca", "Casa", "Dedo", "Espada", "Fuego", "Gato", "Huevo", "Isla", "Jaula",
		    "Lago", "Mesa", "Nube", "Oso", "Pato", "Queso", "Raton", "Silla", "Techo", "Palo",
		    "Vaso", "Surf", "Xilofono", "Yoga", "Zapato", "Avion", "Barco", "Coche", "Dinero", "Escuela",
		    "Fiesta", "Guitarra", "Helado", "Invierno", "Jardin", "Kilo", "Lapiz", "Musica", "Nariz", "Oveja",
		    "Pared", "Rana", "Sol", "Tomate", "Universo", "Whisky", "Yate", "Almohada", "Billetera", "Caja",
		    "Diamante", "Estrella", "Flecha", "Globo", "Hipopotamo", "Isla", "Jirafa", "Kilometro", "Leon", "Manzana",
		    "Naranja", "Octagono", "Paraguas", "Reloj", "Serpiente", "Tigre", "Uva", "Vela", "Waffle", "Avellana",
		    "Bicicleta", "Caramelo", "Delfin", "Elefante", "Foca", "Girasol", "Hormiga", "Iglu", "Joya", "Canguro",
		    "Limon", "Mani", "Nuez", "Platano", "Serpiente", "Vaca", "Zanahoria", "Fresa", "Piramide", "Telefono",
		    "Sopa", "Probar", "Correr", "Nectar", "Iguana", "Angustia", "Atencion", "Divergencia", "Memoria", "Sonreir"
		};
	public JLabel lblPalabra = new JLabel("   "+palabras[(int) (Math.random()*100)]);
	public String auxPalabraEscrita = "";
	public JLabel teclaEnter = new JLabel();
	public JLabel teclaBorrar = new JLabel();
	// Color aleatorio
	public Random random = new Random();
	
	public JLabel tiempo = new JLabel("0 ", 4);
	public int auxSegundos = 0;
	
	public boolean verificarPalabra;
	
	public javax.swing.Timer timer;
<<<<<<< HEAD
	public int segundosContador;
	public String teclaPresionada;
	
=======
//	public int segundosContador;
	public String teclaPresionada;
	// Las variable tipo long en este caso almacena el tiempo actual en milisegundos al iniciar el temporizador
	// System.currentTimeMillis() devuelve el tiempo en milisegundos y un long puede contener valores grandes, por eso es utilizado en este caso
	// https://stackoverflow.com/questions/5857812/long-vs-integer-long-vs-int-what-to-use-and-when
	public long tiempoInicio = System.currentTimeMillis();
	public long tiempoTranscurrido = System.currentTimeMillis() - tiempoInicio;
    public float segundos = tiempoTranscurrido / 1000f;
>>>>>>> 7b4e555 (unidad 3: ejercicio 16)
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		 JOptionPane.showMessageDialog(null, "Bienvenido. \n\nInstrucciones:\n- Ingresa la palabra que se muestra en pantalla escribiendola con el teclado, se muestra un contador a la derecha que indica el tiempo que tarda en escribir esa palabra.\n- Presiona Enter para confirmar la palabra. \n- En caso de estar mal, tendrá que reintentarlo hasta conseguir escribir la palabra correctamente, mientras el contador seguira su curso.\n- En caso de acertar la palabra se le mostrará el tiempo que tardó en escribirla y la palabra se reemplazará con otra.\n\n-Presiona \"Ok\" para Comenzar el juego", "Instrucciones", JOptionPane.INFORMATION_MESSAGE);

		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Palabras frame = new Palabras();
					frame.setLocationRelativeTo(null);
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
	public Palabras() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 918, 477);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelCentral = new JPanel();
		panelCentral.setBackground(new Color(21, 57, 98));
		contentPane.add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(null);
		
		JPanel panelAlfanumerico = new JPanel();
		panelAlfanumerico.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelAlfanumerico.setBackground(new Color(49, 60, 70));
		panelAlfanumerico.setBounds(80, 127, 575, 236);
		panelCentral.add(panelAlfanumerico);
		panelAlfanumerico.setLayout(new GridLayout(3, 0, 10, 10));
		
		JPanel panelTeclasAcciones = new JPanel();
		panelTeclasAcciones.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelTeclasAcciones.setBackground(new Color(49, 60, 70));
		panelTeclasAcciones.setBounds(665, 127, 137, 236);
		panelCentral.add(panelTeclasAcciones);
		panelTeclasAcciones.setLayout(new GridLayout(2, 0, 20, 10));
		
		teclaBorrar = new JLabel("Borrar", 0);
		teclaBorrar.setOpaque(true);
		teclaBorrar.setBackground(new Color(85,97,106));
		teclaBorrar.setForeground(Color.white);
		panelTeclasAcciones.add(teclaBorrar);
		
		teclaEnter = new JLabel("Enter", 0);
		teclaEnter.setOpaque(true);
		teclaEnter.setBackground(new Color(85,97,106));
		teclaEnter.setForeground(Color.white);
		panelTeclasAcciones.add(teclaEnter);
		
		JPanel panelEspacio = new JPanel();
		panelEspacio.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelEspacio.setBackground(new Color(49, 60, 70));
		panelEspacio.setBounds(156, 370, 420, 30);
		panelCentral.add(panelEspacio);
		panelEspacio.setLayout(new GridLayout(0, 1, 0, 0));
		
		espacioTecla = new JLabel("Espacio", 0);
		espacioTecla.setOpaque(true);
		espacioTecla.setBackground(new Color(85,97,106));
		espacioTecla.setForeground(Color.white);
		panelEspacio.add(espacioTecla);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(211, 211, 211));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(80, 11, 722, 105);
		panelCentral.add(panel);
		panel.setLayout(new GridLayout(1, 3, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(2, 0, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("   Escribir Palabra:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_1.add(lblNewLabel_1);
		
		lblPalabra.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_1.add(lblPalabra);
		
		lblEscrito = new JLabel(" ", 0);
		lblEscrito.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lblEscrito);
		
		tiempo = new JLabel("0 ", 4);
		tiempo.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel.add(tiempo);
		
		JPanel panelSuperior = new JPanel();
		panelSuperior.setBackground(new Color(0, 0, 0));
		contentPane.add(panelSuperior, BorderLayout.NORTH);
		
		JPanel panelInferior = new JPanel();
		panelInferior.setBackground(new Color(0, 0, 0));
		contentPane.add(panelInferior, BorderLayout.SOUTH);
		
		addKeyListener(this);
		
//		for(int i = 0; i<100; i++) {
//			System.out.println(palabras[i]);
//		}
		
		char auxNum = 'A';
		// Crear labels teclado numérico
		for (int i = 0; i < 27; i++) {
			teclas[i] = new JLabel("" + (auxNum), 0);
			++auxNum;
			teclas[i].setOpaque(true);
			teclas[i].setBackground(new Color(85, 97, 106));
			teclas[i].setForeground(Color.white);
			panelAlfanumerico.add(teclas[i]);
			if(i == 26) {
				teclas[i].setText("Shift");
			}
		}
		
<<<<<<< HEAD
		
		// Contador
		// https://stackoverflow.com/questions/1006611/java-swing-timer
		timer = new javax.swing.Timer(1000, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				segundosContador++;
		        tiempo.setText(Integer.toString(segundosContador));
				
			}
=======
		// Contador
		// https://stackoverflow.com/questions/1006611/java-swing-timer
		timer = new javax.swing.Timer(1, new ActionListener() {
		   

		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	// Calcula la diferencia entre el tiempo actual y el momento en que se inició el temporizador
		        tiempoTranscurrido = System.currentTimeMillis() - tiempoInicio;
		        segundos = tiempoTranscurrido / 1000f;
		        tiempo.setText(String.format("%.3f", segundos));
		    }
>>>>>>> 7b4e555 (unidad 3: ejercicio 16)
		});
		timer.start();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		float r = random.nextFloat();
		float g = random.nextFloat();
		float b = random.nextFloat();
		Color randomColor = new Color(r, g, b);
		
		int barraEspacio = KeyEvent.VK_BACK_SPACE;
		teclaPresionada = ""+e.getKeyChar();
		teclaPresionada.toUpperCase();
		for(int i = 0; i<27; i++) {
			String aux = teclas[i].getText().toLowerCase();
			if(aux.equals(teclaPresionada )) {
		// System.out.println("Si");
				teclas[i].setBackground(randomColor);
				
		// teclas[i].setBackground(new Color(100,100,150));
				break;
			}
		}
		
		// Iluminar tecla espacio al presionarse
		if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			espacioTecla.setBackground(randomColor);
		}
		
		// Iluminar tecla Shift al presionarse
		if (e.getKeyCode() == KeyEvent.VK_SHIFT) {
			teclas[26].setBackground(randomColor);
		}

		// Escribir la palabra en el panel
		if((e.getKeyCode() != KeyEvent.VK_SHIFT & e.getKeyCode() != KeyEvent.VK_BACK_SPACE & e.getKeyCode() != KeyEvent.VK_ENTER )) {
			auxPalabraEscrita += teclaPresionada;
			lblEscrito.setText(auxPalabraEscrita);
		}
		
		// Borrar la última letra del string al presionar tecla retroceso
		if(auxPalabraEscrita != "" & (e.getKeyCode() == KeyEvent.VK_BACK_SPACE)) {
			auxPalabraEscrita = auxPalabraEscrita.substring(0,auxPalabraEscrita.length() - 1);
		// System.out.println(auxPalabraEscrita);
			lblEscrito.setText(auxPalabraEscrita);
			teclaBorrar.setBackground(randomColor);
		}
		
		// Cambiar palabra al presionar enter y mandar lo que estabas escribiendo para escribir
<<<<<<< HEAD
		if(e.getKeyCode() == KeyEvent.VK_ENTER) {
			// Condición para verificar que la palabra ingresada es la misma que la que se tiene que ingresar
			if(lblPalabra.getText().trim().equals(auxPalabraEscrita.trim())) {
				timer.stop();
				JOptionPane.showMessageDialog(null, "Ha escrito la palabra en "+segundosContador+" segundos", "Bien!",JOptionPane.INFORMATION_MESSAGE);
				lblEscrito.setText("");
				auxPalabraEscrita = ""; 
				tiempo.setText("0");
				segundosContador = 0;
				timer.restart();
				lblPalabra.setText("   "+palabras[(int) (Math.random()*100)]);
			}else {
				JOptionPane.showMessageDialog(null, "La palabra ingresada no esta bien escrita", "Mal!",JOptionPane.INFORMATION_MESSAGE);
				lblEscrito.setText("");
				auxPalabraEscrita = ""; 
			}
			teclaEnter.setBackground(randomColor);
			//	System.out.println(auxPalabraEscrita);
			
		}
=======
//		if(e.getKeyCode() == KeyEvent.VK_ENTER) {
//			// Condición para verificar que la palabra ingresada es la misma que la que se tiene que ingresar
//			if(lblPalabra.getText().trim().equals(auxPalabraEscrita.trim())) {
//				timer.stop();
//				JOptionPane.showMessageDialog(null, "Ha escrito la palabra en "+segundosContador+" segundos", "Bien!",JOptionPane.INFORMATION_MESSAGE);
//				lblEscrito.setText("");
//				auxPalabraEscrita = ""; 
//				tiempo.setText("0");
//				segundosContador = 0;
//				timer.restart();
//				lblPalabra.setText("   "+palabras[(int) (Math.random()*100)]);
//			}else {
//				JOptionPane.showMessageDialog(null, "La palabra ingresada no esta bien escrita", "Mal!",JOptionPane.INFORMATION_MESSAGE);
//				lblEscrito.setText("");
//				auxPalabraEscrita = ""; 
//			}
//			teclaEnter.setBackground(randomColor);
//			//	System.out.println(auxPalabraEscrita);
//			
//		}
>>>>>>> 7b4e555 (unidad 3: ejercicio 16)
		
		//Timer para cambiar los colores de los labels al que tenían por defecto después de un 0.1 segundos
		//https://stackoverflow.com/questions/2258066/run-a-java-function-after-a-specific-number-of-seconds
		new java.util.Timer().schedule(
				new java.util.TimerTask() {
					@Override
					public void run() {
						for(int i = 0; i<27; i++) {
							String aux = teclas[i].getText().toLowerCase();
							if(e.getKeyCode() == KeyEvent.VK_SHIFT) {
								teclas[26].setBackground(new Color(85, 97, 106));
							}if(aux.equals(teclaPresionada)) {
						// System.out.println("Si");
								teclas[i].setBackground(new Color(85, 97, 106));
							}
							if(e.getKeyCode() == KeyEvent.VK_SPACE) {
								espacioTecla.setBackground(new Color(85, 97, 106));
							}
							if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
								teclaBorrar.setBackground(new Color(85, 97, 106));
							}
							if(e.getKeyCode() == KeyEvent.VK_ENTER) {
								teclaEnter.setBackground(new Color(85, 97, 106));
							}
							teclas[i].setBackground(new Color(85, 97, 106));
						}
					}
				},
				100
		);
<<<<<<< HEAD
		
=======
>>>>>>> 7b4e555 (unidad 3: ejercicio 16)
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		
	}
	
}
>>>>>>> 79792e6 (unidad 3: ejercicio 15)
=======
		if (auxPalabraEscrita.equals(lblPalabra.getText().trim())) {
	        timer.stop();
//	        JOptionPane.showMessageDialog(null, "Ha escrito la palabra en " + segundosContador + " segundos", "Bien!", JOptionPane.INFORMATION_MESSAGE);
	        JOptionPane.showMessageDialog(null, "Ha escrito la palabra en " + segundos + " segundos", "Bien!", JOptionPane.INFORMATION_MESSAGE);
	        lblEscrito.setText("");
	        auxPalabraEscrita = "";
	        tiempo.setText("0");
//	        segundosContador = 0;
	        timer.restart();
	     // Reinicia el contador a 0 al completar una palabra
	    	tiempoInicio = System.currentTimeMillis();
	        lblPalabra.setText("   " + palabras[(int) (Math.random() * 100)]);
	    }
	}
}
>>>>>>> 7b4e555 (unidad 3: ejercicio 16)
