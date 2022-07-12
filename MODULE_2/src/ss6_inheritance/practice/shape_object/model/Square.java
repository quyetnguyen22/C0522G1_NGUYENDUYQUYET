package ss6_inheritance.practice.shape_object.model;

public class Square extends Rectangle{
    public Square() {

    }
    public Square(double side) {
        super(side, side);
    }

    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }
    public double getWidth() {
        return super.getWidth();
    }
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return "A square with side= " +
                + getSide()
                + ", "
                + "which is a subclass of Rectangle"
                + super.toString();
    }
}
