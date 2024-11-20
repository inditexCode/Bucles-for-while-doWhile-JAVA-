package bucle_doWhile;

import java.util.Scanner;

public class M2_Bucle_DoWhile_Ejercicio_4 {
	/*
	 * Contador de Números Pares Crea un programa en Java que haga lo siguiente:
	 * 
	 * Pide al usuario que ingrese un número entero positivo. Usa un bucle do-while
	 * para contar cuántos números pares existen entre 1 y el número ingresado
	 * (inclusive). El programa debe mostrar la cantidad de números pares que hay
	 * hasta el número ingresado. Si el usuario ingresa un número negativo o cero,
	 * muestra un mensaje de error y vuelve a pedir un número positivo.
	 */

	public static void main(String[] args) {

		System.out.println("===> BUCLE DO-WHILE 4 EJERCICIO <===");

		Scanner teclado = new Scanner(System.in);

		int numero;
		int contadorPares = 0;

		// Pedir un número entero positivo
		do {
			System.out.print("Ingrese un número entero positivo: ");
			numero = teclado.nextInt();

			if (numero <= 0) {
				System.out.println("Error: el número debe ser positivo.");
			}

		} while (numero <= 0); // El bucle se repite hasta que el número sea positivo

		// Contar cuántos números pares existen entre 1 y el número ingresado
		int i = 1;
		do {
			if (i % 2 == 0) { // Si el número es par
				contadorPares++;
			}
			i++;
		} while (i <= numero); // El bucle termina cuando i es mayor que el número ingresado

		System.out.println("La cantidad de números pares entre 1 y " + numero + " es: " + contadorPares);

		teclado.close(); // Cerrar el Scanner
	}
}
