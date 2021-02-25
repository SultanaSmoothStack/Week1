package com.sultana;

public class Circle implements Shape {
    @Override
    public int calculateArea(int radius1, int radius2) {
        return 22 / 7 * radius1 * radius2;
    }
}
