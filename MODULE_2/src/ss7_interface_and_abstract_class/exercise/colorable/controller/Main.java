package ss7_interface_and_abstract_class.exercise.colorable.controller;
import ss7_interface_and_abstract_class.exercise.colorable.model.Circle;
import ss7_interface_and_abstract_class.exercise.colorable.model.Rectangle;
import ss7_interface_and_abstract_class.exercise.colorable.model.Shape;
import ss7_interface_and_abstract_class.exercise.colorable.model.Square;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2, "Red", false);
        shapes[1] = new Rectangle(3, 5, "Brown", true);
        shapes[2] = new Square(6,"Blue",true);
        for (Shape shape : shapes) {
            System.out.println("\n" + shape + "\nArea: " + shape.getArea());
            if (shape instanceof Square) {
                ((Square) shape).howToColor();
            }
        }
    }
}
