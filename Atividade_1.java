package primeiro_projeto;

import java.util.Scanner;

public class Atividade_1 {
	public static void main (String[]args) {
		//TODO Auto-generated method stub
		//Variaveis

		int idade;
		String nome;

		//Instaciar classe Scanner
		Scanner ler = new Scanner(System.in);

		//Entrada de dados

		System.out.println("Informe o seu nome: ");
		nome = ler.next();

		System.out.println("Informe a sua idade: ");
		idade = ler.nextInt();


		//Saída
		System.out.println("Bom dia "+nome+" de "+idade+" anos :");
	}

}
