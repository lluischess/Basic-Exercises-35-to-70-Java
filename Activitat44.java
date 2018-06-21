package Program3;

import java.util.Scanner;

public class Activitat44 {
	public static void main (String[] args) {
		int numero = 0;
		int multiplicacio;
		int resultat=0;
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduir un número i que es visualitzi la seva taula de multiplicar del 1 al 10");
		numero = lector.nextInt();
		lector.nextLine();	
			
			for (multiplicacio = 1; multiplicacio <=10;multiplicacio++){
			resultat= numero*multiplicacio;
			System.out.println("De la taula del:"+numero+" * "+multiplicacio+" = "+resultat+".");
			}
			lector.close();
		}
	}

