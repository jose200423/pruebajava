import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {

	static int resultadociciclo;

	static int resultadoecRurcivo;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// contarVocalesCiclico("Hola mundo");
		// System.out.println(resultadociciclo);

		contarVocales("Hola mundo", 0, 0);
		System.out.println(resultadoecRurcivo);
		
		System.out.println(calcularFactorial(BigInteger.valueOf(10000)));
		masCercano(1000, 500, true, 0);
		masCercano(1000, 500, false, 0);
		System.out.println(contadorAcendente + " " +contadorDesendente);
		
		for (long i = 0; i < 13; i++) {
			System.out.println("Numero de Fibonacci"+ i + ": " + calcularTribonacci(i));
		}
	}

	public static void contarVocales(String texto, int conteo, int posicion) {
		// recurcividad: usar ciclos para resolver el problema por part
		// subdividiendo. (algoritmos de divide y conquista)

		if (posicion == texto.length()) {
			resultadoecRurcivo = conteo;
			//contarVocales(texto, conteo, posicion);
			return;
		} else {
			switch (texto.charAt(posicion)) {

			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u': {
				conteo++;
			}
			}
			contarVocales(texto, conteo, posicion + 1);
		}
	}

	public static void contarVocalesCiclico(String texto) {

		int contar = 0;

		for (int i = 0; i < texto.length(); i++) {

			switch (texto.charAt(i)) {

			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u': {
				contar++;
			}
			}
		}
		resultadociciclo = contar;
	}
	
	public static BigInteger calcularFactorial(BigInteger n) {
		if(n.equals(BigInteger.ONE)) {
			return BigInteger.ONE;
		}else {
			return n.multiply(calcularFactorial(n.subtract(BigInteger.ONE)));
		}
		
	}
	static long contadorAcendente;
	static long contadorDesendente;
	public static void masCercano(long n, long pos, boolean acendente, long contador) {
		if(pos>=n) {
			contadorAcendente = contador;
			return;
		}else if(pos<=0) {
			contadorDesendente = contador;
			return;
		}
		if(acendente) {
			contador++;
			masCercano(n, pos+1, true, contador);
		}else if(!acendente) {
			contador++;
			masCercano(n, pos-1, false, contador);
		}
	}
	
	public static long calcularFibonacci(long n) {
		if(n==0) {
			return 0;
		}
		if(n==1 || n==2) {
			return 1;
		}else {
			return (calcularFibonacci(n-1) + calcularFibonacci(n-2));
		}
		
	}
	
	public static long calcularTribonacci(long n) {
		if(n == 0 || n == 1){
			return 0;
		}
		if (n == 2 || n == 3) {
			return 1;
		}else {
			return (calcularTribonacci(n-1) + calcularTribonacci(n-2) + calcularTribonacci(n-3) );
		}
	}
	
	//public static long calcularCatalan(long n) {
	//	if(n == 0 || n==1 ) {
		//	return 1;
		//}
	//	if(n == 2) {
			//return 2;
		//}
		//else {
			
	//	}
	//}
}
