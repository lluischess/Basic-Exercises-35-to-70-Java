package Program3;

import java.util.Scanner;
public class Activitat58 {
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
		    	 if ((frase.charAt(i)=='a')||(frase.charAt(i)=='A')||(frase.charAt(i)=='�')||(frase.charAt(i)=='�')
	    			||(frase.charAt(i)=='e')||(frase.charAt(i)=='E')||(frase.charAt(i)=='�')||(frase.charAt(i)=='�')
	    			||(frase.charAt(i)=='i')||(frase.charAt(i)=='I')||(frase.charAt(i)=='�')||(frase.charAt(i)=='�')
	    			||(frase.charAt(i)=='o')||(frase.charAt(i)=='O')||(frase.charAt(i)=='�')||(frase.charAt(i)=='�')
	    			||(frase.charAt(i)=='u')||(frase.charAt(i)=='U')||(frase.charAt(i)=='�')||(frase.charAt(i)=='�'))
		    	 	{
		    		 contador++;
		    	 	}
		     }
		     System.out.println("La paraula: "+frase + ", t�: " + contador +" vocals." );
		     
		     teclea.close();
	}
}