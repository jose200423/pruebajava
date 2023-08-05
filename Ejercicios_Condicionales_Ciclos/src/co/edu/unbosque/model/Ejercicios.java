package co.edu.unbosque.model;

public class Ejercicios {

	private int n;
	private int n2;

	public Ejercicios(int n, int n2) {
		this.n = n;
		this.n2 = n2;
	}

	public boolean calcular_Negativo() {
		boolean rta = false;
		if (n < 0) {
			return rta = true;
		}
		return rta;
	}

	public String calcularSuma_Par() {
		int suma = 0;
		String rta = "";

		if (n < 10 || n > 99 || n2 < 10 || n2 > 99) {
			rta = "No son numeros de dos digitos";
		}
		if (n > 9 && n < 100 && n2 > 9 && n2 < 100) {
			suma = n2 + n;

			if (suma % 2 == 0) {
				rta = "La suma de los dos numeros es par " + suma;
			} else {
				rta = "La suma de los dos numeros no es par " + suma;
			}

		}

		return rta;
	}

	public int calcular_Cuantos_Primos() {
		
		int cont = 0;
		int d1 = n / 100;
		int d2 = (n / 10) % 10;
		int d3 = n % 10;
		if (n > 99 && n < 1000) {
			if (d1 == 2 || d1 == 3 || d1 == 5 || d1 == 7) {
				cont++;
			}
			if (d2 == 2 || d2 == 3 || d2 == 5 || d2 == 7) {
				cont++;
			}

			if (d3 == 2 || d3 == 3 || d3 == 5 || d3 == 7) {
				cont++;

			}

			return cont;
		}
		return cont;
		
	}

	public String calcular_Si_Terminaen7() {
		int ultimo_digito = n % 10;
		if (ultimo_digito == 7) {
			return "si termina en 7";
		}
		return "no termina en 7";
	}

//	Leer dos números enteros y determinar si la diferencia entre los dos es un número divisor
//	exacto de alguno de los dos números.

	public String calcular_DivisordeDiferencia() {
		int resta = 0;
		String rta = "";

		if (n > n2) {
			resta = n - n2;
			if (n % resta == 0) {
				rta = resta + " es divisor exacto de " + n;
			}
			if (n2 % resta == 0) {
				rta = resta + " es divisor exacto de " + n2;
			}
			if (n % resta == 0 && n2 % resta == 0) {
				rta = resta + " es divisor exacto de " + n + " y " + n2;
			} else {
				rta = resta + " no es divisor exacto de ninguno";
			}
		}
		if (n < n2) {
			resta = n2 - n;
			if (n % resta == 0) {
				rta = resta + " es divisor exacto de " + n;
			}
			if (n2 % resta == 0) {
				rta = resta + " es divisor exacto de " + n2;
			}
			if (n % resta == 0 && n2 % resta == 0) {
				rta = resta + " es divisor exacto de " + n + " y " + n2;
			} else {
				rta = resta + " no es divisor exacto de ninguno";
			}
		}
		return rta;
	}

	public String calcular_Divisores(int n) {
		String rta = "";
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				if (i == 1) {
					rta = rta + i;
				} else {
					rta = rta + "," + i;
				}
			}
		}
		return rta;
	}

	public String calcular_Multiplosde5() {
		String rta = "";
		int i = 1;
		for (i = 1; i <= n; i++) {
			if (i % 5 == 0) {
				if (i == 5) {
					rta = rta + i;
				} else {
					rta = rta + "," + i;
				}

			}

		}
		return rta;
	}
	
	//Leer un número entero y determinar si la suma de sus dígitos es también un número primo.

	public String calcular_SumayPrimo() {
		int rta = 0;
		int re = 0;
		while (n != 0) {
			re = n % 10;
			rta = rta + re;
			n = n / 10;
		}
		for (int i = 2; i <= Math.sqrt(rta); i++) {
			if (rta % i == 0)
				return " Numero compuesto :)";
		}
		return " Numero primo :)";

	}
	

	
	//Determinar cuántos elementos de la serie de Fibonacci se encuentran entre 1000 y 2000
	
	public int calcularFibonacci() {
		int h = 0;
		int n = 0;
		int f = 0;
		int cont = 0;
		while(f < 2000) {
			f = h+n;
			h=n;
			if(cont == 0) {
				h++;
			}if(cont > 0) {
				n = n+1;
			}
			n = f;
			if(f>=0 && f<2000){
				System.out.println(f);
				System.out.println("      | " +cont);
		    cont++;
		      }
		}
		return cont;
		
	}
	
	
	
	

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

}
