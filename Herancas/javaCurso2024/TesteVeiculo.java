package javaCurso2024;

public class TesteVeiculo {
	public static void main(String[] args) {
		Carro carro = new Carro("Toyota","Corrola",2004, 4);
		Moto moto = new Moto("Honda","CB500",2019,true);
		Carro carro1 = new Carro("Hyundai","Fiat",2017, 3);
		Moto moto1 = new Moto("Shineray Rio","Honda Pop ",2008,false);
		System.out.println("Detathes do Carro:");
		carro.exibirDetalhes();
		System.out.println("\nDetathes da Moto:");
		moto.exibirDetalhes();
		System.out.println("Detathes do Carro:");
		carro1.exibirDetalhes();
		System.out.println("\nDetathes da Moto:");
		moto1.exibirDetalhes();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
