package com.codegnan.operatorexamples;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number to check even/odd: ");
		int num = scanner.nextInt();
		String evenOddResult = (num % 2 == 0) ? "Even" : "Odd";
		System.out.println(num + " is " + evenOddResult);
	}

}
