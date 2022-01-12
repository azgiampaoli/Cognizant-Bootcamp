
public class estruturaRepeticao {	

	
	public static void ferias(int x) {
		
		if(x==1) {
			System.out.println("Janeiro: " + " Ferias");				
		}else if (x==2) {
			System.out.println("Fevereiro");
		}else if (x==3) {
			System.out.println("Março");
		}else if (x==4) {
			System.out.println("Abril");
		}else if (x==5) {
			System.out.println("Maio");
		}else if (x==6) {
			System.out.println("Junho");
		}else if (x==7) {
			System.out.println("Julho: " + " Ferias");
		}else if (x==8) {
			System.out.println("Agosto");
		}else if (x==9) {
			System.out.println("Setembro");
		}else if (x==10) {
			System.out.println("Outubro");
		}else if (x==11) {
			System.out.println("Novembro");
		}else if(x==12) {
			System.out.println("Dezembro: " + " Ferias");
			}
		
	}
	
	public static void diaSemana(int x) {
	switch(x) {
	case 1: System.out.println("Domingo");
	break;
	case 2: System.out.println("Segunda");
	break;
	case 3: System.out.println("Terça");
	break;
	case 4: System.out.println("Quarta");
	break;
	case 5: System.out.println("Quinta");
	break;
	case 6: System.out.println("Sexta");
	break;
	case 7: System.out.println("Sábado");
	break;
	}
	}
	
	
	public static void main(String[] args) {
		
			ferias(1);
			ferias(12);
			ferias(5);
			ferias(7);
			
			diaSemana(2);
			diaSemana(5);
			diaSemana(7);
			
		}
	
	
	

}
	
