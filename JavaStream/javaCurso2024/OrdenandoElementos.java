package javaCurso2024;

		import java.util.Arrays;
		import java.util.List;

		public class  OrdenandoElementos {
		    public static void main(String[] args) {
		        List<String> nomes = Arrays.asList("Carlos", "Ana", "Bruno", "Pedro", "Julia");
		        
		        System.out.println("Nomes ordenados:");
		        nomes.stream()
		             .sorted()
		             .forEach(System.out::println);
		    }


	}
