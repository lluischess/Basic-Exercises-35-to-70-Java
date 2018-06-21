package Program3;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Activitat69 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader 	bf 			= new BufferedReader(new InputStreamReader(System.in));
		char 			cchar		= ' ';
		char			lastCchar	= ' ';
		int				ichar		= 0;
		
		int 			countLine	= 0;
		int				countWords	= 0;
		int				countChars	= 0;
		
		System.out.println("Introdueix un text on els salts de linea siguin '*' i que acabi amb '/'.");
		
		do{
			
			ichar = bf.read();
			cchar = (char) ichar;
			
			switch (cchar) {
			case '*':
				countLine++;
			case ' ':
				if (lastCchar!='*' && lastCchar!=' ') {
					countWords++;
				}
				break;
			case '/':
				break;
				
			default: 
				countChars++;
				break;
			}
			
			lastCchar = cchar;
			
		} while(cchar != '/');
		
		
		System.out.println("Caracters: " + countChars + ", paraules: " + countWords + ", linies: " + countLine + ".");
		
	}
		
}
