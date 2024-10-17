package javaCurso2024;

import java.util.Arrays;
import java.util.List;

public class FiltrandoDados {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Filtrando números pares, ímpares e primos:
        System.out.println("Números pares:");
        numeros.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

        System.out.println("Números ímpares:");
        numeros.stream().filter(n -> n % 2 != 0).forEach(System.out::println);

        System.out.println("Números primos:");
        // Chamamos o método isPrimo corretamente usando a referência da classe FiltrandoDados
        numeros.stream().filter(FiltrandoDados::isPrimo)
                .forEach(System.out::println);
    }

    // Método auxiliar para verificar se um número é primo
    public static boolean isPrimo(Integer numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
