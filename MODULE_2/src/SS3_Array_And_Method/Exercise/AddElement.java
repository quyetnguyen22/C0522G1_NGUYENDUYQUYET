package SS3_Array_And_Method.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array.");
        int aNumberOf = scanner.nextInt();
        int[] arr = new int[aNumberOf];
        for (int i = 0; i < aNumberOf; i++) {
            System.out.println("Enter the element " + i);
            arr[i] = scanner.nextInt();
        }
        System.out.println("The array\n" + Arrays.toString(arr));
        System.out.println("Input the number that you want to add.");
        int number = scanner.nextInt();
        System.out.println("Input the position that you want to add.");
        int index = scanner.nextInt();
        int[] newArr = new int[aNumberOf];
        if (index < 0 || index > arr.length) {
            System.out.println("Invalid!");
        } else {
            for (int i = 0; i < index; i++) {
                newArr[i] = arr[i];
            }
            newArr[index] = number;
            for (int i = index + 1; i < newArr.length; i++) {
                newArr[i] = arr[i - 1];
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
