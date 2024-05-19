package vista.AccionesListeners;

import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import vista.recursos.componentesPersonalizados.*;

public class MetodosLog_Reg {
	
	
	public MetodosLog_Reg () {
		
		
	}
	
	
	public boolean loginValidado(String contrasenia,  RoundJTextField txtCorreo, RoundJPasswordField passwordField ) {
		txtCorreo.setColorB(new Color(0,0,0));
		txtCorreo.repaint();
		passwordField.setColorB(new Color(0,0,0));
		passwordField.repaint();
		// Valida si alguno de los espacios están vacios
		if(txtCorreo.getText().equals("Correo electronico") || contrasenia.equals("Contraseña")){
			if(txtCorreo.getText().equals("Correo electronico")) {
				System.out.println("Campo correo Vacio");
				txtCorreo.setColorB(new Color(217,0,30));
				txtCorreo.repaint();
			}
			if(contrasenia.equals("Contraseña")) {
				System.out.println("Campo contraseña Vacio");
				passwordField.setColorB(new Color(217,0,30));
				passwordField.repaint();
			}
			return false;
		}
		
		return true;
	}
	
	public void loginNoValido(RoundJTextField txtCorreo, RoundJPasswordField passwordField) {
		txtCorreo.setColorB(new Color(217,0,30));
		txtCorreo.repaint();
		passwordField.setColorB(new Color(217,0,30));
		passwordField.repaint();
	}
	
	public boolean registroValido(String contrasenia, String confirContrasenia, RoundJTextField nombreUsuario, RoundJTextField apellidoUsuario, RoundJTextField txtCorreo, RoundJPasswordField registrarContrasenia, RoundJPasswordField confirmarContrasenia) {
		
		return true;
	}
	
	
	
	
	public static boolean esCorreoValido(String correoValidando) {
	    if (correoValidando != null) {
	        Pattern[] formatos = {
	            Pattern.compile("^[A-Za-z].*?@gmail\\.com$"),
	            Pattern.compile("^[A-Za-z].*?@outlook\\.com$"),
	            Pattern.compile("^[A-Za-z].*?@alu\\.uabcs\\.mx$")
	        };
	        
	        for (Pattern formato : formatos) {
	            Matcher coincide = formato.matcher(correoValidando);
	            if (coincide.matches()) {
	            	return true;
	            }
	        }
	    }
	    return false;
	}
}
