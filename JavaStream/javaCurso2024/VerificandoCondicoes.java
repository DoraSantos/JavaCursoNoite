package javaCurso2024;

import java.util.Arrays;
import java.util.List;

public class VerificandoCondicoes {
    public static void main(String[] args) {
        // Criação de uma lista de números
        List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50);

        // Verifica se algum número é maior que 50
        boolean algumMaiorQue50 = numeros.stream()
                                         // anyMatch retorna true se algum número > 50
                                         .anyMatch(n -> n > 50);
        System.out.println("Algum número é maior que 50? " + algumMaiorQue50);

        // Verifica se todos os números são positivos
        boolean todosPositivos = numeros.stream()
                                        // allMatch retorna true se todos os números > 0
                                        .allMatch(n -> n > 0);
        System.out.println("Todos os números são positivos? " + todosPositivos);

        // Verifica se nenhum número é negativo
        boolean nenhumNegativo = numeros.stream()
                                        // noneMatch retorna true se nenhum número < 0
                                        .noneMatch(n -> n < 0);
        System.out.println("Nenhum número é negativo? " + nenhumNegativo);
    }


	}
