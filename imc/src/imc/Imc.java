package imc;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		
		int weight;
		double height , imc;
		// Read User Keyboard
		Scanner reader = new Scanner(System.in);

		// Creating the variables for the calculation
		System.out.println("Enter your weight/Digite seu peso:");
		weight = reader.nextInt();
		System.out.println("Enter your height/Digite sua altura:");
		height = reader.nextDouble();
		imc = weight / (height * height);
		reader.close();
		System.out.println("");
		System.out.println(imc);

	}
}
