package panelesInterfaz;

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

	public int y = 220;
	public int x = 317;
	
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
		JPanel panel = new JPanel() {
			
			public void paint (Graphics g) {
				super.paint(g);
				
				Graphics2D g2d = (Graphics2D) g;
				g2d.setColor(Color.yellow);
				g2d.fillOval(x, y, 50, 50);
				g2d.setColor(Color.BLACK);
				g2d.drawOval(x, y, 50, 50);				
				repaint();
				
			}	
		};
		panel.setBackground(Color.BLACK);
		panelPrincipal.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		JPanel panel_1 = new JPanel();
		panelPrincipal.add(panel_1, BorderLayout.SOUTH);
		
		
//		setContentPane ( new JPanel () {
//			public void paint (Graphics g) {
//				super.paint(g);
//				
//				Graphics2D g2d = (Graphics2D) g;
//				g2d.setColor(Color.yellow);
//				g2d.fillOval(320, 220, 50, 50);
//				g2d.setColor(Color.BLACK);
//				g2d.drawOval(320, 220, 50, 50);				
//				repaint();
//				
//			}	
//		});

	
		
		
		
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
		if(e.getKeyCode() == KeyEvent.VK_W ) {
			y-=10;
		}
		if(e.getKeyCode() == KeyEvent.VK_A ) {
			x-=10;
		}
		if(e.getKeyCode() == KeyEvent.VK_S ) {
			y+=10;
		}
		if(e.getKeyCode() == KeyEvent.VK_D ) {
			x+=10;
		}
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
