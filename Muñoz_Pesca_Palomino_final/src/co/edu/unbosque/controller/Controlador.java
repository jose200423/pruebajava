package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import co.edu.unbosque.model.Numero;
import co.edu.unbosque.view.VentanaPrincipal;
import co.edu.unbosque.view.Vista;

public class Controlador implements ActionListener {

	private VentanaPrincipal vista;
	private Vista v;
	private Numero x;

	public Controlador() {
		vista = new VentanaPrincipal();
		v = new Vista();
		Scanner sc = new Scanner(System.in);
		asignarOyentes();

	}
//invocar oyentes y escucha 
	public void asignarOyentes() {
		vista.getPdatos().getPote().addActionListener(this);
		vista.getPdatos().getRaiz().addActionListener(this);
		vista.getPdatos().getSin().addActionListener(this);
		vista.getPdatos().getMulti().addActionListener(this);
		vista.getPdatos().getRsa().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
//sysou siempres
		if(comando.equals("CESAR")) {
			operacionCesarc();
		}
		if(comando.equals("DCESAR")) {
			operacionCesarD();
		}
		if(comando.equals("SUMA")) {
			sumaModular();
		}
		if(comando.equals("MULTI")) {
			multiModular();
		}
		if(comando.equals("RSA")) {
			Rsa();
		}
	
	}
	
	public void operacionCesarc() {
		try {
		
		String aux = "";
		x = new Numero(aux);
		aux = v.leerDato("Ingrese frase");
		
		x.setTexto(aux); 
		x.codificar(aux);
		vista.getPresultados().getEresult().setText("Codificacion " + "\n" + x.codificar(aux) );
		
		}catch (Exception e) {
			v.informacion("Algo salio mal. \nPor favor, intenta de nuevo");
		}
		
	}
	
	public void operacionCesarD() {
		try {
		
		String aux = "";
		x = new Numero(aux);
		aux = v.leerDato("Ingrese frase");
		x.setTexto(aux); 
		x.codificar(aux);
		vista.getPresultados().getEresult().setText("Codificacion " + "\n" + x.descodificar(aux) );
		
		}catch (Exception e) {
			v.informacion("Algo salio mal. \nPor favor, intenta de nuevo");
		}
	}	
	
	public void sumaModular() {
		try {
			int aux2 = 0;
			x = new Numero();
			aux2 = v.leerDatoEnter("ingrese primer numero");
			x.setN(aux2);

			aux2 = v.leerDatoEnter("Ingrese segundo numero");
			x.setN1(aux2);

			aux2 = v.leerDatoEnter("Ingrese modulo");
			x.setM(aux2);

			vista.getPresultados().getEresult().setText("El resultado de la operacion es " + "\n" + x.sumaModular());
		} catch (Exception e) {
			v.informacion("Algo salio mal. \nPor favor, intenta de nuevo");
		}
	}

	public void multiModular() {
		   
		try {
		   int aux2 = 0;
		   x = new Numero();
		   aux2 = v.leerDatoEnter("ingrese primer numero");
		   x.setN(aux2);
		   
		   aux2 = v.leerDatoEnter("Ingrese segundo numero");
		   x.setN1(aux2);
		  
		   aux2 = v.leerDatoEnter("Ingrese modulo");
		   x.setM(aux2);
		   
		   
		vista.getPresultados().getEresult().setText("El resultado de la operacion es " + "\n" + x.multiModular() );
		
		}catch (Exception e) {
			v.informacion("Algo salio mal. \nPor favor, intenta de nuevo");
		}
		
		}
		
	
	public void Rsa() {
		try {  
		
		Scanner sc = new Scanner(System.in);
		String aux = "";
		int aux2 = 0;
		x = new Numero();
		sc.useDelimiter("\n");
		aux = v.leerDato("Ingrese frase");
		
		x.setTexto(aux);

		aux2 = v.leerDatoEnter("ingrese primer primo");
		x.setM(aux2);

		aux2 = v.leerDatoEnter("Ingrese segundo primo");
		x.setN1(aux2);

		aux2 = v.leerDatoEnter("Ingrese e");
		x.setP(aux2);

		vista.getPresultados().getEresult().setText("El resultado de la operacion es " + "\n" + x.cifradroRsa(aux));
		}catch (Exception e) {
			v.informacion("Algo salio mal. \nPor favor, intenta de nuevo");
		}
		}

}
