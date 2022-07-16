package ss11_stack_queue.exercise.palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    private static Queue<Character> characterQueue = new LinkedList<>();
    private static Queue<Character> characterQueue1 = new LinkedList<>();
    private static Stack<Character> characterStack = new Stack<>();
    private static Scanner scanner = new Scanner(System.in);

    public static String addString() {
//        Able was I ere I saw Elba
        System.out.println("Input the string:");
        String str = scanner.nextLine();
        return str.toLowerCase();
    }

    public static void addToQueue() {
        String str = addString();
        for (int i = 0; i < str.length(); i++) {
            characterQueue.add(str.charAt(i));
            characterStack.add(str.charAt(i));
        }
        while (!characterStack.isEmpty()) {
            characterQueue1.add(characterStack.pop());
        }
        if (characterQueue1.equals(characterQueue)) {
            System.out.println("This string is a Palindrome!");
            return;
        }
        System.out.println("This string is not a Palindrome!");
    }

    public static void main(String[] args) {
        Palindrome.addToQueue();
    }
}
