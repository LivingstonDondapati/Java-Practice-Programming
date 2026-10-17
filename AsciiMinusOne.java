package com.codegnan.operatorexamples;

import java.util.Scanner;

public class AsciiMinusOne {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a Character: ");
		char inputChar = scanner.next().charAt(0);
		
		int asciiValue = (int) inputChar; 
		
		int result = asciiValue - 1;
		
		System.out.println("Original Character: " + inputChar);
		System.out.println("ASCII Value: " + asciiValue);
		System.out.println("ASCII Value - 1: " + result);

		scanner.close();
	}
	 
}
