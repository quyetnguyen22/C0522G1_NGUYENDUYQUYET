package ss15_exception_debug.exercise.triangle.service.impl;

import ss15_exception_debug.exercise.triangle.model.Triangle;
import ss15_exception_debug.exercise.triangle.service.ITriangleService;

import java.util.Scanner;

public class TriangleService implements ITriangleService {
    private static final Scanner SCANNER = new Scanner(System.in);
    @Override
    public void check() {
        double shapeA;
        do {
            try {
                System.out.println("Input the shape a:");
                 shapeA = Integer.parseInt(SCANNER.nextLine());
                if (shapeA > 0) {
                    break;
                }
                else {
                    try {
                        throw new NumberLessThan0Service("""
                                Input is incorrect!
                                Please input a number greater than 0!""");
                    } catch (NumberLessThan0Service e) {
                        System.err.println(e.getMessage());
                    }
                }
            } catch (NumberFormatException e) {
//                e.printStackTrace();
                System.err.println("Input is incorrect!\n" +
                        "Please input a number greater than 0!");
            }

        } while (true);
        double shapeB;
        do {
            try {
                System.out.println("Input the shape b:");
                shapeB = Integer.parseInt(SCANNER.nextLine());
                if (shapeB > 0) {
                    break;
                }
                else {
                    try {
                        throw new NumberLessThan0Service("""
                                Input is incorrect!
                                Please input a number greater than 0!""");
                    } catch (NumberLessThan0Service e) {
                        System.err.println(e.getMessage());
                    }
                }
            } catch (NumberFormatException e) {
//                e.printStackTrace();
                System.err.println("Input is incorrect!\n" +
                        "Please input a number greater than 0!");
            }

        } while (true);
        double shapeC;
        do {
            try {
                System.out.println("Input the shape c:");
                shapeC = Integer.parseInt(SCANNER.nextLine());
                if (shapeC > 0) {
                    break;
                }
                else {
                    try {
                        throw new NumberLessThan0Service("""
                                Input is incorrect!
                                Please input a number greater than 0!""");
                    } catch (NumberLessThan0Service e) {
                        System.err.println(e.getMessage());
                    }
                }
            } catch (NumberFormatException e) {
//                e.printStackTrace();
                System.err.println("Input is incorrect!\n" +
                        "Please input a number greater than 0!");
            }
        } while (true);
        Triangle TRIANGLE = new Triangle(shapeA, shapeB, shapeC);
        if (shapeA + shapeB <= shapeC || shapeB + shapeC <= shapeA || shapeA + shapeC <= shapeB) {
            try {
                throw new TriangleExceptionService("Total of 2 shape is not greater than the other!\n" +
                        "Retry please!");
            } catch (TriangleExceptionService e) {
                System.out.print(e.getMessage());
            }
        } else {
            System.out.println(TRIANGLE.toString());
        }
    }
}
