package salutation;

import java.util.Scanner;

public class Salutation {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String name; 
		System.out.println("Please enter your name");
		name = leitor.next();
		System.out.println("The name entered was "  + name);
		leitor.close();		

	}

}
