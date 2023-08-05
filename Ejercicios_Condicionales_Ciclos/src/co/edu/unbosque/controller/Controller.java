package co.edu.unbosque.controller;

import co.edu.unbosque.model.Ejercicios;
import co.edu.unbosque.view.Vista_Ventana;

public class Controller {

	private Vista_Ventana vista;
	private Ejercicios e1;

	public Controller() {

		vista = new Vista_Ventana();
		funcionar();
	}

	public void funcionar() {
		String opciones[] = { "1. 3. Leer un número entero y determinar si es negativo.",
				"2. 13. Determinar si la suma de dos números de dos digitos origina un número par.",
				"3. 23. Determinar cuántos dígitos primos tiene un numero de tres digitos.",
				"4. 33. Determinar si termina en 7.",
				"5. 43. Determinar si la diferencia entre los dos numeros es un número divisor exacto de alguno de los dos números.",
				"6. 3. Mostrar todos los divisores exactos del número comprendidos entre 1 y el número leído.",
				"7. 13. mostrar todos los múltiplos de 5 comprendidos entre 1 y el número leído.",
				"8. 23. Determinar si la suma de los dígitos de un numero es también un número primo.",
				"10. 43. Determinar cuántos elementos de la serie de Fibonacci se encuentran entre 1000 y 2000.",
				"11. Salir del programa" };
		String aux_opcion = vista.leerOpcionObject(opciones);
		int aux = 0;

		switch (aux_opcion) {

		case "1. 3. Leer un número entero y determinar si es negativo.":
			aux = vista.leerDatoEntero("Por favor ingrese el numero");
			e1 = new Ejercicios(aux, aux);
			vista.informacion("Es negativo??? " + e1.calcular_Negativo());
			break;

		case "2. 13. Determinar si la suma de dos números de dos digitos origina un número par.":
			e1 = new Ejercicios(aux, aux);
			aux = vista.leerDatoEntero("Por favor ingrese el primer numero" );
			e1.setN(aux);
			aux = vista.leerDatoEntero("Por favor ingrese el primer numero" );
			e1.setN2(aux);
			e1.calcularSuma_Par();
			vista.informacion(e1.calcularSuma_Par());
			break;

		case "3. 23. Determinar cuántos dígitos primos tiene un numero de tres digitos.":
			aux = vista.leerDatoEntero("Por favor ingrese el numero");
			if (aux < 99 || aux > 999) {
				vista.informacion("Error no es un numero de 3 digitos");;
			break;}
			e1 = new Ejercicios(aux, aux);
			vista.informacion("Hay " + e1.calcular_Cuantos_Primos() + " primos ");
			break;

		case "4. 33. Determinar si termina en 7.":
			aux = vista.leerDatoEntero("Por favor ingrese el numero");
			e1 = new Ejercicios(aux, aux);
			vista.informacion(e1.calcular_Si_Terminaen7());
			break;

		case "5. 43. Determinar si la diferencia entre los dos numeros es un número divisor exacto de alguno de los dos números.":
			e1 = new Ejercicios(aux, aux);
			aux = vista.leerDatoEntero("Por favor ingrese el primer numero" );
			e1.setN(aux);
			aux = vista.leerDatoEntero("Por favor ingrese el primer numero" );
			e1.setN2(aux);
			e1.calcular_DivisordeDiferencia();
			vista.informacion(e1.calcular_DivisordeDiferencia());
			break;


		case "6. 3. Mostrar todos los divisores exactos del número comprendidos entre 1 y el número leído.":
			aux = vista.leerDatoEntero("Por favor ingrese el primer numero" );
			e1 = new Ejercicios(aux, aux);
			vista.informacion(e1.calcular_Divisores(aux));
			break;

		case "7. 13. mostrar todos los múltiplos de 5 comprendidos entre 1 y el número leído.":
			aux = vista.leerDatoEntero("Por favor ingrese el primer numero" );
			e1 = new Ejercicios(aux, aux);
			vista.informacion(e1.calcular_Multiplosde5());
			break;

		case "8. 23. Determinar si la suma de los dígitos de un numero es también un número primo.":
			aux = vista.leerDatoEntero("Por favor ingrese el primer numero" );
			e1 = new Ejercicios(aux, aux);
			vista.informacion(e1.calcular_SumayPrimo());
			break;



		case "10. 43. Determinar cuántos elementos de la serie de Fibonacci se encuentran entre 1000 y 2000.":
			e1 = new Ejercicios(aux, aux);
			vista.informacion("la cantidad de numeros que hay entre 1000 y 2000 de la serie Fibonacci son : " + e1.calcularFibonacci());
			break;

		case "11. Salir del programa":
			vista.informacion("Gracias por ultilizar este programa");
			break;

		}
		if (!aux_opcion.equals("Salir del programa")) {
			funcionar();
		}

	}

}



