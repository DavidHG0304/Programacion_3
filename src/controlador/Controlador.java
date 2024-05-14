package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import modelo.Modelo;
import vista.Vista;

public class Controlador implements ActionListener{
	
	public Vista nuevaVista;
	public Modelo nuevoModelo;
	public boolean sesionIniciada;
	
	//Constructor del controlador donde se inicializan lo que se va a necesitar
	public Controlador() {
		this.nuevaVista = new Vista();
		this.nuevoModelo = new Modelo();
		nuevaVista.asignarActListner(this);
		
	}
	
	//Metodo para llamar la vista de login
	public void login() {
		nuevaVista.login();
	}
	
	//Metodo validacion Login FALSO
	public void accionLogin() {
		sesionIniciada = nuevoModelo.accionLogin(nuevaVista.getTxtCorreo().getText(), new String (nuevaVista.getTxtContrasenia().getPassword()));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		switch(e.getActionCommand()){
		case "IniciarSesion":
			accionLogin();
			if(sesionIniciada) {
				nuevaVista.getFrame().dispose();
			}
			break;
//		case "Registrarse":
//			accionLogin();
//			if(sesionIniciada) {
//				nuevaVista.getFrame().dispose();
//			}
//			break;
		}
	}
}
