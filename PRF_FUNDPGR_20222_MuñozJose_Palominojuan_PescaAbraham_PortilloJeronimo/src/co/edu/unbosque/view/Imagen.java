package co.edu.unbosque.view;

import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * clase Imagen es una clase con extencion a un panel se inicializan todos los
 * atrivutos de esta clase que provienen de la clase swing.
 *esta clase es utilizada en casi todos los paneles 
 */

public class Imagen extends JPanel {

	private JLabel fondo;

	/**
	 * metodo constructor de la clase Imagen inicia un layout, un fonfo, inicializa los componentes del
	 * otro metodo y decide si es visible o no el panel.
	 *
	 */	
	
	
	public Imagen() {

		setLayout(new GridLayout());

		inicializarComponentes();

		setVisible(true);

	}
	
	/**
	 * metodo indica a cada uno de los componentes una pocion en el panel gracias al layout.
	 *
	 */

	private void inicializarComponentes() {

		ImageIcon im = new ImageIcon(getClass().getResource("/Imagenes/dogec.gif"));
		fondo = new JLabel();
		fondo.setIcon(new ImageIcon(im.getImage().getScaledInstance(1300, 850, Image.SCALE_REPLICATE)));
		add(fondo);

	}

}
