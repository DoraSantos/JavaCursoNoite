package javaCurso2024;

public class ManipulandoStrings {
	public static void main(String[]args) {
		//Criando String:
		String texto = "Bem Vindo ao Curso Intermediário de Java";
		String texto2 = "Vamos aprender sobre String!";
		
		//1.Comprimento da string:
		System.out.println("Comprimento de string:" + texto.length());
		
		//2.Concatenar Strings:
		String textoCompleto = "\n" + texto +"\n" + texto2;
		System.out.println("Texto Completo:"+textoCompleto);
		
		 //3.Converter para MAIÚSCULAS E minúsculas:
		//System.out.printlin("MIÚSCULAS:" + texto.toUpperCase());
		//System.out.printlin("ninúsculas:" + texto2.toLwerCase());
		
		//4.Substituir uma parte da string:
		String novoTexto = texto.replace("Java","PHP");
		System.out.println("Texto após a substituição:" + novoTexto);
		
		//5.Buscar por uma substring:
		int posicao = texto.indexOf("curso"); 
		System.out.println("Posição da palavra'curso':"+ posicao);
		
		//6.Verificar se uma string começa ou  termina com uma substring:
		System.out.println("Começa com 'Bem':" + texto.startsWith("Bem"));
	
	    //7. Dividir uma String:
// 		String nomeCompleto = "Doralice dos Santos";
//		String[] parteDoNomeCompleto = nomeCompleto.split(" ");
//		System.out.println("Parte do nome completo:");
//
//		for ( String parteDoNome: parteDoNomeCompleto) {
//		System.out.println(parteDoNome);
//		}
		//8.Removere espaços:
		String textoComEspacos = "      Texto com espaços.    ";
		System.out.println("Texto sem espaços:' " + textoComEspacos.trim
				().replaceAll("\\s+","") + "'");
		/*O comando;"\\s+ "=> captura todos os espaços da string
		* O comando " "=> substitui todos os espaços por apenas 1.
				*/
	}

}
