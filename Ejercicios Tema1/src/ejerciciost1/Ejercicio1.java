package ejerciciost1;

import java.util.Scanner; //Importamos el java.util que necesitamos.

public class Ejercicio1 {
	public static void main(String[] args) {
		
		//Creamos las variables necesarias
	
		double numero;
		
		//Doy el scanner para que los programas que introducen scanner lo usemos.
		
		Scanner all = new Scanner(System.in);

		//Pregunto al usuario un numero con decimales.
		
		System.out.print("Escriba un número con decimales, se redondeará ese número ");
		
		//Lo que escriba el usuario será el valor de la variable número.
		
		numero = all.nextDouble();
		
		//Ese número lo convierto en int, por lo que ya no es un número que tome en cuenta los decimales.
		
		numero = (int) (numero + 0.5);
		
		//Muestro el resultado
		
		System.out.print("Ese número redondeado es " + numero);
		
		//cierro el scanner
		
		all.close();
	}
}
