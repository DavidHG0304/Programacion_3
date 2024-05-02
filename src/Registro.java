import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro frame = new Registro();
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
	public Registro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 507, 613);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Usuarios");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Login");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Register");
		mnNewMenu.add(mntmNewMenuItem_1);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelRegistro = new JPanel();
		panelRegistro.setBackground(new Color(85, 0, 170));
		contentPane.add(panelRegistro, BorderLayout.CENTER);
		panelRegistro.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registrarse");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 31));
		lblNewLabel.setForeground(new Color(247, 210, 9));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(109, 84, 271, 54);
		panelRegistro.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ingresa tu nombre");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(85, 159, 105, 14);
		panelRegistro.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(85, 174, 149, 28);
		panelRegistro.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(242, 174, 138, 28);
		panelRegistro.add(textField_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ingresa tu apellido");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setBounds(275, 159, 105, 14);
		panelRegistro.add(lblNewLabel_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(109, 240, 237, 28);
		panelRegistro.add(textField_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("Correo electrónico");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setBounds(109, 224, 105, 14);
		panelRegistro.add(lblNewLabel_1_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(109, 304, 237, 28);
		panelRegistro.add(passwordField);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Contraseña");
		lblNewLabel_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1.setBounds(109, 289, 105, 14);
		panelRegistro.add(lblNewLabel_1_2_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(109, 365, 237, 28);
		panelRegistro.add(passwordField_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Confirmar contraseña");
		lblNewLabel_1_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1_1.setBounds(109, 350, 105, 14);
		panelRegistro.add(lblNewLabel_1_2_1_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Acepto los términos y condiciones, vendo mi alma al diablo.");
		chckbxNewCheckBox.setForeground(new Color(255, 255, 255));
		chckbxNewCheckBox.setBounds(85, 413, 330, 42);
		chckbxNewCheckBox.setOpaque(false);
		
		panelRegistro.add(chckbxNewCheckBox);
		
		JButton btnNewButton = new JButton("Registrarse");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(new Color(237, 198, 107));
		btnNewButton.setBounds(162, 474, 149, 28);
		panelRegistro.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String contrasenia = new String(passwordField.getPassword());
				String contraseniaConfirmar= new String(passwordField_1.getPassword());
				if((contrasenia.equals(contraseniaConfirmar))&&(!contrasenia.equals(""))&&(contrasenia.length() >=8 && contraseniaConfirmar.length() >= 8)) {
					JOptionPane.showMessageDialog(null, "Success", "Se ha registrado con exito", JOptionPane.INFORMATION_MESSAGE);
				}else if(contrasenia.isEmpty() && contraseniaConfirmar.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Escriba una contraseña", "Alerta", JOptionPane.WARNING_MESSAGE);
				}else if(contrasenia.length() < 8 && contraseniaConfirmar.length() < 8) {
					JOptionPane.showMessageDialog(null, "Su contraseña debe ser mayor a 8 caracteres", "Error", JOptionPane.ERROR_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
	}
}
