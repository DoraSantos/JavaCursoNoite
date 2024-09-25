package java2024;

	import java.util.Scanner;

	public class SomaDigitos {
	    public static void main(String[] args) {
	        // Criar o scanner para ler a entrada do utilizador
	        Scanner scanner = new Scanner(System.in);

	        // Pedir o número inteiro ao utilizador
	        System.out.print("Digite um número inteiro: ");
	        int numero = scanner.nextInt();

	        // Inicializar a variável para a soma dos dígitos
	        int somaDigitos = 0;
	        int numeroOriginal = numero; // Guardar o número original para exibição

	        // Calcular a soma dos dígitos
	        while (numero != 0) {
	            somaDigitos += numero % 10; 
	            // Obter o último dígito
	            
	            numero /= 10;             
	            // Remover o último dígito do número
	        }

	        // Exibir o resultado
	        System.out.println("A soma dos dígitos do número " + numeroOriginal + " é: " + somaDigitos);

	        // Fechar o scanner
	        scanner.close();
	    }
	}


