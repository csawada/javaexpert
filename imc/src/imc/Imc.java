package imc;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		// Ler o teclado do Usuário
		Scanner leitor = new Scanner(System.in);

		// Criando as variáveis para o cálculo
		System.out.println("Digite seu peso:");
		int pesoDoUsuario = leitor.nextInt();
		System.out.println("Digite sua altura:");
		double alturaDoUsuario = leitor.nextDouble();
		double imc = pesoDoUsuario / (alturaDoUsuario * alturaDoUsuario);
		leitor.close();
		System.out.println("");
		System.out.println(imc);

	}
}
