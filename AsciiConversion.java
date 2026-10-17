package com.codegnan.operatorexamples;
public class AsciiConversion {
    public static void main(String[] args) {
        char upperChar = 'G'; // ASCII value = 71
        
        // Add 32 to convert Uppercase to Lowercase
        char lowerChar = (char) (upperChar + 32); 
        
        System.out.println(upperChar + " in lowercase is: " + lowerChar);
        // Output: G in lowercase is: g
    }
} 