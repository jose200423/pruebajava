package co.edu.unbosque.view;

import java.awt.Color;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
*  clase Pausa es una clase con extencion a un panel se inicializan todos
* los atrivutos de esta clase que provienen de la clase swing.
*
*/

public class Pausa extends JPanel{
	
	private JButton bguia;
	private JButton bmenu;
	private JTextField  movi;
	private JTextField tem;
	
	/**
	 * metodo constructor de la clase Pausa inicia un layout, un fonfo, inicializa los componentes del
	 * otro metodo y decide si es visible o no el panel.
	 *
	 */	
	
	public Pausa() {
		setLayout(new FlowLayout(FlowLayout.CENTER));
		setBackground(Color.DARK_GRAY);
		
		inicializarCompónentes();
		
		setVisible(false);
	}
	
	/**
	 * metodo indica a cada uno de los componentes una pocion en el panel gracias al layout.
	 *
	 */

	private void inicializarCompónentes() {
		
		Font ti = new Font("Bauhaus 93", 50, 70);
		Font button = new Font("Bauhaus 93", 50, 20);
		Font bu = new Font("Bauhaus 93", 50, 20);
		
		bguia=new JButton("GUIA");
		bguia.setActionCommand("GUIA");
		bguia.setBackground(Color.white);
		bguia.setForeground(Color.black);
		bguia.setFont(button);
		add(bguia);
		
		bmenu=new JButton("MENU");
		bmenu.setActionCommand("MENU");
		bguia.setBackground(Color.white);
		bguia.setForeground(Color.black);
		bmenu.setFont(button);
		add(bmenu);
		
		movi=new JTextField("MOVIMIENTOS:           ");
		movi.setEditable(false);
		movi.setForeground(Color.WHITE);
		movi.setBackground(Color.DARK_GRAY);
		movi.setFont(button);
		add(movi);
		
		tem=new JTextField("TIEMPO            ");
		tem.setEditable(false);
		tem.setForeground(Color.WHITE);
		tem.setBackground(Color.DARK_GRAY);
		tem.setFont(button);
		add(tem);
		
		
	}
	
	/**
	 * getters and setters de la clase ya que las variables son de tipo privado seran nesesarios 
	 * para su uso enotras clases.
	 *
	 */	


	public JButton getBguia() {
		return bguia;
	}

	public void setBguia(JButton bguia) {
		this.bguia = bguia;
	}

	public JButton getBmenu() {
		return bmenu;
	}

	public void setBmenu(JButton bmenu) {
		this.bmenu = bmenu;
	}

	public JTextField getMovi() {
		return movi;
	}

	public void setMovi(JTextField movi) {
		this.movi = movi;
	}

	public JTextField getTem() {
		return tem;
	}

	public void setTem(JTextField tem) {
		this.tem = tem;
	}

	
	

}
