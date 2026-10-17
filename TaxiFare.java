package com.codegnan.operatorexamples;

import java.util.Scanner;

public class TaxiFare {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		{

			System.out.print("Enter the distance traveled (in kilometers): ");
			double distance = scanner.nextDouble();
			double fare = 0;

			// Tiered fare calculation
			if (distance <= 2) {
				fare = 50;
			} else if (distance <= 10) {
				// 50 for the first 2km, plus 15 per km for the remaining distance up to 10km
				fare = 50 + (distance - 2) * 15;
			} else {
				// 50 for first 2km, 120 for the next 8km (8 * 15), plus 10 per km for the rest
				fare = 50 + (8 * 15) + (distance - 10) * 10;
			}

			// Apply 5% discount if distance is more than 20 kilometers
			if (distance > 20) {
				fare = fare * 0.95;
			}

			System.out.println("Total taxi fare: " + fare);

			scanner.close();
		}
	}
}