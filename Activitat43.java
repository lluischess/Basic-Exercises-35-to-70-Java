package Program3;

import java.util.Scanner;

public class Activitat43 {
	public static void main (String[] args) {
		int numero = 1;
		double suma=0;
		double mitjana;
		int contador=0;
		int gran;
		int petit;
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Calcular la mitja aritmètica d’ una seqüència de nombres acabada amb el 0.");
		numero = lector.nextInt();
		lector.nextLine();
		
		gran= numero;
		petit=numero;
		while (numero!=0){
			
			suma=suma+numero;
			if (numero>gran){
				gran=numero;
			}
			
			else{
				
				petit=numero;
			}
			contador=contador+1;
			numero = lector.nextInt();
			lector.nextLine();
		}
		
		mitjana=suma/contador;
		
		System.out.println ("mitjana:"+mitjana);
		System.out.println ("el mes gran:"+gran);
		System.out.println ("el mes petit:"+petit);
		
		lector.close();	
	}
}
