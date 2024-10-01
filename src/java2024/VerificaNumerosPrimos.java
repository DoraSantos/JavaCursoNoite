package java2024;

		import java.util.Scanner;

		public class VerificaNumerosPrimos {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        // Solicitar o número ao utilizador
		        System.out.print("Digite um número para verificar se é primo: ");
		        int numero = scanner.nextInt();

		        // Variável para contar o número de divisores
		        int divisores = 0;

		        // Lógica para verificar quantos divisores o número tem
		        for (int i = 1; i <= numero; i++) {
		            if (numero % i == 0) {
		                divisores++;
		            }
		        }

		        // Verifica se o número de divisores é superior a dois
		        if (divisores == 2) {
		            System.out.println(numero + " é um número primo.");
		        } else {
		            System.out.println(numero + " não é um número primo.");
		        }

		        scanner.close();
		    }
		

		
		

	}

