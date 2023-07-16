package co.edu.unbosque.model;

import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import co.edu.unbosque.model.Elemento;

/**
 * clase Tablero
 *  define las variables que se van utilizar en esta clase y posiblemente en otras 
 *
 */

public class Tablero {

	private Elemento tablero[][];
	private int fil;
	private int col;
	private int m;
	private int a;
	private int t;
	private int pun;
	private int posyase;
	private int posxase;
	private int posynase;
	private int posxnase;
	private int posyt;
	private int posxt;
	private int posynt;
	private int posxnt;
	/**
	 * Metodo constructor que inicializa las variables 
	 *
	 */
	
	
	
	public Tablero(int filas, int columnas, int m, int a, int t, int pO) {
		fil = filas;
		col = columnas;
		this.m = m;
		this.a = a;
		this.t = t;
		this.pun = pO;
		tablero = new Elemento[fil][col];
	}
	
	
	
	
	/**
	 * Genera una matriz con un numero de filas y columnas determinadas por el usuario con dos ciclos for 
	 * uno generandol las filas y otro generando las columnas tambien le da un caracter y un nombre a cada celda  
	 * 
	 */
	

	public void inicializarTablero() {
		for (int i = 0; i < fil; i++) {
			for (int j = 0; j < col; j++) {
				tablero[i][j] = new Elemento(i, j, '.', "blanco");
			}
		}
		System.out.println("Tablero:");
		for (int x = 0; x < tablero.length; x++) {
			System.out.print("|");
			for (int y = 0; y < tablero[x].length; y++) {
				System.out.print(tablero[x][y].getCha());
				if (y != tablero[x].length - 1)
					System.out.print("\t");
			}
			System.out.println("|");
		}
	}
	
	/**
	 * metodo que le da un valor a las casillas 
	 * 
	 */

	public Elemento valorCasilla(int i, int j) {
		return tablero[i][j];
	}
	
	/**
	 * Genera muros aleatoreamente segun el porsentaje elegegido anteriormente por el usuario, 
	 * mediante un for genera la cantidad de muros necesesaria,  ivoca la clase elemento
	 * para darle un nombre y una posicion al objeto..
	 * 
	 */
	

	public void asignarMuros() {
		Random rnd = new Random();
		int c = fil * col * m / 100;
		int posy = 0;
		int posx = 0;
		if(m <= 20) {
		for (int i = 0; i < c; i++) {
			do {
				posy = rnd.nextInt(fil);
				posx = rnd.nextInt(col);
			} while (tablero[posy][posx].getNombre() != "blanco" );
			tablero[posy][posx] = new Elemento(posy, posx, 'M', "muro");
		}
	
		System.out.println("Muros: ");
		for (int x = 0; x < tablero.length; x++) {
			System.out.print("|");
			for (int y = 0; y < tablero[x].length; y++) {
				System.out.print(tablero[x][y].getCha());
				if (y != tablero[x].length - 1)
					System.out.print("\t");
			}
			System.out.println("|");
		}
		}
	}
	
	/**
	 * Genera asesinos letales aleatoreamente segun la cantidad elegegida anteriormente por el usuario, 
	 * mediante un for genera la cantidad de asesinos nesesarios y un do while que hace que 
	 * no genere un enemigo en la posision de un muro,ivoca la clase elemento
	 * para darle un nombre y una posicion al objeto..
	 * 
	 */

	public void asignarAsesino() {
		Random rnd = new Random();
		int c = a;
		int posy = 0;
		int posx = 0;
		for (int i = 0; i < c; i++) {
			do {
				posy = rnd.nextInt(fil);
				posx = rnd.nextInt(col);
			} while (tablero[posy][posx].getNombre() != "blanco");
			tablero[posy][posx] = new Elemento(posy, posx, 'A', "asesino");
		}
		System.out.println("Asesinos: ");
		for (int x = 0; x < tablero.length; x++) {
			System.out.print("|");
			for (int y = 0; y < tablero[x].length; y++) {
				System.out.print(tablero[x][y].getCha());
			}
			System.out.println("|");
		}
	}
	
	
	public boolean Condicionesase() {
		
		boolean noestaenmuros = false;
		boolean noestaen = false;
		boolean noestaen2 = false;
		boolean noestap = false;
		boolean noestac = false;
		boolean estadentro = false;
		boolean estadentro2 = false;
		
		if(tablero[posynase][posxnase].getCha() != 'M' && tablero[posynt][posxnt].getCha() != 'M') {
			noestaenmuros = true;
		}
		if(tablero[posynase][posxnase].getCha() != 'T' && tablero[posynt][posxnt].getCha() != 'T') {
			noestaen = true;
		}
		if(tablero[posynase][posxnase].getCha() != 'A' && tablero[posynt][posxnt].getCha() != 'A') {
			noestaen2 = true;
		}
		if(tablero[posynase][posxnase].getCha() != 'P' && tablero[posynt][posxnt].getCha() != 'P') {
			noestap = true;
		}
		if(tablero[posynase][posxnase].getCha() != 'C' && tablero[posynt][posxnt].getCha() != 'C') {
			noestac = true;
		}
//		if(tablero[posync][posxnc].getCha() != 'M') {
//			System.out.println("Muro_c");
//			noestaenmuros = true;
//		}
		if(posynase >= 0 && posynase <= fil -1 && posxnase >= 0 && posxnase <= col-1) {
			estadentro = true;
		}
		if(posynt >= 0 && posynt <= fil -1 && posxnt >= 0 && posxnt <= col-1) {
			estadentro2 = true;
		}
		
//		if(tablero[posync][posxnc].getCha() != 'T') {
//			System.out.println("Ter_c");
//			noenemigo = true;
//		}
//		if(noestaenmuros == true && estadentro == true && noenemigo == true) {
//			return true;
//		}
//		return false;
		
		return noestaenmuros && estadentro && noestaen && noestaen2 && noestap && noestac && estadentro2;
				
	}
	
	
	public void reasignarasesino() {
		Random rnd = new Random();
		int r = 0;
		for (int i = 0; i < fil; i++) {
			for (int j = 0; j < col; j++) {
				if (tablero[i][j].getCha() == 'A') {
					posyase = i;
					posxase = j;
					
					 r = rnd.nextInt(4);
					 if(r == 0) {
						 posynase = i+1;
						 posxnase = j;
					 }
					 if(r == 1) {
						 posynase = i-1;
						 posxnase = j;
					 }
					 if(r == 2) {
						 posynase = i;
						 posxnase = j+1;
					 }
					 if(r == 3) {
						 posynase = i;
						 posxnase = j-1;
					 }
					 
					
					//tablero[posynase][posxnase] = new Elemento(posynase, posxnase, 'A', "asesino");
				}
			}
		}
	}
	
	public void redibujarAsesino() {
		tablero[posyase][posxase] = new Elemento(posyase, posxase, '.', "blanco");
		tablero[posynase][posxnase] = new Elemento(posynase, posxnase, 'A', "asesino");
	}
	
	public void reasignartormrntoso() {
		Random rnd = new Random();
		int r = 0;
		for (int i = 0; i < fil; i++) {
			for (int j = 0; j < col; j++) {
				if (tablero[i][j].getCha() == 'T') {
					posyt = i;
					posxt = j;
					
					 r = rnd.nextInt(4);
					 if(r == 0) {
						 posynt = i+1;
						 posxnt = j;
					 }
					 if(r == 1) {
						 posynt = i-1;
						 posxnt = j;
					 }
					 if(r == 2) {
						 posynt = i;
						 posxnt = j+1;
					 }
					 if(r == 3) {
						 posynt = i;
						 posxnt = j-1;
					 }

//					tablero[posynt][posxnt] = new Elemento(posynt, posxnt, 'T', "tormentoso");
				}
			}
		}
	}
	
	public void redibujarTormentoso() {
		tablero[posyt][posxt] = new Elemento(posyt, posxt, '.', "blanco");
		tablero[posynt][posxnt] = new Elemento(posynt, posxnt, 'T', "tormentoso");
	}
	
	
	
			
			
		
	
	/**
	 * Genera tormentosos aleatoreamente segun la cantidad elegegida anteriormente por el usuario, 
	 * mediante un for genera la cantidad de tormentosos nesesarios y un do while que hace que 
	 * no genere un enemigo en la posision de un enemigo o de un muro no retorna nada, ivoca la clase elemento
	 * para darle un nombre y una posicion al objeto.
	 * 
	 */

	public void asignarTormentoso() {
		Random rnd = new Random();
		int c = t;
		int posy = 0;
		int posx = 0;
		for (int i = 0; i < c; i++) {
			do {
				posy = rnd.nextInt(fil);
				posx = rnd.nextInt(col);
			} while (tablero[posy][posx].getNombre() != "blanco");
			tablero[posy][posx] = new Elemento(posy, posx, 'T', "tormentoso");
		}
		System.out.println("Tor: ");
		for (int x = 0; x < tablero.length; x++) {
			System.out.print("|");
			for (int y = 0; y < tablero[x].length; y++) {
				System.out.print(tablero[x][y].getCha());
			}
			System.out.println("|");
		}
	}
	
	/**
	 * Genera los personajes mientras se cumplan unas condiciones tambien hace que el bosquesillo se genere al lado del carrito.
	 * 
	 */

	public void asignarPersonaje() {
		boolean bosquebien = false;
		while (bosquebien == false) {
			Elemento carrito = asignarCarrito();
			bosquebien = asignarBosquesillo(carrito.getFil(), carrito.getCol());
		}
	}
	
	
	public void asignarBonus() {
		Random rnd = new Random();
		int c = 1;
		int posy = 0;
		int posx = 0;
		for (int i = 0; i < c; i++) {
			do {
				posy = rnd.nextInt(fil);
				posx = rnd.nextInt(col);
			} while (tablero[posy][posx].getNombre() != "blanco");
			tablero[posy][posx] = new Elemento(posy, posx, 'P', "bonus");
		}
		System.out.println("bonus: ");
		for (int x = 0; x < tablero.length; x++) {
			System.out.print("|");
			for (int y = 0; y < tablero[x].length; y++) {
				System.out.print(tablero[x][y].getCha());
			}
			System.out.println("|");
		}
	}
	
	/**
	 * Genera el carrito alatoriamento mientras se cumplan unas condiciones este metodo retorna 
	 * la posicion del carrito en la matriz.
	 * 
	 */

	public Elemento asignarCarrito() {
		boolean estaesquina = true;
		boolean estamuros = true;
		boolean estamitadmuros = true;
		boolean estaenemigos = true;
		boolean estaenemigos2 = true;
		boolean noestamasunoenemigos = true;
		boolean noestamasunoenemigos2 = true;
		boolean maximo = false;
		int posy = 0;
		int posx = 0;
		int cont = 0;
		int max = fil * col;
		Random rnd = new Random();
		int c = 1;
		while (estaesquina && estamuros && estamitadmuros && estaenemigos && estaenemigos2 && noestamasunoenemigos
				&& noestamasunoenemigos2) {
			posy = rnd.nextInt(fil);
			posx = rnd.nextInt(col);
			System.out.println(posy);
			System.out.println(posx);
			if (posy < fil - 2 && posy >= 2) {
				if (posx < col - 2 && posx >= 2) {

					if ((posy == 0 && posx == 0) || (posy == 0 && posx == col - 1) || (posy == fil - 1 && posx == 0)
							|| (posy == fil - 1 && posx == col - 1)) {
						cont++;
						continue;
					} else {
						estaesquina = false;
					}
					if (tablero[posy][posx].getNombre() != "muro") {
						estamuros = false;
					}
					if (tablero[posy - 1][posx].getNombre() != "muro" && tablero[posy][posx - 1].getNombre() != "muro"
							&& tablero[posy + 1][posx].getNombre() != "muro"
							&& tablero[posy][posx + 1].getNombre() != "muro") {
						estamitadmuros = false;
					}
					if (tablero[posy][posx].getNombre() != "asesino") {
						estaenemigos = false;
					}
					if (tablero[posy - 1][posx].getNombre() != "asesino"
							&& tablero[posy][posx - 1].getNombre() != "asesino"
							&& tablero[posy + 1][posx].getNombre() != "asesino"
							&& tablero[posy][posx + 1].getNombre() != "asesino" && tablero[posy - 1][posx].getNombre() != "asesino"
							&& tablero[posy][posx - 1].getNombre() != "asesino"
							&& tablero[posy +1][posx].getNombre() != "asesino"
							&& tablero[posy][posx + 1].getNombre() != "asesino") {
						noestamasunoenemigos = false;
					}
					if (tablero[posy][posx].getNombre() != "tormentoso") {
						estaenemigos2 = false;
					}
					if (tablero[posy - 1][posx].getNombre() != "tormentoso"
							&& tablero[posy][posx - 1].getNombre() != "tormentoso"
							&& tablero[posy + 1][posx].getNombre() != "tormentoso"
							&& tablero[posy][posx + 1].getNombre() != "tormentoso") {
						noestamasunoenemigos2 = false;
					}
					cont++;
					if (cont == max) {
						maximo = true;
						System.out.println("Entro");
						break;
					}
				}
			}
		}
		if (maximo == true) {

			posy = 1;
			posx = 1;
			tablero[posy][posx] = new Elemento(posy, posx, 'C', "carrito");

		} else {
			tablero[posy][posx] = new Elemento(posy, posx, 'C', "carrito");

			System.out.println("Carrito: ");
			for (int x = 0; x < tablero.length; x++) {
				System.out.print("|");
				for (int y = 0; y < tablero[x].length; y++) {
					System.out.print(tablero[x][y].getCha());
				}
				System.out.println("|");
			}
		}
		return tablero[posy][posx];
	}
	
	/**
	 * Genera el bsquesillo junto al carrito mientras se cumplan unas condiciones, retorna un valor verdadero,  ivoca la clase elemento
	 * para darle un nombre y una posicion al objeto.
	 * 
	 */

	public boolean asignarBosquesillo(int y, int x) {
		boolean estaesquina = true;
		boolean estamuros = true;
		boolean estamitadmuros = true;
		boolean estaenemigos = true;
		boolean estaenemigos2 = true;
		boolean noestamasunoenemigos = true;
		boolean noestamasunoenemigos2 = true;
		boolean maximo = false;
		int limite = 4;
		int posy = y;
		int posx = x;
		int c = 1;
		while (estaesquina && estamuros && estamitadmuros && estaenemigos && estaenemigos2 && noestamasunoenemigos
				&& noestamasunoenemigos2) {

			if (c == 1) {
				posy = y + 1;
				posx = x + 0;
			} else if (c == 2) {
				posy = y - 1;
				posx = x + 0;
			} else if (c == 3) {
				posy = y + 0;
				posx = x - 1;
			} else if (c == 4) {
				posy = y + 0;
				posx = x + 1;
			}
			if (posy < fil - 1 && posy >= 1) {
				if (posx < col - 1 && posx >= 1) {
					if ((posy == 0 && posx == 0) || (posy == 0 && posx == col - 1) || (posy == fil - 1 && posx == 0)
							|| (posy == fil - 1 && posx == col - 1)) {
						c++;
						continue;
					} else {
						estaesquina = false;
					}
					if (tablero[posy][posx].getNombre() != "muro") {
						estamuros = false;
					}
					if (tablero[posy - 1][posx].getNombre() != "muro" && tablero[posy][posx - 1].getNombre() != "muro"
							&& tablero[posy + 1][posx].getNombre() != "muro"
							&& tablero[posy][posx + 1].getNombre() != "muro") {
						estamitadmuros = false;
					}
					if (tablero[posy][posx].getNombre() != "asesino") {
						estaenemigos = false;
					}
					if (tablero[posy - 1][posx].getNombre() != "asesino"
							&& tablero[posy][posx - 1].getNombre() != "asesino"
							&& tablero[posy + 1][posx].getNombre() != "asesino"
							&& tablero[posy][posx + 1].getNombre() != "asesino") {
						noestamasunoenemigos = false;
					}
					if (tablero[posy][posx].getNombre() != "tormentoso") {
						estaenemigos2 = false;
					}
					if (tablero[posy - 1][posx].getNombre() != "tormentoso"
							&& tablero[posy][posx - 1].getNombre() != "tormentoso"
							&& tablero[posy + 1][posx].getNombre() != "tormentoso"
							&& tablero[posy][posx + 1].getNombre() != "tormentoso") {
						noestamasunoenemigos2 = false;
					}
					c++;
					if (c == limite) {
						maximo = true;
						break;
					}
				}
			}

		}
		if (maximo == true) {
			posy = 0;
			posx = 0;
			tablero[posy][posx] = new Elemento(posy, posx, 'B', "personaje");
			return false;
		} else {
			tablero[posy][posx] = new Elemento(posy, posx, 'B', "personaje");
			tablero[posy][posx].setMovimientos(fil*col);
			System.out.println("Bosquesillo: ");
			for (int x_1 = 0; x_1 < tablero.length; x_1++) {
				System.out.print("|");
				for (int y_1 = 0; y_1 < tablero[x_1].length; y_1++) {
					System.out.print(tablero[x_1][y_1].getCha());
					
				}
				System.out.println("|");
			}
			return true;
		}
		
		
		/**
		 * getters and setters de la clase ya que las variables son de tipo privado seran nesesarios 
		 * para su uso enotras clases.
		 *
		 */	
	
	
		
	}
	
	public void asignarPuntos() {
		Random rnd = new Random();
		int c = pun;
		int posy = 0;
		int posx = 0;
		for (int i = 0; i < c; i++) {
			do {
				posy = rnd.nextInt(fil);
				posx = rnd.nextInt(col);
			} while (tablero[posy][posx].getNombre() != "blanco"
					&& (posy>=1 && posy<=fil-2 && posx >=1 && posx<=col-2));
			tablero[posy][posx] = new Elemento(posy, posx, 'O', "objetivos");
		}
		System.out.println("Asesinos: ");
		for (int x = 0; x < tablero.length; x++) {
			System.out.print("|");
			for (int y = 0; y < tablero[x].length; y++) {
				System.out.print(tablero[x][y].getCha());
			}
			System.out.println("|");
		}
	}
	

	public Elemento[][] getTablero() {
		return tablero;
	}

	public void setTablero(Elemento[][] tablero) {
		this.tablero = tablero;
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




	public int getM() {
		return m;
	}




	public void setM(int m) {
		this.m = m;
	}




	public int getA() {
		return a;
	}




	public void setA(int a) {
		this.a = a;
	}




	public int getT() {
		return t;
	}




	public void setT(int t) {
		this.t = t;
	}
	


	
	
	
}
