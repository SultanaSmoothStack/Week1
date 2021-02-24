package com.sultana;

public class Main {

    public static void main(String[] args) {
        triangleArea();
        rectangleArea();
        circleArea();
    }

    public static void triangleArea() {
        Shape shape = new Triangle();
        int area = shape.calculateArea(5, 3);
        shape.display(area, "");
    }

    public static void rectangleArea() {
        Shape shape = new Rectangle();
        int area = shape.calculateArea(5, 3);
        shape.display(area, "Area of Rectangle");
    }

    public static void circleArea() {
        Shape shape = new Circle();
        int area = shape.calculateArea(5, 5);
        shape.display(area, "Area of Circle");
    }
}
