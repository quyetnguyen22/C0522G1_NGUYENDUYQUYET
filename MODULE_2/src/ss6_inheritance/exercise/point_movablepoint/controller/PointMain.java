package ss6_inheritance.exercise.point_movablepoint.controller;

import ss6_inheritance.exercise.point_movablepoint.model.MovablePoint;
import ss6_inheritance.exercise.point_movablepoint.model.Point;

public class PointMain {
    public static void main(String[] args) {
        Point point = new MovablePoint(1,2,3,4);
        point.setXY(5,6);
        ((MovablePoint) point).setSpeed(10,20);
        ((MovablePoint) point).move();
        System.out.println(point.toString());
    }
}
