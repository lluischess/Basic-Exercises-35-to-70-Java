package Program3;


import java.util.Scanner;
public class Activitat56 {
	public static void main(String arg[]){
		int i;
		int contador=0; 
		     Scanner teclea = new Scanner( System.in); 
		     
		     System.out.println("Comptar quantes 'a' hi han en una frase no buida.");
		     System.out.print( "Insereix una frase: "); 
		     String frase = teclea.nextLine(); 
		     		 		     
		     while (frase.length()==0){
		    	 System.out.println("Error has introdu�t un text buit.");	
		  
		    	 System.out.print( "Torna a provar: "); 
			      frase = teclea.nextLine(); 
		     }
		     
		    	 for (i=0; i < frase.length();i++){
			    	 if ((frase.charAt(i)=='a')||(frase.charAt(i)=='A')||(frase.charAt(i)=='�')||(frase.charAt(i)=='�')) 
			    		 contador++;
			    	 
			     }
		    	 System.out.println("La frase: "+frase + ", t�: " + contador +" a's." );	    		     
		     
		     
		     
teclea.close();
	} 
}


