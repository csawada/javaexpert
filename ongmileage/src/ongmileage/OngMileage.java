/*Create a program in which the user enters how many kilometers the dashboard 
of the car shows at the beginning of a trip, how many kilometers it 
shows when arriving at the gas station and how many books have been refilled.
The program must calculate the average of kilometers per liter that the vehicle makes.*/

package ongmileage;

import java.util.Scanner;

public class OngMileage {

	public static void main(String[] args) {
		double start, end, liters, consumption;
		Scanner leitor = new Scanner(System.in);
		System.out.println("CONSUMPTION CALCULATOR");
		System.out.println("Please inform how many kilometers the marker indicated at the beginning of the trip");
		start = leitor.nextDouble();
		System.out.println("Please inform how many kilometers the marker indicated on arrival at the post");
		end = leitor.nextDouble();
		System.out.println("Please inform how many liters of gasoline have been refilled");
		liters = leitor.nextDouble();
		// For the calculation, the priority use of parentheses one of the operations
		consumption = (end - start) / liters;
		System.out.println("On this trip, the vehicle consumed " + consumption + " km/l");
		leitor.close();
	}

}
