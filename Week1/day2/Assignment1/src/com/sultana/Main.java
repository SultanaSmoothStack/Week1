package com.sultana;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // take multiple input
        int sum = 0;
        System.out.println(" Enter numbers ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] numbers = userInput.split(" ");
        for (String number : numbers) {
            if (isNumeric(number)) {
                sum += Integer.parseInt(number);
            }
        }
        //System.out.println(" User Input:  " + userInput);
        System.out.println("Sum of the input numbers is: " + sum);
    }

    private static boolean isNumeric(String str) {
        return str != null && str.matches("[-+]?\\d*\\.?\\d+");
    }
}
