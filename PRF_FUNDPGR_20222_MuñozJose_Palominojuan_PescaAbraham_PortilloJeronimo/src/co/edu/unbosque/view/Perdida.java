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

/**
*  clase Perdida es una clase con extencion a un panel se inicializan todos
* los atrivutos de esta clase que provienen de la clase swing.
*
*/


public class Perdida extends JPanel{
	
	private JLabel imagen;
	private JLabel perd;
	private JButton menu;
	private Imagen in;
	
	/**
	 * metodo constructor de la clase Perdida inicia un layout, un fonfo, inicializa los componentes del
	 * otro metodo y decide si es visible o no el panel.
	 *
	 */	

	public Perdida() {

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
		Font button = new Font("Bauhaus 93", 50, 15);
		
		
		perd = new JLabel("PERDISTE");
		perd.setFont(ti);
		perd.setForeground(Color.black);
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 0;
		c.gridheight=1;
		c.weightx=1;
		c.weighty=1;
		add(perd,c);
		
		
		imagen = new JLabel();
		ImageIcon im = new ImageIcon(getClass().getResource("/imagenes/perro.png"));
		imagen.setIcon(new ImageIcon(im.getImage().getScaledInstance(10, 10, Image.SCALE_SMOOTH)));
		imagen.setIcon(im);
		c.gridx = 1;
		c.gridy = 2;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.weightx = 1;
		c.weighty = 1;
		add(imagen, c);
		
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

	public JLabel getImagen() {
		return imagen;
	}

	public void setImagen(JLabel imagen) {
		this.imagen = imagen;
	}

	public JLabel getPerd() {
		return perd;
	}

	public void setPerd(JLabel perd) {
		this.perd = perd;
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
	

}
