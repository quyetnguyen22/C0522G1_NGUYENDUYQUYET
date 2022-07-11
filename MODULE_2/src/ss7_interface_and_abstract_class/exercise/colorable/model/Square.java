package ss7_interface_and_abstract_class.exercise.colorable.model;

public class Square extends Shape implements Colorable{
private double shapeSquare;
public Square() {

}
public Square(double shapeSquare, String color, boolean filled) {
    super(color, filled);
    this.shapeSquare =shapeSquare;
}

    public double getShapeSquare() {
        return shapeSquare;
    }

    public void setShapeSquare(double shapeSquare) {
        this.shapeSquare = shapeSquare;
    }

    @Override
    public String toString() {
        return "A Square with shape="
                + getShapeSquare()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

    @Override
    public double getArea() {
        return Math.pow(this.shapeSquare,2);
    }
}
