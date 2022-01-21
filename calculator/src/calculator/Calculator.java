package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int value1, value2, addition, subtraction, multiplication;
		double division;
		Scanner leitor= new Scanner(System.in);
		System.out.println("This program will add, subtract, multiply, and divide the values you enter!");
		System.out.println("Enter the first value you want to add");
		value1= leitor.nextInt();
		System.out.println("Enter the second value you want to add");
		value2 = leitor.nextInt();
		addition = value1+value2;
		System.out.println("The sum of the two values was: " + addition);
		subtraction = value1 - value2;
		System.out.println("The subtraction of the two values was: " + subtraction);
		multiplication = value1*value2;
		System.out.println("The multiplication of the two values was: " + multiplication);
		division = value1/ (double)value2;
		System.out.println("The division of the two values was: " + division);
		leitor.close();
	}

}
