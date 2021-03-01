package com.sultana;
import java.util.Scanner;

import static java.lang.Integer.parseInt;
public class Main {

    public static void main(String[] args) {

        /*System.out.println("Enter the number of test cases operation ");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
*/

        //for (int i = 0; i<inputNumber ; i++) {
            System.out.println("Enter the number ");
           Scanner scanner = new Scanner(System.in);

           String userInputString = scanner.nextLine();
            int firstInt = parseInt(userInputString.substring(0,0));
            int secondInt = parseInt(userInputString.substring(1));
            //int inputType = Integer.parseInt(String.valueOf(userInputType));
            if(firstInt == 1){
                if(isOdd(secondInt)){
                    System.out.println("EVEN");
                }
            }

       // }

    }
    public static  boolean isOdd(int a){
        return a % 2 == 0;

    }


}
