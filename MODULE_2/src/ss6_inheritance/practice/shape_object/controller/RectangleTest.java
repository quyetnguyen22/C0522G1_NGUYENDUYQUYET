package ss6_inheritance.practice.shape_object.controller;

import ss6_inheritance.practice.shape_object.model.Rectangle;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2,5);
        rectangle = new Rectangle(4, 5, "Violet", true);
        System.out.println(rectangle);
    }
}
