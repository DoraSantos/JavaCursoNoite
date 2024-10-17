package javaCurso2024;

	import java.util.Arrays;
	import java.util.List;
	import java.util.Map;
	import java.util.stream.Collectors;

	public class AgrupandoDados {
	    public static void main(String[] args) {
	        // Criação de uma lista de nomes
	        List<String> nomes = Arrays.asList("Carlos", "Ana", "Bruno", "Pedro", "Julia");

	        // Agrupa os nomes pelo tamanho de cada nome
	        Map<Integer, List<String>> agrupadosPorTamanho = nomes.stream()
	                                                              // Agrupa os nomes pelo seu comprimento (length)
	                                                              .collect(Collectors.groupingBy(String::length));

	        // Exibe o agrupamento por tamanho
	        System.out.println("Nomes agrupados pelo tamanho: " + agrupadosPorTamanho);
	    }
	}
