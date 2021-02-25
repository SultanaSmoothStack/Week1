package com.sultana.assignment1;

import java.io.File;
public class FileDirectory {
    public static void main(String[] args) {
        String[] listOfFileNames;
        String filePath = "C:/Users/razia/Education/SmoothStack/Assignments/Week1/day3/src/com/sultana";
        File file = new File(filePath);
        listOfFileNames = file.list();
        System.out.println("List of all files: ");
        for (String listOfName:listOfFileNames) {
            System.out.println( listOfName);

        }
    }
}
