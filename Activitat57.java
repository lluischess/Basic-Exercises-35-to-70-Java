package Program3;

import java.util.Scanner;
public class Activitat57 {
	public static void main(String arg[]){
		int i;
		int contador =0;
		
		     Scanner teclea = new Scanner( System.in); 
		     
		     System.out.println("Comptar quants caracters hi han en una frase diferents a a i A.");
		     System.out.print( "Insereix una frase: "); 
		     String frase = teclea.nextLine(); 
		     
		     while (frase.length()==0){
		    	 System.out.println("Error has introdu�t un text buit.");	
		  
		    	 System.out.print( "Torna a provar: "); 
			      frase = teclea.nextLine(); 
		     }
		    
		     for (i=0; i < frase.length();i++){
		    	 if ((frase.charAt(i)!='a')&&(frase.charAt(i)!='A')&&(frase.charAt(i)!='�')&&(frase.charAt(i)!='�')) {
		    		 contador++;
		    	 }
		     }
		     System.out.println("La frase: "+frase + ", t�: " + contador +" car�cters diferents a a's i A's." );
		     
		     teclea.close();
	}
}
