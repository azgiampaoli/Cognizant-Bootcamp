import java.util.Scanner;



public class nomeIdade {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);

		 int idade;
		 String nome;
		
	do {
		 
	System.out.println("Nome: ");
	nome = scan.next();
	System.out.println("Idade: ");
	idade = scan.nextInt();
	} while (idade != 0);

	
	}

	
}
