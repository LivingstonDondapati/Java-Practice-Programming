package com.codegnan.operatorexamples;

public class AsciiExample2 {
    public static void main(String[] args) {
        int asciiValue = 97;
        
        // Manual casting int to char gives the ASCII character
        char ch = (char) asciiValue;
        
        System.out.println("The character for ASCII value " + asciiValue + " is: " + ch);
        // Output: The character for ASCII value 97 is: a
    }
}
 