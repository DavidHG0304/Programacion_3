package ventana;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

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
		
		boton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == boton) {
					JButton botonAleatorio = new JButton();
					
					float randRojo = (float) Math.random();
	                float randVerde = (float) Math.random();
	                float randAzul = (float) Math.random();
					
					botonAleatorio.setBackground(new Color(randRojo,randVerde, randAzul));

					int ejeX = (int)(Math.random() * (panel.getWidth()-botonAleatorio.getWidth()));
					int ejeY = (int)(Math.random() * (panel.getWidth()-botonAleatorio.getWidth()));
					int tamanioAleatorio = (int)(Math.random() * (200 - 100)) + 100;					
					botonAleatorio.setBounds(ejeX, ejeY, tamanioAleatorio, tamanioAleatorio);
					String codigoHexaColor = String.format("%.8f, %.8f, %.8f", randRojo, randVerde, randAzul);
					botonAleatorio.setText(codigoHexaColor);
					
					botonAleatorio.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							if(e.getSource() == botonAleatorio) {
								JOptionPane.showMessageDialog(panel, botonAleatorio.getText());
								
							}
							
						}
					});
					
//					botonAleatorio.setBounds(300, 200, 60, 50);
					
					panel.add(botonAleatorio);
					
					
					
				}
				
				panel.repaint();
			}
		});
		
		
	}
}
