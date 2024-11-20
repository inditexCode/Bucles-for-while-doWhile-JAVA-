package bucle_for;

import java.util.Scanner;

public class M1_BucleFor_Ejercicio_4 {

	public static void main(String[] args) {
	
/* Imprimir los Primeros N Números de la Serie Fibonacci
   Enunciado: Escribe un programa que imprima los primeros N números
   de la serie de Fibonacci, donde N es ingresado por el usuario. 
   La serie de Fibonacci comienza con 0 y 1, y cada número posterior es la suma 
   de los dos anteriores.
*/
		
		System.out.println("===> BUCLE FOR 4 EJERICIO <===");
		System.out.println();
		
		Scanner teclado = new Scanner(System.in);
        System.out.print("Serie Fibonacci: ");
        
		int fibonacci = teclado.nextInt();
		int a = 0;
		int b = 1; 
		
		for (int i = 0; i <= fibonacci; i++) {
			System.out.println(" - " + a);
			int siguiente = a + b;
			a = b;
			b = siguiente;
		}
		teclado.close();
		
		
		
	}

}
