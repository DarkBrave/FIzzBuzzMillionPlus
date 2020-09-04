package com.darkbrave;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        PrintStream fileOut = new PrintStream("./out.txt");
        System.setOut(fileOut);
        for (long i = 0; i <= 10000000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
        System.out.println("Done!");
    }
}
