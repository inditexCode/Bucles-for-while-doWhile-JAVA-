package bucle_for;

import java.util.Scanner;

public class M1_BucleFor_Ejercicio_5 {

	public static void main(String[] args) {
		
/*  Escribe un programa que imprima los números del N hasta 1 en orden descendente.
 *  El número N debe ser ingresado por el usuario.
 */

		
		System.out.println("===> BUCLE FOR 5 EJERICIO <===");
		System.out.println();
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese un número y te devuelvo en orden descendiente.");
		int numero = teclado.nextInt();
		
		for (int i = numero; i >=1 ; i--) {
              System.out.println("- " + i );
		}

		teclado.close();
	}

}
