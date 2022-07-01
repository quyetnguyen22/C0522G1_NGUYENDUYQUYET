package Exercise;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String input = scanner.nextLine();
        System.out.printf("%s\n", input);
        System.out.printf("Hello: %s ", input );
    }
}
