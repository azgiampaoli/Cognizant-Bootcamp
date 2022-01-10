
public class metodos {

	public static int soma(int a, int b) {
		
		int c = a + b;
		return c;
		
	}
	
	public static int subtracao(int a, int b) {
		int c = a - b;
		return c;
		
	}

	public static int multiplicacao(int a, int b) {
		int c = a*b;
		return c;
			
}

	public static int divisao(int a, int b) {
		int c = a/b;
		return c;
	
}
	
	public static String greetings (int a) {
		
		if(a >= 8 && a<12) {
			return ("Bom Dia");
		}else if( a >=12 && a<=18) {
			return("Boa tarde");
		}else {
			return("Boa Noite");
		}
		
	}
	
	public static double emprestimo(double valorPedido) {
		double valorFinal;
			
		if (valorPedido <= 10.000) {
			double taxa = 0.8;
			valorFinal = ((valorPedido * taxa) + valorPedido);
						
		}else if(valorPedido >10.000 && valorPedido<= 25.000) {
			double taxa = 0.5;
			valorFinal = ((valorPedido * taxa) + valorPedido);		
						
		}else {
			double taxa = 0.3;
			valorFinal =((valorPedido * taxa) + valorPedido);
			
		}
		return valorFinal;
		
		
}	
		public static void main(String[] args) {
		
		
		System.out.println(soma(1,2));
		System.out.println(subtracao(4,2));
		System.out.println(multiplicacao(2,5));
		System.out.println(divisao(10,2));
		System.out.println(greetings(11));
		System.out.println(greetings(16));
		System.out.println(greetings(4));
		System.out.println("O valor final do empréstimo será de: R$ " + emprestimo(8.500));
		System.out.println("O valor final do empréstimo será de: R$ " +emprestimo(15.000));
		System.out.println("O valor final do empréstimo será de: R$ " +emprestimo(30.000));
		
		}

}
