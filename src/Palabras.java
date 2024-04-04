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
