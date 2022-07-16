package ss11_stack_queue.exercise.bracket;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    private static Stack<Character> bracketStack = new Stack<>();
    private static Scanner scanner = new Scanner(System.in);

    public static boolean addString() {
//        s * (s – a) * (s – b) * (s – c)
//        s * (s – a) * (s – b * (s – c)
//        s * )s – a) * (s – b) * (s – c(
        System.out.println("Input the string:");
        String str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char chars = str.charAt(i);
            if (chars == '(') {
                bracketStack.add(chars);
            } else if (chars == ')') {
                if (bracketStack.isEmpty()) {
                    System.out.println("???");
                    return false;
                }
                bracketStack.pop();
            }
        }
//        System.out.print(bracketStack);
        if (bracketStack.isEmpty()) {
            System.out.println("well");
        } else {
            System.out.println("???");
        }
        return true;
    }

    public static void main(String[] args) {
        addString();
    }
}

