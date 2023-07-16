package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;


/**
*  clase Menu es una clase con extencion a un panel se inicializan todos
* los atrivutos de esta clase que provienen de la clase swing.
*
*/

public class Menu extends JPanel{
	
	private JLabel btitulo;
	private JButton binicio;
	private JButton binstrucciones;
	private JButton creditos;
	private Imagen in;
	
	/**
	 * metodo constructor de la clase Menu inicia un layout, un fonfo, inicializa los componentes del
	 * otro metodo y decide si es visible o no el panel.
	 *
	 */	
	
	
	public Menu() {
		
		setLayout(new GridBagLayout());
		
		//setForeground(Color.GREEN);
		
		inicializarComponentes();
		
		setVisible(true);
	}
	
	
	
	/**
	 * metodo indica a cada uno de los componentes una pocion en el panel gracias al layout.
	 *
	 */
	
	public void inicializarComponentes() {
		
		GridBagConstraints c = new GridBagConstraints();
		Font ti = new Font("Bauhaus 93", 50, 50);
		Font button = new Font("Bauhaus 93", 50, 30);
		
		btitulo = new JLabel("EL JUEGO DEL BOSQUECILLO");
		btitulo.setFont(ti);
		btitulo.setForeground(Color.black);
		c.gridx = 1;
		c.gridy = 0;
		c.gridwidth = 0;
		c.gridheight=1;
		c.weightx=1;
		c.weighty=1;
		add(btitulo,c);
		
		binicio = new JButton("INICIO");
		binicio.setActionCommand("INICIO");
		binicio.setFont(button);
		binicio.setBackground(Color.white);
		binicio.setForeground(Color.BLACK);
		c.gridx = 1;
		c.gridy = 1;
		c.gridwidth = 1;
		c.gridheight=1;
		c.weightx=1;
		c.weighty=1;
		add(binicio,c);
		
		binstrucciones = new JButton("INSTRUCCIONES");
		binstrucciones.setActionCommand("INSTRU");
		binstrucciones.setFont(button);
		binstrucciones.setBackground(Color.white);
		binstrucciones.setForeground(Color.BLACK);
		c.gridx = 1;
		c.gridy = 2;
		c.gridwidth = 1;
		c.gridheight=1;
		c.weightx=1;
		c.weighty=1;
		add(binstrucciones,c);
		
		creditos = new JButton("CREDITOS");
		creditos.setActionCommand("CREDI");
		creditos.setFont(button);
		creditos.setBackground(Color.white);
		creditos.setForeground(Color.BLACK);
		c.gridx = 1;
		c.gridy = 3;
		c.gridwidth = 1;
		c.gridheight=1;
		c.weightx=1;
		c.weighty=1;
		add(creditos,c);
		
		in = new Imagen();
		in.setOpaque(false);
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 3;
		c.gridheight = 4;
		c.fill = GridBagConstraints.BOTH;
		add(in,c);
		
	}
	
	/**
	 * getters and setters de la clase ya que las variables son de tipo privado seran nesesarios 
	 * para su uso enotras clases.
	 *
	 */	

	public JLabel getBtitulo() {
		return btitulo;
	}

	public void setBtitulo(JLabel btitulo) {
		this.btitulo = btitulo;
	}

	public JButton getBinicio() {
		return binicio;
	}

	public void setBinicio(JButton binicio) {
		this.binicio = binicio;
	}

	public JButton getBinstrucciones() {
		return binstrucciones;
	}

	public void setBinstrucciones(JButton binstrucciones) {
		this.binstrucciones = binstrucciones;
	}

	public Imagen getIn() {
		return in;
	}

	public void setIn(Imagen in) {
		this.in = in;
	}



	public JButton getCreditos() {
		return creditos;
	}



	public void setCreditos(JButton creditos) {
		this.creditos = creditos;
	}



	
	
			

}



