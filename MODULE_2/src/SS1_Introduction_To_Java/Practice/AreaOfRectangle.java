package Practice;

import java.util.Scanner;

public class AreaOfRectangle {
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
