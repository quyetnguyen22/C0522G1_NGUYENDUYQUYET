package ss13_searching_algorithm.go_up_string;

import java.util.*;

public class GoUp {
    private static Scanner scanner = new Scanner(System.in);
    private static Stack<String> stringStack = new Stack<>();

    public static void goUpString() {
        System.out.println("Input a string:");
        String str = scanner.nextLine();
        String[] arrs = str.split("");
        System.out.println(Arrays.toString(arrs));

        for (int i = 0; i < arrs.length - 1; i++) {
            if (arrs[i].charAt(0) < arrs[i + 1].charAt(0)) {
                System.out.print(arrs[i]);
                stringStack.add(arrs[i]);
                if (arrs[i + 1].charAt(0) < stringStack.pop().charAt(0)) {
                    System.out.println(arrs[i + 1]);
                    stringStack.add(arrs[i + 1]);
                }

            }
        }

    }

    public static void main(String[] args) {
        goUpString();
    }
}
