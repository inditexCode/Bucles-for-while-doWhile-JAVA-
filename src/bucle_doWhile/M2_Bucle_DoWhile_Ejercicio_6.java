package bucle_doWhile;

import java.util.Scanner;

public class M2_Bucle_DoWhile_Ejercicio_6 {
	/*
	 * Verdulería y Frutería

  Crea un programa en Java que permita al usuario explorar 
  una lista de productos disponibles en una verdulería y una frutería. 
  El programa debe cumplir con los siguientes requisitos:

  Muestra un menú con las siguientes opciones:

1 - Mostrar productos de la Verdulería.
2 - Mostrar productos de la Frutería.
3 - Salir del programa.
    
    Según la opción ingresada por el usuario:

    Si elige 1, muestra una lista de productos disponibles en la Verdulería.
    Si elige 2, muestra una lista de productos disponibles en la Frutería.
    Si elige 3, muestra un mensaje de despedida y finaliza el programa.
    Si el usuario ingresa una opción no válida, muestra un mensaje de error
    indicando que la opción es inválida, y vuelve a mostrar el menú.

   Usa un bucle do-while para mantener el menú activo hasta que el usuario
   elija la opción de salir (3).
	 * */

	public static void main(String[] args) {

		System.out.println("===> BUCLE DO-WHILE 6 EJERCICIO <===");
		System.out.println();
		
		Scanner teclado = new Scanner(System.in);
		String[]verduleria= {"Papas","Cebollas","Zanahorias","Cabalaza","Morron"};
		String[]fruteria= {"Manzana","Peras","Naranjas","Ciruelas","Mandarinas"};
		
		int ingreso;
		do {
			System.out.println(" 1 - Verduleria");
			System.out.println(" 2 - Fruteria");
			System.out.println(" 3 - Salir");
			  ingreso = teclado.nextInt();
			 
			 switch(ingreso) {
			 case 1:
				 System.out.println("* Productos de verduleria 🫑🥔🧅");
				 for (int i = 0; i < verduleria.length; i++) {
	                    System.out.println(" - " + verduleria[i]);

				 }
				 System.out.println("-------------------------------------");
				 break;
			 case 2:
				 System.out.println("* Productos de fruteria 🍎🍊🍐");
				 for (int i = 0; i < fruteria.length; i++) {
                    System.out.println(" - " + fruteria[i]);
				}
				 System.out.println("-------------------------------------");
				 break;
			 case 3:
				 System.out.println("Gracias por usar el programa...");
				 break;
				 default:
					 System.out.println("Opción ingresada inválida, vuelva a elegir");
					 System.out.println("-------------------------------------");
					 break; 
			 }	
		}while(ingreso!=3);
          teclado.close();
	}

}
