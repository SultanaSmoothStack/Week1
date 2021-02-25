package com.sultana.assignment2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendText {
    public static void main(String[] args) throws IOException {
        String filePath = "C:/Users/razia/Education/SmoothStack/Assignments/Week1/day3/src/com/sultana/assignment2";
        String fileName = "input.txt";
        String outputFileName = "output.txt";
        File file = new File(filePath + "/" + fileName);
        FileWriter fileWriter = new FileWriter(filePath + "/" + outputFileName, true);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            try {
                System.out.println(line);
                fileWriter.write(line);
                fileWriter.write("\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        fileWriter.close();

    }
}
