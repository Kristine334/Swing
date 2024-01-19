import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class EjercicioSwing2 extends JFrame implements ActionListener {
	
	JComboBox cboAnimales;
	String animales[]={"gato","perro","caballo"};
	JLabel lblAnimal;
	ImageIcon imgGato, imgPerro, imgCaballo;

	EjercicioSwing2(){
		setLayout(new FlowLayout());
		imgGato = new ImageIcon ("e:\\imagenes\\gato.jpg");
		imgPerro = new ImageIcon ("e:\\imagenes\\perro.jpg");
		imgCaballo = new ImageIcon ("e:\\imagenes\\caballo.jpg");
		lblAnimal = new JLabel();
		
		
		cboAnimales =new JComboBox(animales);
		cboAnimales.addActionListener(this);

		add(cboAnimales);
		add (lblAnimal);
		setTitle ("Cuadro de animales");
		setSize(300,300);
		setVisible (true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(this,"Seleccionado: " +cboAnimales.getSelectedItem());
		
		if(cboAnimales.getSelectedItem()=="gato")
			lblAnimal.setIcon(imgGato);
		else
		if(cboAnimales.getSelectedItem()=="perro")
			lblAnimal.setIcon(imgPerro);
		else
		if(cboAnimales.getSelectedItem()=="caballo")
			lblAnimal.setIcon(imgCaballo);
	}

	public static void main(String[] args) {
		new EjercicioSwing2();

	}

}
