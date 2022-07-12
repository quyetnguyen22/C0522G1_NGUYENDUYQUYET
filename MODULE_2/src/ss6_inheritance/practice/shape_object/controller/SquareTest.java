package ss6_inheritance.practice.shape_object.controller;

import ss6_inheritance.practice.shape_object.model.Square;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
        square = new Square(5);
        System.out.println(square);
        System.out.println(square.getArea());
    }
}
