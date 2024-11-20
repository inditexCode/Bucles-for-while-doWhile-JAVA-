package bucle_for;

import java.util.Scanner;

public class M1_BucleFor_Ejercicio_2 {

	public static void main(String[] args) {
		
/*  Crea un programa que pida al usuario un número entero
    y luego imprima la tabla de multiplicar de ese número (del 1 al 10)
    usando un bucle for.*/
		
		
		System.out.println("===> BUCLE FOR 2 EJERICIO <===");
		System.out.println();
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese un nùmero y te devuelvo la tabla de multiplicar");
		int numero = teclado.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(numero  + " X " + i + " = " + (numero * i));
		}
		
		teclado.close();
		
		
	}

}
