package Program3;



import java.util.Scanner;
//65. Calcular la mitja aritm�tica d�una s�rie de d�enters positius que finalitza amb el 0, nom�s els enters positius.

public class Activitat65 {
	public static void main(String[]args){
		Scanner lector = new Scanner(System.in);
			
		/*Vairables*/
		int ContNumeros, numero, CalaixNumeros;
		double MitjaAritmetica;
		boolean correcte;
		
		//iniciem el contador
		MitjaAritmetica = 0;
		ContNumeros = 0;
		CalaixNumeros = 0;
		
		//demanar el numero
		System.out.println("Introdueix una s�rie de n�meros, per acabar fica un 0.");
		correcte = lector.hasNextInt();
		
		//control enter			
		if(correcte){
			numero = lector.nextInt();
			lector.nextLine();
			//bucle	
			while(numero != 0){
				if(numero > 0){
					CalaixNumeros = CalaixNumeros + numero;
					ContNumeros = ContNumeros + 1;
				}
				
				//Tornem a llegir un altre n�mero.
				correcte = lector.hasNextInt();

				while(correcte == false){
					lector.nextLine();
					correcte = lector.hasNextInt();

				}
				
				numero = lector.nextInt();
				lector.nextLine();
			}
			
			//Calcular mitja
			if (ContNumeros != 0) {
			   MitjaAritmetica = (double)(CalaixNumeros) / (ContNumeros);
			   System.out.println(MitjaAritmetica +"  Aquesta es la mitja aritm�tica dels positius entrats a la s�rie.");
			}
			else {
				System.out.println("No es pot calcular la mitjana");
			}
		
			
		}
			
		else{
			System.out.println("Has d'introdu�r n�meros enters");
		}		
	lector.close();	
	}
}
