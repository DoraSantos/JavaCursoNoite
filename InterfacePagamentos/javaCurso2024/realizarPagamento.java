package javaCurso2024;

import java.util.Scanner;

public class realizarPagamento {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		InterfacePagamento pagarB = new Boletos();
		InterfacePagamento pagarC = new CartaoCredito();
		System.out.println("Digite a forma que deseja pagar: Boleto ou Cartão");
		String forma = sc.next();

		if (forma.equalsIgnoreCase("Boleto")) {
			pagarB.realizarPagamento();
		} else if (forma.equalsIgnoreCase("Cartao")) {
			pagarC.realizarPagamento();
		} else {
			System.out.println("Digite uma forma válida");
		}
	}

}
