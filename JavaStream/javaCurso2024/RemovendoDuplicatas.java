package javaCurso2024;
	import java.util.Arrays;
	import java.util.List;

	public class RemovendoDuplicatas {
	    public static void main(String[] args) {
	        // Criação de uma lista com números duplicados
	        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 3, 2, 1, 5, 6);

	        // Remove duplicatas e exibe os números únicos
	        System.out.println("Números únicos:");
	        numeros.stream()
	               // distinct remove os elementos duplicados
	               .distinct()
	               // Imprime os números únicos
	               .forEach(System.out::println);
	    }
	}