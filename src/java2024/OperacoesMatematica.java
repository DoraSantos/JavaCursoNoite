package java2024;

public class OperacoesMatematica {
	


		    // Método para adição
		    public int adicionar(int a, int b) {
		        return a + b;
		    }

		    // Método para subtração
		    public int subtrair(int a, int b) {
		        return a - b;
		    }

		    // Método para multiplicação
		    public int multiplicar(int a, int b) {
		        return a * b;
		    }

		    // Método para divisão
		    public double dividir(int a, int b) {
		        if (b == 0) {
		            System.out.println("Erro: divisão por zero!");
		            return 0; // Ou pode lançar uma exceção.
		        }
		        return (double) a / b;
		    }

		    // Método para exponenciação (potência)
		    public double potencia(int base, int expoente) {
		        return Math.pow(base, expoente);
		    }

		    // Método principal (para testar)
		    public static void main(String[] args) {
		        OperacoesMatematica op = new OperacoesMatematica();

		        System.out.println("Adição: " + op.adicionar(5, 3));
		        System.out.println("Subtração: " + op.subtrair(5, 3));
		        System.out.println("Multiplicação: " + op.multiplicar(5, 3));
		        System.out.println("Divisão: " + op.dividir(5, 3));
		        System.out.println("Potência: " + op.potencia(5, 3));
		    }
	}