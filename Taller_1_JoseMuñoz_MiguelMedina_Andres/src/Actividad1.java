import java.util.Iterator;
import java.util.Scanner;

public class Actividad1 {

	static Scanner sc = new Scanner(System.in);
	static int fila = 8;
	static int columnas = 8;
	static char[][] tablero = new char[fila][columnas];
	static int cor;

	public static void main(String[] args) {

		int op;

		do {
			System.out.println("****Menu****");
			System.out.println("1. Ingrese caracteres");
			System.out.println("2. Imprimir la matriz");
			System.out.println("3. Buscar si esta el caracter");
			System.out.println("4. Buscar si la palabra esta esta en la matriz");
			System.out.println("5. Encontrar letas con cordenadas");
			System.out.println("6. Salir");
			op = sc.nextInt();

			switch (op) {
			case 1:
				caracteres();
				break;
			case 2:
				Imprimir();
				break;
			case 3:
				Buscarcaracter();
				break;
			case 4:
				estapalabra();
				break;
			case 5:
				encotrarconc();
				break;
			case 6:
				System.out.println("Has elegido salir");
				break;
			default:
				System.out.println("Algo salio mal, intente de nuevo");
			}

		} while (op != 6);
		
	}

	static void caracteres() {
		System.out.println("Ingrese caracteres" + "\n" + "tener cuidado antes de de terminar de llenar la matriz");
		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.println("posicion " + i + "," + j + ":");
				tablero[i][j] = sc.next().charAt(0);
			}
		}
	}

	static void Imprimir() {
		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print(tablero[i][j] + " ");
			}
			System.out.println();
		}
	}

	static void Buscarcaracter() {
		System.out.println("Ingrese caracter a buscar: ");
		char caracter = sc.next().charAt(0);

		System.out.println("Se encuentra en");
		boolean rta = false;
		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < columnas; j++) {
				if (tablero[i][j] == caracter) {
					System.out.print(i + ", " + j);
					rta = true;
				}

			}
	
		}
		if (!rta) {
			System.out.println("La letra no se encuentra en la matriz.");
		}

		
	}

	static void estapalabra() {
		System.out.print("Ingrese la palabra a buscar: ");
		String palabra = sc.next();
		boolean rt = false;
		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < columnas; j++) {
				if (buscar(tablero, i, palabra)) {
					System.out.println("La palabra '" + palabra + "' se encuentra en la fila " + i + " de la matriz.");
					rt = true;
					break;
				}

			}
			if (!rt) {
				System.out.println("La palabra '" + palabra + "' no se encuentra en ninguna fila de la matriz.");
			}
		}

	}

	static boolean buscar(char[][] tablero, int fila, String palabra) {
		for (int i = 0; i <= tablero[0].length - palabra.length(); i++) {
			int j = 0;
			for (; j < palabra.length(); j++) {
				if (tablero[fila][i + j] != palabra.charAt(j)) {
					break;
				}
			}
			if (j == palabra.length()) {
				return true;
			}
		}
		return false;
	}

	static void encotrarconc() {
		System.out.println("Ingrese coordenadas: Ejemplo 2,3-1,2");
		String cor = sc.next();

		String [] coor = cor.split("-");
		System.out.println("Las letras son");

		for(String cordenada : coor) {

		String [] indice = cordenada.split(",");

		int i = Integer.parseInt(indice[0]);
		int j = Integer.parseInt(indice[1]);

		System.out.println(tablero[i][j] + " ");
		}
		System.out.println();
		}
}





