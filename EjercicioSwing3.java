import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class EjercicioSwing3 extends JFrame implements ActionListener {
	
	
	//Dejamos este ejercicio de momento porque tenemos que conocer la lista de modelos
	
	
	String provincias[]= {"Gipuzkoa","Bizkaia","Alava"};
	JComboBox cboProvincias;
	JComboBox cboLocalidades;
	String gipuzkoa[]= {"Donosti","Hernani","Alegi"};
	String bizkaia[]= {"Balmaseda","Bilbao","Bermeo"};
	String alava[]= {"Gazteiz","Aramaio","Labastida"};
	
	
	
	EjercicioSwing3(){
		setLayout(new FlowLayout());
		
		
		cboProvincias =new JComboBox(provincias);
		cboProvincias.addActionListener(this);
		cboLocalidades =new JComboBox(gipuzkoa);
		cboLocalidades.addActionListener(this);
		cboLocalidades =new JComboBox(bizkaia);
		cboLocalidades.addActionListener(this);
		cboLocalidades =new JComboBox(alava);
		cboLocalidades.addActionListener(this);				
		
		add(cboProvincias);		
		add(cboLocalidades);
		
		setTitle ("Provincias y Localidades");
		setSize(300,80);
		setVisible (true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(this,"Provincia seleccionada");
		
		if(cboProvincias.getSelectedItem()=="Gipuzkoa")
			for(int i = 0; i<gipuzkoa.length;i++)
				cboProvincias.addItem(gipuzkoa[i]);
			
			cboLocalidades= new JComboBox(gipuzkoa);
		if(cboProvincias.getSelectedItem()=="Bizkaia")
			cboLocalidades= new JComboBox(bizkaia);
		if(cboProvincias.getSelectedItem()=="Alava")
			cboLocalidades= new JComboBox(alava);
		
	}

	public static void main(String[] args) {
		new EjercicioSwing3();

	}

}
