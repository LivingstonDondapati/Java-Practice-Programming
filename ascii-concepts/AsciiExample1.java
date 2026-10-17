package com.codegnan.operatorexamples;

public class AsciiExample1 {
    public static void main(String[] args) {
        char ch = 'A';
        
        // Explicit casting char to int gives its ASCII value
        int asciiValue = (int) ch;
        
        System.out.println("The ASCII value of " + ch + " is: " + asciiValue);
        // Output: The ASCII value of A is: 65
    } 
}