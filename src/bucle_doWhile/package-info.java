package bucle_doWhile;
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
-------------------------------------------------------------------------------------
2 - Suma Acumulativa
Crea un programa en Java que haga lo siguiente:

Pide al usuario que ingrese números enteros positivos uno por uno.
Suma los números que el usuario ingrese.
El programa se detiene cuando el usuario ingresa el número 0.
Al finalizar, muestra la suma total de los números ingresados.
----------------------------------------------------------------------------------------
3 - Promedio de Números
  Crea un programa en Java que haga lo siguiente:

  Pide al usuario que ingrese números enteros positivos uno por uno.
  Suma los números que el usuario ingrese y guarda la cantidad de números ingresados.
  El programa se detiene cuando el usuario ingresa el número 0.
  Al finalizar, muestra el promedio de los números ingresados (excluyendo el 0). 
  Si el usuario no ingresa ningún número válido antes de ingresar el 0, 
  el programa debe mostrar un mensaje indicando que no se pudo calcular el promedio.
-----------------------------------------------------------------------------------------
4 - Contador de Números Pares
  Crea un programa en Java que haga lo siguiente:

  Pide al usuario que ingrese un número entero positivo.
  Usa un bucle do-while para contar cuántos números pares existen entre 1
  y el número ingresado (inclusive).
  El programa debe mostrar la cantidad de números pares que hay hasta el número ingresado.
  Si el usuario ingresa un número negativo o cero, muestra un mensaje de error
  y vuelve a pedir un número positivo.
  ------------------------------------------------------------------------------------
  5 - Calificación de un Curso
   Crea un programa en Java que haga lo siguiente:

  El programa tiene 5 materias: Matemáticas, Lengua, Lógica, Ciencias y programación.
  Pide al usuario que ingrese una nota para cada materia.
  Usa un bucle do-while para permitirle al usuario ingresar una calificación por materia.
  Valida que las notas sean números válidos entre 0 y 10.
  Al final, calcula el promedio de las 5 calificaciones ingresadas y lo muestra en pantalla.
  ---------------------------------------------------------------------------------------
  6 - Verdulería y Frutería

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

   Usa un bucle do-while para mantener el menú activo hasta que el usuario elija la opción de salir (3).
--------------------------------------------------------------------------------------------------------
 7 - Este ejercicio continuamos con el numero 6 pero solo que a los productos le 
 agregaremos el precio, es decir para el array de verduleria tenemos que crear un array 
 de precios, lo mismo para la fruteria y luego imprimir el producto con los respectivos
 precios.
 AYUDA: ES EL MISMO CODIGO QUE EL EJERCICIO ANTERIOR SOLO QUE CREAMOS 2 ARRAYS MAS PARA 
 LOS RESPECTIVOS PRECIOS. MUCHA SUERTE.!!!! 
 ----------------------------------------------------------------------------------------
 8 - "Calculadora de Suma y Resta"

Crea un programa en Java que permita al usuario realizar operaciones de suma y resta. El programa debe:

Mostrar un menú con las siguientes opciones:

1 - Realizar una suma.
2 - Realizar una resta.
3 - Salir.
Si el usuario elige 1, pide dos números y muestra el resultado de la suma.
Si elige 2, pide dos números y muestra el resultado de la resta.

Si elige 3, el programa finaliza con un mensaje de despedida.

Si el usuario ingresa una opción no válida, muestra un mensaje de error y vuelve a mostrar el menú.

Usa un bucle do-while para mantener el menú activo hasta que el usuario elija la opción 3.
-----------------------------------------------------------------------------------------
9 - "Adivina el Animal"

Crea un programa en Java que simule un juego en el que el usuario debe adivinar un animal que la computadora ha seleccionado. El programa debe:

Tener una lista predefinida de animales (ejemplo: perro, gato, elefante, león, tigre).
Elegir un animal al azar de la lista.
Pedir al usuario que adivine el animal.
Usar un bucle do-while para seguir pidiendo al usuario que intente hasta que adivine correctamente.
Si el usuario adivina correctamente, mostrar un mensaje de felicitación.
Si el usuario ingresa "salir", finalizar el programa y mostrar el animal correcto.
-----------------------------------------------------------------------------------

 * */
 