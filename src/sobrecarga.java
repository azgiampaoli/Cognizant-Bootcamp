
public class sobrecarga {
	
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
		
		System.out.println("A area do quadrado �: " + sobrecarga.area(5));
		System.out.println("A area do retangulo �: " + sobrecarga.area(2, 10));
		System.out.println("A area do trap�zio �: " + sobrecarga.area(2, 5, 3));

}
}