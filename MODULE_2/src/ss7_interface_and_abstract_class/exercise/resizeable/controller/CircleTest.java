package ss7_interface_and_abstract_class.exercise.resizeable.controller;

import ss7_interface_and_abstract_class.exercise.resizeable.model.Circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
    }
}