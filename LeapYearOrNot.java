package com.codegnan.operatorexamples;

import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a year: ");

		int year = scanner.nextInt();

		String leapYearResult = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? "Leap year"
				: "Not a leap year";
		System.out.println(year + " is " + leapYearResult);
	}

}
