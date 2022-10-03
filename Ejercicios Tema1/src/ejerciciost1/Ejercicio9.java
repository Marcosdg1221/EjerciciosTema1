package ejerciciost1;

import java.util.Scanner; //Importamos el java.util que necesitamos.

public class Ejercicio9 {

	public static void main(String[] args) {
		//Doy el scanner y las variables necesarias
		
				Scanner all = new Scanner(System.in);
				
				//Las variables numero1 y numero2 pueden ser constantes;
				
				final int numero1;
				
				//numero2 será constante, y como el anterior, será un int
				
				final int numero2;
				
				//Creo una variable booleana para poder comprobar si los dos números son iguales
				
				boolean igual;
				
				//Lo que escriba el usuario en las siguientes preguntas serán las variables
				
				System.out.println("Introduzca el número que desee");
				numero1 = all.nextInt();
				System.out.println("Introduzca otro número, se mostrará si es igual al primer número");
				numero2 = all.nextInt();
				
				//Ahora es momento del boolean simplemente si los números son iguales, devolverá true.
				
				igual = (numero1 == numero2);
				
				//Muestro el resultado con un true o false.
				
				System.out.println("El número es igual " + igual);
				
				//Cierro scanner
				
				all.close();
			}
	}
	
