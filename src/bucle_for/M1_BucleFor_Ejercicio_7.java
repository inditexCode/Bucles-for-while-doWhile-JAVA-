package bucle_for;

public class M1_BucleFor_Ejercicio_7 {

	public static void main(String[] args) {
		
/*  Escribe un programa que almacene una serie de números en un array
 *   y luego calcule el promedio de esos números utilizando un bucle for.

    Instrucciones:

    Crea un array de números enteros.
    Usa un bucle for para sumar todos los elementos del array.
    Calcula el promedio dividiendo la suma por la cantidad de elementos.
    Muestra el promedio en pantalla.
    Ejemplo: Si el array contiene los números {4, 8, 15, 16, 23, 42}, 
    el programa debe calcular y mostrar el promedio de esos números.
*/
		System.out.println("===> BUCLE FOR 7 EJERICIO <===");
		System.out.println();
		
		int[]numeros = {1,8,6,9,8,4,3,2,7};
		
		int suma = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i];
		}
		double promedio = (double) suma / numeros.length;
		System.out.println(promedio);
		
		
		

	}

}
