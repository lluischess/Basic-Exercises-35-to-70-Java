package Program3;

import java.util.Scanner;

public class Activitat40 {
	public static void main (String[] args) {
		int numero = 1;
		int suma=0;
		
		
		Scanner lector = new Scanner(System.in);
		
		
		while (numero!=0){
			
			System.out.println("Calcular la suma d'una seqüència de nombres acabada amb el 0");
			numero = lector.nextInt();
			lector.nextLine();
			suma=suma+numero;
		}
		
		System.out.println ("suma:"+suma);
		
		lector.close();	
	}
}
