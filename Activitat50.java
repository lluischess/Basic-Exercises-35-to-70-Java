 package Program3;



import java.util.Scanner;

public class Activitat50 {
	public static void main (String[] args) {
		
		int usuari;
		//La s�rie de Fibonacci seria: 1 1 2 3 5 8 13 ..
		//Aquesta s�rie es calcula tenint en compte que el primer i segon valor de la s�rie �s 1, i a partir d'ells el
		//tercer membre i successius es calculen amb la suma dels dos anteriors.
		//S�ha de tenir en compte que no es pot calcular la s�rie de Fibonacci per un n�mero inferior a 2, i aix� s�ha
		//de controlar.
		int var1, var2, i, fibornacci;
	
		Scanner Teclado = new Scanner(System.in);
		
		do{
			System.out.println("Introdueix un numero major a 1");
			usuari = Teclado.nextInt();
		}while(usuari<=1);
		
		System.out.println("Els " +usuari +" primers numeros de la serie de fibonacci son = ");
			
		var1=1;
		var2=1;
		
		System.out.print(var1 +" ");

		for(i=2; i <= usuari; i++){	
			System.out.print(var2 +" ");
			
			var2 = var1+var2;
			var1 = var2-var1;
		}

		System.out.println();
		
		// SEGONA VERSIÓ.
		var1=1;
		var2=1;
		
		System.out.print(var1 +" "+var2+" ");
		for (i=3;i<=usuari;i++) {
			fibornacci = var1 + var2;
			System.out.print(fibornacci +" ");
			
			var1=var2;
			var2=fibornacci;
		}
		System.out.println();
		Teclado.close();
		
	}
}

