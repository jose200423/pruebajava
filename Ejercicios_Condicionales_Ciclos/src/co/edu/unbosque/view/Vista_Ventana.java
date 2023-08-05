package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class Vista_Ventana {

	public Vista_Ventana() {

	}

	public void infoverdad(boolean mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}

	public void mostrainformacion(int numero) {
		JOptionPane.showMessageDialog(null, numero);
	}

	public void mostrainforma(Object object) {
		JOptionPane.showMessageDialog(null, object);
	}

	public void informacion(String men) {
		JOptionPane.showMessageDialog(null, men);
	}

	public int leerDatoEntero(String mensaje) {
		int dato = 0;
		String aux = JOptionPane.showInputDialog(mensaje);
		dato = Integer.parseInt(aux);
		return dato;
	}

	

	public String leerOpcionObject(Object opciones[]) {
		Object dato = JOptionPane.showInputDialog(null, "Seleccion ejercicio a realizar:", "Menu de ejercicios",
				JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
		return dato.toString();
	}

}