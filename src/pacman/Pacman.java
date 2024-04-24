package pacman;

import java.awt.EventQueue;
<<<<<<< HEAD
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.BorderLayout;
=======
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.BasicStroke;
import java.awt.BorderLayout;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
>>>>>>> 2a0d70f (unidad 3: ejercicio 22)
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
<<<<<<< HEAD
=======
import java.io.IOException;

import javax.swing.Timer;
>>>>>>> 2a0d70f (unidad 3: ejercicio 22)
import java.awt.event.ActionEvent;

public class Pacman extends JFrame implements KeyListener {

	private static final long serialVersionUID = 1L;
	private JPanel panelPrincipal;
	private JPanel panel = new JPanel();
<<<<<<< HEAD

	public int y = 220;
	public int x = 317;
	public int velocidadPlayer = 5;
	public JugadoresElementos jugador = new JugadoresElementos(317, 220, 100, 100);
	public JugadoresElementos rectangulo = new JugadoresElementos(295, 100, 20, 300);
=======
	public int y = 220;
	public int x = 310;
	public int velocidadPlayer = 8;
	public JugadoresElementos jugador = new JugadoresElementos(370, 424, 39,40);
	public JugadoresElementos marcos[] = new JugadoresElementos[65];
	public JugadoresElementos elementos2[][] = new JugadoresElementos[4][4];
	public Bolitas bolitaElementos = new Bolitas();
	public Bolitas bolitas[] = new Bolitas[200];
	private int direccion = 4;
	private int teclaAux;
	Timer timer;
	private AudioInputStream audio1;
	private AudioInputStream audio2;
	private AudioInputStream audio3;
	private int puntuacion = 0;
	JLabel score = new JLabel();
	private boolean comiendo = true;
	
>>>>>>> 2a0d70f (unidad 3: ejercicio 22)
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pacman frame = new Pacman();
					frame.setFocusable(false);
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.setFocusable(true);
<<<<<<< HEAD
=======
					frame.setResizable(false);
>>>>>>> 2a0d70f (unidad 3: ejercicio 22)
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Pacman() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
<<<<<<< HEAD
		this.setBounds(100, 100, 687, 562);
=======
		this.setBounds(100, 100, 800, 800);
>>>>>>> 2a0d70f (unidad 3: ejercicio 22)
		panelPrincipal = new JPanel();
		panelPrincipal.setBackground(Color.BLUE);
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(new BorderLayout(0, 10));
		
<<<<<<< HEAD
		//Inicializar jugador (Circulo amarillo
		
		
		
		panel = new JPanel() {
			
			public void paint (Graphics g) {
				super.paint(g);
				
				Graphics2D g2d = (Graphics2D) g;
				g2d.setColor(Color.yellow);
//				g2d.fillOval(x, y, 50, 50);
				g2d.fillOval(jugador.getX(), jugador.getY(), jugador.getW(), jugador.getH());
				g2d.setColor(Color.BLACK);
				g2d.drawOval(jugador.getX(), jugador.getY(), jugador.getW(), jugador.getH());				
				//Objeto 
				g2d.setColor(Color.WHITE);
				g2d.fillRect(rectangulo.getX(), rectangulo.getY(), rectangulo.getW(), rectangulo.getH());
				
				repaint();
				
			}	
		};
		panel.setBackground(Color.BLACK);
=======
		reproducirAudio();
		
		if(direccion > 0 && direccion < 5) {
		timer = new Timer(25, new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            moverJugador(KeyEvent.VK_D);
	        }
	    });
	    timer.start();
		}
		
		//Inicializar elementos, muros
		inicializarBolitas();
		inicializarElementos();
//		System.out.println(bolitaElementos.bolitaEsTocada(jugador));
		panel = new JPanel() {
			public void paint (Graphics g) {
				super.paint(g);
				Graphics2D g2d = (Graphics2D) g;
				
				for (int i = 0; i < marcos.length; i++) {
					JugadoresElementos marco = marcos[i];
					if (marco != null) {
						g2d.setColor(Color.BLUE); 
						g2d.setStroke(new BasicStroke(4));
						g2d.drawRoundRect(marco.getX(), marco.getY(), marco.getW(), marco.getH(), 2, 2);
						g2d.setColor(new Color(0,96,224));
						g2d.setStroke(new BasicStroke(2));
						g2d.fillRoundRect(marco.getX(), marco.getY(), marco.getW(), marco.getH(), 2, 2);
					}
				}
				for (int i = 0; i < bolitas.length; i++) {
					Bolitas bolita = bolitas[i];
					if (bolita != null && bolita.isTocada()) {
						g2d.setColor(Color.WHITE); 
						g2d.fillOval(bolita.getbX(), bolita.getbY(), bolita.getbD(), bolita.getbD());
						bolitaTocada();
					}
				}
				
				//Gif para que pacman se mueva a los lados
				Image pacmanDerecha = new ImageIcon(getClass().getResource("pacman.gif")).getImage();
				Image pacmanAbajo = new ImageIcon(getClass().getResource("pacmanAbajo.gif")).getImage();
				Image pacmanIzquierda = new ImageIcon(getClass().getResource("pacmanIzquierda.gif")).getImage();
				Image pacmanArriba = new ImageIcon(getClass().getResource("pacmanArriba.gif")).getImage();
				switch(direccion) {
				//Arriba
					case 1:
						g2d.drawImage(pacmanArriba, jugador.getX(), jugador.getY(), jugador.getW(), jugador.getH(), this);
						break;
				//Izquierda
					case 2:
						g2d.drawImage(pacmanIzquierda, jugador.getX(), jugador.getY(), jugador.getW(), jugador.getH(), this);
						break;
				//Abajo
					case 3:
						g2d.drawImage(pacmanAbajo, jugador.getX(), jugador.getY(), jugador.getW(), jugador.getH(), this);
						break;
				//Derecha
					case 4:
						g2d.drawImage(pacmanDerecha, jugador.getX(), jugador.getY(), jugador.getW(), jugador.getH(), this);
						break;
				}
				repaint();
			}	
		};
		panel.setBackground(Color.BLACK);
		
		//label Score
		score = new JLabel(String.format("Score: %07d", puntuacion));
		score.setBounds(550, 635, 200, 20);
		score.setFont(new Font("Xolonium", Font.BOLD,15));
//		score.setOpaque(true);
		score.setForeground(Color.white);
		score.setBackground(Color.WHITE);
		panel.add(score);
		
>>>>>>> 2a0d70f (unidad 3: ejercicio 22)
		panelPrincipal.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		JPanel panel_1 = new JPanel();
		panelPrincipal.add(panel_1, BorderLayout.SOUTH);
		
<<<<<<< HEAD
		
		
		JButton btnNewButton = new JButton("Reiniciar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(btnNewButton);
		
		addKeyListener(this);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
=======
		JButton btnNewButton = new JButton("Reiniciar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reiniciarJuego();
			}
		});
		panel_1.add(btnNewButton);
		btnNewButton.setFocusable(false);
		addKeyListener(this);
		repaint();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
>>>>>>> 2a0d70f (unidad 3: ejercicio 22)
	}

	@Override
	public void keyPressed(KeyEvent e) {
<<<<<<< HEAD
		//Verifica que tecla se está tocando y mueve al jugador a la dirección que se presionó 
		if((e.getKeyCode() == KeyEvent.VK_W) || (e.getKeyCode() == KeyEvent.VK_UP) ) {
			jugador.setY(jugador.getY()-velocidadPlayer);;
//			y-=10;
		}
		if((e.getKeyCode() == KeyEvent.VK_A)||(e.getKeyCode() == KeyEvent.VK_LEFT) ) {
			jugador.setX(jugador.getX()-velocidadPlayer);
		}
		if((e.getKeyCode() == KeyEvent.VK_S)||(e.getKeyCode() == KeyEvent.VK_DOWN)) {
			jugador.setY(jugador.getY()+velocidadPlayer);
		}
		if((e.getKeyCode() == KeyEvent.VK_D)||(e.getKeyCode() == KeyEvent.VK_RIGHT) ) {
			jugador.setX(jugador.getX()+velocidadPlayer);
		}
		
		// Sui el jugador se sale del borde del panel que vuelva pero al lado contrario
		
		//Si llega al limite por la izquierda
	    if (jugador.getX() < 0-jugador.getW()) {
	        jugador.setX((getWidth()+jugador.getW()) - jugador.getW());
	    }
        //Si llega al limite por la Derecha
	    else if (jugador.getX() + jugador.getW() > (getWidth()+jugador.getH())) {
	        jugador.setX(0-jugador.getH());
	    }
        //Si llega al limite por arriba
	    if (jugador.getY() < 0-jugador.getH()) {
	        jugador.setY(getHeight() - jugador.getW());
	    }
        //Si llega al limite por abajo
	    else if (jugador.getY() + jugador.getH() > getHeight()) {
	        jugador.setY(0-jugador.getH());
	    }
		
	    //Si hay colision hace que no se meva
		if (jugador.colisionaron(jugador, rectangulo, velocidadPlayer)) {
	        if (e.getKeyCode() == KeyEvent.VK_W || e.getKeyCode() == KeyEvent.VK_UP) {
	            jugador.setY(jugador.getY() + velocidadPlayer);
	        } else if (e.getKeyCode() == KeyEvent.VK_A || e.getKeyCode() == KeyEvent.VK_LEFT) {
	            jugador.setX(jugador.getX() + velocidadPlayer);
	        } else if (e.getKeyCode() == KeyEvent.VK_S || e.getKeyCode() == KeyEvent.VK_DOWN) {
	            jugador.setY(jugador.getY() - velocidadPlayer);
	        } else if (e.getKeyCode() == KeyEvent.VK_D || e.getKeyCode() == KeyEvent.VK_RIGHT) {
	            jugador.setX(jugador.getX() - velocidadPlayer);
	        }
	    }
		
		panel.update(panel.getGraphics());
		System.out.println(jugador.getX());
		
=======
		// TODO Auto-generated method stub
>>>>>>> 2a0d70f (unidad 3: ejercicio 22)
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		
	}
}
=======
		teclaAux = e.getKeyCode();
		
		if (timer != null && timer.isRunning()) {
			timer.stop();
		}
		//Al presionar una tecla, se inicia un timer que hará que repita la accion de avanzar hasta que otra tecla sea presionada
	
		
		timer = new Timer(25, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				moverJugador(teclaAux);
			}
		});
		timer.start();
	}
	
	public void moverJugador(int teclaAux) {
		int dx = 0, dy = 0;
		switch (teclaAux) {
		//Arriba
		case KeyEvent.VK_W, KeyEvent.VK_UP:
			dy = -velocidadPlayer;
			direccion = 1;
			break;
		//Izquierda
		case KeyEvent.VK_A, KeyEvent.VK_LEFT:	
			dx = -velocidadPlayer;
			direccion = 2;
			break;
		//Abajo
		case KeyEvent.VK_S, KeyEvent.VK_DOWN:	
			dy = velocidadPlayer;
			direccion = 3;
			break;
		//Derecha
		case KeyEvent.VK_D, KeyEvent.VK_RIGHT:	
			dx = velocidadPlayer;
			direccion = 4;
			break;
		}
		
		moverEjes(dx, dy);
		
		panel.update(panel.getGraphics());
		//System.out.println(jugador.getX());
	}
 
	public void moverEjes(int x2, int y2) {
		int newX = jugador.getX() + x2;
	    int newY = jugador.getY() + y2;
	    
	    if (!jugador.verificarColisiones(marcos, jugador, newX, newY)) {
	    	jugador.setX(newX);
	    	jugador.setY(newY);
	   		verificarPanel();
	   		panel.repaint(); 
	    }
	}
	
	
	//Hacer que el jugador vuelva al panel si se sale de este
	public void verificarPanel() {
		if (jugador.getX() < 0-jugador.getW()) {
			jugador.setX((getWidth()+jugador.getW()) - jugador.getW());
		}
		//Si llega al limite por la Derecha
		else if (jugador.getX() + jugador.getW() > (getWidth()+jugador.getH())) {
			jugador.setX(0-jugador.getH());
		}
		//Si llega al limite por arriba
		if (jugador.getY() < 0-jugador.getH()) {
			jugador.setY(getHeight() - jugador.getW());
		}
		//Si llega al limite por abajo
		else if (jugador.getY() + jugador.getH() > getHeight()) {
			jugador.setY(0-jugador.getH());
		}
	}
	
	//Reproducir una de las dos canciones al iniciar el Programa
	//https://stackoverflow.com/questions/557903/how-can-i-wait-for-a-java-sound-clip-to-finish-playing-back
	public void reproducirAudio() {
	    try {
	    	audio1 = AudioSystem.getAudioInputStream(getClass().getResource("lvl.wav"));
	    	audio2 = AudioSystem.getAudioInputStream(getClass().getResource("lvl(2).wav"));
	        Clip clip = AudioSystem.getClip();
	       
	        int audioRandom = 0;
	        audioRandom = (int) (Math.random()*2);
	        System.out.println("Musica " + audioRandom);
	        switch(audioRandom) {
	        	case 0:
	        		clip.open(audio2);
	        		break;
	        	case 1:
	        		clip.open(audio1);
	        		break;
	        }
	        
	        clip.start();
	    } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
	        e.printStackTrace();
	    }
	}
	
	public void audioComer(boolean come) {
	    try {
	    	audio3 = AudioSystem.getAudioInputStream(getClass().getResource("waca.wav"));
	        Clip clip = AudioSystem.getClip();
	        
	        if(come == false) {
	        	System.out.println("Waca");
	        	clip.open(audio3);
	        	clip.start();
	        }
	        
	    } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
	        e.printStackTrace();
	    }
	}
	
	private void bolitaTocada() {
		boolean noMasBolitas = false;
		
		for (Bolitas bolita : bolitas) {
			if (bolita != null && bolita.bolitaEsTocada(jugador)&& (bolita.isTocada())) {
				bolita.setTocada(false);
				comiendo = false;
				audioComer(comiendo);
				puntuacion+=10;
				score.setText(String.format("Score: %07d", puntuacion));
				panel.repaint();
				
				
			}
		}
	}
	
	public void reiniciarJuego() {
	    jugador.setX(370);
	    jugador.setY(424);
	    
	    for (Bolitas bolita : bolitas) {
	        if (bolita != null) {
	            bolita.setTocada(true);
	        }
	    }
	    
	    puntuacion = 0;
	    score.setText(String.format("Score: %07d", puntuacion));
	    
	    if (timer != null && timer.isRunning()) {
	        timer.stop();
	    }
	    timer.start();
	}
	
	private void inicializarBolitas() {
		int[][] coordenadas = {
				{35, 35}, {75, 35}, {115, 35}, {155, 35}, {195, 35},
		        {235, 35}, {275, 35}, {315, 35}, {355, 35}, {395, 35},
		        {435, 35}, {475, 35}, {515, 35}, {555, 35}, {595, 35},
		        {635, 35}, {675, 35}, {715, 35},
		        
		        {35, 80}, {35, 125}, {35, 185},
		        
		        {75, 125}, {115, 125}, {155, 125}, {195, 125}, {235, 125},
		        {275, 125}, {315, 125}, {355, 125}, {395, 125}, {435, 125},
		        {475, 125}, {515, 125}, {555, 125}, {595, 125}, {635, 125},
		        {675, 125}, {715, 125},
		        
		        {75, 185}, {115, 185}, {155, 185}, {195, 185}, {235, 185},
		        {275, 185}, {315, 185}, {355, 185}, {395, 185}, {435, 185},
		        {475, 185}, {515, 185}, {555, 185}, {595, 185}, {635, 185},
		        {675, 185}, {715, 185},
		        
		        {195, 80}, {355, 80}, {395, 80}, {555, 80}, {715, 80},
		        
		        {195, 235}, {235, 235}, {275, 235}, {315, 235}, {355, 235},
		        {395, 235}, {435, 235}, {475, 235}, {515, 235}, {555, 235},
		        
		        {195, 285},  {555, 285},
		        
		        {35, 335}, {75, 335}, {115, 335}, {155, 335}, {195, 335},
		        {555, 335}, {595, 335}, {635, 335}, {675, 335}, {715, 335}, 
		        
		        {195, 385},  {555, 385},
		        {195, 435},  {555, 435},
		        
		        {35, 485}, {75, 485}, {115, 485}, {155, 485}, {195, 485},
		        {235, 485}, {275, 485}, {315, 485}, {355, 485}, {395, 485},
		        {435, 485}, {475, 485}, {515, 485}, {555, 485}, {595, 485},
		        {635, 485}, {675, 485}, {715, 485},
		        
		        {35, 535}, {75, 535}, {115, 535}, {155, 535}, {195, 535},
		        {235, 535}, {275, 535}, {315, 535}, {355, 535}, {395, 535},
		        {435, 535}, {475, 535}, {515, 535}, {555, 535}, {595, 535},
		        {635, 535}, {675, 535}, {715, 535},
		        
		        {35, 585}, {75, 585}, {115, 585}, {155, 585}, {195, 585},
		        {235, 585}, {275, 585}, {315, 585}, {355, 585}, {395, 585},
		        {435, 585}, {475, 585}, {515, 585}, {555, 585}, {595, 585},
		        {635, 585}, {675, 585}, {715, 585}
		        
		    };
	    
	    // Crear las bolitas en las coordenadas especificadas
	    for (int i = 0; i < coordenadas.length && i < bolitas.length; i++) {
	        int x = coordenadas[i][0];
	        int y = coordenadas[i][1];
	        bolitas[i] = new Bolitas(x, y, 8);
	    }
	}
	//Pintar elementos conforme a sus coordenadas, me enfade de intentarlo de otra forma y lo terminé haciendo a mano xd
	private void inicializarElementos() {
		// TODO Auto-generated method stub
		for (int i = 0; i < marcos.length; i++) {
			marcos[i] = new JugadoresElementos(0,0,0,0);
		}
		//Muros del Borde
		marcos[0] = new JugadoresElementos(10,10,745,2);
		
		marcos[1] = new JugadoresElementos(10,10,2,200);
		marcos[2] = new JugadoresElementos(755,10,2,200);
		
		marcos[3] = new JugadoresElementos(595,210,160,2);
		marcos[4] = new JugadoresElementos(595,310,200,2);
		marcos[5] = new JugadoresElementos(10,210,160,2);
		marcos[6] = new JugadoresElementos(0,310,170,2);
		marcos[7] = new JugadoresElementos(170,210,2,100);
		marcos[8] = new JugadoresElementos(595,210,2,100);
		
		marcos[9] = new JugadoresElementos(595,370,200,2);
		marcos[10] = new JugadoresElementos(0,370,168,2);
		
		marcos[11] = new JugadoresElementos(595,370,2,100);
		marcos[12] = new JugadoresElementos(170,370,2,100);
		
		marcos[13] = new JugadoresElementos(595,470,160,2);
		marcos[14] = new JugadoresElementos(10,470,160,2);
		
		marcos[15] = new JugadoresElementos(755,470,2,150);
		marcos[16] = new JugadoresElementos(10,470,2,150);
		
		marcos[17] = new JugadoresElementos(10,620,745,2);
		
		//CeldaFantasmas
		marcos[18] = new JugadoresElementos(290,420,200,2);
		
		marcos[19] = new JugadoresElementos(290,320,2,100);
		marcos[20] = new JugadoresElementos(490,320,2,100);
		
		marcos[21] = new JugadoresElementos(415,320,75,2);
		marcos[22] = new JugadoresElementos(290,320,75,2);

		//Muros Dentro del coso //Horizontales
		marcos[23] = new JugadoresElementos(290,470,200,2);
		
		marcos[24] = new JugadoresElementos(290,520,200,2);
		
		marcos[25] = new JugadoresElementos(70,570,265,2);
		marcos[26] = new JugadoresElementos(440,570,260,2);
		
//		marcos[27] = new JugadoresElementos(290,160,200,2);
		marcos[28] = new JugadoresElementos(70,520,150,2);
		marcos[29] = new JugadoresElementos(550,520,150,2);
		
		marcos[30] = new JugadoresElementos(230,260,130,2);
		marcos[31] = new JugadoresElementos(420,260,115,2);
		
		marcos[32] = new JugadoresElementos(280,208,205,2);
		
		marcos[33] = new JugadoresElementos(70,110,100,2);
		marcos[34] = new JugadoresElementos(70,160,100,2);
		marcos[35] = new JugadoresElementos(70,60,100,2);
		
		marcos[36] = new JugadoresElementos(600,110,100,2);
		marcos[37] = new JugadoresElementos(600,160,100,2);
		marcos[38] = new JugadoresElementos(600,60,100,2);
		
		marcos[39] = new JugadoresElementos(220,60,120,2);
		marcos[40] = new JugadoresElementos(440,60,100,2);
		marcos[41] = new JugadoresElementos(440,110,100,2);
		marcos[42] = new JugadoresElementos(220,110,120,2);
		
		marcos[43] = new JugadoresElementos(280,160,205,2);
		
		//Muros Dentro del coso //Verticales
		marcos[44] = new JugadoresElementos(390,520,2,50);
		marcos[45] = new JugadoresElementos(390,165,2,40);
		marcos[46] = new JugadoresElementos(390,14,2,98);
		
		marcos[47] = new JugadoresElementos(70,60,2,50);
		marcos[48] = new JugadoresElementos(170,60,2,50);
		marcos[49] = new JugadoresElementos(220,60,2,50);
		marcos[50] = new JugadoresElementos(340,60,2,50);
		
		marcos[51] = new JugadoresElementos(600,60,2,50);
		marcos[52] = new JugadoresElementos(700,60,2,50);
		marcos[53] = new JugadoresElementos(440,60,2,50);
		marcos[54] = new JugadoresElementos(540,60,2,50);
		
		marcos[55] = new JugadoresElementos(542,164,2,150);
		marcos[56] = new JugadoresElementos(222,160,2,150);
		
		marcos[57] = new JugadoresElementos(542,370,2,100);
		marcos[58] = new JugadoresElementos(222,370,2,100);
	}
	
}
>>>>>>> 2a0d70f (unidad 3: ejercicio 22)
