package javaCurso2024;

	import java.util.Arrays;
	import java.util.List;

	public class ReduzindoDados {
	    public static void main(String[] args) {
	        // Criação de uma lista de números
	        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

	        // Calcula a soma de todos os números usando reduce
	        int soma = numeros.stream()
	                          // Acumula a soma dos números
	                          .reduce(0, Integer::sum);

	        // Exibe a soma total
	        System.out.println("Soma dos números: " + soma);
	    }


	}
