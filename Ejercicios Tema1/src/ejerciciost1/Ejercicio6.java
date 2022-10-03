package ejerciciost1;

import java.util.Scanner; //Importamos el java.util que necesitamos.

public class Ejercicio6 {

public static void main(String[] args) {
		
		//Doy el scanner y las variables necesarias
		
		Scanner all = new Scanner(System.in);
		
		//Pongo la variable segundos
		
		int segundos;
		
		//Pongo la variable minutos
		
		int minutos;
		
		//Pongo la variable horas
		
		int horas;
		
		
		//Lo que escriba el usuario a la siguiente cuestión será el valor de la variable segundos
		
		System.out.println("Introduzca un número de segundos, se calculará cuánto equivale en horas, minutos y segundos");
		segundos = all.nextInt();
		
		//Un minuto equivale a 60 segundos, dividimos segundos entre sesenta.
		
		minutos = (segundos/60);
		
		//Una hora equivale a 3600 segundos, dividimos segundos entre tres mil seiscientos.
		
		horas = (segundos/3600);
		
		//Muestro el resultado en una frase
		
		System.out.println("En horas equivale a " + horas + " en minutos, equivale a " + minutos);
		
		//Muestro el número de segundos introducido
		
		System.out.print(" Número de segundos introducidos; " + segundos);
		
		//Cierro el scanner
		
		all.close();
	}
}
