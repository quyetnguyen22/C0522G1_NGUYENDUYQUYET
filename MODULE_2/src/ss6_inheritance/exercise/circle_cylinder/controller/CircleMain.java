package ss6_inheritance.exercise.circle_cylinder.controller;

import ss6_inheritance.exercise.circle_cylinder.model.Circle;
import ss6_inheritance.exercise.circle_cylinder.model.Cylinder;

public class CircleMain {
    public static void main(String[] args) {
        Circle circle = new Cylinder();
        ((Cylinder) circle).setHeight(5);
//        Cylinder cylinder = (Cylinder) circle;
//        cylinder.setHeight(5);
//        circle.setHeight(5);
        circle.setR(1);
        circle.setColor("red");
        System.out.println(circle.toString());
    }
}
