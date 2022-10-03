package ejerciciost1;

import java.util.Scanner; //Importamos el java.util que necesitamos.

public class Ejercicio3 {

public static void main(String[] args) {
		
		//Creo una variable int para el primer número introducido
		
		int num1;
		
		//Creo una variable int para el segundo número introducido
		
		int num2;
				
		//Creo otra variable int para guardar el resultado de una operación necesaria
		
		int operacion;
		
		//Creo el resultado final y lo que se mostrará al final
		
		int total;
		
		//Doy el scanner 
		
		Scanner all = new Scanner(System.in);

		//Pido al usuario que introduzca un número
		
		System.out.print("Introduzca un número para una operación ");
		
		//Guarda el primer número que escribió el usuario
		
		num1 = all.nextInt();
		
		//Pido al usuario que introduzca el segundo número
		
		System.out.print("Introduzca un número para una operación ");
				
		//Guarda el segundo número que escribió el usuario
				
		num2 = all.nextInt();
		
		//En la variable operacion guardo el resultado de la suma del primer numero introducido y la 
		//resta entre ese numero y el resto del segundo 
		
		operacion = num2 + (num1 - num1%num2);
		
		//Con total, resto la variable operacion y num1, ese será el número que hay que sumar
		//para que el primer número sea múltiplo del segundo.
		
		total = operacion - num1;
		
		//Muestro el resultado
		
		System.out.print("Habría que sumar " + total);
		
		//Cierro el scanner
		
		all.close();
		}
}
