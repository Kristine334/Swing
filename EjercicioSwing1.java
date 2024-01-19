import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class EjercicioSwing1 extends JFrame implements ActionListener{
	
	JButton btnValidar;
	JLabel lblUsuario,lblMensaje;
	JTextField txtUsuario;
	JPasswordField pswContrasena;
	
	EjercicioSwing1(){
		setLayout(new FlowLayout());
		btnValidar = new JButton ("Validar");
		lblUsuario = new JLabel ();
		lblMensaje = new JLabel ();
		txtUsuario = new JTextField ("Usuario");		
		pswContrasena = new JPasswordField ("aaaaaaaaaa");		
		
		
		add (txtUsuario);
		add (lblUsuario);		
		add (pswContrasena);
		add (lblMensaje);
		add (btnValidar);
		
		btnValidar.addActionListener(this);
		
		setTitle ("Valida tu usuario y contraseña");
		setSize(250,250);
		setVisible (true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}	
	


	@Override
	public void actionPerformed(ActionEvent e) {
		String valor = new String (pswContrasena.getPassword());
		String usuario = new String (txtUsuario.getText());
		if (valor.equalsIgnoreCase("admin1234") & usuario.equalsIgnoreCase("admin")) 
				lblMensaje.setText("La contraseña es correcta");
				else
				lblMensaje.setText("La contraseña no es correcta");
			

	}

	public static void main(String[] args) {
		new EjercicioSwing1();

	}

}
