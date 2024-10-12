package javaCurso2024;
	
		import java.io.File;
		import java.io.FileNotFoundException;
		import java.util.Scanner;
		public class LeituraArquivo {
		    public static void main(String[] args) {
		        // Caminho do arquivo
		        String caminhoArquivo = "C:\\Users\\Noite\\Desktop\\teste\\teste.txt";
		        
		        // Criar um objeto File
		        File arquivo = new File(caminhoArquivo);

		        // Verificar se o arquivo existe
		        if (!arquivo.exists()) {
		            System.out.println("Erro: O arquivo não foi encontrado.");
		            return;  
		            // Sair do programa se o arquivo não existir
		        }

		        // Se o arquivo existir, tentar lê-lo
		        try {
		            Scanner leitor = new Scanner(arquivo);

		            // Ler o arquivo linha por linha
		            while (leitor.hasNextLine()) {
		                String linha = leitor.nextLine();
		                System.out.println(linha);
		            }

		            // Fechar o leitor após a leitura
		            leitor.close();
		        } catch (FileNotFoundException e) {
		            // Tratar exceção caso o arquivo não seja encontrado (teoricamente já tratado pelo if)
		            System.out.println("Erro: Não foi possível abrir o arquivo.");
		        } catch (Exception e) {
		            // Tratar outras exceções não previstas
		            System.out.println("Erro inesperado: " + e.getMessage());
		        }
		    }


	}

