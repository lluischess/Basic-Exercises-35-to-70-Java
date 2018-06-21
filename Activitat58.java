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
		    	 System.out.println("Error has introduït un text buit.");	
		  
		    	 System.out.print( "Torna a provar: "); 
			      frase = teclea.nextLine(); 
		     }
		    
		     for (i=0; i < frase.length();i++){
		    	 if ((frase.charAt(i)=='a')||(frase.charAt(i)=='A')||(frase.charAt(i)=='á')||(frase.charAt(i)=='Á')
	    			||(frase.charAt(i)=='e')||(frase.charAt(i)=='E')||(frase.charAt(i)=='é')||(frase.charAt(i)=='É')
	    			||(frase.charAt(i)=='i')||(frase.charAt(i)=='I')||(frase.charAt(i)=='í')||(frase.charAt(i)=='Í')
	    			||(frase.charAt(i)=='o')||(frase.charAt(i)=='O')||(frase.charAt(i)=='ó')||(frase.charAt(i)=='Ó')
	    			||(frase.charAt(i)=='u')||(frase.charAt(i)=='U')||(frase.charAt(i)=='ú')||(frase.charAt(i)=='Ú'))
		    	 	{
		    		 contador++;
		    	 	}
		     }
		     System.out.println("La paraula: "+frase + ", té: " + contador +" vocals." );
		     
		     teclea.close();
	}
}