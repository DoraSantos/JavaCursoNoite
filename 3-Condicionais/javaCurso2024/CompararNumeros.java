package javaCurso2024;

import java.util.Scanner;
public class CompararNumeros {
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		//Solicite o primeiro valor
		System.out.println("Digite o primeiro valor:");
		int valor1 = scanner.nextInt();
		
		//Solicite o segundo valor
		System.out.println("Digite o segundo valor:");
		int valor2= scanner.nextInt();
		
		//Comparar os dois valores e exibe o maior
		if(valor1 > valor2) {
			System.out.println("O maior valor é:" +  valor1);
		}else if(valor2 > valor1) {
				System.out.println("O maior valor é:" + valor2);
		}else {
					System.out.println("Os dois valores são iguais.");
				
		}
		
		
 }

}
