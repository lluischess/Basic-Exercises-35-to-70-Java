package Program3;

import java.util.Scanner;

public class Activitat55 {
	public static void main (String[] args) {	
		int dia;
		int mes;
		int any;
		int diamaxim;
		System.out.println(".Fer l’exercici anterior però cada mes tindrà els dies que li corresponen tenint en compte els anys de traspàs");	
		Scanner lector = new Scanner(System.in);
		System.out.println("Dia:");
		dia= lector.nextInt();
		lector.nextLine();
		System.out.println("Mes:");
		mes = lector.nextInt();
		lector.nextLine();
		System.out.println("Any:");
		any = lector.nextInt();
		lector.nextLine();
		
			
		if  ((mes>=1) && (mes<=12) && (dia>=1)){
			if (mes==2){
				if (any%4==0) {
					diamaxim = 29;
				}
				else {
					diamaxim = 28;
				}
			}
			else {
				switch (mes){
				case 1:
				case 3:
				case 5:
				case 7:
				case 9:
				case 11:
				}
				diamaxim = 30;
			}
			
			if (dia > diamaxim) {
				System.out.println("Data incorrecta");	
			}
			else {
				System.out.println("Data correcta");
			}
		}
		else {
			System.out.println("Data incorrecta");
		}
			lector.close();
		}
}