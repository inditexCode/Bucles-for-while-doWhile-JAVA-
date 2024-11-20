package bucle_while;

import java.util.Scanner;

public class M3_Bucle_While_Ejercicio_8 {
	/*
	 * Número invertido
Escribe un programa que permita al usuario ingresar un número positivo y luego 
lo invierta (por ejemplo, de 1234 a 4321). Usa un bucle while para realizar el cálculo.

Requisitos:
Valida que el número sea positivo.
Usa operaciones matemáticas como módulo y división entera para invertir el número. 
	 * */

	public static void main(String[] args) {

		System.out.println("===> BUCLE WHILE 8 EJERCICIO <===");
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número positivo: ");
        int numero = scanner.nextInt();

        while (numero < 0) {
            System.out.print("Por favor, ingresa un número positivo: ");
            numero = scanner.nextInt();
        }

        int invertido = 0;
        while (numero != 0) {
            int digito = numero % 10; // Obtener el último dígito
            invertido = invertido * 10 + digito; // Añadir el dígito al invertido
            numero /= 10; // Eliminar el último dígito
        }

        System.out.println("El número invertido es: " + invertido);
        scanner.close();
		
	}

}
