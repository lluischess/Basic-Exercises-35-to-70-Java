package Program3;

import java.util.Scanner;

public class Activitat37a {

	public static void main(String[] args) {

		int Bitllets, Moneda=0, Import, volta;
		
		Scanner teclat = new Scanner (System.in);
		
		System.out.println("Introduir un import en euros enter i indicar el número mínim de bitllets i monedes que li correspon.Bitllets i monedes : 500, 200, 100, 50, 20, 10, 5, 2, 1.(165€ son 1 de 100, 1 de 50, 1 de 10 i 1 de 5)");
		Import = teclat.nextInt();
		teclat.nextLine();
		
		volta = 1;
		
		
		while(volta<=9){
		
			switch (volta){
			
				case 1:
					Moneda = 500;	
					volta++;
				break;
				case 2:
					Moneda = 200;
					volta++;
				break;
				case 3:
					Moneda = 100;
					volta++;
				break;
				case 4:
					Moneda = 50;
					volta++;
				break;
				case 5:
					Moneda = 20;
					volta++;
				break;
				case 6:
					Moneda = 10;
					volta++;
				break;
				case 7:
					Moneda = 5;
					volta++;
				break;
				case 8:
					Moneda = 2;
					volta++;
				break;
				case 9:
					Moneda = 1;
					volta++;
				break;	
			}
		
			Bitllets = (int) Import / Moneda;
			
			if (Bitllets != 0) {
				// Import = Import%Moneda;
				Import = Import - (Moneda*Bitllets);
				System.out.println(Bitllets + " " + "de " + Moneda);
			}
			teclat.close();	
		}
	}

}
