package Program3;

import java.util.Scanner;

public class Activitat45 {
	public static void main (String[] args) {
		int n = 0;
		int m =0;
		int multiplicacio;
		int resultat=0;
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduir dos número n i m i fer la taula del 1 al n del número m.");
		System.out.println("Introduir n.");
		n = lector.nextInt();
		lector.nextLine();	
		System.out.println("Introduir m.");
		m = lector.nextInt();
		lector.nextLine();	
			
			for (multiplicacio = 1; multiplicacio <=m;multiplicacio++){
			resultat= n*multiplicacio;
			
			System.out.println("De la taula del:"+n+" * "+multiplicacio+" = "+resultat+".");
			}
			lector.close();
		}
	}

