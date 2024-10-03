package javaCurso2024;

public class OperaConta {

	public static void main(String[] args) {
		// Criação de conta com saldo inicial de R$1000,00:
		ContaBancaria conta = new ContaBancaria(1000.55);
		
        //Operando a conta do Cliente:
		// 1)Exibir o saldo inicial da conta:
		System.out.println("Saldo Inicial:" + conta.getSaldo());
		//2)Realizando um déposito:
		conta.depositar(3);
		System.out.println("Saldo após o déposito de R$"+ conta.getSaldo());
		//3)Fazer um saque:
		conta.sacar(250);
		System .out.println("Saldo após o saque R$ "+ conta.getSaldo());
	}

}
