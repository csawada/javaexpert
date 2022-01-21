package averagegrades;

import java.util.Scanner;

public class AverageGrades {

	public static void main(String[] args) {
		Scanner note = new Scanner(System.in);
		double n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, fm;
		System.out.println("Enter exam grade 1");
		n1 = note.nextDouble();
		System.out.println("Enter exam grade 2");
		n2 = note.nextDouble();
		System.out.println("Enter exam grade 3");
		n3 = note.nextDouble();
		System.out.println("Enter exam grade 4");
		n4 = note.nextDouble();
		System.out.println("Enter exam grade 5");
		n5 = note.nextDouble();
		System.out.println("Enter exam grade 6");
		n6 = note.nextDouble();
		System.out.println("Enter exam grade 7");
		n7 = note.nextDouble();
		System.out.println("Enter exam grade 8");
		n8 = note.nextDouble();
		System.out.println("Enter exam grade 9");
		n9 = note.nextDouble();
		System.out.println("Enter exam grade 10");
		n10 = note.nextDouble();
		
		fm =(n1+n2+n3+n4+n5+n6+n7+n8+n9+n10)/10;
		if (fm >= 5)
			
		{
			System.out.println("You were approved");
		} else {
			System.out.println("You failed");
		}
		
		System.out.print("The final average is:  " + fm + " points");
	}

}
