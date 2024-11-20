package bucle_doWhile;

import java.util.Scanner;

public class M2_Bucle_DoWhile_Ejercicio_2 {

    /*
     * Suma Acumulativa Crea un programa en Java que haga lo siguiente:
     * 
     * Pide al usuario que ingrese números enteros positivos uno por uno. Suma los
     * números que el usuario ingrese. El programa se detiene cuando el usuario
     * ingresa el número 0. Al finalizar, muestra la suma total de los números
     * ingresados.
     */
    public static void main(String[] args) {

        System.out.println("===> BUCLE DO-WHILE 2 EJERCICIO <===");
        System.out.println();

        Scanner teclado = new Scanner(System.in);
        int suma = 0;
        int numero;

        do {
            System.out.print("Ingresa un número entero positivo (0 para salir): ");
            numero = teclado.nextInt();

            // Validación: si el número es negativo, no se suma
            if (numero < 0) {
                System.out.println("Error: El número debe ser positivo.");
            } else {
                suma += numero;  // Sumar solo números positivos
            }

        } while (numero != 0);  // El bucle termina cuando el usuario ingresa 0

        System.out.println("La suma de los números ingresados es: " + suma);
        teclado.close();
    }
}
