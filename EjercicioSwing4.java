import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.*;

public class EjercicioSwing4 extends JFrame implements ActionListener {
	
	JButton btnRandom;
	JLabel lblEtiqueta1, lblEtiqueta2, lblEtiqueta3, lblResultado;
	JTextField txtTexto1,txtTexto2,txtTexto3;	
	
	EjercicioSwing4(){
		setLayout(new FlowLayout());
		btnRandom = new JButton ("Pulsar");
		lblEtiqueta1= new JLabel ();		
		lblEtiqueta2= new JLabel ();
		lblEtiqueta3= new JLabel ();
		lblResultado= new JLabel ();
		//txtTexto1= new JTextField ("Los tres valores son diferentes");
		//txtTexto2= new JTextField ("Hay dos valores iguales");
		//txtTexto3= new JTextField ("Los tres valores son iguales");
		
		
		add (lblEtiqueta1);
		add (lblEtiqueta2);
		add (lblEtiqueta3);
		add (lblResultado);
		add (btnRandom);
		//add (txtTexto1);
		//add (txtTexto2);
		//add (txtTexto3);	
		
		
		btnRandom.addActionListener(this);
		
		setTitle ("Random");
		setSize(250,250);
		setVisible (true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnRandom) {			
			int random1 =(int)Math.floor (Math.random()*100);
			int random2 =(int)Math.floor (Math.random()*100);
			int random3 =(int)Math.floor (Math.random()*100);
			
			lblEtiqueta1.setText(String.valueOf(random1));
			lblEtiqueta2.setText(String.valueOf(random2));
			lblEtiqueta3.setText(String.valueOf(random3));		
			
			if(random1 == random2 & random1== random3)				
				lblResultado.setText("Los tres valores son iguales");
			if(random1 == random2 & random1 != random3)
				lblResultado.setText("Hay dos valores iguales");
			if(random1 != random2 & random1 == random3)
				lblResultado.setText("Hay dos valores iguales");
			if(random1 != random2 & random1 != random3)
				lblResultado.setText("Los tres valores son diferentes");
				
			
			
		}
		

	}

	public static void main(String[] args) {
		
		new EjercicioSwing4();

	}

}
