package javaCurso2024;

	import java.util.Scanner;

	 public class VerificaDivisivelPor3e5 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Solicita um número inteiro do utilizador
	        System.out.print("Digite um número inteiro: ");
	        int numero = scanner.nextInt();

	        // Verifica se o número é divisível tanto por 3 quanto por 5
	        if (numero % 3 == 0 && numero % 5 == 0) {
	            System.out.println("O número é divisível por 3 e 5.");
	        } else {
	            System.out.println("O número não é divisível por 3 e 5.");
	        
	    }
	}
}
