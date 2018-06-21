package Program3;

import java.util.Scanner;

public class Activitat35 {
	public static void main (String[] args) {
		int numeronatural=0;
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Visualitzar el 20 primers nombres naturals");
		
		while (numeronatural<21){
			System.out.println(""+numeronatural+".");
			numeronatural=numeronatural+1;
		}
		lector.close();		
	}
}
