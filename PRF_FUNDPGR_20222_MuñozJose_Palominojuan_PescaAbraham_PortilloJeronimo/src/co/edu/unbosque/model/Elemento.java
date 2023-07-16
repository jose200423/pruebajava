package co.edu.unbosque.model;

/**
 * clase elemento establece los atrivutos que se van utilizar en esta clase y posiblemente en otras 
 *
 */

public class Elemento {

	private int fil;
	private int col;
	private char cha;
	private String nombre;
	private long movimientos;
	private int objetivos;
	
	/**
	 * metodo constructor de la clase inicializa las variables. 
	 *
	 */

	public Elemento(int fil, int col, char cha, String nombre) {
		this.fil = fil;
		this.col = col;
		this.cha = cha;
		this.nombre = nombre;
		this.movimientos = 0;
		this.objetivos = 0;
	}
	
	/**
	 * getters and setters de la clase ya que las variables son de tipo privado seran nesesarios 
	 * para su uso enotras clases.
	 *
	 */

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

	public char getCha() {
		return cha;
	}

	public void setCha(char cha) {
		this.cha = cha;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getMovimientos() {
		return movimientos;
	}

	public void setMovimientos(long movimientos) {
		this.movimientos = movimientos;
	}

	public int getObjetivos() {
		return objetivos;
	}

	public void setObjetivos(int objetivos) {
		this.objetivos = objetivos;
	}
	
	
	
	

}
