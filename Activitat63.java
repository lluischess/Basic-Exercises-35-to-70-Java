package Program3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Activitat63 {
	public static void main(String[] ar) throws IOException{
		// Declarem un BufferedReader contra el teclat
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		
		char cCar, cAnterior;
		int iCar;
		int iLa = 0;
		char l1,l2;
		
		System.out.println("Diguem la classe: ");
		
		l1 = (char) buffer.read();
		if (l1 != 10 && l1 != 13) {
			
			l2 = (char) buffer.read();
			if (l2 != 10 && l2 != 13) {
			
				// Busquem 'a'
				cAnterior = ' ';
				
				iCar = buffer.read();
				while (iCar != 10 && iCar != 13) {
					cCar = (char) iCar;
		
					if ((cCar==l2) && (cAnterior == l1)) {
						iLa++;
					}
					
					cAnterior = cCar;
					
		   			iCar = buffer.read();
				}
		
				System.out.println("Els dos primers surt: " + iLa);
			}
			else {
				System.out.println("Mínim 2 caracters");
			}
		}
		else {
			System.out.println("Mínim 2 caracters");
		}
	}
}