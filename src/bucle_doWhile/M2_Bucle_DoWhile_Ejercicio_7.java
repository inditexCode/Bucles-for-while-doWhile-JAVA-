package bucle_doWhile;

import java.util.Scanner;

public class M2_Bucle_DoWhile_Ejercicio_7 {
	/*
 Este ejercicio continuamos con el numero 6 pero solo que a los productos le 
 agregaremos el precio, es decir para el array de verduleria tenemos que crear un array 
 de precios, lo mismo para la fruteria y luego imprimir el producto con los respectivos
 precios.
 AYUDA: ES EL MISMO CODIGO QUE EL EJERCICIO ANTERIOR SOLO QUE CREAMOS 2 ARRAYS MAS PARA 
 LOS RESPECTIVOS PRECIOS. MUCHA SUERTE.!!!! 
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("===> BUCLE DO-WHILE 7 EJERCICIO <===");
		System.out.println();
		
		Scanner teclado = new Scanner(System.in);
		String[]verduleria= {"Papas","Cebollas","Zanahorias","Cabalaza","Morron"};
		double[]precioVerduras= {1.29,1.89,2.24,1.98,2.35};
		String[]fruteria= {"Manzana","Peras","Naranjas","Ciruelas","Mandarinas"};
		double[]precioFruteria= {1.25,1.95,2.02,2.12,2.89};
		
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
                     System.out.printf(" - %s: $%.2f%n", verduleria[i], precioVerduras[i]);
				 }
				 System.out.println("-------------------------------------");
				 break;
			 case 2:
				 System.out.println("* Productos de fruteria 🍎🍊🍐");
				 for (int i = 0; i < fruteria.length; i++) {
                     System.out.printf(" - %s: $%.2f%n", fruteria[i], precioFruteria[i]);
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
