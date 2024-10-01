package javaCurso2024;

		import java.util.Scanner;

		public class VerificaDiaDoMes {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        // Solicitar o nome do mês ao utilizador
		        System.out.print("Digite o nome de um mês: ");
		        String mes = scanner.nextLine().toLowerCase(); // Converter para minúsculas para evitar erros de formatação

		        // Estrutura de decisão switch
		        switch (mes) {
		            case "janeiro":
		            case "março":
		            case "maio":
		            case "julho":
		            case "agosto":
		            case "outubro":
		            case "dezembro":
		                System.out.println("O mês escolhido tem 31 dias.");
		                break;

		            case "abril":
		            case "junho":
		            case "setembro":
		            case "novembro":
		                System.out.println("O mês escolhido tem 30 dias.");
		                break;

		            case "fevereiro":
		                System.out.println("O mês escolhido tem 28 ou 29 dias, dependendo se é ano bissexto.");
		                break;

		            default:
		                System.out.println("Erro: O mês digitado não é válido.");
		                break;
		        }

		        scanner.close();
		    }
		


	}

