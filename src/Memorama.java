import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Collections;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Memorama extends JFrame implements MouseListener, ActionListener{
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JButton botones[] = new JButton[8];
    int numeroBoton[] = {1,2,3,4,1,2,3,4};
    public int botonesSeleccionados = 0;
    public int primerBotonPresionado = 1;
    public int segundoBotonPresionado = 1;
    public boolean paresEncontrados[][] = new boolean[2][4]; 
    public ArrayList<Integer> numeros = new ArrayList<>();
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 727, 529);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(254, 122, 122));
		contentPane.add(panel, BorderLayout.NORTH);
		
		lblNewLabel = new JLabel("Intentos: 0");
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(154, 247, 252));
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Reiniciar");
		panel_1.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(2, 4, 0, 0));
		
		btnNewButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        reiniciar();
		    }
		});
		
		for (int i = 1; i <= 4; i++) {
            numeros.add(i);
            numeros.add(i);
        }

		Collections.shuffle(numeros);

        for (int i = 0; i < 8; i++) {
            botones[i] = new JButton(""+numeros.get(i));
            panel_2.add(botones[i]);
            botones[i].addActionListener(this);
            ImageIcon icon = new ImageIcon(getClass().getResource("backside.png"));
            botones[i].setIcon(icon);
        }
		
	}

	public void actionPerformed(ActionEvent e) {
	    JButton boton = (JButton) e.getSource();
	    int valorBoton = Integer.parseInt(boton.getText());
	    
	    
	    if (!boton.isEnabled()) {
	        return;
	    }
	    
	    ImageIcon imagenFrente = null;
	    
	    switch (valorBoton) {
        case 1:
            imagenFrente = new ImageIcon(getClass().getResource("fresa.png"));
            break;
        case 2:
        	imagenFrente = new ImageIcon(getClass().getResource("cereza.png"));
            break;
        case 3:
        	imagenFrente = new ImageIcon(getClass().getResource("limon.png"));
            break;
        case 4:
        	imagenFrente = new ImageIcon(getClass().getResource("sandia.png"));
            break;
        default:
            break;
	    }
	    boton.setIcon(imagenFrente);
	    if (botonesSeleccionados == 0) {
	        primerBotonPresionado = valorBoton;
	        boton.setEnabled(false);
	        botonesSeleccionados++;
	    } else if (botonesSeleccionados == 1) {
	        segundoBotonPresionado = valorBoton;
	        boton.setEnabled(false);
	        botonesSeleccionados++;
	        
	        intentos++;
	        lblNewLabel.setText("Intentos: " + intentos);
	        
	        if (primerBotonPresionado == segundoBotonPresionado) {
	            JOptionPane.showMessageDialog(null, "Es un par");
	            marcarParEncontrado(primerBotonPresionado);
	            if (todosLosParesEncontrados()) {
	                JOptionPane.showMessageDialog(null, "¡Has ganado!");
	            }
	        } else {
	            JOptionPane.showMessageDialog(null, "No es un par");
	            resetearBotones();
	        }
	        primerBotonPresionado = 1;
	        segundoBotonPresionado = 1;
	        botonesSeleccionados = 0;
	    }
	}
	public boolean todosLosParesEncontrados() {
	    for (int i = 0; i < paresEncontrados.length; i++) {
	        for (int j = 0; j < paresEncontrados[i].length; j++) {
	            if (!paresEncontrados[i][j]) {
	                return false;
	            }
	        }
	    }
	    return true;
	}
	public void marcarParEncontrado(int valorPar) {
        for (int i = 0; i < botones.length; i++) {
            int valorBoton = Integer.parseInt(botones[i].getText());
            if (valorBoton == valorPar) {
                botones[i].setEnabled(false);
                int fila = i / 4;
                int columna = i % 4;
                paresEncontrados[fila][columna] = true;
            }
        }
    }
	public void reiniciar() {
	    botonesSeleccionados = 0;
	    primerBotonPresionado = -1;
	    segundoBotonPresionado = -1;
	    contentPane.remove(botones[0].getParent());
	    JPanel panel_2 = new JPanel();
	    contentPane.add(panel_2, BorderLayout.CENTER);
	    panel_2.setLayout(new GridLayout(2, 4, 0, 0));
	    for (int i = 0; i < 8; i++) { 
	        botones[i] = new JButton(""+numeros.get(i));
	        panel_2.add(botones[i]);
	        botones[i].addActionListener(this);
	        ImageIcon icon = new ImageIcon(getClass().getResource("backside.png"));
	        botones[i].setIcon(icon);
	    }
	    intentos = 0;
	    lblNewLabel.setText("Intentos: 0");
	    paresEncontrados = new boolean[2][4]; 
	    Collections.shuffle(numeros);
	    contentPane.revalidate(); 
	}
	public void resetearBotones() {
	    for (int i = 0; i < botones.length; i++) {
	        int fila = i / 4;
	        int columna = i % 4;
	        if (!paresEncontrados[fila][columna]) {
	            botones[i].setEnabled(true);
	            ImageIcon icon = new ImageIcon(getClass().getResource("backside.png"));
	            botones[i].setIcon(icon);
	        }
	    }
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
	}
}
