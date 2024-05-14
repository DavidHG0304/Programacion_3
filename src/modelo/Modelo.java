package modelo;

import javax.swing.JOptionPane;

//Aqui se haran todas las validaciones para poder hacer las acciones en base a la base
//De datos y todo eso

public class Modelo {

	public Modelo() {
		
	}
	
	public boolean accionLogin(String correoElectronico, String contrasenia) {
		
		if(correoElectronico.equals("") && contrasenia.equals("")) {
			JOptionPane.showMessageDialog(null, "Rellene los campos", "Acceso Denegado", JOptionPane.ERROR_MESSAGE);
		}else if(correoElectronico.equals("David") && contrasenia.equals("123")) {
			JOptionPane.showMessageDialog(null, "Ha ingresado a su cuenta", "Bienvenido", JOptionPane.INFORMATION_MESSAGE);
			return true;
		}else {
			JOptionPane.showMessageDialog(null, "Datos Incorrectos", "Acceso Denegado", JOptionPane.ERROR_MESSAGE);
		}
		return false;
		
	}
	
}
