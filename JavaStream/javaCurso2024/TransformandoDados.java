package javaCurso2024;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TransformandoDados{
    public static void main(String[] args) {
        // Criação de uma lista de números
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Aplica o mapeamento (quadrado de cada número)
        List<Integer> quadrados = numeros.stream()
                                         // Calcula o quadrado de cada número
                                         .map(n -> n * n)
                                         // Coleta os resultados num novo List
                                         .collect(Collectors.toList());

        // Exibe a lista dos quadrados
        System.out.println("Quadrado dos números: " + quadrados);
    }
}
