package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Modelo;
import vista.Vista;

public class Controlador implements ActionListener{
	
	public Vista nuevaVista;
	public Modelo nuevoModelo;
	public ControladorTXT controladorTXT;
	public boolean sesionIniciada;
	
	// Constructor del controlador donde se inicializan lo que se va a necesitar
	public Controlador()  {
		this.nuevaVista = new Vista();
		this.nuevoModelo = new Modelo();
		this.controladorTXT = new ControladorTXT(nuevaVista);
		nuevaVista.asignarActListner(this);
	}
	
	// Metodo para llamar la vista de login
	public void login() {
		nuevaVista.login();
	}
	
	// Metodo validacion Login FALSO
	public void accionLogin() {
		sesionIniciada = nuevoModelo.accionLogin(nuevaVista.getTxtCorreo().getText(), new String (nuevaVista.getTxtContrasenia().getPassword()), nuevaVista.getTxtCorreo(), nuevaVista.getTxtContrasenia());
	}	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method s
		switch (e.getActionCommand()) {
		case "Iniciar":
			// System.out.println("Hola");
			accionLogin();
			if (sesionIniciada) {
				nuevaVista.getFrame().dispose();
			}
			break;			
		}
	}
}
