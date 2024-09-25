package javaCurso2024;

import java.util.Scanner;

public class VerificaNumero { 
	public static void main(System[] args) {
		//Pedir
	Scanner scanner = Scanner(System.in);
	
	//Solicite  um número inteiro do utlilizador
	System.out.println("Digite um número inteiro: ");
    int numero = scanner.nextInt();

    // Verifica se o número é positivo, negativo ou zero
    if (numero > 0) {
        System.out.println("O número é positivo.");
    } else if (numero < 0) {
        System.out.println("O número é negativo.");
    } else {
    	System.out.println("Número é igual a ZERO.");	
	   }
    
     }

}
