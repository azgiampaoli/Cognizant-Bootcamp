import java.util.Scanner;

public class parImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int numero;
		int resultado;
		int par =-1;
		int impar=0;
		
		do{
			System.out.println("Digite um número: ");
			numero = scan.nextInt();
			
		resultado = numero %2;
			
		if(resultado == 0) {
			par++;
		}else {
			impar++;
		}
			
			
		}while( numero !=0);
		

		
		System.out.println("A Quantidade de números pares é: " + par);
		System.out.println("A Quantidade de números impares é: " + impar);
		
		
	}

}
