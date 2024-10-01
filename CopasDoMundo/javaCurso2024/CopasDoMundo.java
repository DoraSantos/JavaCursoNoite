package javaCurso2024;

		public class CopasDoMundo {

		    public static void main(String[] args) {
		        int anoAtual = 2024; // Pode atualizar para o ano em que está a correr o programa
		        System.out.println("Anos de ocorrência da Copa do Mundo de Futebol:");

		        // Loop para percorrer os anos de 1930 até o ano atual
		        for (int ano = 1930; ano <= anoAtual; ano += 4) {
		            // Se for 1942 ou 1946, ignora (não houve Copa nesses anos)
		            if (ano == 1942 || ano == 1946) {
		                continue;
		            }
		            System.out.println(ano);
		        }
		    }
		


	}