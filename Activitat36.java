package Program3;

import java.util.Scanner;

public class Activitat36 {
	public static void main (String[] args) {
		int numero;
		int contador=0;
		int numero2=0;
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Visualitzar el següent sèrie tants elements com l’usuari indiqui");
		System.out.print("l’usuari indica un numero");
		
		numero = lector.nextInt();
		lector.nextLine();
		
		while (contador<=numero){
			numero2=contador*2;
			System.out.println(""+numero2+".");
			contador=contador+1;
		}
		lector.close();		
	}
}
