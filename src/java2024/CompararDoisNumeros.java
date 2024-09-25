package java2024;
	
	import java.util.Scanner;

	 public class CompararDoisNumeros {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        

	        // Solicita o primeiro número inteiro
	        System.out.print("Digite o primeiro número: ");
	        int numero1 = scanner.nextInt();

	        // Solicita o segundo número inteiro
	        System.out.print("Digite o segundo número: ");
	        int numero2 = scanner.nextInt();

	        // Compara os dois números
	        if (numero1 > numero2) {
	            System.out.println("O primeiro número é maior: " + numero1);
	        } else if (numero2 > numero1) {
	            System.out.println("O segundo número é maior: " + numero2);
	        } else {
	            System.out.println("Os dois números são iguais.");
	        
	    }
	}
}
