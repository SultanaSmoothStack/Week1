package com.sultana;

public class Main {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 11, 9}, {13, 43, 5, 11}};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    System.out.println("New max found: " + max);
                }
            }

        }
        System.out.println("Max: " + max);
    }
}
