import java.util.Scanner;

public class fatorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int resultado = 1;
		
		System.out.println("Digite o numero: ");
		numero = scan.nextInt();
		
		for (int i=numero; i>1; i--) {
			
			resultado = resultado * i;
			
		}

		System.out.println("Fatorial: " + resultado);
	}

}
