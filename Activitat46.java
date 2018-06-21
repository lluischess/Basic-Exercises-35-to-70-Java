package Program3;

import java.util.Scanner;

public class Activitat46 {
	public static void main (String[] args) {
		int n = 1;
		int multiplicacio;
		Scanner lector = new Scanner(System.in);
		System.out.println("Visualitzar els N primers nombres imparells positius, sent N un valor entrat per teclat.");
		System.out.println("Introduir n.");
		n = lector.nextInt();
		lector.nextLine();	
		System.out.println("Introduir m.");
		if (n<=0) {
			System.out.println("Error");
		}
			
			for (multiplicacio = 1; multiplicacio <=n*2;multiplicacio=multiplicacio+2){
			
			System.out.println(""+multiplicacio+"");
			}
			lector.close();
		}
	}

