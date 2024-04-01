import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class examenUnidad2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField marcoFondo;
	private JTextField textField_1;
	private JTextField txtCalle;
	private JTextField txtJhonDoe;
	private JTextField textField_2;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTable table;
	private JTable table_1;
	private JTextField textField_3;
	private JTextField textField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					examenUnidad2 frame = new examenUnidad2();
					frame.setVisible(true);
					frame.setLocationRelativeTo( null );
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public examenUnidad2() {
		setResizable(false);
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 634);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelTitulo = new JPanel();
		panelTitulo.setBackground(new Color(0, 101, 153));
		panelTitulo.setForeground(new Color(255, 255, 255));
		contentPane.add(panelTitulo, BorderLayout.NORTH);
		panelTitulo.setLayout(new GridLayout(4, 1, 40, 0));
		
		JLabel lblNewLabel_2 = new JLabel("");
		panelTitulo.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("     Factura en Java - NetBeans - ArrayList y POO");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		panelTitulo.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("          [Sin Base de datos]");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		panelTitulo.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		panelTitulo.add(lblNewLabel_2_1);
		
		JPanel panelColorAbajo = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panelColorAbajo.getLayout();
		flowLayout.setHgap(0);
		flowLayout.setVgap(0);
		panelColorAbajo.setBackground(new Color(0, 101, 153));
		contentPane.add(panelColorAbajo, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_4 = new JLabel(" ");
		panelColorAbajo.add(lblNewLabel_4);
		
		JPanel panelCentral = new JPanel();
		panelCentral.setBackground(new Color(255, 255, 255));
		contentPane.add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(new GridLayout(4, 0, 0, 0));
		
		JPanel panelDatosCliente = new JPanel();
		panelDatosCliente.setBackground(new Color(255, 255, 255));
		panelCentral.add(panelDatosCliente);
		panelDatosCliente.setLayout(null);
		
		
		JLabel labelDocumento = new JLabel("Documento:");
		labelDocumento.setBounds(35, 36, 74, 14);
		panelDatosCliente.add(labelDocumento);
		
		JLabel labelDireccion = new JLabel("Dirección:");
		labelDireccion.setBounds(35, 76, 74, 14);
		panelDatosCliente.add(labelDireccion);
		
		textField_1 = new JTextField();
		textField_1.setText("123456");
		textField_1.setBounds(114, 36, 110, 20);
		panelDatosCliente.add(textField_1);
		textField_1.setColumns(10);
		
		txtCalle = new JTextField();
		txtCalle.setText("Calle 1 # 123");
		txtCalle.setBounds(114, 74, 110, 20);
		panelDatosCliente.add(txtCalle);
		txtCalle.setColumns(10);
		
		JLabel labelNombres = new JLabel("Nombres:");
		labelNombres.setBounds(258, 36, 74, 14);
		panelDatosCliente.add(labelNombres);
		
		JLabel labelTelefono = new JLabel("Teléfono:");
		labelTelefono.setBounds(258, 76, 74, 14);
		panelDatosCliente.add(labelTelefono);
		
		txtJhonDoe = new JTextField();
		txtJhonDoe.setText("Jhon Doe");
		txtJhonDoe.setColumns(10);
		txtJhonDoe.setBounds(348, 36, 166, 20);
		panelDatosCliente.add(txtJhonDoe);
		
		textField_2 = new JTextField();
		textField_2.setText("5554433");
		textField_2.setColumns(10);
		textField_2.setBounds(348, 74, 166, 20);
		panelDatosCliente.add(textField_2);
		
		JLabel labelDatosCliente = new JLabel("Datos del cliente");
		labelDatosCliente.setBackground(new Color(255, 255, 255));
		labelDatosCliente.setBounds(20, 11, 98, 14);
		labelDatosCliente.setOpaque(true);
		panelDatosCliente.add(labelDatosCliente);
		
		marcoFondo = new JTextField();
		marcoFondo.setBackground(new Color(255, 255, 255));
		marcoFondo.setEnabled(false);
		marcoFondo.setEditable(false);
		marcoFondo.setBounds(10, 19, 524, 93);
		panelDatosCliente.add(marcoFondo);
		marcoFondo.setColumns(10);
		
		JPanel panelDatosFactura = new JPanel();
		panelDatosFactura.setBackground(new Color(255, 255, 255));
		panelCentral.add(panelDatosFactura);
		panelDatosFactura.setLayout(null);
		
		JLabel labelNoFactura = new JLabel("N° Factura:");
		labelNoFactura.setBounds(20, 35, 74, 14);
		panelDatosFactura.add(labelNoFactura);
		
		JLabel labelFecha = new JLabel("Fecha:");
		labelFecha.setBounds(268, 35, 74, 14);
		panelDatosFactura.add(labelFecha);
		
		JLabel labelDatosFactura = new JLabel("Datos de factura");
		labelDatosFactura.setOpaque(true);
		labelDatosFactura.setBackground(Color.WHITE);
		labelDatosFactura.setBounds(20, 0, 98, 14);
		panelDatosFactura.add(labelDatosFactura);
		
		JLabel label = new JLabel("1");
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setBounds(115, 35, 27, 14);
		panelDatosFactura.add(label);
		
		JLabel label_1 = new JLabel("2021/50/21");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1.setBounds(356, 35, 98, 14);
		panelDatosFactura.add(label_1);
		
		textField_6 = new JTextField();
		textField_6.setEnabled(false);
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBackground(Color.WHITE);
		textField_6.setBounds(10, 8, 524, 70);
		panelDatosFactura.add(textField_6);
		
		JButton btnNewButton_2 = new JButton("Ver listado de facturas");
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBounds(57, 85, 165, 23);
		Border emptyBorder = BorderFactory.createEmptyBorder();
		btnNewButton_2.setBorder(emptyBorder);
		panelDatosFactura.add(btnNewButton_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("");
		lblNewLabel_3_2.setIcon(new ImageIcon("C:\\Users\\David\\eclipse-workspace\\Cuarto Semestre\\Test\\src\\hamburger.png"));
		lblNewLabel_3_2.setBounds(20, 82, 32, 32);
		panelDatosFactura.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("");
		lblNewLabel_3_1_2.setIcon(new ImageIcon("C:\\Users\\David\\eclipse-workspace\\Cuarto Semestre\\Test\\src\\plus.png"));
		lblNewLabel_3_1_2.setBounds(352, 90, 16, 16);
		panelDatosFactura.add(lblNewLabel_3_1_2);
		
		JButton btnNewButton_1_2 = new JButton("Añadir");
		btnNewButton_1_2.setBackground(Color.WHITE);
		btnNewButton_1_2.setBounds(372, 85, 56, 23);
		btnNewButton_1_2.setBorder(emptyBorder);
		panelDatosFactura.add(btnNewButton_1_2);
		btnNewButton_1_2.addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
//            	System.out.println("Hola");
            	
            	JFrame panelAniadirProducto = new JFrame();
            	panelAniadirProducto.setSize(450, 300);
            	panelAniadirProducto.setBackground(new Color(255, 255, 255));
            	panelAniadirProducto.setLocationRelativeTo( null );
            	panelAniadirProducto.setLayout(new BorderLayout(0, 0));
        		setContentPane(contentPane);
            	panelAniadirProducto.setVisible(true);
            	
            	JPanel panelEncabezado = new JPanel();
            	panelEncabezado.setBackground(new Color(0, 101, 153));
            	panelEncabezado.setForeground(new Color(255, 255, 255));
            	panelEncabezado.setBorder(new EmptyBorder(5, 5, 5, 5));
            	panelAniadirProducto.add(panelEncabezado, BorderLayout.NORTH);
        		panelEncabezado.setLayout(new GridLayout(3, 1, 40, 0));
            	
        		JLabel labelAniadirProducto = new JLabel("    Añadir nuevo producto");
        		
        		labelAniadirProducto.setFont(new Font("Tahoma", Font.BOLD, 12));
        		labelAniadirProducto.setForeground(new Color(255, 255, 255));
        		panelEncabezado.add(labelAniadirProducto);
        		
        		JPanel panelCentral = new JPanel();
        		panelCentral.setBackground(new Color(255, 255, 255));
        		panelCentral.setForeground(new Color(255, 255, 255));
        		panelCentral.setBorder(new EmptyBorder(5, 5, 5, 5));
        		panelCentral.setLayout(null);
            	panelAniadirProducto.add(panelCentral);
            	
            	JLabel nombreProducto = new JLabel("Nombre: ");
            	nombreProducto.setBounds(40, 30, 70, 15);
            	nombreProducto.setFont(new Font("Tahoma", Font.PLAIN, 12));
            	panelCentral.add(nombreProducto);

            	JLabel labelCantidad = new JLabel("Cantidad: ");
            	labelCantidad.setBounds(40, 75, 70, 15);
            	labelCantidad.setFont(new Font("Tahoma", Font.PLAIN, 12));
            	panelCentral.add(labelCantidad);
            	
            	JLabel labelValor = new JLabel("Valor: ");
            	labelValor.setBounds(40, 120, 70, 15);
            	labelValor.setFont(new Font("Tahoma", Font.PLAIN, 12));
            	panelCentral.add(labelValor);
            	
            	JTextField txtNombre = new JTextField();
            	txtNombre.setBounds(120, 30, 275, 25);
            	txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
            	panelCentral.add(txtNombre);
            	
            	JTextField txtCantidad = new JTextField();
            	txtCantidad.setBounds(120, 75, 175, 25);
            	txtCantidad.setFont(new Font("Tahoma", Font.PLAIN, 12));
            	panelCentral.add(txtCantidad);
            	
            	JTextField txtValor = new JTextField();
            	txtValor.setBounds(120, 120, 175, 25);
            	txtValor.setFont(new Font("Tahoma", Font.PLAIN, 12));
            	panelCentral.add(txtValor);
            	
            	JButton botonAgregar = new JButton("Agregar");
            	botonAgregar.setBounds(120, 160, 82, 25);
            	botonAgregar.setFont(new Font("Tahoma", Font.PLAIN, 12));
            	panelCentral.add(botonAgregar);
            	
            	JButton botonCerrar = new JButton("Cerrar");
            	botonCerrar.setBounds(211, 160, 82, 25);
            	botonCerrar.setFont(new Font("Tahoma", Font.PLAIN, 12));
            	panelCentral.add(botonCerrar);
            	
            	JPanel panelSur = new JPanel();
            	panelSur.setBackground(new Color(0, 101, 153));
            	panelSur.setForeground(new Color(255, 255, 255));
            	panelSur.setBorder(new EmptyBorder(5, 5, 5, 5));
            	panelAniadirProducto.add(panelSur, BorderLayout.SOUTH);
            	panelSur.setLayout(new GridLayout(3, 1, 40, 0));
            	
            }
        });
		
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("");
		lblNewLabel_3_1_1_1.setIcon(new ImageIcon("C:\\Users\\David\\eclipse-workspace\\Cuarto Semestre\\Test\\src\\remove.png"));
		lblNewLabel_3_1_1_1.setBounds(438, 90, 16, 16);
		panelDatosFactura.add(lblNewLabel_3_1_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Eliminar");
		btnNewButton_1_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1_1.setBounds(458, 85, 56, 23);
		btnNewButton_1_1_1.setBorder(emptyBorder);
		panelDatosFactura.add(btnNewButton_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setEnabled(false);
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBackground(Color.WHITE);
		textField_3.setBounds(10, 80, 524, 35);
		panelDatosFactura.add(textField_3);
		
		
		JPanel panelTabla = new JPanel();
		panelTabla.setBackground(new Color(255, 255, 255));
		panelCentral.add(panelTabla);
		panelTabla.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 0, 524, 101);
		panelTabla.add(scrollPane);
		
		table_1 = new JTable();
		table_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"Agua", "2", "500", "1000.0"},
				{"Cereal", "5", "1000", "5000.0"},
				{"Leche", "2", "300", "600.0"},
			},
			new String[] {
				"Producto", "Cantidad", "Valor", "Sub Total"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		
		
		//no sabía cómo hacer que se seleccionara una columna al iniciar el programa, hice una busqueda simplemente para que se viera un poquito mejor
		//https://stackoverflow.com/questions/8661251/programmatically-select-a-row-in-jtable
		table_1.setRowSelectionInterval(2, 2);

		table_1.getColumnModel().getColumn(0).setResizable(false);
		table_1.getColumnModel().getColumn(1).setResizable(false);
		table_1.getColumnModel().getColumn(2).setResizable(false);
		table_1.getColumnModel().getColumn(3).setResizable(false);
		scrollPane.setViewportView(table_1);
		
		JPanel panelInferior = new JPanel();
		panelCentral.add(panelInferior);
		panelInferior.setLayout(new BorderLayout(0, 0));
		
		JPanel panelBotonesFinalizar = new JPanel();
		panelBotonesFinalizar.setBackground(new Color(255, 255, 255));
		panelInferior.add(panelBotonesFinalizar, BorderLayout.SOUTH);
		panelBotonesFinalizar.setLayout(new GridLayout(0, 4, 5, 0));
		
		JLabel lblNewLabel_3 = new JLabel(" ");
		lblNewLabel_3.setBackground(new Color(255, 255, 255));
		panelBotonesFinalizar.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel(" ");
		lblNewLabel_3_1.setBackground(Color.WHITE);
		panelBotonesFinalizar.add(lblNewLabel_3_1);
		
		JButton btnNewButton = new JButton("Finalizar factura");
		panelBotonesFinalizar.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
//            	System.out.println("Hola");
            	JOptionPane.showMessageDialog(null, "La factura se ha realizado con éxito!", "Información", JOptionPane.INFORMATION_MESSAGE);
            }
        });
		
		JButton btnNewButton_1 = new JButton("Limpiar");
		panelBotonesFinalizar.add(btnNewButton_1);
		
		
		JPanel panelTotalFactura = new JPanel();
		panelTotalFactura.setBackground(new Color(255, 255, 255));
		panelInferior.add(panelTotalFactura, BorderLayout.CENTER);
		panelTotalFactura.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(20, 0, 214, 89);
		panelTotalFactura.add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 5));
		
		JLabel lblNewLabel_5 = new JLabel("  SubTotal: ");
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("6600.0");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("% Descuento:");
		panel.add(lblNewLabel_7);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(1, 0, 0, 0));
		
		textField = new JTextField();
		textField.setText("5");
		panel_2.add(textField);
		textField.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setSelected(true);
		chckbxNewCheckBox.setBackground(new Color(255, 255, 255));
		panel_2.add(chckbxNewCheckBox);
		
		
		JLabel lblNewLabel_9 = new JLabel("IVA 19%");
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("1254.0");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_9_1 = new JLabel("Total Factura: ");
		panel.add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_10_1 = new JLabel("1254.0");
		lblNewLabel_10_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel.add(lblNewLabel_10_1);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(234, 21, 255, 26);
		panelTotalFactura.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel_8 = new JLabel("Valor descontado:");
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_8_1 = new JLabel("330.0");
		lblNewLabel_8_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_1.add(lblNewLabel_8_1);
		
	}
}