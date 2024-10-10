package javaCurso2024;

public class Cap8_Lab2 {
		
		    public static void main(String[] args) {
		        // Verificar se o array de argumentos tem elementos
		        if (args.length > 0) {
		            // Passos 3 e 4: Inicializa a variável soma e faz a soma das idades
		            int soma = 0;
		            for (int i = 0; i < args.length; i++) {
		                soma += Integer.parseInt(args[i]); // Converte a string para inteiro e acumula na soma
		            }
		            
		            // Passo 5: Calcula a média
		            double media = (double) soma / args.length;
		            
		            // Passo 6: Exibe a média
		            System.out.println("A média das idades é: " + media);
		        } else {
		            // Passo 2: Mensagem de erro caso não haja argumentos
		            System.out.println("Erro: Entre com valores válidos para as idades.");
		        }
		      
		    }

          }