package ejerciciost1;

import java.util.Scanner; //Importamos el java.util que necesitamos.

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//Creo una variable int para el número introducido
		
		int numero;
		
		//Creo otra variable int para guardar el resultado de una operación necesaria
		
		int otro;
		
		//Creo el resultado final y lo que se mostrará al final
		
		int total;
		
		//Doy el scanner 
		
		Scanner all = new Scanner(System.in);

		//Pido al usuario que introduzca un número
		
		System.out.print("Introduzca un número, se mostrará cuanto es necesario sumarle para que sea múltiplo 7 ");
		
		//Guarda el número que escribió el usuario
		
		numero = all.nextInt();
		
		//En la variable otro guardo el resultado de la suma del numero introducido y la 
		//resta entre siete y el resto de la división de ese número entre siete
		//Si el número introducido ya es un múltiplo de 7, mostrará 0
		
		otro = (7 - numero%7) != 7 ? (7 - numero%7) : 0;
		
		 //intento hacer que si pones siete te ponga 0 y no siete.
		
		
		//Con total, resto la variable otro y numero, ese será el número que hay que sumar
		//para que sea múltiplo por siete
		
		//Muestro el resultado
		
		System.out.print("Habría que sumar " + otro + " para que sea múltiplo de 7");
		
		//Cierro el scanner
		
		all.close();
		}
}

