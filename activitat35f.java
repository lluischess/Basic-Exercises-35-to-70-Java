package Program3;

import java.util.Scanner;

public class activitat35f {
	public static void main (String[] args) {
		int numeronatural=0;
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Visualitzar el 20 primers nombres naturals");
		
		for (numeronatural=0;numeronatural<21;numeronatural++){
			
			System.out.println(""+numeronatural+".");
		}
		lector.close();		
	}
}