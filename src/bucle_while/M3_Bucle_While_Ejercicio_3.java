package bucle_while;

import java.util.Scanner;

public class M3_Bucle_While_Ejercicio_3 {
/*
  Calculadora de promedio
  Escribe un programa que permita a un usuario ingresar una serie de números
  para calcular su promedio. El programa debe:

  Solicitar al usuario que ingrese números uno por uno.
  Continuar pidiendo números hasta que el usuario ingrese 0 (cero).
  Calcular y mostrar el promedio de los números ingresados (excluyendo el 0).
  Si el usuario no ingresa ningún número (solo el 0), mostrar un mensaje diciendo 
  que no se puede calcular el promedio.
*/
	public static void main(String[] args) {

		System.out.println("===> BUCLE WHILE 3 EJERCICIO <===");
		System.out.println();
		
		Scanner teclado = new Scanner(System.in);
		int numero;
		int contador=0;
		int suma=0;
		
		while(true) {
			System.out.println("Ingrese los números y calculamos el promedio...");
			numero = teclado.nextInt();
			if(numero == 0 ) {
               break;// Salir del bucle si el número es 0
			}
			suma += numero;
			contador++;
		}

		// calcular promedio
		if(contador > 0) {
			double promedio = (double)suma/contador;
            System.out.println("El promedio de los números ingresados es: " + promedio);
		}else {
            System.out.println("No ingresaste ningún número válido para calcular el promedio.");

		}
		
		teclado.close();
	}

}
