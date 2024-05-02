package calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Memorama extends JFrame {
	
	static JButton primerBotonPresionado = null;
	public JPanel panelBotones = new JPanel();
	private static final long serialVersionUID = 1L;
	public int intentos = 0;
	public JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Memorama frame = new Memorama();
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
	public Memorama() {
        getContentPane().setBackground(new Color(101, 228, 69));

        JPanel panel = new JPanel();
        panel.setBackground(Color.CYAN);
        getContentPane().add(panel, BorderLayout.NORTH);

        lblNewLabel = new JLabel("Intentos: "+intentos);
        panel.add(lblNewLabel);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(249, 239, 128));
        getContentPane().add(panel_1, BorderLayout.SOUTH);

        JButton btnNewButton = new JButton("Reiniciar");
        panel_1.add(btnNewButton);

        panelBotones = new JPanel();
        panelBotones.setBackground(new Color(213, 135, 245));
        getContentPane().add(panelBotones, BorderLayout.CENTER);
        panelBotones.setLayout(new GridLayout(2, 4, 5, 5));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 637, 579);

        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                reiniciar();
            }
        });

        crearBotones();
    }

    private void crearBotones() {
    	
    	
        String[][] botones = { { "3", "4", "1", "2" }, { "2", "1", "4", "3" } };

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                JButton boton = new JButton(botones[i][j]);
                panelBotones.add(boton);
                boton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JButton botonPresionado = (JButton) e.getSource();
                        if (botonPresionado.isEnabled()) {
                            botonPresionado.setEnabled(false);
                            if (primerBotonPresionado == null) {
                                primerBotonPresionado = botonPresionado;
                            } else {
                            	intentos +=1;
                            	lblNewLabel.setText("Intentos: "+intentos);
                            	System.out.println(intentos);
                                if (primerBotonPresionado.getText().equals(botonPresionado.getText())) {
                                    JOptionPane.showMessageDialog(null, "Es par");
                                } else {
                                	JOptionPane.showMessageDialog(null, "No es par");

                                    primerBotonPresionado.setEnabled(true);
                                    botonPresionado.setEnabled(true);
                                }
                                primerBotonPresionado = null;
                            }
                        }
                    }
                });
            }
        }
    }

    private void reiniciar() {
        panelBotones.removeAll(); 
        panelBotones.revalidate(); 
        panelBotones.repaint(); 
        crearBotones(); 
        intentos = 0;
        lblNewLabel.setText("Intentos: "+intentos);
    }
}

//Profe me confundí bastante con la
