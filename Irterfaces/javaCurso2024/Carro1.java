package javaCurso2024;

public class Carro1 implements Veiculo1 {
//Construtor sem parametros(necessário para a linha 'new carro()')
	public Carro1()	{
		//Se houver lógica de inicialização,insira-a aqui!
		}
     @Override
    public void acelerar() {
	System.out.println("O carro está acelerando...");
}
     @Override
    public void frear() {
	System.out.println("O carro está freando...");
     }
	 @Override
	public void acabouCombustivel() {
		System.out.println("O combustível do carro acabou...");
	}
	 @Override
	public void pneuFurou() {
		System.out.println("O pneu da bicicleta furou!...");
	
}
	}

