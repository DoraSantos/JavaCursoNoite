package javaCurso2024;

  import java.util.Scanner;

    public class VerificarParImpar {
	
      public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Solicita um número inteiro do utilizador
	        System.out.print("Digite um número inteiro: ");
	        int numero = scanner.nextInt();

	        // Verifica se o número é par ou ímpar
	        if (numero % 2 == 0) {
	            System.out.println("O número é par.");
	        } else {
	            System.out.println("O número é ímpar.");
	        }
	    }
	}

