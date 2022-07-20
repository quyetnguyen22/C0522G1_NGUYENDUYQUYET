package ss14_sorting_algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class SetUpInsertionSort {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static int[] addElements() {
        System.out.println("Input the array size:");
        int size = Integer.parseInt(SCANNER.nextLine());
        int[] arr = new int[size];
        System.out.printf("Input %d elements:\n", size);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(SCANNER.nextLine());
        }
        System.out.println("The array entered:\n" + Arrays.toString(arr));
        return arr;
    }
    public static void insertionSort() {
        int[] newAray = addElements();
        for (int i = 1; i < newAray.length; i++) {
            int insertionNum = newAray[i];
            int j = i;
            while (j > 0 && insertionNum < newAray[j - 1]) {
                newAray[j] = newAray[j - 1];
                j--;
            }
            newAray[j] = insertionNum;
        }
        System.out.println("The array after sorting:\n" + Arrays.toString(newAray));
    }

    public static void main(String[] args) {
        insertionSort();
    }
}
