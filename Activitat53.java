package Program3;

import java.util.Scanner;

public class Activitat53 {
	public static void main (String[] args) {	
		int M;
		int N;
		int contador= 0;
		int Q=0;
		int A;
		char Error = 0;
		System.out.println(". Fer un programa per dividir dos números enters M i N pel mètode de restes successives. Donar com a resultats el quocient i el residu.");	
		Scanner lector = new Scanner(System.in);
		System.out.print("Introdueix un numero");
		M= lector.nextInt();
		lector.nextLine();
		System.out.print("Introdueix un numero per restar al enterior numero");
		N = lector.nextInt();
		lector.nextLine();
		if (M<N){
			A=M;
			M=N;
			N=A;
		}
		System.out.println("Els quocient son:");
		while (M!=0){
			
			Q= M - N;
			M=Q;
		contador= contador+1;
		System.out.println(""+Q+"");
		if (M<0){
			M= Error;
			System.out.println("El quocient no dona 0 exacte");
		}
		}
		System.out.print("Vueltas:"+contador+"");
		lector.close();
}
}

