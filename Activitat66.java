package Program3;

import java.util.Scanner;

public class Activitat66 {
	public static void main(String[] args) {
		Scanner teclea = new Scanner( System.in);
		int numero;
		int divisor = 1;
		
		 System.out.println("Escriure els divisors d’un número enter llegit per teclat.");
	     System.out.print( "Els divisors son: ");  
	    numero = teclea.nextInt();
	     teclea.nextLine();
	     
	     numero = Math.abs(numero); //treiem simbols negatius
	     
	    for (divisor = 1;divisor <=numero/2;divisor++){
	    	if (numero%divisor==0){
	    		System.out.print( divisor+" "); 
	    	}
	     }
	    teclea.close();
		
		
		}
	}
