package br.com.fiap;

import java.util.Scanner;

public class TesteWhile {

	public static void main(String[] args) {
		/*
		 Looping
		 Laço de repetição
		 */
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = leitor.next();
		
		System.out.println("Quantidades de repetições?  ");
		int repeticoes = leitor.nextInt();
		
		int contador = 1;
		
		while (contador <= repeticoes) {
			System.out.println(contador + " - " + nome);
			contador = contador + 1;
		}
		
		System.out.println("FIM");
	}

}
