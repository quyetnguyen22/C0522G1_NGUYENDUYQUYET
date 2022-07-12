package ss6_inheritance.practice.shape_object.controller;

import ss6_inheritance.practice.shape_object.model.Circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(2,"Orange", true);
        System.out.println(circle);
        System.out.println(circle.getArea());
    }
}
