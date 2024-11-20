package bucle_for;

import java.util.Scanner;

public class M1_BucleFor_Ejercicio_1 {

	public static void main(String[] args) {
	
/* Suma de Números del 1 al N
  Descripción: Crea un programa que pida al usuario un número entero positivo N
  y luego calcule la suma de todos los números desde 1 hasta N. 
  Utiliza un bucle for para realizar la suma.

  Instrucciones:

  Solicita al usuario que ingrese un número N.
  Usa un bucle for para sumar todos los números de 1 a N.
  Muestra el resultado de la suma.*/

		
		System.out.println("===> BUCLE FOR 1 EJERICIO <===");
		System.out.println();

	   Scanner teclado = new Scanner(System.in);
	   System.out.println("Ingrese un nùmero entero...");
	   int numero = teclado.nextInt();
	   int suma = 0;
	   
	   for (int i = 1; i <= numero; i++) {
		suma += i;
	}
       System.out.println("La suma de los números del 1 al " + numero + " es: " + suma);
	   
	   teclado.close();
	   
	}

}
