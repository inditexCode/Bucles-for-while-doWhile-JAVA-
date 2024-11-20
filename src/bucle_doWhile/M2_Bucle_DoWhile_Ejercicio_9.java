package bucle_doWhile;

import java.util.Random;
import java.util.Scanner;

public class M2_Bucle_DoWhile_Ejercicio_9 {

	/*
"Adivina el Animal"

Crea un programa en Java que simule un juego en el que el usuario debe adivinar un animal
que la computadora ha seleccionado. El programa debe:

Tener una lista predefinida de animales (ejemplo: perro, gato, elefante, león, tigre).
Elegir un animal al azar de la lista.
Pedir al usuario que adivine el animal.
Usar un bucle do-while para seguir pidiendo al usuario que intente hasta que adivine correctamente.
Si el usuario adivina correctamente, mostrar un mensaje de felicitación.
Si el usuario ingresa "salir", finalizar el programa y mostrar el animal correcto.*/

	public static void main(String[] args) {

		System.out.println("===> BUCLE DO-WHILE 9 EJERCICIO <===");
		System.out.println();
		
        String[] animales = {"perro", "gato", "pajaro", "tigre", "leon", "puma"};
		
		Random random = new Random();
		String animalSeleccionado = animales[random.nextInt(animales.length)];
		Scanner teclado = new Scanner(System.in);
		String intentos;
		
		do {
            System.out.print("Adivina el animal (o escribe 'salir' para rendirte): ");
            intentos = teclado.nextLine().toLowerCase();
            
            if(intentos.equals("salir")) {
            System.out.println("Te rendiste. El animal correcto era: " + animalSeleccionado);
             break;
            }
            if(intentos.equals(animalSeleccionado)) {
            System.out.println("¡Felicidades! Adivinaste correctamente: " + animalSeleccionado);
            }else {
                System.out.println("No es correcto. ¡Intenta de nuevo!");
            }
		}while(!intentos.equals(animalSeleccionado));
		
		 System.out.println("Gracias por jugar. ¡Hasta la próxima!");
         teclado.close();
	}
}
