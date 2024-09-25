package java2024;

import java.util.Scanner;

public class ContarVogais {

	public static void main(String[] args) {
	//Criar o scanner para ler a entrada do utilizador
		Scanner scanner = new Scanner (System.in);
		
		//Pedir a frase do utilizador
System.out.print("Digite uma frase:");
String frase = scanner.nextLine();

//Iniciar a contagem das vogais
int contadorVogais = 0;

//Converter a frase para letras minúsculas para simplificar a comparação
frase = frase.toLowerCase(); 
//percorrer cada letra da frase e contar as vogais
for (int i = 0; i < frase.length(); i++) {
	char letra = frase.charAt(i);
	if(letra == 'a'|| letra  == 'e'|| letra== 'i'|| letra == 'o'|| letra == 'u') {
		contadorVogais++;
	}
}

//Exibir o número de vogais entradas
System.out.println("A frase contém" + contadorVogais + "vogais.");
	}

}
