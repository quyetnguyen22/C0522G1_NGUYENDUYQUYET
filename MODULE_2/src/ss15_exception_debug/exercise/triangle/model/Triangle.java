package ss15_exception_debug.exercise.triangle.model;

public class Triangle {
    private double shapeA;
    private double shapeB;
    private double shapeC;

    public Triangle(double shapeA, double shapeB, double shapeC) {
        this.shapeA = shapeA;
        this.shapeB = shapeB;
        this.shapeC = shapeC;
    }
    public double getShapeA() {
        return this.getShapeA();
    }
    public void setShapeA(double shapeA) {
        this.shapeA = shapeA;
    }

    public double getShapeB() {
        return shapeB;
    }

    public void setShapeB(double shapeB) {
        this.shapeB = shapeB;
    }

    public double getShapeC() {
        return shapeC;
    }

    public void setShapeC(double shapeC) {
        this.shapeC = shapeC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "shapeA=" + shapeA +
                ", shapeB=" + shapeB +
                ", shapeC=" + shapeC +
                '}';
    }
}
