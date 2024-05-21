package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.SwingWorker;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.formdev.flatlaf.FlatLightLaf;

import modelo.Modelo;
import modelo.entidades.Vehiculo;
import vista.Vista;
import vista.VistaPanelCategorias;
import vista.VistaPanelClientes;
import vista.VistaPanelInicio;
import vista.VistaPanelMarcas;
import vista.VistaPanelRentas;
import vista.VistaPanelVehiculos;
import vista.VistaRegistro;
import vista.AccionesListeners.ListenersLogin;
import vista.AccionesListeners.ListenersRegistro;
import vista.AccionesListeners.MetodosLog_Reg;
import vista.componentes.PanelesNavegacion;


public class Controlador implements ActionListener{
	
	public Vista nuevaVista;
	public VistaRegistro vistaRegistro;
	public VistaPanelInicio panelInicio;
	public VistaPanelMarcas panelMarcas;
	public VistaPanelCategorias panelCategorias;
	public VistaPanelVehiculos panelVehiculos;
	public VistaPanelClientes panelClientes;
	public VistaPanelRentas panelRentas;
	
	public PanelesNavegacion panelesNavegacion;
	
	public MetodosLog_Reg metodos;
	public Modelo nuevoModelo;
	public ListenersLogin accionesLogin;
	public ListenersRegistro accionesRegistro;
	public boolean sesionIniciada;
	public boolean usuarioRegistrado;
	
	// Constructor del controlador donde se inicializan lo que se va a necesitar
	public Controlador()  {
		// Instanciar vistas
		this.nuevaVista = new Vista();
		this.nuevoModelo = new Modelo();
		this.accionesLogin = new ListenersLogin(nuevaVista);
		this.metodos = new MetodosLog_Reg();
		nuevaVista.asignarActListner(this);
	}
	
	// Metodos para llamar las vistas
	public void login() {
		FlatLightLaf.setup();
		try {
			UIManager.setLookAndFeel("com.formdev.flatlaf.intellijthemes.FlatCyanLightIJTheme");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		nuevaVista.login();
	}
	
	public void registro() {
		this.vistaRegistro = new VistaRegistro();
		this.accionesRegistro = new ListenersRegistro(vistaRegistro);
		vistaRegistro.asignarActListner(this);
		vistaRegistro.registro();
	}
	
	public void panelPrincipal() {
		this.panelInicio = new VistaPanelInicio();
		panelInicio.panelPrincipal();
		panelInicio.asignarActListner(this);
	}
	
	public void marcas() {
		this.panelMarcas = new VistaPanelMarcas();
		panelMarcas.marcas();
		panelMarcas.asignarActListner(this);
	}
	
	public void categorias() {
		this.panelCategorias = new VistaPanelCategorias();
		panelCategorias.categorias();
		panelCategorias.asignarActListner(this);
	}
	public void rentas() {
		this.panelRentas = new VistaPanelRentas();
		panelRentas.rentas();
		panelRentas.asignarActListner(this);
	}
	
	public void vehiculos() {
		this.panelVehiculos = new VistaPanelVehiculos();
		panelVehiculos.panelVehiculos();
		panelVehiculos.asignarActListner(this);
		cargarVehiculos();
	}
	public void clientes() {
		this.panelClientes = new VistaPanelClientes();
		panelClientes.clientes();
		panelClientes.asignarActListner(this);
	}
	
	
	
	public void cargarVehiculos() {
        SwingWorker<ArrayList<Vehiculo>, Void> worker = new SwingWorker<ArrayList<Vehiculo>, Void>() {
            @Override
            protected ArrayList<Vehiculo> doInBackground() throws Exception {
                ArrayList<Vehiculo> vehiculos = nuevoModelo.obtenerVehiculos();
                nuevoModelo.obtenerImagenesVehiculos(vehiculos);
                return vehiculos;
            }

            @Override
            protected void done() {
                try {
                    ArrayList<Vehiculo> vehiculos = get();
                    panelVehiculos.mostrarVehiculos(vehiculos);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        worker.execute();
    }
	
	// Metodo validacion Login
	public void accionLogin() {
		if(metodos.loginValidado(new String (nuevaVista.getTxtContrasenia().getPassword()), nuevaVista.getTxtCorreo(), nuevaVista.getTxtContrasenia())) {
			sesionIniciada = nuevoModelo.accionLogin(nuevaVista.getTxtCorreo().getText(),new String (nuevaVista.getTxtContrasenia().getPassword()));
		}
		metodos.loginNoValido(new String (nuevaVista.getTxtContrasenia().getPassword()),nuevaVista.getTxtCorreo(), nuevaVista.getTxtContrasenia());
	}	
	
	// Metodo validacion Registro
	public void accionRegistro() {
		if(metodos.registroValido(new String(vistaRegistro.getTxtContrasenia().getPassword()), new String(vistaRegistro.getConfirmarContrasenia().getPassword()),  vistaRegistro.getNombre(), vistaRegistro.getApellidos(), vistaRegistro.getTxtCorreo(), vistaRegistro.getTxtContrasenia(), vistaRegistro.getConfirmarContrasenia())){
			usuarioRegistrado = nuevoModelo.accionRegistro(vistaRegistro.getNombre().getText(), vistaRegistro.getApellidos().getText(), vistaRegistro.getTxtCorreo().getText(), new String(vistaRegistro.getTxtContrasenia().getPassword()), new String(vistaRegistro.getConfirmarContrasenia().getPassword()));
		}
//		metodos.registroNoValido(vistaRegistro.getNombre(), vistaRegistro.getApellidos(), vistaRegistro.getTxtCorreo(), vistaRegistro.getTxtContrasenia(), vistaRegistro.getConfirmarContrasenia());
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method s
		switch (e.getActionCommand()) {
		
		// Acciones Login - Registro
		case "Iniciar":
			// System.out.println("Hola");
			accionLogin();
//			if (sesionIniciada) {
//				nuevaVista.getFrame().dispose();
//				panelPrincipal();
//			}
			nuevaVista.getFrame().dispose();
			panelPrincipal();
			break;
		case "Crear Cuenta":
			accionRegistro();
			if(usuarioRegistrado) {
				vistaRegistro.getFrame().dispose();
			}
			break;
			
		// Acciones Registro
		case "Registrarse":
			// System.out.println("Registro");
			nuevaVista.getFrame().dispose();
			registro();
			break;
		case "Iniciar Sesion":
			// System.out.println("Hola");
			vistaRegistro.getFrame().dispose();
			nuevaVista.getFrame().setVisible(true);
			break;
			
		// Acciones Botones PaginaPrincipal
		case "Marcas pInicial":
			panelInicio.getFrame().dispose();
			marcas();
			break;
		case "Categorias pInicial":
			panelInicio.getFrame().dispose();
			categorias();
			break;
		case "Rentas pInicial":
			panelInicio.getFrame().dispose();
			rentas();
			break;
		case "Vehiculos pInicial":
			panelInicio.getFrame().dispose();
			vehiculos();
			break;
		case "Clientes pInicial":
			panelInicio.getFrame().dispose();
			clientes();
			break;
		case "Cerrar Sesión pInicial":
			panelInicio.getFrame().dispose();
			nuevaVista.getFrame().setVisible(true);
			break;
			
		// Acciones Botones Panel Marcas
		case "Inicio pMarcas":
			panelMarcas.getFrame().dispose();
			panelPrincipal();
			break;
		case "Categorias pMarcas":
			panelMarcas.getFrame().dispose();
			categorias();
			break;
		case "Rentas pMarcas":
			panelMarcas.getFrame().dispose();
			rentas();
			break;
		case "Vehiculos pMarcas":
			panelMarcas.getFrame().dispose();
			vehiculos();
			break;
		case "Clientes pMarcas":
			panelMarcas.getFrame().dispose();
			clientes();
			break;
		case "Cerrar Sesión pMarcas":
			panelMarcas.getFrame().dispose();
			nuevaVista.getFrame().setVisible(true);
			break;
			
		// Acciones Botones Panel Categorias
		case "Inicio pCategorias":
			panelCategorias.getFrame().dispose();
			panelPrincipal();
			break;
		case "Marcas pCategorias":
			panelCategorias.getFrame().dispose();
			marcas();
			break;
		case "Rentas pCategorias":
			panelCategorias.getFrame().dispose();
			rentas();
			break;
		case "Vehiculos pCategorias":
			panelCategorias.getFrame().dispose();
			vehiculos();
			break;
		case "Clientes pCategorias":
			panelCategorias.getFrame().dispose();
			clientes();
			break;
		case "Cerrar Sesión pCategorias":
			panelCategorias.getFrame().dispose();
			nuevaVista.getFrame().setVisible(true);
			break;
			
			// Acciones Botones Panel Rentas
		case "Inicio pRentas":
			panelRentas.getFrame().dispose();
			panelPrincipal();
			break;
		case "Marcas pRentas":
			panelRentas.getFrame().dispose();
			marcas();
			break;
		case "Categorias pRentas":
			panelRentas.getFrame().dispose();
			categorias();
			break;
		case "Vehiculos pRentas":
			panelRentas.getFrame().dispose();
			vehiculos();
			break;
		case "Clientes pRentas":
			panelRentas.getFrame().dispose();
			clientes();
			break;
		case "Cerrar Sesión pRentas":
			panelRentas.getFrame().dispose();
			nuevaVista.getFrame().setVisible(true);
			break;
			
		// Acciones Botones Panel Vehiculos
		case "Inicio pVehiculos":
			panelVehiculos.getFrame().dispose();
			panelPrincipal();
			break;
		case "Marcas pVehiculos":
			panelVehiculos.getFrame().dispose();
			marcas();
			break;
		case "Categorias pVehiculos":
			panelVehiculos.getFrame().dispose();
			categorias();
			break;
		case "Rentas pVehiculos":
			panelVehiculos.getFrame().dispose();
			rentas();
			break;
		case "Clientes pVehiculos":
			panelVehiculos.getFrame().dispose();
			clientes();
			break;
		case "Cerrar Sesión pVehiculos":
			panelVehiculos.getFrame().dispose();
			nuevaVista.getFrame().setVisible(true);
			break;
			
			
		// Acciones Botones Panel Clientes
		case "Inicio pClientes":
			panelClientes.getFrame().dispose();
			panelPrincipal();
			break;
		case "Marcas pClientes":
			panelClientes.getFrame().dispose();
			marcas();
			break;
		case "Categorias pClientes":
			panelClientes.getFrame().dispose();
			categorias();
			break;
		case "Rentas pClientes":
			panelClientes.getFrame().dispose();
			rentas();
			break;
		case "Vehiculos pClientes":
			panelClientes.getFrame().dispose();
			vehiculos();
			break;
		case "Cerrar Sesión pClientes":
			panelClientes.getFrame().dispose();
			nuevaVista.getFrame().setVisible(true);
			break;
		
		// Acciones Clientes
		}
		
	}
}