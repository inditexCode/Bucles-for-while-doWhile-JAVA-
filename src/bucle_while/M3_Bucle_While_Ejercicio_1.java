package bucle_while;

import java.util.Scanner;

public class M3_Bucle_While_Ejercicio_1 {
	
/*
  Sumar los números introducidos por el usuario hasta que se ingrese un número negativo
  Descripción: Crea un programa en Java que le pida al usuario ingresar números
  uno por uno. El programa debe sumar esos números y continuar hasta que el usuario 
  ingrese un número negativo. Una vez ingresado un número negativo, el programa
  debe mostrar la suma total de los números ingresados. 
*/
	public static void main(String[] args) {
		System.out.println("===> BUCLE WHILE 1 EJERCICIO <===");
		System.out.println();
		
		Scanner teclado = new Scanner(System.in);
		int numero;
		int suma=0;
		
		// Solicitar al usuario ingresar números
        System.out.println("Introduce números para sumar. Ingresa un número negativo para terminar:");
        
		while (true) {
			numero = teclado.nextInt();
			
			if(numero<0) {
				break;
			}
			suma+=numero;
		}
		  // Mostrar la suma total
        System.out.println("La suma total de los números ingresados es: " + suma);
        
        teclado.close(); // Cerramos el scanner
	}

}
