package Program3;

import java.util.Scanner;
public class Activitat60 {
	public static void main(String arg[]){
		int lletra;
		int contador =0;
		String frase;
		     Scanner teclea = new Scanner( System.in); 
		     
		     System.out.println("Comptar quants caracters hi han en una frase diferents a a i A.");
		     System.out.print( "Insereix una frase: "); 
		     frase = teclea.nextLine(); 
		     
		     while (frase.length()==0){
		    	 System.out.println("Error has introduït un text buit.");	
		  
		    	 System.out.print( "Torna a provar: "); 
			      frase = teclea.nextLine(); 
		     }
		    
		     for (lletra=0; lletra < frase.length()-1;lletra++){
		    	 if (frase.charAt(lletra)=='l') {
		    		 if (frase.charAt(lletra+1)=='a'){
		    			 contador++;
		    		 }
		    	 }
		     }
		     System.out.println("La frase: "+frase + ", té: " + contador +" Las" );
		     
		     teclea.close();
	}
}
