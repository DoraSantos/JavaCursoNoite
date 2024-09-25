package java2024;

	import java.util.Scanner;

	public class CalculoDesconto {
	    public static void main(String[] args) {
	        // Criar o scanner para ler a entrada do utilizador
	        Scanner scanner = new Scanner(System.in);

	        // Pedir o preço original do produto ao utilizador
	        System.out.print("Digite o preço original do produto: ");
	        double precoOriginal = scanner.nextDouble();

	        // Pedir o percentual de desconto ao utilizador
	        System.out.print("Digite o percentual de desconto: ");
	        double percentualDesconto = scanner.nextDouble();

	        // Calcular o valor do desconto
	        double valorDesconto = (percentualDesconto / 100) * precoOriginal;

	        // Calcular o preço final após o desconto
	        double precoFinal = precoOriginal - valorDesconto;

	        // Exibir o preço final
	        System.out.printf("O preço final após o desconto é: €%.2f%n", precoFinal);

	        // Fechar o scanner
	        scanner.close();
	    }
	}


