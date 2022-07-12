package ss6_inheritance.practice.shape_object.controller;

import ss6_inheritance.practice.shape_object.model.Shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape("red", true);
        shape = new Shape("Pink", false);
        System.out.println(shape);
    }
}
