package bucle_doWhile;

import java.util.Random;
import java.util.Scanner;

public class M2_Bucle_DoWhile_Ejercicio_1 {
/*
 1 -  Adivina el Número
  Crea un programa en Java que haga lo siguiente:

  Genera un número aleatorio entre 1 y 100.
  Pide al usuario que adivine el número.
  Usa un bucle do-while para seguir pidiendo números hasta que el usuario acierte.
  Si el número ingresado por el usuario es mayor o menor que el número generado,
  muestra un mensaje indicando si debe intentar con un número más alto o más bajo.
  Cuando el usuario acierte, muestra un mensaje de felicitación e indica 
  cuántos intentos tomó. 
*/

    public static void main(String[] args) {
        System.out.println("===> BUCLE DO-WHILE 1 EJERCICIO <===");
        System.out.println();

        Random random = new Random();
        boolean bandera = false;
        int contador = 0;

        Scanner teclado = new Scanner(System.in);

        // Genera un número aleatorio entre 1 y 100
        int aleatorio = random.nextInt(100) + 1;

        do {
            System.out.println("Ingrese un número aleatorio del 1 al 100: ");
            int numeroIngresado = teclado.nextInt();

            // Verifica si el número está fuera del rango
            if (numeroIngresado < 1 || numeroIngresado > 100) {
                System.out.println("Error - Ingresa un número del 1 al 100.");
                continue; // Vuelve al inicio del bucle sin ejecutar el resto del código
            }

            contador++; // Incrementa el contador en cada intento válido

            if (numeroIngresado == aleatorio) {
                System.out.println("¡Felicidades 🥳🥳🥳! Ganaste el juego en " + contador + " intentos.");
                bandera = true;
            } else if (numeroIngresado > aleatorio) {
                System.out.println("El número es más bajo. ¡Intenta de nuevo!");
            } else {
                System.out.println("El número es más alto. ¡Intenta de nuevo!");
            }
        } while (!bandera);

        teclado.close(); // Cierra el recurso Scanner
    }
}
