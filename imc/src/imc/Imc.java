package imc;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		
		double weight, height , imc;
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
		System.out.println("IMC is " +imc);
		
		if (imc < 18.5) {
            System.out.println("Under weight/Abaixo do peso");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Healthy/Saudável");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Excess Weight/Peso em excesso");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Grade I obesity/Obesidade Grau I");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Grade II obesity/Obesidade Grau II");
        } else {
        	System.out.println("Grade III obesity/Obesidade Grau III");
        }
            System.out.println("Your IMC is: "+imc);
		
	}
}
