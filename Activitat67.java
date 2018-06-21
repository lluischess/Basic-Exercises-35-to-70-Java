//Feu un programa que ens escrigui si un n�mero N enter que hem llegit �s primer (es considera que un n�mero 
//es  primer  nom�s  si  �s  divisible  per  ell  i  la  unitat,  per
//tant  per  saber  si  �s  primer  un  n�mero  c
//al  buscar  si  t� algun divisor des de 2 fins a la meitat d'ell mateix).
package Program3;

import java.util.Scanner;

public class Activitat67 {


	public static void main (String[] args) {
		Scanner teclat = new Scanner(System.in);
		int valorUsuari, divisor=2, residu;
		boolean buscar=false;
		
		System.out.println("Dir si un numero enter es primer.");
		System.out.print("Introdueix un numero: ");
		valorUsuari=teclat.nextInt();
		teclat.nextLine();
		
		if (valorUsuari>=2){
			
			//inicialitzem el divisor a 2.
			while ((divisor<=valorUsuari/2)&&(buscar==false)){
				
				//El residu a de donar 0 per saber que es divisor
				residu=valorUsuari%divisor;
				
				if(residu==0){
					buscar=true;
				}
				
				divisor++;
			}
			
			if (buscar==true){
				System.out.println(""+valorUsuari+" no es primer.");
			}else {
				System.out.println(""+valorUsuari+" es primer.");
			}
		
		}else {
			System.out.println(""+valorUsuari+" no es primer.");
		}
		
		teclat.close();
			
	}
}
