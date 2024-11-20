package bucle_for;

public class M1_BucleFor_Ejercicio_9 {

	public static void main(String[] args) {
		
        /* EJERCICIO DE PIRÁMIDE EN FORMA DE ÁRBOL DE NAVIDAD 
     Escribe un programa en Java que imprima un árbol de Navidad utilizando asteriscos (*).
     El árbol debe estar centrado en la consola,
     Utiliza bucles for anidados para manejar los espacios y los asteriscos en cada línea.
     El número de asteriscos en cada fila sigue la fórmula:
     2 * i - 1, donde i es el número de la fila actual.
         * */
        
        System.out.println("===> BUCLE FOR EJERCICIO 9 ÁRBOL DE NAVIDAD <===");
        System.out.println();

        int altura = 5;
        
        for (int i = 1; i <= altura; i++) {
        	
            // Imprimir espacios antes de los asteriscos
           for (int j = 1; j <= altura - i; j++) {
			System.out.print(" ");
		}
           // Imprimir los asteriscos para formar la pirámide
      for (int e = 1; e <= (2 * i - 1); e++) {
		System.out.print("*");
	}
      // Saltar a la siguiente línea después de imprimir cada fila
      System.out.println();
		}
        System.out.println("ÁRBOL DE NAVIDAD");
	}
}
