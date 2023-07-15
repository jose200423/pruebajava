package co.edu.unbosque.model;

public class Numero {

	private String texto;
	private int n;
	private int n1;
	private int m;
	private int p;

	public Numero(String texto) {
		this.texto = texto;

	}

	public Numero() {
		n = 0;
	}

	public String codificar(String texto) {

		String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		texto = texto.toUpperCase();

		char caracter;
		String texto1 = "";

		for (int i = 0; i < texto.length(); i++) {
			caracter = texto.charAt(i);
			int pos = letras.indexOf(caracter);
			if (pos == -1) {
				texto1 = texto1 + caracter;
			} else {
				texto1 = texto1 + letras.charAt((pos + 3) % 26);
			}

		}

		return texto1;

	}

	public String descodificar(String texto) {

		String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		texto = texto.toUpperCase();

		char caracter;
		String texto1 = "";

		for (int i = 0; i < texto.length(); i++) {
			caracter = texto.charAt(i);

			int pos = letras.indexOf(caracter);
			if (caracter != ' ') {
				if (pos - 3 < 0) {
					texto1 = texto1 + letras.charAt(letras.length() + (pos - 3));
				} else {
					texto1 = texto1 + letras.charAt((pos - 3) % 26);
				}
			} else {
				texto1 = texto1 + caracter;
			}

		}

		return texto1;

	}

	public String sumaModular() {
		int suma = 0;
		int rta = 0;

		suma = n + n1;
		if (suma >= m) {
			rta = suma % m;
		} else {
			rta = suma;
		}

		return "" + rta;
	}

	public String multiModular() {
		int multi = 0;
		int rta = 0;

		multi = n * n1;
		if (multi >= m) {
			rta = multi % m;
		} else {
			rta = multi;
		}
		return "" + rta;
	}
	
	public boolean primo(int n1) {
		boolean rta = true;
		for (int i = 2; i <= Math.sqrt(n1); i++) {
			if (n1 % i == 0)
				rta = false;
		}
		return rta;
	
	}
	

	public String cifradroRsa(String texto) {

		String letras = "0ABCDEFGHYJKLMNOPQRSTUVWXYZ";
		texto = texto.toUpperCase();
		int num = 0;
		int k = n1 * m;
		String rta = "";
		
		if(primo(n1) == true && primo(m)== true ) {
		for (int i = texto.length() - 1; i >= 0; i--) {
			char c = texto.charAt(i);
			int nu = letras.indexOf(c);
			num = nu;
			num = (int) Math.pow(num, p) % k;
			if (num != -1) {
				rta = num + " " + rta;
			}
		}
		return rta;
		} 
		return "los numeros no son primos";
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getP() {
		return p;
	}

	public void setP(int p) {
		this.p = p;
	}

}
