package java2024;

import java.util.Random;

public class GeradorNumerosAleatorios {

	public static void main(String[] args) {
		
		        // Criar um objeto da classe Random para gerar números aleatórios
		        Random random = new Random();

		        System.out.println("Números aleatórios gerados entre 1 e 100:");

		        // Gerar e exibir 5 números aleatórios
		        for (int i = 0; i < 5; i++) {
		            // Gera um número aleatório entre 1 e 100 (inclusive)
		            int numeroAleatorio = random.nextInt(100) + 1;
		            System.out.println(numeroAleatorio);
		        }
		    }
		


	}


