package cl.clase.view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame {
	
	JTextField txtUsuario;
	JTextField txtClave;
	JButton btnLogin;
	JButton btnLimpiar;
	JLabel lblUsuario;
	JLabel lblClave;
	
	public final String USU= "usuario";
	public final String PASS= "1234";
	
	public Login() {
		super("Login");
		this.iniciarComponentes();
	}
	
	public void iniciarComponentes() {
		this.setLayout(null);
		this.setSize(400,300); //Ancho, Alto
		
		txtUsuario = new JTextField();
		txtClave = new JTextField();
		btnLogin = new JButton();
		btnLimpiar = new JButton();
		lblUsuario = new JLabel();
		lblClave = new JLabel();
		
		lblUsuario.setSize(100,20);//Ancho, Alto
		lblUsuario.setLocation(20, 20);//x, y
		lblUsuario.setText("Usuario");
		
		lblClave.setSize(100,20);//Ancho, Alto
		lblClave.setLocation(20, 50);//x, y
		lblClave.setText("Clave");
		
		txtUsuario.setSize(100,20);//Ancho, Alto
		txtUsuario.setLocation(120,20); //x, y
		
		txtClave = new JPasswordField();
		txtClave.setSize(100,20);//Ancho, Alto
		txtClave.setLocation(120, 50);//x, y
		
		btnLogin.setSize(100,20);//Ancho, Alto
		btnLogin.setText("Ingresar");
		btnLogin.setLocation(20, 80);//x, y
		
		//Agregar el Evento checkLogin() al boton
		//new ActionListener() es un objeto anonimo
		btnLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				checkLogin();
			}
		});
		
		btnLimpiar.setSize(100,20);//Ancho, Alto
		btnLimpiar.setText("Limpiar");
		btnLimpiar.setLocation(130, 80);//x, y
		
		btnLimpiar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				txtUsuario.setText("");
				txtClave.setText("");
			}
		});
		
		this.add(txtUsuario);
		this.add(txtClave);
		this.add(btnLogin);
		this.add(btnLimpiar);
		this.add(lblUsuario);
		this.add(lblClave);
	}
	
	public void checkLogin() {
		
		if(txtUsuario.getText().equals(USU) && txtClave.getText().equals(PASS)) {
			System.out.println("Acceso Correcto");
			this.setVisible(false);
			Principal principal = new Principal();
			principal.setVisible(true);
		}else
		{
			//System.out.println("Acceso Incorrecto");
			txtUsuario.setText("");
			txtClave.setText("");
			JOptionPane.showMessageDialog(this, "Login Incorrecto", "Mensaje", JOptionPane.ERROR_MESSAGE);
		}
	}
	
}
