package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * Clase Creditos que tiene una extencion a JPanel se establecen los atrivutos de esta clase
 *
 */

public class Creditos extends JPanel{
	
	private JLabel titu;
	private JTextArea credi;
	private Imagen in;
	private JButton menu;
	
	/**
	 * metodo constructor de la clase inicializa el layout establece un color de fondo e inicializa 
	 * los componentes de el otro metodo
	 *
	 */
	public Creditos() {
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
		
		titu = new JLabel("CREDITOS");
		titu.setFont(ti);
		titu.setForeground(Color.black);
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 0;
		c.gridheight=1;
		c.weightx=1;
		c.weighty=1;
		add(titu,c);
		
		credi = new JTextArea("IMAGENES PNG DE"+"\n"+
                "https://www.pngwing.com/es/free-png-nudeh"+"\n"+
                "IMAGENES JPG"+
                "\n"+ "plantillasdememes.com" + "\n"
                + "GIFS" + "\n" + 
                "tenor.com" + "\n" + "MUSICA libre de copyright ");
		credi.setFont(button);
		credi.setForeground(Color.WHITE);
		credi.setBackground(Color.BLACK);
		credi.setEditable(false);
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 1;
		c.gridheight=1;
		c.weightx=1;
		c.weighty=1;
		add(credi,c);
		
		
		menu = new JButton("Menu");
		menu.setActionCommand("MENU");
		menu.setFont(button);
		menu.setBackground(Color.white);
		menu.setForeground(Color.BLACK);
		c.gridx = 0;
		c.gridy = 3;
		c.gridwidth = 1;
		c.gridheight=1;
		c.weightx=1;
		c.weighty=1;
		add(menu,c);
		
		
		in = new Imagen();
		in.setOpaque(false);
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 4;
		c.gridheight = 4;
		c.fill = GridBagConstraints.BOTH;
		add(in,c);
	
		
	}

	public JLabel getTitu() {
		return titu;
	}

	public void setTitu(JLabel titu) {
		this.titu = titu;
	}

	public JTextArea getCredi() {
		return credi;
	}

	public void setCredi(JTextArea credi) {
		this.credi = credi;
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
	

}
