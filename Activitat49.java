package Program3;

import java.util.Scanner;

public class Activitat49 {
	public static void main (String[] args) {
		int usuari;
		int comptador = 1;
		int a;
		int i;
		Scanner lector = new Scanner(System.in);
		System.out.println("Fer un algorisme que escrigui el triangle de Floyd. Inicialment llegirem un número N enter que representarà el número de files a escriure.");	
		usuari = lector.nextInt();
		for (i = 1; i <= usuari; i++ ){
			for (a = 1; a <=i; a++) {
				System.out.print(""+comptador+"\t");
			comptador++;
		}
			System.out.print("\n");
			lector.close();
		}
	}
	}

