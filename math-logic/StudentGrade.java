package com.codegnan.operatorexamples;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's marks: ");
        int marks = scanner.nextInt();

        // Nested ternary operator to evaluate the grade based on the given ranges
        char grade = (marks >= 90) ? 'A' : 
                     (marks >= 80) ? 'B' : 
                     (marks >= 70) ? 'C' : 
                     (marks >= 60) ? 'D' : 
                     (marks >= 50) ? 'E' : 'F';

        System.out.println("Grade: " + grade);

        scanner.close();
    }
}