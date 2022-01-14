import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		
		int multiplicador;
		System.out.println("Digite o valor para realizar a tabuada: ");
		 multiplicador = scan.nextInt();
		 
		 for(int i =1; i<11; i++) {
			 
			
			 
			 System.out.println(multiplicador + " x " + i + " = " + multiplicador *i);
			 
		 }

	}

}
