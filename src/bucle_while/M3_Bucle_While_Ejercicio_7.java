package bucle_while;

import java.util.Scanner;

public class M3_Bucle_While_Ejercicio_7 {
	/*
	 *  Calculadora de suma acumulativa
Haz un programa que permita al usuario sumar números.
El programa debe seguir pidiendo números y acumulándolos hasta que el usuario ingrese 0.
Cuando esto ocurra, muestra la suma total.

Requisitos:
Valida que las entradas sean números.
El programa debe terminar cuando el usuario ingrese 0.
	 * */

	public static void main(String[] args) {

		System.out.println("===> BUCLE WHILE 7 EJERCICIO <===");
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int numero = -1; // Inicializamos con un valor que no sea 0 para entrar al bucle

        System.out.println("=== Calculadora de Suma Acumulativa ===");
        System.out.println("Ingresa números para sumar. Ingresa 0 para terminar.");

        while (numero != 0) {
            System.out.print("Ingresa un número: ");
            if (scanner.hasNextInt()) { // Validar si la entrada es un número entero
                numero = scanner.nextInt();
                suma += numero; // Acumular el número ingresado
            } else {
                System.out.println("Entrada no válida. Por favor, ingresa un número entero.");
                scanner.next(); // Limpiar la entrada inválida
            }
        }

        System.out.println("La suma total es: " + suma);
        scanner.close();
	}

}
