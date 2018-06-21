package Program3;

import java.util.Scanner;

public class Activitat41 {
	public static void main (String[] args) {
		int numero = 1;
		int suma=0;
		int mitjana;
		int contador=0;
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Calcular la mitja aritmètica d’ una seqüència de nombres acabada amb el 0.");
		numero = lector.nextInt();
		lector.nextLine();
		
		while (numero!=0){
			
			suma=suma+numero;
			contador++;
			numero = lector.nextInt();
			lector.nextLine();
		}
		if (contador ==0){
		System.out.println ("NO HI HA NUMEROS A CALCULAR");
		}
		else {
			mitjana=suma/contador;
			System.out.println ("suma:"+mitjana);
		}
		
		lector.close();	
	}
}
