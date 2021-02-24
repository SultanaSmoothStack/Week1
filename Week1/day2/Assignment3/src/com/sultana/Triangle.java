package com.sultana;

public class Triangle implements Shape {
    @Override
    public int calculateArea(int length, int width) {
        return length * width / 2;
    }

    @Override
    public void display(int area, String message) {
        if (message == null || message.equals("")) {
            message = "Triangle Shape Area";
        }
        System.out.println(message + ": " + area);
    }
}
