
public class operadoresLogicos {

	 
	
	
	public static void main(String[] args) {
		
		double salarioMensal = 4.500d;
		double mediaSalarial = 7.850d;
		
		int qtdeDependentes = 4;
		int mediaDependentes = 2;
		
		System.out.println((salarioMensal < mediaSalarial) && (qtdeDependentes >= mediaDependentes));
		
		boolean resolucaoSalario = (salarioMensal < mediaSalarial);
		boolean resolucaoDependentes = (qtdeDependentes >= mediaDependentes);
		
		if (resolucaoSalario && resolucaoDependentes){
		System.out.println("Você merece Auxílio");
	}else {
		System.out.println("Você não terá Auxílio");
	}

	}}
