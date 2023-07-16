package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
*  clase Instrucciones es una clase con extencion a un panel se inicializan todos
* los atrivutos de esta clase que provienen de la clase swing.
*
*/

public class Instrucciones extends JPanel{
	
	private JLabel titu;
	private JLabel control;
	private JTextArea cont;
	private JLabel instru;
	private JTextArea inst;
	private JLabel enem;
	private JTextArea ene;
	private Imagen in;
	private JButton menu;
	private JLabel imagen;
	private JLabel imagen1;
	
	/**
	 * metodo constructor de la clase  Instrucciones inicia un layout, un fonfo, inicializa los componentes del
	 * otro metodo y decide si es visible o no el panel.
	 *
	 */	
	
	public Instrucciones() {
		
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
		Font ti = new Font("Bauhaus 93", 50, 50);
		Font  ti2 =  new Font("Bauhaus 93", 50, 30);
		Font button = new Font("Bauhaus 93", 50, 15);
		
		titu = new JLabel("INSTRUCCIONES");
		titu.setFont(ti);
		titu.setForeground(Color.black);
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 0;
		c.gridheight=1;
		c.weightx=1;
		c.weighty=1;
		add(titu,c);
		
		
		control = new JLabel("Controles");
		control.setFont(ti2);
		control.setForeground(Color.black);
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.weightx = 1;
		c.weighty = 1;
		add(control,c);
		
		cont = new JTextArea("El jugador solo puede"+"\n"+
                "moverse horizontal y "+"\n"+
                "verticalmente."+
                "\n"+ " Unicamente con las" + "\n"
                + "teclas de movimiento.");
		cont.setFont(button);
		cont.setForeground(Color.WHITE);
		cont.setBackground(Color.BLACK);
		cont.setEditable(false);
		c.gridx = 0;
		c.gridy = 2;
		c.gridwidth = 1;
		c.gridheight=2;
		c.weightx=1;
		c.weighty=1;
		add(cont,c);
		
		instru = new JLabel("Instrucciones"); 
		instru.setFont(ti2);
		instru.setForeground(Color.black);
		c.gridx = 1;
		c.gridy = 1;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.weightx = 1;
		c.weighty = 1;
		add(instru, c);
		
		inst = new JTextArea(" El jugador" + "\n" + "debera recolectar todos " + "\n"
			    + " los puntos objetivos para" + "\n" + " poder ganar" + "\n" + " tambien tendra un numero" + "\n" + "de movimientos limitados."
);
		inst.setFont(button);
		inst.setForeground(Color.WHITE);
		inst.setBackground(Color.BLACK);
		inst.setEditable(false);
		c.gridx = 1;
		c.gridy = 2;
		c.gridwidth = 1;
		c.gridheight = 2;
		c.weightx = 1;
		c.weighty = 1;
		add(inst,c);
		
		
		enem = new JLabel("Enemigos");
        enem.setFont(ti2);   
		enem.setForeground(Color.black);
		c.gridx = 2;
		c.gridy = 1;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.weightx = 1;
		c.weighty = 1;
		add(enem, c);

		ene = new JTextArea("Habra dos enemigos" + "\n" + "Asesino letal:" + "\n" + "en el momento" + "\n"
				+ "que se encuentre perdera " + "\n" + "el jugador, el" + "\n" + "jugador podra" + "\n"
				+ "selecionar el numero" + "\n" + "de asesesinos el" + "\n" + "minimo son" + "\n" + "1 y maximo 2"
				+ "\n" + "Tormentoso:" + "\n" + "en el momento" + "\n" + "que se encuentre perdera " + "\n"
				+ "el jugador 5%" + "\n" + "de sus movimientos," + "el jugador, el" + "\n" + "jugador podra" + "\n"
				+ "selecionar el numero" + "\n" + "de Tormentosos el" + "\n" + "minimo son" + "\n" + "2 y maximo 4");
		ene.setFont(button);
		ene.setForeground(Color.WHITE);
		ene.setBackground(Color.BLACK);
		ene.setEditable(false);
		c.gridx = 2;
		c.gridy = 2;
		c.gridwidth = 1;
		c.gridheight = 2;
		c.weightx = 1;
		c.weighty = 1;
		add(ene, c);
		
		menu = new JButton("Menu");
		menu.setActionCommand("MENU");
		menu.setFont(button);
		menu.setBackground(Color.white);
		menu.setForeground(Color.BLACK);
		c.gridx = 1;
		c.gridy = 4;
		c.gridwidth = 1;
		c.gridheight=1;
		c.weightx=1;
		c.weighty=1;
		add(menu,c);
		
		imagen = new JLabel();
		ImageIcon im = new ImageIcon(getClass().getResource("/imagenes/do.png"));
		imagen.setIcon(new ImageIcon(im.getImage().getScaledInstance(10, 10, Image.SCALE_SMOOTH)));
		imagen.setIcon(im);
		c.gridx = 2;
		c.gridy = 0;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.weightx = 1;
		c.weighty = 1;
		add(imagen, c);
		
		imagen1 = new JLabel();
		ImageIcon im1 = new ImageIcon(getClass().getResource("/imagenes/tecla.png"));
		imagen1.setIcon(new ImageIcon(im1.getImage().getScaledInstance(10, 10, Image.SCALE_SMOOTH)));
		imagen1.setIcon(im1);
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.weightx = 1;
		c.weighty = 1;
		add(imagen1, c);
		
		in = new Imagen();
		in.setOpaque(false);
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 3;
		c.gridheight = 5;
		c.fill = GridBagConstraints.BOTH;
		add(in,c);
	
	}
	
	/**
	 * getters and setters de la clase ya que las variables son de tipo privado seran nesesarios 
	 * para su uso enotras clases.
	 *
	 */	

	public JLabel getTitu() {
		return titu;
	}

	public void setTitu(JLabel titu) {
		this.titu = titu;
	}

	public JLabel getControl() {
		return control;
	}

	public void setControl(JLabel control) {
		this.control = control;
	}

	public JTextArea getCont() {
		return cont;
	}

	public void setCont(JTextArea cont) {
		this.cont = cont;
	}

	public JLabel getInstru() {
		return instru;
	}

	public void setInstru(JLabel instru) {
		this.instru = instru;
	}

	public JTextArea getInst() {
		return inst;
	}

	public void setInst(JTextArea inst) {
		this.inst = inst;
	}

	public JLabel getEnem() {
		return enem;
	}

	public void setEnem(JLabel enem) {
		this.enem = enem;
	}

	public JTextArea getEne() {
		return ene;
	}

	public void setEne(JTextArea ene) {
		this.ene = ene;
	}

	public Imagen getIn() {
		return in;
	}

	public void setIn(Imagen in) {
		this.in = in;
	}

	public JButton getMenu() {
		return menu;
	}

	public void setMenu(JButton menu) {
		this.menu = menu;
	}

	public JLabel getImagen() {
		return imagen;
	}

	public void setImagen(JLabel imagen) {
		this.imagen = imagen;
	}

	public JLabel getImagen1() {
		return imagen1;
	}

	public void setImagen1(JLabel imagen1) {
		this.imagen1 = imagen1;
	}
	
	

}
