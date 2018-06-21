package Program3;

import java.util.Scanner;

public class Activitat52 {
	public static void main (String[] args) {	
			int n1;
			int n2;
			int mcd = 1;
			System.out.println(". Fer un programa que calculi el N termes de la sèrie Fibonacci. ");	
			Scanner lector = new Scanner(System.in);
			n1= lector.nextInt();
			
			lector.nextLine();
			n2 = lector.nextInt();
			lector.nextLine();
			
			while ((n2>0) && (n1>0)){
				mcd=n1 % n2;
				n1 = n2;
				n2 = mcd;
			}
			System.out.println("El resultado:"+n1+"");
			lector.close();
	}
	}
	

