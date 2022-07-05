package SS3_Array_And_Method.Exercise;

import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        String chars = InputCharacter();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Input a letter.");
        char letter = scanner1.nextLine().charAt(0);
        System.out.print("There are letter:" + CountChar(chars, letter));
    }
    public static String InputCharacter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a range of character.");
        String rangeOfChar = scanner.nextLine();
        return  rangeOfChar;
    }
    public static int CountChar(String character, char input) {
        int count = 0;
        for (int i = 0; i < character.length(); i++) {
            if (input == character.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}
