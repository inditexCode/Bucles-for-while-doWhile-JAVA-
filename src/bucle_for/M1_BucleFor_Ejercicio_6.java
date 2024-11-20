package bucle_for;

import java.util.Scanner;

public class M1_BucleFor_Ejercicio_6 {

	public static void main(String[] args) {
 /*    Escribe un programa que imprima los números pares con un msj y los numeros
  *    impares con otro mensaje, el numero lo debe ingresar el usuario
 */
		System.out.println("===> BUCLE FOR 6 EJERICIO <===");
		System.out.println();
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese un número.");
		int numero = teclado.nextInt();

		for (int i = 0; i < numero; i++) {
			System.out.println("Cantidad de veces que se recorre con el bucle " + numero);
		}
		if(numero % 2 == 0) {
			System.out.println("Es par " + numero);
		}else {
			System.out.println("Es impar " + numero);
		}
		
		teclado.close();
	}

}
