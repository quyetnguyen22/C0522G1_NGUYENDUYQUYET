package ss6_inheritance.exercise.circle_cylinder.class_circle_cylinder;

public class Cylinder extends Circle {
    private double height;

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * getHeight();
    }

    public String toString() {
        return super.toString() + ("\nThe volume of this cylinder: " + getVolume());
    }
}
