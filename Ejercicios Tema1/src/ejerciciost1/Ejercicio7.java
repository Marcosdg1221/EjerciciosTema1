package ejerciciost1;

import java.util.Scanner; //Importamos el java.util que necesitamos.

public class Ejercicio7 {

public static void main(String[] args) {
		
		//Doy el scanner y las variables necesarias
		
		Scanner all = new Scanner(System.in);
		
		//Dado que milímetros serán las comas del resultado, es una variable double
		
		double milimetros;
		
		//La variable centimetros será un int
		
		int centimetros;
		
		//La variable metros será un int
		
		int metros;
		
		//La variable constante resultado será un double para mostrar las comas
		
		double resultado;
		
		//Lo que escriba el usuario en las siguientes cuestiones serán las variables
		
		System.out.println("Por favor, introduzca una medida en milímetros");
		milimetros = all.nextDouble();
		System.out.println("Por favor, introduzca un número de centímetros");
		centimetros = all.nextInt();
		System.out.println("Por favor, introduzca una medida en metros");
		metros = all.nextInt();
		
		//Ahora, aplicamos esta fórmula, es una suma de todos los valores, con cada uno multiplicando o dividiendo
		//el valor que equivalen en centímetros
		
		resultado = ((milimetros / 10) + (centimetros) + (metros * 100));
		
		//Muestro el resultado en centímetros
		
		System.out.print("En centímetros, La suma de las tres medidas es " + resultado + "cm");
		
		//Cerramos el scanner
		
		all.close();
	}
}
