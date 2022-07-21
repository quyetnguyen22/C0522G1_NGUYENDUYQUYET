package ss15_exception_debug.exercise;

import ss15_exception_debug.exercise.triangle.service.impl.NumberLessThan0Service;
import ss15_exception_debug.exercise.triangle.service.impl.TriangleExceptionService;

import java.util.Scanner;

public class IllegalTriangle {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void addInfor() {
        int a;
        do {
            try {
                System.out.println("Input the shape a:");
                a = Integer.parseInt(SCANNER.nextLine());
                if (a > 0) {
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
        int b;
        do {
            try {
                System.out.println("Input the shape b:");
                b = Integer.parseInt(SCANNER.nextLine());
                if (b > 0) {
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
        int c;
        do {
            try {
                System.out.println("Input the shape c:");
                c = Integer.parseInt(SCANNER.nextLine());
                if (c > 0) {
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
        if (a + b <= c || b + c <= a || a + c <= b) {
            try {
                throw new TriangleExceptionService("Total of 2 shape is not greater than the other!\n" +
                        "Retry please!");
            } catch (TriangleExceptionService e) {
                System.out.print(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        addInfor();
    }

}
