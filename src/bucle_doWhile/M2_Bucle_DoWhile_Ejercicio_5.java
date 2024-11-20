package bucle_doWhile;

import java.util.Scanner;

public class M2_Bucle_DoWhile_Ejercicio_5 {
	/*
	 * Calificación de un Curso Crea un programa en Java que haga lo siguiente:
	 * 
	 * El programa tiene 5 materias: Matemáticas, Lengua, Lógica, Ciencias y
	 * programación. Pide al usuario que ingrese una nota para cada materia. Usa un
	 * bucle do-while para permitirle al usuario ingresar una calificación por
	 * materia. Valida que las notas sean números válidos entre 0 y 10. Al final,
	 * calcula el promedio de las 5 calificaciones ingresadas y lo muestra en
	 * pantalla.
	 */

	public static void main(String[] args) {

		System.out.println("===> BUCLE DO-WHILE 5 EJERCICIO <===");
		System.out.println();

		String[] materias = { "Matemáticas", "Lengua", "Lógica", "Ciencias", "programación" };

		Scanner teclado = new Scanner(System.in);
		double sumaNotas = 0;
		double promedio;
		double notas;
		int cantidadNotas = 0;

		do {
			System.out.print("Ingresa la calificación para " + materias[cantidadNotas] + " (0-10): ");
			notas = teclado.nextDouble();
			if (notas >= 0 && notas <= 10) {
				sumaNotas += notas;
				cantidadNotas++;
			} else {
				System.out.println("Error: La nota debe estar entre 0 y 10.");
			}

		} while (cantidadNotas < 5);

		promedio = sumaNotas / cantidadNotas;

		System.out.println("El promedio final del curso es: " + promedio);

		teclado.close();

	}

}
