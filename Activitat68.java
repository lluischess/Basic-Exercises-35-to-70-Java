package Program3;



import java.util.Scanner;

public class Activitat68 {
	
	public static final int RANDOM = (int) (Math.random()*100)+1;
	public static void main(String[] args) {
	
		//Fer un joc en el qual l�ordinador s�inventi un n�mero entre el 1 i el 100. Per cada intent el jugador intentar�
		//encertar el n�mero. En el cas de que l�encerti el joc finalitzar�, en cas contrari se li haur� d�indicar al jugador
		//si el n�mero es m�s gran o m�s petit que el que ha d�encertar. Al final, una vegada el jugador hagi encertat el
		//n�mero, se li mostrar� quantes oportunitats ha necessitat per endevinar el n�mero.
		
		Scanner teclat = new Scanner(System.in); 
		int intents = 0, valorUsuari;
		
		System.out.print("Comencem el joc, endevina un n�mero entre 1 i el 100. Introdueix un valor: ");
		valorUsuari=teclat.nextInt();
		teclat.nextLine();
		intents++;
					
		while (valorUsuari!=RANDOM){
			if(valorUsuari>RANDOM){
				System.out.print("El número és massa gran, introdueix un altre n�mero: ");
			}
			else{
				System.out.print("El número és massa petit, introdueix un altre n�mero: ");
			}	
			
			intents++;	

			valorUsuari=teclat.nextInt();
			teclat.nextLine();
		}
		
		System.out.println("Enhorabona! Has guanyat. Total intents:"+intents);
		teclat.close();
	 }
 }

