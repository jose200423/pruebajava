package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.AttributeSet.ColorAttribute;

import co.edu.unbosque.model.Elemento;
import co.edu.unbosque.model.Tablero;

/**
 * /** clase PanelTablero es una clase con extencion a un panel se inicializan
 * todos los atrivutos de esta clase que provienen de la clase swing.
 *
 */

public class PanelTablero extends JPanel{

	private JLabel l1;
	private int fil;
	private int col;
	private Elemento tablero[][];

	/**
	 * metodo constructor de la clase PanelTablero inicia un layout, un fonfo,
	 * inicializa los componentes del otro metodo y decide si es visible o no el
	 * panel.
	 *
	 */

	public PanelTablero(int fil, int col, Tablero t) {
		this.fil = fil;
		this.col = col;
		
		setLayout(new GridLayout(this.fil, this.col));

		inicializarComponentes(t.getTablero());

		setVisible(false);
	}

	/**
	 * este metodo mediante un ciclo inserta imagenes segun el valor de la letra
	 * qiue tenga esta se representa con las imagenes en Jlabel
	 * 
	 *
	 */

	public void inicializarComponentes(Elemento[][] t) {

		setBackground(Color.BLACK);

		for (int i = 0; i < fil; i++) {
			for (int j = 0; j < col; j++) {
				l1 = new JLabel();
				add(l1);
				if (t[i][j].getCha() == 'M') {
					cambiarImagen("muro", "jpg");
				} else if (t[i][j].getCha() == 'B') {
					cambiarImagen("perso", "gif");
				} else if (t[i][j].getCha() == 'A') {
					cambiarImagen("asesino", "gif");
				} else if (t[i][j].getCha() == 'T') {
					cambiarImagen("tormentoso", "gif");
				} else if (t[i][j].getCha() == 'C') {
					cambiarImagen("Carritop", "png");
				} else if (t[i][j].getCha() == 'P') {
					cambiarImagen("cat", "gif");
				}

			}
		}

	}
	
	public void reDibujarComponentes(Elemento[][] t) {
		
		removeAll();
		
		setLayout(new GridLayout(this.fil, this.col));
		
		setBackground(Color.BLACK);

		for (int i = 0; i < fil; i++) {
			for (int j = 0; j < col; j++) {
				l1 = new JLabel();
				add(l1);
				if (t[i][j].getCha() == 'M') {
					cambiarImagen("muro", "jpg");
				} else if (t[i][j].getCha() == 'B') {
					cambiarImagen("perso", "gif");
				} else if (t[i][j].getCha() == 'A') {
					cambiarImagen("asesino", "gif");
				} else if (t[i][j].getCha() == 'T') {
					cambiarImagen("tormentoso", "gif");
				} else if (t[i][j].getCha() == 'C') {
					cambiarImagen("Carritop", "png");
				} else if (t[i][j].getCha() == 'P') {
					cambiarImagen("cat", "gif");
				} else if (t[i][j].getCha() == 'O') {
					cambiarImagen("nn", "gif");

			}
			}
		}

	}

	public Elemento obtenerDatos(int y,int x) {
		return tablero[fil][col];
	}	
	
		
	
	
	public void cambiarImagen(String elem, String type) {
		ImageIcon im = new ImageIcon(getClass().getResource("/Imagenes/"+elem+"."+ type));
		ImageIcon icono = new ImageIcon(im.getImage().getScaledInstance(VentanaPrincipal.ALTO/17, VentanaPrincipal.ANCHO/17, Image.SCALE_DEFAULT));
		l1.setIcon(icono);
	}
	
	/**
	 * getters and setters de la clase ya que las variables son de tipo privado seran nesesarios 
	 * para su uso enotras clases.
	 *
	 */	

	public JLabel getL1() {
		return l1;
	}

	public void setL1(JLabel l1) {
		this.l1 = l1;
	}

	public int getFil() {
		return fil;
	}

	public void setFil(int fil) {
		this.fil = fil;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public Elemento[][] getTablero() {
		return tablero;
	}

	public void setTablero(Elemento[][] tablero) {
		this.tablero = tablero;
	}
}
