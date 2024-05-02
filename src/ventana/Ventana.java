package ventana;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame{
	
	public Ventana () {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 800);
		this.setLocationRelativeTo(null);
		this.setTitle("");
//		this.setLayout(null);
//		this.setResizable(false);
		this.loadComponents();
		this.setVisible(true);
	}

	
	
	public void loadComponents() {
			ventana();	
	}
	
	public void ventana () {
		
		JPanel panel = new JPanel();
		panel.setSize(this.getWidth(), this.getHeight());
		panel.setLocation(0,0);
		panel.setLayout(null);
		panel.setBackground(new Color(119,234,149));
		this.add(panel);
		
		JButton boton = new JButton();
		boton.setText("Click me!");
		boton.setFont(new Font("Arial BLack",Font.BOLD, 20));
		boton.setBounds(100, 600, 370, 50);
		panel.add(boton);
		panel.setFocusable(true);
		
		
		panel.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseExited(MouseEvent e) {
				int randRojo = (int) (Math.random() * 255);
				int randVerde = (int) (Math.random() * 255);
				int randAzul = (int) (Math.random() * 255);
				panel.setBackground(new Color(randRojo,randVerde, randAzul));
				
				panel.repaint();
			}
		});	
		
		panel.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyPressed(KeyEvent e) {
		    	int teclaPresionada = e.getKeyCode();
		    	System.out.println(teclaPresionada);
		        if (teclaPresionada == 127) {
		            panel.removeAll();
		            panel.repaint();
		        }else if(teclaPresionada == 87) {
					Component[] components = panel.getComponents();
					for (Component component : components) {
	                       if (component instanceof JButton) {
	                           JButton button = (JButton) component;
	                           button.setSize(button.getWidth() + 10, button.getHeight() + 10);
	                       }
						}
					}
		        	
		    	}
		});
		
		
		panel.addMouseListener(new MouseAdapter() {
					
			@Override
			public void mouseClicked(MouseEvent e) {
				int ejeX = e.getX();
				int ejeY = e.getY();
//				System.out.println(ejeX);
//				System.out.println(ejeY);
					
				JButton botonAleatorio = new JButton();
				int randRojo = (int) (Math.random() * 255);
				int randVerde = (int) (Math.random() * 255);
				int randAzul = (int) (Math.random() * 255);
				botonAleatorio.setBackground(new Color(randRojo,randVerde, randAzul));
						
		//		int ejeX = (int)(Math.random() * (panel.getWidth()-botonAleatorio.getWidth()));
		//		int ejeY = (int)(Math.random() * (panel.getWidth()-botonAleatorio.getWidth()));
						
						
				int tamanioAleatorio = (int)(Math.random() * (200 - 50)) + 10;					
				botonAleatorio.setBounds(ejeX, ejeY, tamanioAleatorio, tamanioAleatorio);
				//Me confundí con lo de las coordenadas, las capturas del trabajo están medio raras
				String codigoHexaColor = String.format("#%02x%02x%02x", randRojo, randVerde, randAzul);
				botonAleatorio.setText(codigoHexaColor);
				
				
				botonAleatorio.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(panel, botonAleatorio.getText());	
						
						botonAleatorio.addKeyListener(new KeyAdapter() {
							@Override
							public void keyPressed(KeyEvent e) {
								int teclaPresionada = e.getKeyCode();
								System.out.println(teclaPresionada);
								if (teclaPresionada == 127) {
									panel.removeAll();
									panel.repaint();
								} else if(teclaPresionada == 87) {
									Component[] components = panel.getComponents();
									for (Component component : components) {
				                        if (component instanceof JButton) {
				                            JButton button = (JButton) component;
				                            button.setSize(button.getWidth() + 10, button.getHeight() + 10);
				                        }
				                    }
								}
							}
						});
								
					}
				});
				
				
						
				panel.add(botonAleatorio);
				panel.repaint();
				}
		});
	}
	
	
	
	
	
}
