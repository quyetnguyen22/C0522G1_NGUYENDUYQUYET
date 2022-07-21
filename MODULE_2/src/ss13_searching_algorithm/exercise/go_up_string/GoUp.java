package ss13_searching_algorithm.exercise.go_up_string;

import java.util.*;

public class GoUp {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Stack<String> STRINGSTACK = new Stack<>();

    public static void goUpString() {
        System.out.println("Input a string:");
        String str = SCANNER.nextLine();
        String[] arrs = str.split("");
        System.out.println(Arrays.toString(arrs));
        int index = 0;
        String min = arrs[0];
        for (int i = 0; i < arrs.length; i++) {
            for (int j = 0; j < arrs.length; j++) {
                if (min.charAt(0) >= arrs[j].charAt(0)) {
                    min = arrs[j];
                    index = j;
                }
            }
        }
        STRINGSTACK.add(min);
        System.out.print(arrs[index]);
        for (int k = index; k < arrs.length - 1; k++) {
            if (arrs[k].charAt(0) > STRINGSTACK.peek().charAt(0)) {
                System.out.print(arrs[k]);
                STRINGSTACK.add(arrs[k]);
            }
        }

    }

    public static void main(String[] args) {
        goUpString();
    }
}
