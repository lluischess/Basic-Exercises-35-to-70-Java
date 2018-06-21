package Program3;

import java.util.Scanner;

public class Activitat59 {
	public static double round(double value, int places) { 
	    if (places < 0) throw new IllegalArgumentException();

	    long factor = (long) Math.pow(10, places);
	    value = value * factor;
	    long tmp = Math.round(value);
	    return (double) tmp / factor;
	}
	public static void main(String arg[]){

	int i;
	int contador =0;
	int contadore=0;
	double result=0;
	double resulta=0;
	double resulte=0;
	
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
	    	 if ((frase.charAt(i)=='a')||(frase.charAt(i)=='A')||(frase.charAt(i)=='á')||(frase.charAt(i)=='Á')){
	    			 contador++;
	    	 }
	    	 if (frase.charAt(i)==' '){
	    		 contadore++;
	    	 }
	     }
	     result= contador+contadore;
	     resulta = round ((contador/result)*100,2); 
	     resulte= round ((contadore/result)*100,2);
	     System.out.println("La frase té: " + contador +" caràcters iguals a a's i A's i el % és del: "+resulta+"% respecte als espais");
	     System.out.println("La frase té: " + contadore +" d'espais en blanc i el % és del: "+resulte+ "% respecte les a's" );
	     
	     teclea.close();
	}
}
