package ss1_introduction_to_java.practice;

import java.util.Scanner;

public class IBMIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Your weight (in kilogram):");
        weight = scanner.nextDouble();

        System.out.print("Your height (in meter):");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }

    public static class AreaOfRectangle {
        public static void main(String[] args) {
            float length;
            float width;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the length: ");
            width = input.nextFloat();
            System.out.println("Enter the width: ");
            length = input.nextFloat();
            float area = length * width;
            System.out.println("Area of the rectangle is: " + area);
        }
    }
}
