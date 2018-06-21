package Program3;

import java.util.Scanner;

public class Activitat48 {
	public static void main (String[] args) {
		int c1;
		int c2;
		int numero = 0;
		Scanner lector = new Scanner(System.in);
		System.out.println("Visualitzar un quadrat de N asteriscs, sent N un valor entrat per teclat");	
		numero = lector.nextInt();
		for (c1 = 1; c1<=numero;c1++ ){
			System.out.println();
			for (c2=1;c2<=numero;c2++)
				System.out.print("*");
			lector.close();
		}
	}
	}
	

