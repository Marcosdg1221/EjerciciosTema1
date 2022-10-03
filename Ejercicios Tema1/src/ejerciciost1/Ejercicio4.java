package ejerciciost1;

import java.util.Scanner; //Importamos el java.util que necesitamos.

public class Ejercicio4 {

	public static void main(String[] args) {
		
		//Doy el scanner y las variables necesarias
		
		Scanner all = new Scanner(System.in);
		
		//Ya que las dos variables nunca cambiarán, introduzco double constantes
		
		final double base, altura;
		
		//La área, al igual que la base y la altura, puede mostrar decimales para que sea más exacto
		
		double area; 

		//Lo que escriba el usuario en las siguientes preguntas serán las variables
		
		System.out.print("Por favor, escriba la base de un triángulo en cm, se calculará su área ");
		base = all.nextInt();
		System.out.print("Se necesita la altura en cm para calcular su área, introduzca su valor ");
		altura = all.nextInt();
		
		//Ahora aplicamos la fórmula con los valores tomados
		
		area= ((base * altura)/2);
		
		//Muestro el resultado
		
		System.out.print("El área del triángulo es " + area + " cm");
		
		//Cerramos el scanner
		
		all.close();
	}
}