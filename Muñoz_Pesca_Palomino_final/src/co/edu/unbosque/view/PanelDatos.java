package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelDatos extends JPanel{
	

	private JLabel eoperaciones;
	private JButton pote;
	private JButton raiz;
	private JButton sin;
	private JButton multi;
	private JButton rsa;
	
	
	public PanelDatos() {
		
		setLayout(null);
		setBackground(Color.GRAY);
		setBorder(new TitledBorder("Panel de Datos"));
		
		inicializarComponentes();
		
		setVisible(true);
	}
	

	public JLabel getEoperaciones() {
		return eoperaciones;
	}


	public void setEoperaciones(JLabel eoperaciones) {
		this.eoperaciones = eoperaciones;
	}


	public JButton getPote() {
		return pote;
	}


	public void setPote(JButton pote) {
		this.pote = pote;
	}


	public JButton getRaiz() {
		return raiz;
	}


	public void setRaiz(JButton raiz) {
		this.raiz = raiz;
	}


	public JButton getSin() {
		return sin;
	}


	public void setSin(JButton sin) {
		this.sin = sin;
	}


	public void inicializarComponentes() {
		
		
        eoperaciones = new JLabel("Operaciones");
		eoperaciones.setBounds(50, 25, 150, 20);
        add(eoperaciones);
        
		
		pote = new JButton("1.Cifrado Cesar");
		pote.setBounds(50, 50, 200, 20);
		pote.setActionCommand("CESAR");
		add(pote);
		
		raiz = new JButton("2.Desifrado Cesar");
		raiz.setBounds(50, 100, 200, 20);
		raiz.setActionCommand("DCESAR");
		add(raiz);
		
		sin = new JButton("3.Sumar dos números en aritmética modular");
		sin.setBounds(50, 150, 300, 20);
		sin.setActionCommand("SUMA");
		add(sin);
		
		multi = new JButton("4.Multiplicar dos números en aritmética modular");
		multi.setBounds(50, 200, 300, 20);
		multi.setActionCommand("MULTI");
		add(multi);
		
		
		rsa = new JButton("5.Cifrado RSA");
		rsa.setBounds(50, 250, 200, 20);
		rsa.setActionCommand("RSA");
		add(rsa);
		
		
		
        
	}


	public JButton getMulti() {
		return multi;
	}


	public void setMulti(JButton multi) {
		this.multi = multi;
	}


	public JButton getRsa() {
		return rsa;
	}


	public void setRsa(JButton rsa) {
		this.rsa = rsa;
	}
	
	

	


}
