import java.util.Scanner;

public class Equation_1 {
    public static void main(String[] args) {
        float a;
        float b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number a: ");
        a = input.nextFloat();
        System.out.println("Enter the number b:");
        b = input.nextFloat();
        float x = -a / b;
        System.out.println("The result of this equation is: " +x);
    }
}
