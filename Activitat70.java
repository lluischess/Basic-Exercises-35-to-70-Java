package Program3;

import java.util.Scanner;

public class Activitat70 {

	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);
		
		int start = 1;
		
		int numero, resultat = 0, intents = 0;
		
		while(start==1){
			
			int RANDOM1 = (int) (Math.random()*100)+1;
			int RANDOM2 = (int) (Math.random()*100)+1;
			
			System.out.print("Introdueix un n�mero, per el joc d'endevinar: ");
			numero=teclat.nextInt();
			teclat.nextLine();
			
			intents++;
			
			resultat = RANDOM1 * RANDOM2;
			System.out.println(resultat);
			while(numero!=resultat){
				
				System.out.print("Has fallat introdueix un altre n�mero, �nims: ");
				
				numero=teclat.nextInt();
				teclat.nextLine();
				
				intents++;
			}
			
			System.out.println("Has guanyat, total intents: " + intents);

			System.out.println("Vols tornar a jugar ?");
			System.out.println("[1] Per seguir jugant");
			System.out.println("[2] Per finalitzar");
			
			start = teclat.nextInt();
			teclat.nextLine();
			intents = 0;
		}
		System.out.println("Has acabat");
		teclat.close();
		
		
		

	}

}
