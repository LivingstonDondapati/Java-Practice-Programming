package com.codegnan.operatorexamples;

import java.util.Scanner;

public class NumPositiveOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number to check positive/negative/zero: ");
		int number = scanner.nextInt();
		// Nested ternary operator handles positive, negative, or zero
		String positiveResult = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";
		System.out.println(number + " is " + positiveResult);
	}

}
