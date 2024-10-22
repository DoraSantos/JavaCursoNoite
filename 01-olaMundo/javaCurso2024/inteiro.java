package javaCurso2024;

public class inteiro {

	public static void main(String[] args) {
		
		// Declarando  variavel inteira:
		int idade1 = 12;
				System.out.println("O Thiago tem " + idade1 + " anos!");
				String cep = "08474-390";
				System.out.println(cep);
				/*
				 * Vamos fazer uma dentro 
				 * da variavel
				 */
				int somando = 2 + 8;
				System.out.println(somando);
				
				//Subtraindo dentro da variavel:
				int subtracao = 10 - 9; 
				System.out.println(subtracao);
				
				//Divisão dentro da variavel:
				int divisao =  20 / 10;
				System.out.println(divisao);
				
				//Multiplicando dentro da variavel;
				int multiplicar = 5 * 4;
				System.out.println(multiplicar);
				
				//Numero inteiro com virgula:
				double salario = 10000;
				//Variavel de Texto
				String nome = "Maria";
				
				//Variavél inteira
				int idade = 25;
				System.out.println(salario);
				
				
				import java.util.Scanner;

				public class Produto {
				    public static void main(String[] args) {
				        // Criar um scanner para ler a entrada do usuário
				        Scanner scanner = new Scanner(System.in);

				        // Solicitar informações ao usuário
				        System.out.print("Digite o nome do produto: ");
				        String nome = scanner.nextLine();

				        System.out.print("Digite a quantidade do produto: ");
				        int quantidade = scanner.nextInt();

				        System.out.print("Digite o preço unitário do produto: ");
				        double precoUnitario = scanner.nextDouble();

				        System.out.print("Digite o código de identificação do produto: ");
				        int codigoIdentificacao = scanner.nextInt();

				        System.out.print("Digite o peso do produto (em kg): ");
				        double peso = scanner.nextDouble();

				        // Exibir as informações do produto formatadas
				        System.out.println("\nInformações do SistemaDeVendasJFrame:");
				        System.out.println("-------------------------");
				        System.out.printf("Nome: %s\n", nome);
				        System.out.printf("Quantidade: %d unidades\n", quantidade);
				        System.out.printf("Preço Unitário: €%.2f\n", precoUnitario);
				        System.out.printf("Código de Identificação: %d\n", codigoIdentificacao);
				        System.out.printf("Peso: %.2f kg\n", peso);
				    }
				}



	}

}
