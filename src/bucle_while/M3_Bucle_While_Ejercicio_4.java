package bucle_while;

import java.time.LocalTime;
import java.util.Scanner;

public class M3_Bucle_While_Ejercicio_4 {

	/*
	 * Menú interactivo Crea un programa que muestre un menú interactivo al usuario
	 * con varias opciones. El usuario podrá seleccionar una opción y el programa
	 * responderá de acuerdo con la selección. El menú debe repetirse hasta que el
	 * usuario elija la opción de salir. 1: Saludar. 2: Mostrar la hora actual. 3:
	 * Mostrar un mensaje motivacional. 4: Salir. REQUISITOS PARA LA HORA ACTUAL. -
	 * import java.time.LocalTime; - LocalTime horaActual = LocalTime.now();
	 */
	public static void main(String[] args) {
		System.out.println("===> BUCLE WHILE 4 EJERCICIO <===");
		System.out.println();

		Scanner teclado = new Scanner(System.in);
		int opcion = 0;

		while (opcion != 4) {
			// mostrar el menu
			System.out.println("\n=== Menú Interactivo ===");
			System.out.println("1. Saludar");
			System.out.println("2. Mostrar la hora actual");
			System.out.println("3. Mostrar un mensaje motivacional");
			System.out.println("4. Salir");
			System.out.print("Elige una opción: ");

			// Leer la opción del usuario
			if (teclado.hasNextInt()) {
				opcion = teclado.nextInt();
				// Procesar la opción seleccionada
				switch (opcion) {
				case 1:
					System.out.println("¡Hola! Espero que tengas un gran día 😊");
					break;
				case 2:
					LocalTime horaActual = LocalTime.now();
					System.out.println("La hora actual es: " + horaActual);
					break;
				case 3:
					System.out.println("¡Nunca te rindas! Cada día es una nueva oportunidad.");
					break;
				case 4:
					System.out.println("Gracias por usar el programa, Hasta luego...!");
					break;
				default:
					System.out.println("Opción inválida. Por favor, elige una opción entre 1 y 4.");
				}
			} else {
				System.out.println("Entrada inválida. Por favor, ingresa un número.");
				teclado.next(); // Limpiar la entrada no válida
			}
		}

		teclado.close();
	}

}
