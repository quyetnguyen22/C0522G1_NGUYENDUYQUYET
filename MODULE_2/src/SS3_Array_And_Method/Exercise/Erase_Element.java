package SS3_Array_And_Method.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Erase_Element {
    public static void main(String[] args) {
//        int[] arr = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array.");
        int aNumberOf = scanner.nextInt();
        int[] arr = new int[aNumberOf];
        for (int i = 0; i < aNumberOf; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Enter the element " + i);
            arr[i] = scanner1.nextInt();
        }
        System.out.println("The array\n" + Arrays.toString(arr));
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Input the element that you want to erase.");
        int number = scanner2.nextInt();
        boolean isNotExist = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                for (int j = i; j < aNumberOf - 1; j++) {
                    arr[j] = arr[j + 1];
                    isNotExist = false;
                }
            }
        }
        System.out.print(Arrays.toString(arr) + "\t");
        if (isNotExist) {
            System.out.println("\nThe number which you entered is not exist.");

        }
    }
}