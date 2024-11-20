package bucle_while;

import java.util.Scanner;

public class M3_Bucle_While_Ejercicio_5 {
	/*
	 * Contador de números pares Escribe un programa que pida al usuario ingresar un
	 * número positivo y cuente cuántos números pares hay desde 1 hasta ese número
	 * (inclusive).
	 * 
	 * Requisitos: Valida que el usuario ingrese un número positivo. Usa un bucle
	 * while para contar los números pares.
	 */

	public static void main(String[] args) {
		System.out.println("===> BUCLE WHILE 5 EJERCICIO <===");
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingresa un número positivo: ");
		int numero = scanner.nextInt();

		while (numero <= 0) {
			System.out.print("Por favor, ingresa un número positivo: ");
			numero = scanner.nextInt();
		}

		int contador = 0;
		int i = 1;
		while (i <= numero) {
			if (i % 2 == 0) {
				contador++;
			}
			i++;
		}

		System.out.println("Hay " + contador + " números pares entre 1 y " + numero + ".");
		scanner.close();

	}

}
