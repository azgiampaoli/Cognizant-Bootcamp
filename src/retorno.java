
public class retorno {

	
	 public static int area(int lado) {
		 int area = lado * lado;
		 return area;
	 }
	 
	 	 
	 public static int area(int lado, int altura) {
		 int area = lado * altura;
		 return area;
		 
	 }
	 
	 public static int area(int baseMaior, int baseMenor, int altura) {
		 
		 int area = ((baseMenor + baseMaior) * altura)/2;
		 return area;
		 
	 }
		
	

	
	
	public static void main(String[] args) {
		
		System.out.println("A area do quadrado �: " + retorno.area(2));
		System.out.println("A area do retangulo �: " + retorno.area(3, 4));
		System.out.println("A area do trap�zio �: " + retorno.area(1, 2, 3));

}
}