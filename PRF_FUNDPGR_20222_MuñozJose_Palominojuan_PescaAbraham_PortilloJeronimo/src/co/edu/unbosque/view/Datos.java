package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *  clase datos es una clase con extencion a un panel se inicializan todos
 * los atrivutos de esta clase que provienen de la clase swing.
 *
 */

public class Datos extends JPanel{
	
	private JTextField col;
	private JTextField fil;
	private JTextField muros;
	private JTextField tor;
	private JTextField letal;
	private JTextField puntos;
	private JLabel tcol;
	private JLabel tfil;
	private JLabel tmuros;
	private JLabel ttor;
	private JLabel tletal;
	private JLabel tpuntos;
	private JLabel titulo;
	private JButton menu;
	private JButton normal;
	private JButton inverso;
	private Imagen in;
	
	
	/**
	 * metodo constructor de la clase datos inicia un layout, un fonfo, inicializa los componentes del
	 * otro metodo y decide si es visible o no el panel.
	 *
	 */	
	public Datos() {
		setLayout(new GridBagLayout());

		setBackground(Color.black);

		inicializarComponentes();

		setVisible(false);

	}
	
	/**
	 * metodo indica a cada uno de los componentes una pocion en el panel gracias al layout.
	 *
	 */
	
	public void inicializarComponentes() {
		
		GridBagConstraints c = new GridBagConstraints();
		Font ti = new Font("Bauhaus 93", 50, 70);
		Font button = new Font("Bauhaus 93", 50, 40);
		Font bu = new Font("Bauhaus 93", 50, 20);
		
		

		titulo = new JLabel("DATOS");
		titulo.setFont(ti);
		titulo.setForeground(Color.BLACK);
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 0;
		c.gridheight=1;
		c.weightx=1;
		c.weighty=1;
		add(titulo,c);
		
		tfil = new JLabel("FILAS");
		tfil.setFont(button);
		tfil.setForeground(Color.black);
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 1;
		c.gridheight=1;
		c.weightx=0.2;
		c.weighty=0;
		add(tfil,c);
		
		fil = new JTextField("");
		fil.setBackground(Color.white);
		fil.setForeground(Color.black);
		c.gridx = 1;
		c.gridy = 1;
		c.gridwidth = 1;
		c.gridheight= 1;
		c.weightx=0;
		c.weighty=1;
		c.ipadx=80;
		c.ipady=0;
		add(fil,c);
		
		tcol = new JLabel("COLUMNAS");
		tcol.setFont(button);
		tcol.setForeground(Color.black);
		c.gridx = 0;
		c.gridy = 2;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.weightx = 0.2;
		c.weighty = 0;
		add(tcol, c);
		
		col = new JTextField("");
		col.setBackground(Color.white);
		col.setForeground(Color.black);
		c.gridx = 1;
		c.gridy = 2;
		c.gridwidth = 1;
		c.gridheight= 1;
		c.weightx=0;
		c.weighty=1;
		c.ipadx=80;
		c.ipady=0;
		add(col,c);
		
		tmuros = new JLabel("%DE MUROS");
		tmuros.setFont(button);
		tmuros.setForeground(Color.black);
		c.gridx = 0;
		c.gridy = 3;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.weightx = 0.2;
		c.weighty = 0;
		add(tmuros, c);
		
		muros = new JTextField("");
		muros.setFont(button);
		muros.setBackground(Color.white);
		muros.setForeground(Color.black);
		c.gridx = 1;
		c.gridy = 3;
		c.gridwidth = 1;
		c.gridheight= 1;
		c.weightx=0;
		c.weighty=1;
		c.ipadx=80;
		c.ipady=0;
		add(muros,c);
		
		ttor = new JLabel("N tormentosos");
		ttor.setFont(button);
		ttor.setForeground(Color.black);
		c.gridx = 2;
		c.gridy = 1;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.weightx = 0.2;
		c.weighty = 0;
		add(ttor, c);
		
		tor = new JTextField("");
		tor.setFont(button);
		tor.setBackground(Color.white);
		tor.setForeground(Color.black);
		c.gridx = 4;
		c.gridy = 1;
		c.gridwidth = 1;
		c.gridheight= 1;
		c.weightx=0;
		c.weighty=1;
		c.ipadx=80;
		c.ipady=0;
		add(tor,c);
		
		tletal = new JLabel("N Asesinos");
		tletal.setFont(button);
		tletal.setForeground(Color.black);
		c.gridx = 2;
		c.gridy = 2;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.weightx = 0.2;
		c.weighty = 0;
		add(tletal, c);
		
		letal = new JTextField("");
		letal.setFont(button);
		letal.setBackground(Color.white);
		letal.setForeground(Color.black);
		c.gridx = 4;
		c.gridy = 2;
		c.gridwidth = 1;
		c.gridheight= 1;
		c.weightx=0;
		c.weighty=1;
		c.ipadx=80;
		c.ipady=0;
		add(letal,c);
		
		tpuntos = new JLabel("N Puntos");
		tpuntos.setFont(button);
		tpuntos.setForeground(Color.black);
		c.gridx = 2;
		c.gridy = 3;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.weightx = 0.2;
		c.weighty = 0;
		add(tpuntos, c);
		
		puntos = new JTextField("");
		puntos.setFont(button);
		puntos.setBackground(Color.white);
		puntos.setForeground(Color.black);
		c.gridx = 4;
		c.gridy = 3;
		c.gridwidth = 1;
		c.gridheight= 1;
		c.weightx=0;
		c.weighty=1;
		c.ipadx=80;
		c.ipady=0;
		add(puntos,c);
		
		menu = new JButton("Menu");
		menu.setActionCommand("MENU");
		menu.setFont(bu);
		menu.setBackground(Color.white);
		menu.setForeground(Color.BLACK);
		c.gridx = 0;
		c.gridy = 4;
		c.gridwidth = 1;
		c.gridheight=1;
		c.weightx=1.5;
		c.weighty=1;
		add(menu,c);
		
		
		normal = new JButton("JUGAR NORMAL");
		normal.setActionCommand("NORMAL");
		normal.setFont(bu);
		normal.setBackground(Color.white);
		normal.setForeground(Color.BLACK);
		c.gridx = 1;
		c.gridy = 4;
		c.gridwidth = 1;
		c.gridheight=1;
		c.weightx=1.5;
		c.weighty=1;
		add(normal,c);
		
		inverso = new JButton("JUGAR INVERSO");
		inverso.setActionCommand("INVERSO");
		inverso.setFont(bu);
		inverso.setBackground(Color.white);
		inverso.setForeground(Color.BLACK);
		c.gridx = 2;
		c.gridy = 4;
		c.gridwidth = 1;
		c.gridheight=1;
		c.weightx=1.5;
		c.weighty=1;
		add(inverso,c);


		in = new Imagen();
		in.setOpaque(false);
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 6;
		c.gridheight = 6;
		c.fill = GridBagConstraints.BOTH;
		add(in,c);
		
	}
	
	/**
	 * getters and setters de la clase ya que las variables son de tipo privado seran nesesarios 
	 * para su uso enotras clases.
	 *
	 */	

	public JTextField getCol() {
		return col;
	}

	public void setCol(JTextField col) {
		this.col = col;
	}

	public JTextField getFil() {
		return fil;
	}

	public void setFil(JTextField fil) {
		this.fil = fil;
	}

	public JTextField getMuros() {
		return muros;
	}

	public void setMuros(JTextField muros) {
		this.muros = muros;
	}

	public JTextField getTor() {
		return tor;
	}

	public void setTor(JTextField tor) {
		this.tor = tor;
	}

	public JTextField getLetal() {
		return letal;
	}

	public void setLetal(JTextField letal) {
		this.letal = letal;
	}

	public JTextField getPuntos() {
		return puntos;
	}

	public void setPuntos(JTextField puntos) {
		this.puntos = puntos;
	}

	public JLabel getTcol() {
		return tcol;
	}

	public void setTcol(JLabel tcol) {
		this.tcol = tcol;
	}

	public JLabel getTfil() {
		return tfil;
	}

	public void setTfil(JLabel tfil) {
		this.tfil = tfil;
	}

	public JLabel getTmuros() {
		return tmuros;
	}

	public void setTmuros(JLabel tmuros) {
		this.tmuros = tmuros;
	}

	public JLabel getTtor() {
		return ttor;
	}

	public void setTtor(JLabel ttor) {
		this.ttor = ttor;
	}

	public JLabel getTletal() {
		return tletal;
	}

	public void setTletal(JLabel tletal) {
		this.tletal = tletal;
	}

	public JLabel getTpuntos() {
		return tpuntos;
	}

	public void setTpuntos(JLabel tpuntos) {
		this.tpuntos = tpuntos;
	}

	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}

	public JButton getMenu() {
		return menu;
	}

	public void setMenu(JButton menu) {
		this.menu = menu;
	}

	public Imagen getIn() {
		return in;
	}

	public void setIn(Imagen in) {
		this.in = in;
	}

	public JButton getNormal() {
		return normal;
	}

	public void setNormal(JButton normal) {
		this.normal = normal;
	}

	public JButton getInverso() {
		return inverso;
	}

	public void setInverso(JButton inverso) {
		this.inverso = inverso;
	}
	
	

	
	
	
	

}
