package ss4_class_object.exercise.quadratic_equation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inputA;
        do {
            System.out.println("Input a: ");
            inputA = scanner.nextDouble();
            if (inputA == 0) {
                System.out.println("A is not equal to 0!");
            }
        } while (inputA == 0);
        System.out.println("Input b: ");
        double inputB = scanner.nextDouble();
        System.out.println("Input c: ");
        double inputC = scanner.nextDouble();
        CalQuadratic input = new CalQuadratic(inputA, inputB, inputC);
        if (input.getDelta() > 0) {
            System.out.println("Root 1:\t" + input.getRoot1());
            System.out.println("Root 2:\t" + input.getRoot2());
        } else if (input.getDelta() == 0) {
            System.out.println("Root:\t" + input.getRoot());
        } else {
            System.out.println("Phuong trinh vo nghiem!");
        }
    }
}

