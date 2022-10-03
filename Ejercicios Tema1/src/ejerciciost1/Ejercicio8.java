package ejerciciost1;

import java.util.Scanner; //Importamos el java.util que necesitamos.

public class Ejercicio8 {

public static void main(String[] args) {
		
		//Doy el scanner y las variables necesarias
		
		Scanner all = new Scanner(System.in);
		
		//Tanto la variable entradasinfantiles como la de entradasadultos son constantes, ponemos final int
		
		final int entradasinfantiles;
		
		//En esta variable hacemos lo mismo
		
		final int entradasadultos;
		
		//Ya que esta variable tendrá comas, será un double
		
		double resultado;
		
		//Lo que escriba el usuario en las siguientes cuestiones serán las variables
		
		System.out.println("Introduzca el número de entradas infantiles que desea comprar");	
		entradasinfantiles = all.nextInt();
		System.out.println("Introduzca el número de entradas para adultos que desea comprar");
		entradasadultos = all.nextInt();
		
		//En las dos variables de las entradas multiplicamos el numero de entradas por el precio y luego los sumamos
		
		resultado = ((entradasinfantiles * 15.50) + (entradasadultos * 20));
		
		//Si el resultado es menor que 100, no se le aplicará el descuento del 5%, si lo es, sí se le aplicará.
		
		resultado = resultado<100 ? resultado : (resultado - (resultado * 5) / 100);
		
		//Muestro el resultado en euros
		
		System.out.println("El precio de la compra es; " + resultado + "€");
		
		//Cierro scanner
		
		all.close();
	}
}

	
