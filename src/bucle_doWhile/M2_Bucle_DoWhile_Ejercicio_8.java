package bucle_doWhile;

import java.util.Scanner;

public class M2_Bucle_DoWhile_Ejercicio_8 {
	/*
	 * "Calculadora de Suma y Resta" Crea un programa en Java que permita al usuario
	 * realizar operaciones de suma y resta. El programa debe: Mostrar un menú con
	 * las siguientes opciones: 1 - Realizar una suma. 2 - Realizar una resta. 3 -
	 * Salir. Si el usuario elige 1, pide dos números y muestra el resultado de la
	 * suma. Si elige 2, pide dos números y muestra el resultado de la resta. Si
	 * elige 3, el programa finaliza con un mensaje de despedida. Si el usuario
	 * ingresa una opción no válida, muestra un mensaje de error y vuelve a mostrar
	 * el menú. Usa un bucle do-while para mantener el menú activo hasta que el
	 * usuario elija la opción 3.
	 */

	public static void main(String[] args) {

		System.out.println("===> BUCLE DO-WHILE 8 EJERCICIO <===");
		System.out.println();

		Scanner teclado = new Scanner(System.in);
		int opcion;

		do {
			System.out.println("1 - Realizar una suma.");
			System.out.println("2 - Realizar una resta.");
			System.out.println("3 - Realizar una Salir.");
			opcion = teclado.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("Ingrese el primer número");
				double num1 = teclado.nextDouble();
				System.out.println("Ingrese el segundo número");
				double num2 = teclado.nextDouble();
				System.out.println("El total de la suma es: " + (num1 + num2));
				break;
			case 2:
				System.out.println("Ingrese el primer número");
				 num1 = teclado.nextDouble();
				System.out.println("Ingrese el segundo número");
				 num2 = teclado.nextDouble();
				System.out.println("El total de la resta es: " + (num1 - num2));
				break;
			case 3:
				System.out.println("Gracias por usar nuestro programa....");
				break;
			default:
				System.out.println("Opción incorrecta vuelva a elegir");
				break;
			}

		} while (opcion != 3);
          teclado.close();
	}

}
