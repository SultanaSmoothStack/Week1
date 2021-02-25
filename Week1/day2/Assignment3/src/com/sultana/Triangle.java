package com.sultana;

public class Triangle implements Shape {
    @Override
    public int calculateArea(int length, int width) {
        return length * width / 2;
    }
}
