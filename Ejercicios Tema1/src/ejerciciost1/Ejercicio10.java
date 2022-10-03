package ejerciciost1;

import java.util.Scanner; //Importamos el java.util que necesitamos.

public class Ejercicio10 {

public static void main(String[] args) {
		
		Scanner all = new Scanner(System.in);
		
		//Creo una variable double para el número de metros introducido
		
		double metros;
		
		//Creo otra variable int para guardar el resultado de  los centímetros
		
		double centimetros;
		
		//Creo otra variable que será el resultado en centímetros sin decimales
		
		System.out.println("Introduzca la medida en metros del papel lanzado");
		
		
		
		metros= all.nextInt();
		
		centimetros = (int)(metros * 100);
		
		System.out.println("El resultado en centímetros es " + centimetros + " cm");
	
}
}
