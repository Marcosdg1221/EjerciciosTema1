package ejerciciost1;

import java.util.Scanner; //Importamos el java.util que necesitamos.

public class Ejercicio5 {

	public static void main(String[] args) {
		
		//Doy el scanner y las variables necesarias
		
		Scanner all = new Scanner(System.in);
		
		//Las variables a,b,c y x presentan las mismas características. 
		//para añadirlos en una línea introducimos una coma y un espacio;
		
		int a, b, c, x;
		
		//El resultado (y) no cambia, podemos aplicarle un final para que sea constante
		
		final int y;
		
		//Ahora explico el ejercicio para que el usuario sepa qué vamos a hacer
		
		System.out.println("Se va a realizar la siguiente ecuación; y=ax^2+bx+c ");
		
		//Lo que escriba el usuario en las siguientes cuestiones serán las respectivas variables
		
		System.out.print("Introduzca el valor de a ");
		a = all.nextInt();
		System.out.print("Introduzca el valor de b ");
		b = all.nextInt();
		System.out.print("Introduzca el valor de c ");
		c = all.nextInt();
		System.out.print("Introduzca el valor de x ");
		x = all.nextInt();
		
		//Ahora, aplicamos la fórmula
		
		y = ((a * x)*(a*x)+(b * x) + c);
		
		//Teniendo ya el resultado, mostramos la solución al usuario
		
		System.out.print("El resultado de la operación es " + y);
		
		//Cerramos el scanner
		
		all.close();
	}
}
