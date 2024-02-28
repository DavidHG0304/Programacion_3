package calculadora;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calculadora extends JFrame{
	
	public Calculadora() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 518);
		this.setLocationRelativeTo(null);
		this.setTitle("Calculadora");
		this.setLayout(null);
		this.setResizable(false);
		this.loadComponents();
		this.setVisible(true);
		
	}
	
	public void loadComponents() {
		calculadora();
	}
	
	public void calculadora() {
		//Panel
		JPanel calculadora = new JPanel();
		calculadora.setSize(this.getWidth(),this.getHeight());
		calculadora.setLocation(0,0);
		calculadora.setLayout(null);
		calculadora.setBackground(Color.BLACK);
		this.add(calculadora);
		
		//Label
		JLabel texto1 = new JLabel();
		texto1.setText("235.0");
		texto1.setBounds(295, 45, 80, 50);
		texto1.setForeground(Color.white);
		texto1.setFont(new Font("Arial",Font.BOLD,30));
		calculadora.add(texto1);
		
		JLabel texto2 = new JLabel();
		texto2.setText("Historial  ←");
		texto2.setBounds(290, 15, 200, 15);
		texto2.setForeground(Color.white);
		texto2.setFont(new Font("Arial",Font.BOLD,15));
		calculadora.add(texto2);
		
		JLabel texto3 = new JLabel();
		texto3.setText("─");
		texto3.setBounds(5, -10, 80, 50);
		texto3.setForeground(Color.white);
		texto3.setFont(new Font("Arial",Font.PLAIN,20));
		calculadora.add(texto3);
		
		JLabel texto4 = new JLabel();
		texto4.setText("─");
		texto4.setBounds(5, -5, 80, 50);
		texto4.setForeground(Color.white);
		texto4.setFont(new Font("Arial",Font.PLAIN,20));
		calculadora.add(texto4);
		
		JLabel texto5 = new JLabel();
		texto5.setText("─");
		texto5.setBounds(5, 0, 80, 50);
		texto5.setForeground(Color.white);
		texto5.setFont(new Font("Arial",Font.PLAIN,20));
		calculadora.add(texto5);
		
		JLabel texto6 = new JLabel();
		texto6.setText("Estandar");
		texto6.setBounds(25, -4, 80, 50);
		texto6.setForeground(Color.white);
		texto6.setFont(new Font("Arial",Font.PLAIN,15));
		calculadora.add(texto6);
		
		//Botones de la calculadora
		//Boton-%
		JButton boton1 = new JButton();
		boton1.setText("%");
		boton1.setFont(new Font("Arial",Font.PLAIN,18));
		boton1.setBackground(Color.DARK_GRAY);
		boton1.setForeground(Color.white);
		boton1.setBounds(5, 100, 90, 60);
		calculadora.add(boton1);
		//Boton ¹/ₓ
		JButton boton2 = new JButton();
		boton2.setText(" ¹/ₓ");
		boton2.setFont(new Font("Arial",Font.PLAIN,18));
		boton2.setBackground(Color.DARK_GRAY);
		boton2.setForeground(Color.white);
		boton2.setBounds(5, 163, 90, 60);
		calculadora.add(boton2);
		//Boton 7
		JButton boton3 = new JButton();
		boton3.setText("7");
		boton3.setFont(new Font("Arial",Font.PLAIN,18));
		boton3.setBackground(Color.GRAY);
		boton3.setForeground(Color.white);
		boton3.setBounds(5, 226, 90, 60);
		calculadora.add(boton3);
		//Boton 4
		JButton boton4 = new JButton();
		boton4.setText("4");
		boton4.setFont(new Font("Arial",Font.PLAIN,18));
		boton4.setBackground(Color.GRAY);
		boton4.setForeground(Color.white);
		boton4.setBounds(5, 289, 90, 60);
		calculadora.add(boton4);
		//Boton 1
		JButton boton5 = new JButton();
		boton5.setText("1");
		boton5.setFont(new Font("Arial",Font.PLAIN,18));
		boton5.setBackground(Color.GRAY);
		boton5.setForeground(Color.white);
		boton5.setBounds(5, 352, 90, 60);
		calculadora.add(boton5);
		//Boton +/_
		JButton boton6 = new JButton();
		boton6.setText("+/_");
		boton6.setFont(new Font("Arial",Font.PLAIN,18));
		boton6.setBackground(Color.GRAY);
		boton6.setForeground(Color.white);
		boton6.setBounds(5, 415, 90, 60);
		calculadora.add(boton6);
		//Boton CE
		JButton boton7 = new JButton();
		boton7.setText("CE");
		boton7.setFont(new Font("Arial",Font.PLAIN,18));
		boton7.setBackground(Color.DARK_GRAY);
		boton7.setForeground(Color.white);
		boton7.setBounds(98, 100, 90, 60);
		calculadora.add(boton7);
		//Boton x²
		JButton boton8 = new JButton();
		boton8.setText("x²");
		boton8.setFont(new Font("Arial",Font.PLAIN,18));
		boton8.setBackground(Color.DARK_GRAY);
		boton8.setForeground(Color.white);
		boton8.setBounds(98, 163, 90, 60);
		calculadora.add(boton8);
		//Boton 8
		JButton boton9 = new JButton();
		boton9.setText("8");
		boton9.setFont(new Font("Arial",Font.PLAIN,18));
		boton9.setBackground(Color.GRAY);
		boton9.setForeground(Color.white);
		boton9.setBounds(98, 226, 90, 60);
		calculadora.add(boton9);
		//Boton 5
		JButton boton10 = new JButton();
		boton10.setText("5");
		boton10.setFont(new Font("Arial",Font.PLAIN,18));
		boton10.setBackground(Color.GRAY);
		boton10.setForeground(Color.white);
		boton10.setBounds(98, 289, 90, 60);
		calculadora.add(boton10);
		//Boton 2
		JButton boton11 = new JButton();
		boton11.setText("2");
		boton11.setFont(new Font("Arial",Font.PLAIN,18));
		boton11.setBackground(Color.GRAY);
		boton11.setForeground(Color.white);
		boton11.setBounds(98, 352, 90, 60);
		calculadora.add(boton11);
		//Boton 0
		JButton boton12 = new JButton();
		boton12.setText("0");
		boton12.setFont(new Font("Arial",Font.PLAIN,18));
		boton12.setBackground(Color.GRAY);
		boton12.setForeground(Color.white);
		boton12.setBounds(98, 415, 90, 60);
		calculadora.add(boton12);
		//Boton C
		JButton boton13 = new JButton();
		boton13.setText("C");
		boton13.setFont(new Font("Arial",Font.PLAIN,18));
		boton13.setBackground(Color.DARK_GRAY);
		boton13.setForeground(Color.white);
		boton13.setBounds(191, 100, 90, 60);
		calculadora.add(boton13);
		//Boton ²√x
		JButton boton14 = new JButton();
		boton14.setText("²√x");
		boton14.setFont(new Font("Arial",Font.PLAIN,18));
		boton14.setBackground(Color.DARK_GRAY);
		boton14.setForeground(Color.white);
		boton14.setBounds(191, 163, 90, 60);
		calculadora.add(boton14);
		//Boton 9
		JButton boton15 = new JButton();
		boton15.setText("9");
		boton15.setFont(new Font("Arial",Font.PLAIN,18));
		boton15.setBackground(Color.GRAY);
		boton15.setForeground(Color.white);
		boton15.setBounds(191, 226, 90, 60);
		calculadora.add(boton15);
		//Boton 6
		JButton boton16 = new JButton();
		boton16.setText("6");
		boton16.setFont(new Font("Arial",Font.PLAIN,18));
		boton16.setBackground(Color.GRAY);
		boton16.setForeground(Color.white);
		boton16.setBounds(191, 289, 90, 60);
		calculadora.add(boton16);
		//Boton 3
		JButton boton17 = new JButton();
		boton17.setText("3");
		boton17.setFont(new Font("Arial",Font.PLAIN,18));
		boton17.setBackground(Color.GRAY);
		boton17.setForeground(Color.white);
		boton17.setBounds(191, 352, 90, 60);
		calculadora.add(boton17);
		//Boton .
		JButton boton18 = new JButton();
		boton18.setText(".");
		boton18.setFont(new Font("Arial",Font.PLAIN,18));
		boton18.setBackground(Color.GRAY);
		boton18.setForeground(Color.white);
		boton18.setBounds(191, 415, 90, 60);
		calculadora.add(boton18);
		//Boton [ × ] Borrar
		JButton boton19 = new JButton();
		boton19.setText("[ × ]");
		boton19.setFont(new Font("Arial",Font.PLAIN,18));
		boton19.setBackground(Color.DARK_GRAY);
		boton19.setForeground(Color.RED);
		boton19.setBounds(284, 100, 90, 60);
		calculadora.add(boton19);
		//Boton ÷
		JButton boton20 = new JButton();
		boton20.setText("÷");
		boton20.setFont(new Font("Arial",Font.PLAIN,18));
		boton20.setBackground(Color.DARK_GRAY);
		boton20.setForeground(Color.white);
		boton20.setBounds(284, 163, 90, 60);
		calculadora.add(boton20);
		//Boton X
		JButton boton21 = new JButton();
		boton21.setText("x");
		boton21.setFont(new Font("Arial",Font.PLAIN,18));
		boton21.setBackground(Color.DARK_GRAY);
		boton21.setForeground(Color.white);
		boton21.setBounds(284, 226, 90, 60);
		calculadora.add(boton21);
		//Boton -
		JButton boton22 = new JButton();
		boton22.setText("-");
		boton22.setFont(new Font("Arial",Font.PLAIN,18));
		boton22.setBackground(Color.DARK_GRAY);
		boton22.setForeground(Color.white);
		boton22.setBounds(284, 289, 90, 60);
		calculadora.add(boton22);
		//Boton +
		JButton boton23 = new JButton();
		boton23.setText("+");
		boton23.setFont(new Font("Arial",Font.PLAIN,18));
		boton23.setBackground(Color.DARK_GRAY);
		boton23.setForeground(Color.white);
		boton23.setBounds(284, 352, 90, 60);
		calculadora.add(boton23);
		//Boton =
		JButton boton24 = new JButton();
		boton24.setText("=");
		boton24.setFont(new Font("Arial",Font.PLAIN,18));
		boton24.setBackground(Color.PINK);
		boton24.setForeground(Color.DARK_GRAY);
		boton24.setBounds(284, 415, 90, 60);
		calculadora.add(boton24);
		
		
//		JLabel linea = new JLabel();
//		linea.setBounds(5, 10, 370, 87);
//		linea.setOpaque(true);
//		linea.setBackground(Color.black);
//		calculadora.add(linea);
		
		JLabel linea2 = new JLabel();
		linea2.setBounds(5, 94, 370, 2);
		linea2.setOpaque(true);
		linea2.setBackground(Color.WHITE);
		calculadora.add(linea2);
		
		JLabel linea3 = new JLabel();
		linea3.setBounds(5, 44, 370, 2);
		linea3.setOpaque(true);
		linea3.setBackground(Color.WHITE);
		calculadora.add(linea3);
		
		JLabel linea4 = new JLabel();
		linea4.setBounds(5, 44, 2, 50);
		linea4.setOpaque(true);
		linea4.setBackground(Color.WHITE);
		calculadora.add(linea4);
		
		JLabel linea5 = new JLabel();
		linea5.setBounds(373, 44, 2, 50);
		linea5.setOpaque(true);
		linea5.setBackground(Color.WHITE);
		calculadora.add(linea5);
		
		
		
		
		
		this.repaint();
	}
	
}
