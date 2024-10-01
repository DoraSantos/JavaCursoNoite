package javaCurso2024;
		//importando classses prontas do Java:
		import java.util.ArrayList;//Criar
		import java.util.Scanner;//perguntar coisas pro usúario

		public class ListaFrutas {
		    public static void main(String[] args) {
		        // Cria um scanner para capturar a entrada do usuário
		        Scanner scanner = new Scanner(System.in);
		        // Cria um array dinâmico (ArrayList) para armazenar os nomes das frutas
		        ArrayList<String> frutas = new ArrayList<>();
		        
		        while (true) {
		            // Pede ao usuário para inserir o nome de uma fruta
		            System.out.print("Digite o nome de uma fruta (ou pressione ENTER para parar): ");
		            String fruta = scanner.nextLine();
		            
		            // Se o usuário pressionar ENTER sem digitar nada, o loop é interrompido
		            if (fruta.isEmpty()) {
		                break;
		            }
		            
		            // Adiciona a fruta ao array dinâmico
		            frutas.add(fruta);
		        }
		        
		        // Exibe a lista de frutas inseridas
		        System.out.println("\nAs frutas que você inseriu são:");
		        for (String f : frutas) {
		            System.out.println(f);
		        }

		        // Fecha o scanner
		        scanner.close();
		    }
		}
