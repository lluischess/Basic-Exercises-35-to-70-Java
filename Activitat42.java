package Program3;

import java.util.Scanner;

public class Activitat42 {
	public static void main (String[] args) {
		int numero = 1;
		int gran;
		
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Dir quin és el valor més gran d’ una seqüència de nombres acabada amb el 0.");
		numero = lector.nextInt();
		lector.nextLine();
		
		gran = numero;
		
		while (numero!=0){
			
			if (numero>gran){
				gran=numero;
			}
			
			numero = lector.nextInt();
			lector.nextLine();
		}
		
		System.out.println ("El mes gran es: "+gran);
		
		lector.close();	
	}
}
