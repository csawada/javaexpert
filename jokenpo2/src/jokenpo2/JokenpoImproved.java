package jokenpo2;

import java.util.Random;
import java.util.Scanner;

public class JokenpoImproved {

	public static void main(String[] args) {
		int chooseUser = 0;
		int chooseMachine = 0;
		int ScoreMachine = 0;
		int UserScore = 0;
		int MaximumNumberOfMatches = 1;
		int counter = 0;
		int draws = 0;
		int matchNumber = 1;
		String AnswerUser = "yes";

		Scanner reader = new Scanner(System.in);

		while (AnswerUser.equalsIgnoreCase("yes")) {
			System.out.println("=== JOKENPO ===\n");

			while (MaximumNumberOfMatches < 3 || MaximumNumberOfMatches % 2 == 0) {
				System.out.println("How many Matches do you want to play?\n"
						+ "REMEMBER: number of matches MUST BE GREATER THAN THREE AND BE ODD");
				MaximumNumberOfMatches = reader.nextInt();
				System.out.println();
			}
			while (MaximumNumberOfMatches > counter && !(ScoreMachine > (MaximumNumberOfMatches - draws) / 2
					|| UserScore > (MaximumNumberOfMatches - draws) / 2)) {
				while (chooseUser <= 0 || chooseUser > 3) {
					System.out.println("MATCH\n" + matchNumber);
					System.out.println();
					System.out.println("Stone - 1");
					System.out.println("Paper - 2");
					System.out.println("Scissors - 3");

					System.out.println("Choose an option: ");
					chooseUser = reader.nextInt();
					System.out.println();

					if (chooseUser <= 0 || chooseUser > 3) {
						System.out.println("You entered an invalid option! Please enter again!");
					}
				}
				if (chooseUser == 1) {
					System.out.println("You chose Stone!");
				} else if (chooseUser == 2) {
					System.out.println("You chose Paper!");
				} else {
					System.out.println("You chose Scissors!");
				}

				Random sweepstakes = new Random();
				chooseMachine = sweepstakes.nextInt(3) + 1;

				if (chooseMachine == 1) {
					System.out.println("The machine chose Stone");
				} else if (chooseMachine == 2) {
					System.out.println("The machine chose Paper!");
				} else {
					System.out.println("The machine chose Scissors!");
				}

				if (chooseUser == chooseMachine) {
					System.out.println("DRAWS!\n");
					draws++;
				} else if ((chooseUser == 1 && chooseMachine == 3) || (chooseUser == 2 && chooseMachine == 1)
						|| (chooseUser == 3 && chooseMachine == 2)) {
					System.out.println("You won the match!\n");
					UserScore++;
				} else {
					System.out.println("Machine won the game!\n");
					ScoreMachine++;
				}
				counter++;
				chooseUser = 0;
				MaximumNumberOfMatches++;
			}
		}

	}
}
