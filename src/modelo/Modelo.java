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
	
	public boolean accionLogin(String correoElectronico, String contrasenia) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://sql.freedb.tech:3306/freedb_registros?useSSL=false","freedb_prueba","#ZKP5mSgzS6Ps&!");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM usuarios");
			
			while (rs.next() ) {
				String contraEncriptada = encriptarContrasenia(contrasenia);
				// Encriptar la contraseña que ingresa el usuario para validar si esta coincide con la que está registrada en la base de datos
				if(rs.getString("correo_electronico").equals(correoElectronico) && rs.getString("contraseña").equals(contraEncriptada)) {
					registroEncontrado = true;
					break;
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(registroEncontrado) {
			System.out.println("Datos Coinciden");
			return true;
		}else {
			System.out.println("Datos No coinciden");
			return false;
		}
	}
	
	
	public boolean accionRegistro(String nombreUsuario, String apellidoUsuario, String correo, String contrasenia, String confirContrasenia) {
		
		if(true) {
			JOptionPane.showMessageDialog(null, "Registro Completado", "Registro Completo", JOptionPane.INFORMATION_MESSAGE);
		}
		
		return false;
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
	
}
