package SS4_Class_Object.Exercise.QuadraticEquation;

class CalQuadratic {
    private double a, b, c;

    public CalQuadratic(double newA, double newB, double newC) {
        this.a = newA;
        this.b = newB;
        this.c = newC;
    }

    double getA() {
        return a;
    }

    double getB() {
        return b;
    }

    double getC() {
        return c;
    }

    double getDelta() {
        return Math.sqrt(Math.pow(b, 2) - 4 * a * c);
    }
    double getRoot1() {
        return (-b + getDelta()) / (2 * a);
    }
    double getRoot2() {
        return (-b - getDelta()) / (2 * a);
    }
    double getRoot() {
        return -b / (2 * a);
    }
}
