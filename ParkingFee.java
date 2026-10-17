package com.codegnan.operatorexamples;

import java.util.Scanner;

public class ParkingFee {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of hours parked: ");
		int hours = scanner.nextInt();

		// Calculate fee using a ternary operator
		int fee = (hours <= 3) ? (hours * 2) : (6 + (hours - 3));

		System.out.println("Total parking fee: $" + fee);

		scanner.close();
	}
}