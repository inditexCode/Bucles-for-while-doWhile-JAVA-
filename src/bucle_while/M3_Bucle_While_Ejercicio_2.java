package bucle_while;

import java.util.Random;
import java.util.Scanner;

public class M3_Bucle_While_Ejercicio_2 {
/*
  Adivinar el número
  Descripción: Crea un programa que genere un número aleatorio entre 1 y 100,
  y le pida al usuario adivinar ese número. El programa debe dar pistas al usuario 
  si el número ingresado es mayor o menor que el número secreto. 
  El bucle while continuará ejecutándose hasta que el usuario adivine el número correcto.
*/
	public static void main(String[] args) {
		
		System.out.println("===> BUCLE WHILE 2 EJERCICIO <===");
		System.out.println();
		
		Scanner teclado = new Scanner(System.in);
		
		Random random = new Random();
		int numero;
        
		// Generamos un número aleatorio entre 1 y 100
		int aleatorio = random.nextInt(100) + 1;

        System.out.println("¡Bienvenido al juego de Adivina el Número!");
        System.out.println("Estoy pensando en un número entre 1 y 100.");
        
        while(true) {
            System.out.print("Introduce tu intento: ");
        	numero = teclado.nextInt();
        	
        	if(numero == aleatorio) {
        		System.out.println("Felicidades ganaste el juego.!!!");
        		System.out.println("Número ingresado -> " + numero + " ==> " + aleatorio);
        		break;
        	}
        	if(numero < 0 || numero >100 ) {
        		System.out.println("Error elija un Número del 1 al 100");
        	}else if(numero<aleatorio) {
        		System.out.println("Más alto.!!!");
        	}else if(numero > aleatorio) {
        		System.out.println("Más bajo.!!!");
        	}else {
        		System.out.println("Valor ingresado incorrecto...");
        	}
        	
        }
        
        teclado.close();

	}

}
