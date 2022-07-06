package SS4_Class_Object.Practice;

public class SimpleCircle {
        /**
         * Main method
         */
        public static void main(String[] args) {
            SS4_Class_Object.Exercise.SimpleCircle circle1 = new SS4_Class_Object.Exercise.SimpleCircle();
            System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());
            SS4_Class_Object.Exercise.SimpleCircle circle2 = new SS4_Class_Object.Exercise.SimpleCircle(25);
            System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());

            SS4_Class_Object.Exercise.SimpleCircle circle3 = new SS4_Class_Object.Exercise.SimpleCircle(125);
            System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());
            circle2.radius = 100;
            System.out.println("The area of the circle of radius " +circle2.radius + " is " + circle2.getArea());
        }
    }

    class SimpleCircle {
        double radius;
        /* Construct a circle with radius */

        SimpleCircle() {
            radius = 1;
        }

        /* Construct a circle with a specified radius */
        SimpleCircle(double newRadius) {
            radius = newRadius;
        }

        /* Return the area of this circle */
        double getArea() {
            return radius * radius * Math.PI;
        }

        /* return the perimeter of this circle */
        double getPerimeter() {
            return 2 * radius * Math.PI;
        }

        /* set a new radius for this circle */
        void setRadius(double newRadius) {
            radius = newRadius;
        }
    }
