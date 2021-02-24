package com.sultana;

public class Rectangle implements Shape {
    @Override
    public int calculateArea(int length, int width) {
        return length * width;
    }

    @Override
    public void display(int area, String message) {
        System.out.println(message + ": " + area);
    }
}
