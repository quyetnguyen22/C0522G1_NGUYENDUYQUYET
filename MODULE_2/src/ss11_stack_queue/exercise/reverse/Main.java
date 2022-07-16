package ss11_stack_queue.exercise.reverse;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    private static Stack<Integer> integerStack = new Stack<>();
    private static Stack<Integer> integerStack1 = new Stack<>();
    private static Stack<String> stringStack = new Stack<>();
    private static Stack<String> wStack = new Stack<>();

    private static Scanner scanner = new Scanner(System.in);

    public static int aNumberOf() {
        System.out.println("Enter a number of elements:");
        int numberOf = Integer.parseInt(scanner.nextLine());
        return numberOf;
    }

    public static void addNumber() {
        int stop = aNumberOf();
        int i = 0;
        while (i < stop) {
            System.out.printf("Enter the elements %d:", i);
            int add = Integer.parseInt(scanner.nextLine());
            integerStack.push(add);
            i++;
        }
        System.out.println(integerStack);
    }
    public static void addString() {
        System.out.println("Enter a word:");
        String word = scanner.nextLine();
//        System.out.println(word.split(" ").toString());
        int i = 0;
        while (i<word.length()) {
            stringStack.push(word);
        }
    }

    public static void reverseElement() {
        int i = 0;
        do {
            integerStack1.push(integerStack.pop());
            i++;
        } while (!integerStack.isEmpty());
        System.out.println(integerStack1);
    }



    public static void main(String[] args) {
//        Main.addNumber();
        Main.addString();
        Main.reverseElement();
    }
}
