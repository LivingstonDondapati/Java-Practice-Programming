package com.codegnan.operatorexamples;

public class AsciiTableExample {
    public static void main(String[] args) {
        System.out.println("Char \t ASCII Value");
        System.out.println("--------------------");

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println(ch + " \t " + (int) ch);
        }
    }
}
