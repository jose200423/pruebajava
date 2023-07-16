package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.sound.sampled.Clip;
import javax.xml.stream.events.StartDocument;

import co.edu.unbosque.model.Elemento;

import co.edu.unbosque.model.Tablero;
import co.edu.unbosque.view.Datos;
import co.edu.unbosque.view.Instrucciones;
import co.edu.unbosque.view.Menu;
import co.edu.unbosque.view.PanelTablero;
import co.edu.unbosque.view.VentanaPrincipal;

/**
 * clase controlador implementa los eventos ActionListener y el KeyListener
 *
 */

public class Controlador implements ActionListener, KeyListener {

	private VentanaPrincipal vista;
	private Elemento tablero[][];
	int f = 0;
	int c = 0;
	int muros = 0;
	int asesinos = 0;
	int tormentosos = 0;
	int pObjetivos = 0;
	int posybos = 0;
	int posxbos = 0;
	int posycar = 0;
	int posxcar = 0;
	int posynb = 0;
	int posxnb = 0;
	int posync = 0;
	int posxnc = 0;
	private Tablero t;

	/**
	 * metodo constructor de la clase inicializa los otros metodos de la clase
	 *
	 */
	public Controlador() {
		//funcionar();
		vista = new VentanaPrincipal();
		asignarOyentes();

	}

	/**
	 * metodo privado que hace el llamado a los getters de los comoponentes del
	 * paquete view
	 *
	 */

	private void asignarOyentes() {

		vista.getMenu().getBinicio().addActionListener(this);
		vista.getInst().getMenu().addActionListener(this);
		vista.getMenu().getBinstrucciones().addActionListener(this);
		vista.getPer().getMenu().addActionListener(this);
		vista.getD().getMenu().addActionListener(this);
		vista.getMenu().getCreditos().addActionListener(this);
		vista.getD().getNormal().addActionListener(this);
		vista.getD().getInverso().addActionListener(this);
		vista.getP().getBguia().addActionListener(this);
		vista.getP().getBmenu().addActionListener(this);
		vista.getIn().getMenu().addActionListener(this);
		vista.getCredi().getMenu().addActionListener(this);

		System.out.println("Asignar Oyentes");
		// vista.getPanelimagen().addKeyListener(this);
		// vista.addKeyListener(this);

	}

	/**
	 * metodo que le da una accion a los componentes de la clase view
	 *
	 */

	@Override
	public void actionPerformed(ActionEvent e) {
		String aux = "";
		String comando = e.getActionCommand();
		if (comando.equals("INICIO")) {
			vista.getMenu().setVisible(false);
			vista.getD().setVisible(true);

		}
		if (comando.equals("INSTRU")) {
			vista.getMenu().setVisible(false);
			vista.getInst().setVisible(true);
		}
		if (comando.equals("MENU")) {
			vista.getInst().setVisible(false);
			vista.getMenu().setVisible(true);
		}
		if (comando.equals("MENU")) {
			vista.getPer().setVisible(false);
			vista.getMenu().setVisible(true);
		}
		if (comando.equals("MENU")) {
			vista.getCredi().setVisible(false);
			vista.getMenu().setVisible(true);
		}
		if (comando.equals("CREDI")) {
			vista.getMenu().setVisible(false);
			vista.getCredi().setVisible(true);
		}
		if (comando.equals("MENU")) {
			vista.getD().setVisible(false);
			vista.getMenu().setVisible(true);
		}
		if (comando.equals("NORMAL")) {
			inicializarJuego();
			vista.getD().setVisible(false);
			vista.getP().setVisible(true);
			vista.getPanelimagen().setVisible(true);
			// vista.getPanelimagen().setFocusable(true);
			// vista.getPanelimagen().addKeyListener(this);
			
		}
		if (comando.equals("INVERSO")) {
			vista.getD().setVisible(false);
			vista.getPanelimagen().setVisible(true);
			vista.getP().setVisible(true);
			// funcionar();
		}
		if (comando.equals("GUIA")) {
			vista.getPanelimagen().setVisible(false);
			vista.getP().setVisible(false);
			vista.getIn().setVisible(true);
			// funcionar();
		}
		if (comando.equals("MENU")) {
			vista.getPanelimagen().repaint();
			vista.getPanelimagen().setVisible(false);
			vista.getP().setVisible(false);
			vista.getMenu().setVisible(true);
			// funcionar();
		}
		if (comando.equals("JUEGO")) {
			vista.getPanelimagen().setVisible(true);
			vista.getP().setVisible(true);
			vista.getIn().setVisible(false);
			// funcionar();
		}
	}

	public void inicializarJuego() {

		 String aux_fil = "";
		 int aux1_fil = 0;
		 String aux_col = "";
		 int aux1_col = 0;
		 
		 String aux_muros = "";
		 int aux1_muros = 0;
		 
		 String aux_asesinos = "";
		 int aux1_asesinos = 0;
		 
		 String aux_t = "";
		 int aux1_t = 0;
		 
		 String aux_pObj = "";
		 int aux1_pObj = 0;
		 
		 aux_fil = vista.getD().getFil().getText();
		 System.err.println(aux_fil);
		 aux1_fil = Integer.parseInt(aux_fil);
		 System.err.println(aux1_fil);
		 //t.setFil(20);
		 aux_col= vista.getD().getCol().getText();
		 System.err.println(aux_col);
		 aux1_col= Integer.parseInt(aux_col);
		 System.err.println(aux1_col);
		 
		 aux_muros= vista.getD().getMuros().getText();
		 System.err.println(aux_muros);
		 aux1_muros= Integer.parseInt(aux_muros);
		 System.err.println(aux1_muros);
		 
		 aux_asesinos= vista.getD().getLetal().getText();
		 System.err.println(aux_asesinos);
		 aux1_asesinos= Integer.parseInt(aux_asesinos);
		 System.err.println(aux1_asesinos);
		 
		 aux_t= vista.getD().getTor().getText();
		 System.err.println(aux_t);
		 aux1_t= Integer.parseInt(aux_t);
		 System.err.println(aux1_t);
		 
		 aux_pObj= vista.getD().getPuntos().getText();
		 System.err.println(aux_pObj);
		 aux1_pObj= Integer.parseInt(aux_pObj);
		 System.err.println(aux1_pObj);
		 
		 
		 
		 this.f = aux1_fil;
		 this.c = aux1_col;
		 
		 this.muros = aux1_muros;
		 this.asesinos = aux1_asesinos;
		 this.tormentosos = aux1_t;
		 this.pObjetivos = aux1_pObj;
		 
		 funcionar();
		 //t.setCol(20);
		// t.inicializarTablero();
		//
		// t.asignarMuros();
		//
		// t.asignarAsesino();
		//
		// t.asignarTormentoso();
		// t.asignarPersonaje();
		//
		// t.asignarBonus();

		// vista = new VentanaPrincipal(aux, aux2, t);
		// vista.getPanelimagen().setVisible(true);

	}

	public void funcionar() {

		t = new Tablero(f, c, muros, asesinos, tormentosos, pObjetivos);

		t.inicializarTablero();

		t.asignarMuros();

		t.asignarAsesino();

		t.asignarTormentoso();

		t.asignarPersonaje();

		t.asignarBonus();
		
		t.asignarPuntos();
		
		vista.iniciarTableroMain(f, c, t);

		//vista = new VentanaPrincipal(f, c, t);

		vista.setVisible(true);

		vista.setFocusable(true);

		vista.addKeyListener(this);

		tablero = t.getTablero();

		System.out.println("Funcionar");

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("Entro");
		System.out.println(e.getKeyCode());
		PosicionBosquesillo();
		PosicionCarrito();

		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			System.out.println("Right");
			NuevaPosicionBos(1, 0);
			NuevaPosicionCar(1, 0);
			if (Condiciones() == true) {
				redibujar();
				System.out.println("Redibujo");
			}
			t.reasignarasesino();
			t.reasignartormrntoso();
			if (t.Condicionesase() == true) {
				t.redibujarAsesino();
				t.redibujarTormentoso();
			}
			// movi.menosmovi();

		} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			NuevaPosicionBos(-1, 0);
			NuevaPosicionCar(-1, 0);
			if (Condiciones() == true) {
				redibujar();
			}
			t.reasignarasesino();
			t.reasignartormrntoso();
			if (t.Condicionesase() == true) {
				t.redibujarAsesino();
				t.redibujarTormentoso();
			}

			// movi.menosmovi();
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			NuevaPosicionBos(0, 1);
			NuevaPosicionCar(0, 1);
			if (Condiciones() == true) {
				redibujar();
			}
			t.reasignarasesino();
			t.reasignartormrntoso();
			if (t.Condicionesase() == true) {
				t.redibujarAsesino();
				t.redibujarTormentoso();
			}

			// movi.menosmovi();

		} else if (e.getKeyCode() == KeyEvent.VK_UP) {
			NuevaPosicionBos(0, -1);
			NuevaPosicionCar(0, -1);
			if (Condiciones() == true) {
				redibujar();
			}
			t.reasignarasesino();
			t.reasignartormrntoso();
			if (t.Condicionesase() == true) {
				t.redibujarAsesino();
				t.redibujarTormentoso();
			}

			// movi.menosmovi();

		}
		if (tablero[posynb][posxnb].getMovimientos() <= 0 && tablero[posynb][posxnb].getCha() == 'B') {
			vista.getPanelimagen().setVisible(false);
			vista.getP().setVisible(false);
			vista.getPanelimagen().removeAll();
			vista.getPer().setVisible(true);
			vista.setResizable(true);
		}
		if (tablero[posync][posxnc].getObjetivos() == 5 && tablero[posync][posxnc].getCha() == 'C') {
			vista.getPanelimagen().setVisible(false);
			vista.getP().setVisible(false);
			vista.getPanelimagen().removeAll();
			vista.getG().setVisible(true);
			vista.setResizable(true);
		}
		vista.getP().getMovi().setText("Movimientos:" + tablero[posynb][posxnb].getMovimientos());

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public void PosicionBosquesillo() {

		for (int i = 0; i < f; i++) {
			for (int j = 0; j < c; j++) {
				if (tablero[i][j].getCha() == 'B') {
					posybos = i;
					posxbos = j;
				}
			}
		}

	}

	public void PosicionCarrito() {

		for (int i = 0; i < f; i++) {
			for (int j = 0; j < c; j++) {
				if (tablero[i][j].getCha() == 'C') {
					posycar = i;
					posxcar = j;
				}
			}
		}

	}

	public void NuevaPosicionBos(int mox, int moy) {

		posynb = posybos;
		posxnb = posxbos;

		posynb += moy;
		posxnb += mox;

	}

	public void NuevaPosicionCar(int mox, int moy) {

		posync = posycar;
		posxnc = posxcar;

		if (posycar == posynb && posxcar == posxnb) {
			posync += moy;
			posxnc += mox;
		}

	}

	public boolean Condiciones() {
		long tem = 0;
		int obje = 0;
		boolean noestaenmuros = false;
		boolean estadentro = false;
		boolean noenemigoA = false;
		boolean noenemigoT = false;
		boolean penemigo = false;
		boolean penemigoa = false;
		boolean objetivos = false;
		boolean pernoobj = false;
		if (tablero[posynb][posxnb].getCha() != 'M' && tablero[posync][posxnc].getCha() != 'M') {
			System.out.println("Muro");
			noestaenmuros = true;
		}
		// if(tablero[posync][posxnc].getCha() != 'M') {
		// System.out.println("Muro_c");
		// noestaenmuros = true;
		// }
		if (posynb >= 0 && posynb <= f - 1 && posxnb >= 0 && posxnb <= c - 1) {
			estadentro = true;
		}
		if (posync >= 0 && posync <= f - 1 && posxnc >= 0 && posxnc <= c - 1) {
			estadentro = true;
		}
		if (tablero[posynb][posxnb].getCha() != 'A' && tablero[posync][posxnc].getCha() != 'A') {
			System.out.println("Asesino");
			noenemigoA = true;
		}
		if (tablero[posynb][posxnb].getCha() == 'A') {
			System.out.println("Asesino");
			tem = tablero[posybos][posxbos].getMovimientos();
			tablero[posybos][posxbos].setMovimientos(tem * 0);
			penemigoa = true;
		}
		if (tablero[posynb][posxnb].getCha() == 'P') {
			tem = tablero[posybos][posxbos].getMovimientos();
			tablero[posybos][posxbos].setMovimientos(tem+5);
			penemigoa = true;
		}
		if (tablero[posync][posxnc].getCha() == 'O') {
			obje = tablero[posycar][posxcar].getObjetivos();
			tablero[posycar][posxcar].setObjetivos(obje +1);
			penemigoa = true;
		}
		// if(tablero[posync][posxnc].getCha() != 'A') {
		// System.out.println("Asesino_c");
		// noenemigo = true;
		// }
		if (tablero[posynb][posxnb].getCha() == 'T') {
			System.out.println("Ter");
			tem = tablero[posybos][posxbos].getMovimientos();
			tablero[posybos][posxbos].setMovimientos(Math.round(tem * (1 - 0.05)));

			penemigo = true;
		}
		if (tablero[posynb][posxnb].getCha() != 'T' && tablero[posync][posxnc].getCha() != 'T') {
			System.out.println("Ter");
			noenemigoT = true;
		}
		if (tablero[posynb][posxnb].getCha() != 'O' ) {
			pernoobj = true;
		}
		// if(tablero[posync][posxnc].getCha() != 'T') {
		// System.out.println("Ter_c");
		// noenemigo = true;
		// }
		// if(noestaenmuros == true && estadentro == true && noenemigo == true) {
		// return true;
		// }
		// return false;

		return noestaenmuros && estadentro && noenemigoA && noenemigoT && pernoobj;

	}

	public void redibujar() {
		long tem = 0;
		int obj = 0;
		tem = tablero[posybos][posxbos].getMovimientos();
		obj = tablero[posycar][posxcar].getObjetivos();
		System.out.println(tem);
		tablero[posybos][posxbos] = new Elemento(posybos, posxbos, '.', "blanco");
		tablero[posycar][posxcar] = new Elemento(posycar, posxcar, '.', "blanco");

		tablero[posynb][posxnb] = new Elemento(posynb, posxnb, 'B', "personaje");
		tablero[posynb][posxnb].setMovimientos(tem - 1);
		System.out.println(tablero[posynb][posxnb].getMovimientos());
		tablero[posync][posxnc].setObjetivos(obj+1);
		tablero[posync][posxnc] = new Elemento(posync, posxnc, 'C', "carrito");

		vista.getPanelimagen().reDibujarComponentes(tablero);
	}

}
