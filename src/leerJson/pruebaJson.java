package leerJson;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
import java.util.Iterator;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;

public class pruebaJson extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panelPrincipal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pruebaJson frame = new pruebaJson();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public pruebaJson() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 400);
		panelPrincipal = new JPanel();
		panelPrincipal.setForeground(new Color(32, 134, 225));
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panelPrincipal.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnLeerContenido = new JButton("Leer contenido");
		btnLeerContenido.setBounds(97, 126, 126, 55);
		panel.add(btnLeerContenido);
		
		btnLeerContenido.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	leerJson();
            }
        });
		
	}
	
	private void leerJson() {
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("src/leerJson/sample4.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray companyList = (JSONArray) jsonObject.get("people");
            Iterator<JSONObject> iterator = companyList.iterator();
            while (iterator.hasNext()) {
            	String nombresito = (String) iterator.next().get("firstName");
                System.out.println(nombresito);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
