package jokeponbr;

import java.util.Scanner;

public class JokenpoBr {

	public static void main(String[] args) {
		int jogador, computador;

		Scanner leitor = new Scanner(System.in);
		System.out.println(" === Jokenpô BR ===");
		System.out.println("(1) pedra, (2) papel ou  (3) tesoura");
		System.out.println("Digite a opção desejada\n");

		// jogador
		jogador = leitor.nextInt();
		switch (jogador) {
		case 1:
			System.out.println("O jogador escolheu Pedra");
			break;
		case 2:
			System.out.println("O jogador escolheu Papel");
			break;
		case 3:
			System.out.println("O jogador escolheu Tesoura");
		default:
			System.out.println("Por favor insira um número válido");
		}
		// computador
		computador = (int) (Math.random() * 3 + 1);
		switch (computador) {
		case 1:
			System.out.println("O computador escolheu Pedra");
			break;
		case 2:
			System.out.println("O computadorescolheu Papel");
			break;
		case 3:
			System.out.println("O computador escolheu Tesoura");
		}

		// Lógica para determinar o vencedor
		if (jogador == computador) {
			System.out.println("EMPATE! Ninguém ganhou.");
		} else {
			if ((jogador == 1 && computador == 2) || (jogador == 1 && computador == 3)
					|| (jogador == 2 && computador == 1) || (jogador == 2 && computador == 3)
					|| (jogador == 3 && computador == 2) || (jogador == 3 && computador == 1)) {
				System.out.println("Jogador Ganhou");
			} else {
				System.out.println("Computador Ganhou");
			}

		}

	}
}