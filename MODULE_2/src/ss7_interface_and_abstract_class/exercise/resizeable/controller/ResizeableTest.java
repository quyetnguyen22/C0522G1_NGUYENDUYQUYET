package ss7_interface_and_abstract_class.exercise.resizeable.controller;
import ss7_interface_and_abstract_class.exercise.resizeable.model.Circle;
import ss7_interface_and_abstract_class.exercise.resizeable.model.Rectangle;
import ss7_interface_and_abstract_class.exercise.resizeable.model.Shape;

public class ResizeableTest {
    public static void main(String[] args) {
       Shape[] shape = new Shape[2];
       shape[0] = new Circle(2,"red",true);
       shape[1] = new Rectangle(2,5,"Yellow", true);
        for (Shape shapes : shape) {
            System.out.println("\n" +shapes + "\nArea of the circle before increasing: " + shapes.getArea());
            if (shapes instanceof Circle) {
                ((Circle) shapes).resize(100);
                System.out.println("Area of the circle after increasing: " + shapes.getArea());
            }
            if (shapes instanceof Rectangle) {
                ((Rectangle) shapes).resize(50);
                System.out.println("Area of the rectangle after increasing: " + shapes.getArea());
            }
        }
    }
    }

