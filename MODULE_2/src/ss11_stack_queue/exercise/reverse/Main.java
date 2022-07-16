package ss11_stack_queue.exercise.reverse;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    private static Stack<Integer> integerStack = new Stack<>();
    private static Stack<Integer> integerStack1 = new Stack<>();
    private static Stack<Character> stringStack = new Stack<>();
    private static Queue<Character> characterQueue = new LinkedList<>();

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
        int j = 0;
        do {
            integerStack1.push(integerStack.pop());
            j++;
        } while (!integerStack.isEmpty());
        System.out.println(integerStack1);
    }

    public static void addString() {
        System.out.println("Enter a word:");
        String word = scanner.nextLine();
        for (int i = 0; i < word.length(); i++) {
            stringStack.add(word.charAt(i));
        }
        int j = 0;
        while (!stringStack.isEmpty()) {
            characterQueue.add(stringStack.pop());
            System.out.print(characterQueue.poll());
            j++;
        }
    }

    public static void main(String[] args) {
        Main.addNumber();
        Main.addString();

    }
}
