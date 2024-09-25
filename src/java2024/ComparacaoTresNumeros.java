package java2024;
import java.util.Scanner;

public class ComparacaoTresNumeros {
    public static void main(String[] args) {
        // Criar o scanner para ler a entrada do utilizador
        Scanner scanner = new Scanner(System.in);

        // Pedir os três números inteiros ao utilizador
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int numero3 = scanner.nextInt();

        // Encontrar o maior número usando Math.max()
        int maiorNumero = Math.max(numero1, Math.max(numero2, numero3));

        // Encontrar o menor número usando Math.min()
        int menorNumero = Math.min(numero1, Math.min(numero2, numero3));

        // Exibir o maior e o menor número
        System.out.println("O maior número é: " + maiorNumero);
        System.out.println("O menor número é: " + menorNumero);

        // Fechar o scanner
        scanner.close();
    
	    }
	}


