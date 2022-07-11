package ss6_inheritance.exercise.circle_cylinder.model;

public class Circle {
    private double r;
    private String color;

    public Circle() {

    }

    public double getR() {
        return this.r;
    }

    public String getColor() {
        return this.color;
    }

    public void setR(double newR) {
        this.r = newR;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public double getArea() {
        return Math.PI * r * r;
    }

    public String toString() {
        return ("The radius of circle: " + getR() + "\nThe color of circle: " + getColor() + "\nThe area of circle: " + getArea());
    }
}
