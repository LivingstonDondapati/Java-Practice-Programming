package com.codegnan.operatorexamples;

import java.util.Scanner;

public class DivisibleBy5OrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number to check divisibility by 5: ");
		int val = scanner.nextInt();
		String divisibleResult = (val % 5 == 0) ? "Divisible by 5" : "Not divisible by 5";
		System.out.println(val + " is " + divisibleResult);

		scanner.close();
	}

}
