package Program3;

import java.util.Scanner;
public class Activitat62 {
	public static void main(String arg[]){
		int lletra;
		int contador =0;
		String frase;
		     Scanner teclea = new Scanner( System.in); 
		     
		     System.out.println(". Igual que l�exercici 60 per� ara compteu el n�mero de mots/paraules �LA� (penseu que es considera que acaba una paraula quan darrera hi ha un espai o signe de puntuaci�). Nom�s cal controlar els seg�ents signes de puntaci� (. , ; )");
		     System.out.print( "Insereix una frase: "); 
		     frase = teclea.nextLine(); 
		     
		     while (frase.length()==0){
		    	 System.out.println("Error has introdu�t un text buit.");	
		  
		    	 System.out.print( "Torna a provar: "); 
			      frase = teclea.nextLine(); 
		     }
		    
		     for (lletra=0; lletra < frase.length()-1;lletra++){
		    	 if ((frase.charAt(lletra)=='l') && (frase.charAt(lletra+1)=='a')) {  
		    		 if ((frase.charAt(lletra+2)==' ') || (frase.charAt(lletra+2)=='.') || (frase.charAt(lletra+2)==',') || (frase.charAt(lletra+2)==';')) {
		    			 contador++;
		    			 
		    	 		}
		    	 }
		     }
		     
		     System.out.println("La frase: "+frase + ", t�: " + contador +" Las" );
		     
		     teclea.close();
	}
}
