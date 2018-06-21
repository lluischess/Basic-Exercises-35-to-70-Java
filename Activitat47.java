package Program3;

import java.util.Scanner;

public class Activitat47 {
	public static void main (String [] args){
		int Num;
		int i =1;
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Calcular el factorial d’ un nombre demanat per teclat.");
		System.out.println("Introduir el numero del que treurem el factorial:");
		
		Num = lector.nextInt();
		lector.nextLine();
		
		while (i<=Num) {
			System.out.println("Numeros:"+i);
			i++;
		}
		
		
		System.out.println("El numero factorial del : "+Num);
		
		
		lector.close();
	}
}
