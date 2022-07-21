package ss14_sorting_algorithm.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    private static final Scanner SCANNER = new Scanner(System.in);
public static void insertionSortByStep() {
    System.out.println("Input list size:");
    int size = Integer.parseInt(SCANNER.nextLine());
    int[] list = new int[size];
    System.out.printf("Input %d elements:\n", size);
    for (int i = 0; i < list.length; i++) {
        list[i] = Integer.parseInt(SCANNER.nextLine());
    }
    System.out.println("The array you entered\n" + Arrays.toString(list));
    for (int i = 1; i < list.length; i++) {
        int key = list[i];
        int j = i;
        while (j >0 && key < list[j - 1]) {
            list[j] = list[j - 1];
            j--;
        }
        list[j] = key;
        System.out.println("Step " + i + ":" + " swap " + list[j] + " with " + list[j + 1]);
        System.out.println(Arrays.toString(list));
    }
}

    public static void main(String[] args) {
        InsertionSort.insertionSortByStep();
    }
}
