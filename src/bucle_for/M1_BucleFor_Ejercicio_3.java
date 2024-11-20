package bucle_for;

import java.util.Scanner;

public class M1_BucleFor_Ejercicio_3 {

	public static void main(String[] args) {
		
/* Contar Números Pares e Impares en un Rango
   Enunciado: Escribe un programa que cuente la cantidad de números pares e impares 
   entre 1 y un número ingresado por el usuario.
*/
	
		System.out.println("===> BUCLE FOR 3 EJERICIO <===");
		System.out.println();
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese un número...");
		int numero = teclado.nextInt();
		int contadorPares = 0;
		int contadorImpares = 0;

		
		for (int i = 1; i <= numero; i++) {
			if(i % 2 == 0) {
				contadorPares++;
			}else {
				contadorImpares++;
			}	
		}
	 System.out.println("Cantidad Números pares: " + contadorPares);
	 System.out.println("Cantidad Números impares: " + contadorImpares);
	 
	 teclado.close();

	}

}
