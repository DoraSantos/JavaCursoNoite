package javaCurso2024;

import java.util.Scanner;

		public class Divisao {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        try {
		            // Solicitar ao utilizador para inserir dois números inteiros
		            System.out.print("Insira o primeiro número inteiro: ");
		            int num1 = scanner.nextInt();

		            System.out.print("Insira o segundo número inteiro: ");
		            int num2 = scanner.nextInt();

		            // Verificar se o segundo número é zero antes de tentar realizar a divisão
		            if (num2 == 0) {
		                throw new ArithmeticException("Erro: Não é possível dividir por zero.");
		            }

		            // Realizar a divisão
		            int resultado = num1 / num2;
		            System.out.println("O resultado da divisão é: " + resultado);
		        } catch (ArithmeticException e) {
		            // Capturar a exceção e exibir a mensagem de erro
		            System.out.println(e.getMessage());
		        } catch (Exception e) {
		            // Capturar outras exceções possíveis
		            System.out.println("Erro: Entrada inválida. Por favor, insira apenas números inteiros.");
		        } finally {
		            // Fechar o scanner
		            scanner.close();
		        }
		    }

	}

