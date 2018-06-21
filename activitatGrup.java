package Program3;

import java.util.Scanner;

public class activitatGrup {
	
	public static void main(String [] args) {
		int errors;
		int contadorerrors=0;
		int resposta;
		boolean p1 = false;
		boolean p2 = false;
		boolean p3 = false;
		boolean p4 = false;
		boolean b = false;
		
		Scanner teclea = new Scanner(System.in);
		
		System.out.println("Benvingut el apassionant joc de les preguntes maleïdes!!!");
		System.out.println("Et farem 4 preguntes i tindràs 3 intents per respondre correctament a totes elles i si no l'encertes amb 3 intents tornaràs a començar.");
		System.out.println("Que la sort t'acompanyi ja que et fara falta");
		System.out.println("Nomes pots respondra amb un numero del 1 al 4");
		
		while (b = true) {
			contadorerrors = 0;
			
			while ((contadorerrors <= 3) && (p1 != true)){
				System.out.println("1");
				resposta=teclea.nextInt();
				if (resposta == 1){
					System.out.println("ere el amo :P");
					p1 = true;
				}
				else{
					contadorerrors++;
					System.out.println("2");
				}
				
			}
			while ((contadorerrors <= 3) && (p2 != true)){
				System.out.println("2");
				resposta=teclea.nextInt();
				if (resposta == 1){
					System.out.println("ere el amo :P");
					p2 = true;
				}
				else{
					System.out.println("2");
					contadorerrors++;
				}
				
			}
			while ((contadorerrors <= 3) && (p3 != true)){
				System.out.println("2");
				resposta=teclea.nextInt();
				if (resposta == 1){
					System.out.println("ere el amo :P");
					p3 = true;
				}
				else{
					System.out.println("2");
					contadorerrors++;
				}
				
			}
			while ((contadorerrors <= 3) && (p4 != true)){
				System.out.println("2");
				resposta=teclea.nextInt();
				if (resposta == 1){
					System.out.println("Ets un crak");
					p4 = true;
					b = true;
				}
				else{
					System.out.println("2");
					contadorerrors++;
				}
				
			}
			
			
			
			
			
			
		}
	
	
	}
}
