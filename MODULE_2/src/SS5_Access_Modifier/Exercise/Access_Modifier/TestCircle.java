package SS5_Access_Modifier.Exercise.Access_Modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.setRadius(11);
        circle.setColor("Yellow");
        System.out.printf("The area of the %s circle is: %f",circle.getColor(), circle.getArea());
    }
}
