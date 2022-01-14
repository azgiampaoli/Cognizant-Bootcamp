import java.util.Random;

public class numerosAleatorios {

	public static void main(String[] args) {
		Random random = new Random();
		
		int[] numeros = new int[20];
		
		for(int i =0; i<numeros.length; i++) {
			
			int numero = random.nextInt(100);
			numeros[i] = numero;
			
			
			}
			
			
			
		
		
		System.out.println("Números: ");
		for(int number : numeros) {
			if(numeros != null)
				System.out.println(number + " " + " e seu sucessor: " + (number + 1));
				
		}
		

	}

}
