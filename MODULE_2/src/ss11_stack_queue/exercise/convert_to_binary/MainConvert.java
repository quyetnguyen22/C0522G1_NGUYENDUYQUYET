package ss11_stack_queue.exercise.convert_to_binary;

import java.util.Scanner;
import java.util.Stack;

public class MainConvert {
    public static Stack<Integer> integerStack = new Stack<>();
    private static Scanner scanner = new Scanner(System.in);

    public static int addNumber() {
        System.out.println("Enter a number which you want to convert:");
        int number = Integer.parseInt(scanner.nextLine());
        return number;
    }

    public static void convert() {
        int n = addNumber();
        do {
            integerStack.push(n % 2);
            n /= 2;
        } while (n != 0);
        int i = 0;
        while (!integerStack.isEmpty()) {
            System.out.print(integerStack.pop());
            i++;
        }
    }

    public static void main(String[] args) {
        MainConvert.convert();
    }
}
