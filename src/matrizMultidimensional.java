import java.util.Random;

public class matrizMultidimensional {

	public static void main(String[] args) {
		Random random = new Random();
		
		int[][] matriz = new int[4][4];
		
		for(int i =0; i<matriz.length; i++) {
			for( int j=0; j<matriz.length; j++) {
				
				int numeros = random.nextInt(9);
				
				matriz[i][j] = numeros;
			}
		}

		for(int i =0; i<matriz.length; i++) {
			for( int j=0; j<matriz.length; j++) {
				
				System.out.println("Num: " + matriz[i][j]);
			}
		
	}

}
}
