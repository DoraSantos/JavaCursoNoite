package javaCurso2024;

public class ArraySimples {

	public static void main(String[] args) {
		// Criando um array(lista) de frutas:
		//Array começa em ZERO nas principais Linguagens!
		String[] frutas = { "Banana", "Maça", "Pera", "Tomate", "Melancia", "Melão"};
		
		//Exibindo apenas 1 item do array:
		//System.out.println("Minha fruta é: "+ frutas[0]);
		
		//Exibir todos os itens do array com for:
		// "item < frutas.length": deve ser lido como: enquanto o valor da variavel item for menor que o comprimento do array frutas, incrementar a variavel item usando item++
		//for ( int item = 0; item < frutas.length; item++) {
			//System.out.println(frutas[item]);
		//}
		
		for( String fruta : frutas) {
		System.out.println(fruta);
		}
	}

}