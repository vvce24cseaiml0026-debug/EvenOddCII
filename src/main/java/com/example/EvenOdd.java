
package com.example;

public class EvenOdd {

    public static String checkEvenOdd(int number) {

        if (number % 2 == 0) {
            return "EVEN";
        } else {
            return "ODD";
        }
    }

    public static void main(String[] args) {

        int number = 10;

        System.out.println("Number: " + number);

        System.out.println(
            "Result: " + checkEvenOdd(number)
        );
    }
}
