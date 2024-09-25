package java2024;  

import java.util.Scanner;

public class SomaNumerosPositivos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int numero;

        // Loop para continuar lendo números até que o usuário insira um número negativo
      
            System.out.print("Insira um número inteiro (número negativo para encerrar): ");
            numero = scanner.nextInt();

            // Soma apenas os números positivos
            if (numero >= 0) {
                soma += numero;

  while (numero >= 0); 
  // Continua enquanto o número for positivo ou zero

        // Exibe o resultado final
        System.out.println("A soma dos números positivos é: " + soma);

        // Fechar o scanner para evitar vazamento de recursos
        scanner.close();
    }
}
