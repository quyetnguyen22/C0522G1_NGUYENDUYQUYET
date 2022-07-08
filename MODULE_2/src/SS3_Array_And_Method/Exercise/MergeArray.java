package ss3_array_and_method.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the first array.");
        int aNumberOf = scanner.nextInt();
        int[] arr1 = new int[aNumberOf];
        for (int i = 0; i < aNumberOf; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.print("Enter the element " + i);
            arr1[i] = scanner1.nextInt();
        }
        System.out.println("The first array\n" + Arrays.toString(arr1));
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter the number of elements in the second array.");
        int aNumberOf2 = scanner2.nextInt();
        int[] arr2 = new int[aNumberOf2];
        for (int i = 0; i < aNumberOf2; i++) {
            Scanner scanner3 = new Scanner(System.in);
            System.out.print("Enter the element " + i);
            arr2[i] = scanner3.nextInt();
        }
        System.out.println("The second array\n" + Arrays.toString(arr2));
        int[] newArr = new int[aNumberOf + aNumberOf2];
        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }
        for (int i = arr1.length ; i < newArr.length; i++) {
            newArr[i] = arr2[i - arr1.length];
        }
        System.out.println("The new array\n" + Arrays.toString(newArr));
    }
}
