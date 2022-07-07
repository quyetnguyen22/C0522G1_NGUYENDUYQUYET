package SS5_Access_Modifier.Exercise.Access_Modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    Circle() {

    }
    Circle(double radius) {
        this.radius = radius;
    }
    protected double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    protected double getArea() {
        return Math.PI * radius * radius;
    }
}
