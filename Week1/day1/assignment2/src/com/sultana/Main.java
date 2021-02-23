package com.sultana;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int secretNumber;

        // create a random number from 1 to 100
        secretNumber = (int) (Math.random() * 100);
        //System.out.println(secretNumber);

        Scanner scanner = new Scanner(System.in);
        int guessedNumber;
        int numberOfTries = 0;
        final int maxTries = 3;

        for (int i = 0; i < maxTries; i++) {
            System.out.println("Enter your Number between 1 to 100:  ");
            // Input validation
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.printf("\"%s\" is not a valid number. Enter a number between 1 to 100\n", input);
            }
            guessedNumber = scanner.nextInt();

            numberOfTries++;
            System.out.println("Your guess is: " + guessedNumber);

            if (guessedNumber == secretNumber) {
                System.out.println(" Your guess is correct. Congratulations!!! ");
                break;
            } else if (guessedNumber < 0 || guessedNumber > 100) {
                System.out.println(" your guess is out of range");
            } else if (guessedNumber < secretNumber) {
                System.out.println(" Your guess number is smaller than the secrect number");
            } else {
                System.out.println(" your guess is greater than the number");
            }
        }
        // checking maximum tries
        if (maxTries == numberOfTries) {
            System.out.println(" ");
            System.out.println(" You loose. ");
            System.out.println("The number was: " + secretNumber);
            System.out.println(" You tries " + numberOfTries + " times");
        }

    }

}

