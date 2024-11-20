package bucle_while;

import java.util.Scanner;

public class M3_Bucle_While_Ejercicio_6 {

	/*
	 * Generador de tabla de multiplicar Crea un programa que pida un número al
	 * usuario y muestre su tabla de multiplicar desde 1 hasta 10. Usa un bucle
	 * while para calcular y mostrar cada línea.
	 */
	public static void main(String[] args) {

		System.out.println("===> BUCLE WHILE 6 EJERCICIO <===");
		System.out.println();

		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingresa un número y te devuelvo la tabla de multiplicar: ");
		int numero = teclado.nextInt();

		System.out.println("Tabla de multiplicar del " + numero + ":");
		int i = 1;
		while (i <= 10) {
			System.out.println(numero + " x " + i + " = " + (numero * i));
			i++;
		}
		teclado.close();

	}

}
