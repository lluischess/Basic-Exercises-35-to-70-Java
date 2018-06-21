package Program3;

import java.util.Scanner;

public class Activitat39 {
	public static void main (String[] args) {
		int numero = 0;
		int contador=0;
		int suma=0;
		
		Scanner lector = new Scanner(System.in);
		System.out.println("D’una llista de 10 nombres calcular la seva mitja aritmètica");
		System.out.println("l’usuari indica un numero");
		
		
		for (contador=0;contador<=10;contador++){
			
			numero = lector.nextInt();
			suma=suma+numero;
			System.out.println("introdueix numero");
		}
		
		
		System.out.println("mitjana: "+suma/10+"");
		lector.close();	
		
	}
	
}
