package javaCurso2024;

import java.util.Scanner;

public class JurosCompostos {
	public static void main(String[]args){
		//instanciando a classe scanner para usá-la:
		Scanner sc = new Scanner (System.in);
		
		//Entrada de valores do usuários:
		//Capital
		System.out.println("Digite o Capital:");
		double capital = sc.nextDouble();
		//Capturando a taxa de juros:
		System.out.println("Digite a taxa  de juros anual:");
		double taxa = sc.nextDouble();
		//Pegar o tempo  da aplicação:
		System.out.println("Digiteo tempo:");
		int tempo = sc.nextInt();
		
		//Cálculo dos juros compostos(anual):
	double montante = capital * Math.pow(1 + (taxa/100), tempo);
	double  juros = montante -capital;
	//Resultado:
	System.out.println("O valor dos juros compostos é:" + juros);
	System.out.println("O valor total(principal + juros) é:" + montante);
	sc.close();
	
		
	}

}
