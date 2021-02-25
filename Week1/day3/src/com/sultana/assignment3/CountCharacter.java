package com.sultana.assignment3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CountCharacter {

    public static void main(String[] args) {
        String filePath = "C:/Users/razia/Education/SmoothStack/Assignments/Week1/day3/src/com/sultana/assignment3";
        String fileName = "input.txt";
        File file = new File(filePath + "/" + fileName);
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream
        Scanner scanner = null;
        int count = 0;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
            System.out.print("Enter a character you want to count: ");
            String str= sc.nextLine();
            char c = str.charAt(0);
            String lowerCase = line.toLowerCase();

            for(int i = 0; i < lowerCase.length(); i++) {
                if(lowerCase.charAt(i) == c )
                    count++;
            }

        }

        //Counts each character except space

        System.out.println("Total number of characters in a string: " + count);
    }
}
