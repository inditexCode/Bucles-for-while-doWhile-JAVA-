package bucle_doWhile;

import java.util.Scanner;

public class M2_Bucle_DoWhile_Ejercicio_3 {

	/*
	 * Promedio de Números Crea un programa en Java que haga lo siguiente:
	 * 
	 * Pide al usuario que ingrese números enteros positivos uno por uno. Suma los
	 * números que el usuario ingrese y guarda la cantidad de números ingresados. El
	 * programa se detiene cuando el usuario ingresa el número 0. Al finalizar,
	 * muestra el promedio de los números ingresados (excluyendo el 0). Si el
	 * usuario no ingresa ningún número válido antes de ingresar el 0, el programa
	 * debe mostrar un mensaje indicando que no se pudo calcular el promedio.
	 */
	public static void main(String[] args) {

		System.out.println("===> BUCLE DO-WHILE 3 EJERCICIO <===");
		System.out.println();

		Scanner teclado = new Scanner(System.in);

		int numero;
		int contador = 0;
		int suma = 0;

		do {
			System.out.print("Ingresa un número entero positivo (0 para salir): ");
			numero = teclado.nextInt();
			if (numero < 0) {
				System.out.println("Error: El número debe ser positivo.");
			} else if (numero > 0) {
				suma += numero;
				contador++;
			}
		} while (numero != 0);

		if (contador > 0) {
			double promedio = (double) suma / contador;
			System.out.println("El promedio de los números ingresados es: " + promedio);
		} else {
			System.out.println("No se pudo calcular el promedio porque no se ingresaron números válidos.");
		}
		teclado.close();

	}

}
