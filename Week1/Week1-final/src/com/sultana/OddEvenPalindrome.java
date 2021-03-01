package com.sultana;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddEvenPalindrome {

    private static List<String> getAllLines(int count) {
        List<String> inputList = new ArrayList<>();
        for (int i = 0; i< count ; i++) {
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            inputList.add(line);
        }
        return inputList;
    }
    public static void main(String[] args) throws IOException {
        int cases = 0;
        System.out.println("Enter the number of test cases operation ");
        Scanner reader = new Scanner(System.in);
        cases = reader.nextInt();
        System.out.println("Enter a test case and number in the form of  space-separated integers");
        List<String> inputList = getAllLines(cases);
        List<String> result = determineTypes(inputList);
        result.forEach(System.out::println);
    }

    private static List<String> determineTypes(List<String> inputList) {
        List<String> resultList = new ArrayList<>();
        for (String input: inputList) {
            String s[] = input.split(" ");
            if (s[0].equals("1")) {
                resultList.add(isOdd(Integer.parseInt(s[1])));
            } else if (s[0].equals("2")) {
                resultList.add(isPrime(Integer.parseInt(s[1])));
            } else if (s[0].equals("3")) {
                resultList.add(isPalindrome(Integer.parseInt(s[1])));
            } else {
                resultList.add("Input is not Valid");
            }
        }
        return resultList;
    }

    public static String isOdd(int num){
        return (num % 2 == 0) ? "EVEN" : "ODD";
    }
    public static String isPrime(int num) {
        String prime = "PRIME";
        if (num == 1 || num == 2 || num ==3) {
            return prime;
        }
        for (int i = 2; i < num/2; i++) {
            if (num % i == 0) {
                return "NOT PRIME";
            }
        }
        return prime;
    }

    public static String isPalindrome(int num) {
        int reversedInteger = 0, remainder;
        int originalInteger = num;
        while (num != 0) {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num /= 10;
        }
        return (originalInteger == reversedInteger) ? "PALINDROME" : "NOT PALINDROME";
    }
}
