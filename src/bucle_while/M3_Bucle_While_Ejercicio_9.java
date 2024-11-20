package bucle_while;

import java.util.Scanner;

public class M3_Bucle_While_Ejercicio_9 {

	/*
Sumar números del 1 al N
Escribe un programa que calcule la suma de los números enteros desde 1 hasta un número 
N ingresado por el usuario. El programa debe usar un bucle while para realizar la suma.

Requisitos:
El programa debe pedir al usuario un número positivo N.
Usa un bucle while para sumar los números desde 1 hasta N.
Imprime el resultado de la suma al final.
*/
	public static void main(String[] args) {
		Scanner TECLADO = new Scanner(System.in);
        int numero, suma = 0;
        int i = 1;

        // Pedir al usuario un número positivo
        System.out.print("Ingresa un número entero positivo: ");
        while (!TECLADO.hasNextInt()) {
            System.out.print("Entrada no válida. Por favor, ingresa un número entero positivo: ");
            TECLADO.next(); // Limpiar entrada no válida
        }
        
        numero = TECLADO.nextInt();

        // Calcular la suma usando el bucle while
        while (i <= numero) {
            suma += i;  // Sumar el valor de i
            i++;        // Incrementar i
        }

        // Mostrar el resultado
        System.out.println("La suma de los números del 1 al " + numero + " es: " + suma);
        TECLADO.close();
		
	}

}
