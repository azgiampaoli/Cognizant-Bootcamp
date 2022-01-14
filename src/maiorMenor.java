import java.util.Scanner;

public class maiorMenor {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int maior = 0;
		int media =0;
		
		int i =0;
		
		do {
			System.out.println("Digite um número: ");
			numero = scan.nextInt();
			
			if(numero > maior) {
				maior = numero;
			}
			
			media = media + numero;
			
			
			i++ ;
		}while(i < 5);

		System.out.println("o numero maior é: " + maior);
		System.out.println("A valor da media dos numeros digitados é:  " + media/5);
		
	}

}
