package com.sultana;

public interface Shape {
    int calculateArea(int length, int width);
    default void display(int area, String message) {
        if (message == null || message.equals("")) {
            message = "Shape Area";
        }
        System.out.println(message + ": " + area);
    }
}
