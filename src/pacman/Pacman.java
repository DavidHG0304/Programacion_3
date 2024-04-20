package pacman;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;

public class Pacman extends JFrame implements KeyListener {

	private static final long serialVersionUID = 1L;
	private JPanel panelPrincipal;
	private JPanel panel = new JPanel();

	public int y = 220;
	public int x = 317;
	public int velocidadPlayer = 5;
	public JugadoresElementos jugador = new JugadoresElementos(317, 220, 100, 100);
	public JugadoresElementos rectangulo = new JugadoresElementos(295, 100, 20, 300);
	
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
		this.setBounds(100, 100, 687, 562);
		panelPrincipal = new JPanel();
		panelPrincipal.setBackground(Color.BLUE);
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(new BorderLayout(0, 10));
		
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
		panelPrincipal.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		JPanel panel_1 = new JPanel();
		panelPrincipal.add(panel_1, BorderLayout.SOUTH);
		
		
		
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
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
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
		
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}