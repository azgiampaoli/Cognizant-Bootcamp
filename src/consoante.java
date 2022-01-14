import java.util.Scanner;

public class consoante {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] consoante = new String[6];
		int count=0;
		int qtdeConsoantes=0;
		do {
			System.out.println("Digite uma consoante: ");
			String letra = scan.next();
			
			if(!(letra.equalsIgnoreCase("a")|
			letra.equalsIgnoreCase("e")|
			letra.equalsIgnoreCase("i")|
			letra.equalsIgnoreCase("o")|
			letra.equalsIgnoreCase("u"))){
			
			consoante[count] = letra;
			qtdeConsoantes++;
			}
			
			
			count++;
			
		}while(count < consoante.length);
	
		
		System.out.println(qtdeConsoantes);

	}
	
}
