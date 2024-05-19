package modelo;

import java.awt.Color;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import vista.recursos.componentesPersonalizados.*;


//Aqui se haran todas las validaciones para poder hacer las acciones en base a la base
//De datos y todo eso

public class Modelo {
	boolean registroEncontrado = false;
	boolean registrado = true;
	
	public Modelo() {
	}
	
	public boolean accionLogin(String correoElectronico, String contrasenia, RoundJTextField txtCorreo, RoundJPasswordField passwordField) {
//		txtCorreo.setColorB(new Color(0,0,0));
//		txtCorreo.repaint();
//		passwordField.setColorB(new Color(0,0,0));
//		passwordField.repaint();
//		
//		// Valida si alguno de los espacios están vacios
//		if(correoElectronico.equals("Correo electronico") || contrasenia.equals("Contraseña")){
//			if(correoElectronico.equals("Correo electronico")) {
//				System.out.println("Campo correo Vacio");
//				txtCorreo.setColorB(new Color(217,0,30));
//				txtCorreo.repaint();
//			}
//			if(contrasenia.equals("Contraseña")) {
//				System.out.println("Campo contraseña Vacio");
//				passwordField.setColorB(new Color(217,0,30));
//				passwordField.repaint();
//			}
//			return false;
//		}
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection con = DriverManager.getConnection("jdbc:mysql://sql.freedb.tech:3306/freedb_registros?useSSL=false","freedb_prueba","#ZKP5mSgzS6Ps&!");
//			Statement st = con.createStatement();
//			ResultSet rs = st.executeQuery("SELECT * FROM usuarios");
//			
//			while (rs.next() ) {
//				String contraEncriptada = encriptarContrasenia(contrasenia);
//				// Encriptar la contraseña que ingresa el usuario para validar si esta coincide con la que está registrada en la base de datos
//				if(rs.getString("correo_electronico").equals(correoElectronico) && rs.getString("contraseña").equals(contraEncriptada)) {
//					registroEncontrado = true;
//					break;
//				}
//			}
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		if(registroEncontrado) {
//			System.out.println("Datos Coinciden");
//			return true;
//		}else {
//			System.out.println("Datos No coinciden");
//			txtCorreo.setColorB(new Color(217,0,30));
//			txtCorreo.repaint();
//			passwordField.setColorB(new Color(217,0,30));
//			passwordField.repaint();
//			return false;
//		}
		return true;
	}
	
	
	public boolean accionRegistro(String contrasenia, String confirContrasenia, RoundJTextField nombreUsuario, RoundJTextField apellidoUsuario, RoundJTextField txtCorreo, RoundJPasswordField registrarContrasenia, RoundJPasswordField confirmarContrasenia) {
		nombreUsuario.setColorB(new Color(0,0,0));
		nombreUsuario.repaint();
		apellidoUsuario.setColorB(new Color(0,0,0));
		apellidoUsuario.repaint();
		txtCorreo.setColorB(new Color(0,0,0));
		txtCorreo.repaint();
		registrarContrasenia.setColorB(new Color(0,0,0));	
		registrarContrasenia.repaint();
		confirmarContrasenia.setColorB(new Color(0,0,0));
		confirmarContrasenia.repaint();
		
		// Valida si no hay espacios vacios
		if(nombreUsuario.getText().equals("Nombre") || apellidoUsuario.getText().equals("Apellidos") || txtCorreo.getText().equals("Correo electronico") || contrasenia.equals("Contraseña") || confirContrasenia.equals("Confirmar contraseña")){
			if(nombreUsuario.getText().equals("Nombre")) {
				System.out.println("Campo correo Vacio");
				nombreUsuario.setColorB(new Color(217,0,30));
				nombreUsuario.repaint();
			}
			
			if(apellidoUsuario.getText().equals("Apellidos")) {
				System.out.println("Campo correo Vacio");
				apellidoUsuario.setColorB(new Color(217,0,30));
				apellidoUsuario.repaint();
			}
			
			if(txtCorreo.getText().equals("Correo electronico")) {
				System.out.println("Campo correo Vacio");
				txtCorreo.setColorB(new Color(217,0,30));
				txtCorreo.repaint();
			}
			
			if(contrasenia.equals("Contraseña")) {
				System.out.println("Campo contraseña Vacio");
				registrarContrasenia.setColorB(new Color(217,0,30));
				registrarContrasenia.repaint();
			}
			
			if(confirContrasenia.equals("Confirmar contraseña")) {
				System.out.println("Campo confirmar contraseña Vacio");
				confirmarContrasenia.setColorB(new Color(217,0,30));
				confirmarContrasenia.repaint();
			}
			// JOptionPane.showMessageDialog(null, "Hay Campos Vacios", "Rellene los campos", JOptionPane.ERROR_MESSAGE);
			return false;
		}
		
		// Validar que los campos sean correctos
		if (contrasenia.length() < 8 || !confirContrasenia.equals(contrasenia) || !esCorreoValido(txtCorreo.getText())) {
			if(contrasenia.length() < 8) {
				System.out.println("Contraseña debe ser mayor a 8 caracteres");
				registrarContrasenia.setColorB(new Color(217, 0, 30));
				registrarContrasenia.repaint();
			}
			if(confirContrasenia.length() < 8) {
				System.out.println("Contraseña debe ser mayor a 8 caracteres");
				confirmarContrasenia.setColorB(new Color(217,0,30));
				confirmarContrasenia.repaint();
			}
			
			if (!confirContrasenia.equals(contrasenia)) {
				System.out.println("Contrasenias no coinciden");
				registrarContrasenia.setColorB(new Color(217, 0, 30));
				registrarContrasenia.repaint();
				confirmarContrasenia.setColorB(new Color(217,0,30));
				confirmarContrasenia.repaint();
			}
			if(!esCorreoValido(txtCorreo.getText())) {
				System.out.println("El correo no es valido");
				JOptionPane.showMessageDialog(null, "Formato Correo Invalido", "Rellene los campos", JOptionPane.ERROR_MESSAGE);
				txtCorreo.setColorB(new Color(217,0,30));
				txtCorreo.repaint();
			}
			return false;
		}
		// Una vez validado todo lo anterior ingresar a la base de datos para registrar al usuario
		
		JOptionPane.showMessageDialog(null, "Registro Completado", "Rellene los campos", JOptionPane.INFORMATION_MESSAGE);
		return true;
	}
	
	public static String encriptarContrasenia(String contrasenia) {
		try{
	        final MessageDigest digest = MessageDigest.getInstance("SHA-256");
	        final byte[] hash = digest.digest(contrasenia.getBytes("UTF-8"));
	        final StringBuilder hexString = new StringBuilder();
	        for (int i = 0; i < hash.length; i++) {
	            final String hex = Integer.toHexString(0xff & hash[i]);
	            if(hex.length() == 1) 
	              hexString.append('0');
	            hexString.append(hex);
	        }
	        return hexString.toString();
	    } catch(Exception ex){
	       throw new RuntimeException(ex);
	    }
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
