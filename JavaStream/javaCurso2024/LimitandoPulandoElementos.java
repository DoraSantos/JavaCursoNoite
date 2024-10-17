package javaCurso2024;

	import java.util.Arrays;
	import java.util.List;

	public class LimitandoPulandoElementos {
	    public static void main(String[] args) {
	        // Criação de uma lista de números
	        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	        // Exibe os três primeiros elementos
	        System.out.println("Os três primeiros elementos:");
	        numeros.stream()
	               // Limita o fluxo aos primeiros 3 elementos
	               .limit(3)
	               // Imprime os elementos
	               .forEach(System.out::println);

	        // Exibe os elementos restantes após pular os dois primeiros
	        System.out.println("Pulando os dois primeiros, exibindo o restante:");
	        numeros.stream()
	               // Pula os primeiros 2 elementos
	               .skip(2)
	               // Imprime o restante
	               .forEach(System.out::println);
	    }
	


	}
