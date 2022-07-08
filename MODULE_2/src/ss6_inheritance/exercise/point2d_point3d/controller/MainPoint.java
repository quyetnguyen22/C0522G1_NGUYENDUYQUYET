package ss6_inheritance.exercise.point2d_point3d.controller;

import ss6_inheritance.exercise.point2d_point3d.class_point.Point2D;
import ss6_inheritance.exercise.point2d_point3d.class_point.Point3D;

public class MainPoint {
    public static void main(String[] args) {
        Point2D point2D = new Point3D();
        point2D.setXY(1.0f, 2.0f);
        ((Point3D) point2D).setXYZ(4.0f,5.0f,3.0f);
        System.out.println(point2D.toString());
    }
}
