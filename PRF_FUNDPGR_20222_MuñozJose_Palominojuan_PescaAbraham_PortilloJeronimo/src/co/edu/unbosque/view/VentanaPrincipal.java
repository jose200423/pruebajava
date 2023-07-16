package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import co.edu.unbosque.model.Tablero;


/**
*  clase VentanaPrincipal es una clase con extencion a un JFrame se inicializan todos
* los atrivutos de esta clase.
*
*/


public class VentanaPrincipal extends JFrame {
	
	private Menu menu;
	private Instrucciones inst;
	private Instrucciones2 in;
	private Perdida per;
	private PanelTablero panelimagen;
	private Datos d;
	private Ganador g;
	private Pausa p;
	private Creditos credi;
	public static final int ALTO = 640;
	public static final int ANCHO = 500;
	
	/**
	 * metodo constructor de la clase VentanaPrincipal inicia un layout, un fonfo, inicializa los componentes del
	 * otro metodo y decide si es visible o no .
	 *
	 */	
	
	
	public VentanaPrincipal() {
		setTitle("EL Bosquesillo");
		setSize(900, 680);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.DARK_GRAY);//
		getContentPane().setLayout(new GridBagLayout()); 
		inicialozarComponentes();
		setResizable(false);// no permite modificar el tamaño de la ventana
		setLocationRelativeTo(null);// 
		setVisible(true);// 
		setIconImage(new ImageIcon(getClass().getResource("/Imagenes/fondo.jpg")).getImage());
		
	
	}
	
	public void iniciarTableroMain(int fil,int col, Tablero t) {
		inicializarTablero(fil, col, t);
	}
	
	

	
	/**
	 * metodo indica a cada uno de los componentes una pocion en el panel gracias al layout.
	 * e inicializa los otros paneles 
	 *
	 */

	public void inicialozarComponentes()  {
		GridBagConstraints c= new GridBagConstraints();
		c.gridx=0;
		c.gridy=0;
		c.gridwidth=1;
		c.gridheight=1;
		c.weightx=1.0;
		c.weighty=1.0;
		c.fill= GridBagConstraints.BOTH;
		menu = new Menu();
		getContentPane().add(menu,c);
		//getContentPane().add(menu,s);
		
		inst = new Instrucciones();
		getContentPane().add(inst, c);
		per = new Perdida();
		c.gridx=0;
		c.gridy=0;
		c.gridwidth=1;
		c.gridheight=1;
		c.weightx=1.0;
		c.weighty=1.0;
		c.fill= GridBagConstraints.SOUTH;
		getContentPane().add(per, c);
		d = new Datos();
		getContentPane().add(d,c);
		p = new Pausa();
		getContentPane().add(p,c);
		in = new Instrucciones2();
		getContentPane().add(in,c);
		credi = new Creditos();
		getContentPane().add(credi,c);
		g = new Ganador();
		c.gridx=0;
		c.gridy=0;
		c.gridwidth=1;
		c.gridheight=1;
		c.weightx=1.0;
		c.weighty=1.0;
		c.fill= GridBagConstraints.SOUTH;
		getContentPane().add(g,c);
		
		
	}
	
	public void inicializarTablero(int fil,int col, Tablero t) {
		GridBagConstraints c= new GridBagConstraints();
		panelimagen = new PanelTablero(fil, col, t);
		c.gridx=0;
		c.gridy=1;
		c.gridwidth=2;
		c.gridheight=2;
		c.weightx=2.0;
		c.weighty=2.0;
		c.fill= GridBagConstraints.NORTH;
		getContentPane().add(panelimagen,c);
	}
	

	/**
	 * getters and setters de la clase ya que las variables son de tipo privado seran nesesarios 
	 * para su uso enotras clases.
	 *
	 */	

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public Instrucciones getInst() {
		return inst;
	}

	public void setInst(Instrucciones inst) {
		this.inst = inst;
	}

	public Perdida getPer() {
		return per;
	}

	public void setPer(Perdida per) {
		this.per = per;
	}


	public PanelTablero getPanelimagen() {
		return panelimagen;
	}

	public void setPanelimagen(PanelTablero panelimagen) {
		this.panelimagen = panelimagen;
	}


	public static int getAlto() {
		return ALTO;
	}

	public static int getAncho() {
		return ANCHO;
	}

	public Datos getD() {
		return d;
	}

	public void setD(Datos d) {
		this.d = d;
	}

	public Ganador getG() {
		return g;
	}

	public void setG(Ganador g) {
		this.g = g;
	}

	public Pausa getP() {
		return p;
	}

	public void setP(Pausa p) {
		this.p = p;
	}



	public Instrucciones2 getIn() {
		return in;
	}



	public void setIn(Instrucciones2 in) {
		this.in = in;
	}



	public Creditos getCredi() {
		return credi;
	}

	public void setCredi(Creditos credi) {
		this.credi = credi;
	}

	
	
	
	

}
