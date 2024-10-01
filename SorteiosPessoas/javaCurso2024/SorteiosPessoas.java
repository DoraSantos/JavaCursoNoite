package javaCurso2024;

		import java.util.ArrayList;
		import java.util.Random;
		import java.util.Scanner;

		public class SorteiosPessoas {
		    public static void main(String[] args) {
		        // Cria um scanner para capturar a entrada do usuário
		        Scanner scanner = new Scanner(System.in);
		        // Cria uma lista dinâmica para armazenar os nomes das pessoas
		        ArrayList<String> pessoas = new ArrayList<>();
		        // Objeto Random para realizar o sorteio
		        Random random = new Random();

		        // Loop para capturar os nomes das pessoas
		        while (true) {
		            System.out.print("Digite o nome de uma pessoa (ou pressione ENTER para parar): ");
		            String nome = scanner.nextLine();

		            // Se o usuário pressionar ENTER sem digitar nada, o loop é interrompido
		            if (nome.isEmpty()) {
		                break;
		            }

		            // Adiciona o nome à lista
		            pessoas.add(nome);
		        }

		        // Verifica se a lista de pessoas não está vazia
		        if (pessoas.size() > 0) {
		            // Sorteia uma pessoa aleatoriamente
		            int indiceSorteado = random.nextInt(pessoas.size());
		            String pessoaSorteada = pessoas.get(indiceSorteado);

		            // Exibe o nome da pessoa sorteada
		            System.out.println("\nA pessoa sorteada foi: " + pessoaSorteada);
		        } else {
		            System.out.println("\nNenhuma pessoa foi inserida para o sorteio.");
		        }

		        // Fecha o scanner
		        scanner.close();
		    }
		
		

	}


