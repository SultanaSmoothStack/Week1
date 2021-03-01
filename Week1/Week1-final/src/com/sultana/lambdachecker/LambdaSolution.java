package com.sultana.lambdachecker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class LambdaSolution {
    public static void main(String[] args) {
        int cases;
        System.out.println("Enter the number of test cases operation ");
        Scanner reader = new Scanner(System.in);
        cases = reader.nextInt();
        System.out.println("Enter a test case and number in the form of  space-separated integers");
        List<String> inputList = getAllLines(cases);
        List<String> resultList = getOptionResult(inputList);
        resultList.forEach(System.out::println);
    }

    private static List<String> getOptionResult(List<String> inputList) {
        List<String> resultList = new ArrayList<>();
        Operation operation;
        OperationChecker operationChecker = new OperationChecker();
        for (String input : inputList) {
            String s[] = input.split(" ");
            if (s[0].equals("1")) {
                operation = operationChecker.is_odd();
                boolean result = operation.check(Integer.parseInt(s[1]));
                if (result) {
                    resultList.add("ODD");
                }
                else {
                    resultList.add("EVEN");
                }
            } else if (s[0].equals("2")) {
                operation = operationChecker.is_Prime();
                boolean result = operation.check(Integer.parseInt(s[1]));
                if (result) {
                    resultList.add("PRIME");
                }
                else {
                    resultList.add("COMPOSITE");
                }
            }   else if(s[0].equals("3")) {
                operation = operationChecker.is_Palindrome();
                boolean result = operation.check(Integer.parseInt(s[1]));
                if (result) {
                    resultList.add("PALINDROME");
                } else {
                    resultList.add("NOT PALINDROME");
                }
            }
        }
        return resultList;
    }

    private static List<String> getAllLines(int count) {
        List<String> inputList = new ArrayList<>();
        for (int i = 0; i< count ; i++) {
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            inputList.add(line);
        }
        return inputList;
    }
}
