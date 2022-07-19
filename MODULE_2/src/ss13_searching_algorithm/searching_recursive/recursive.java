package ss13_searching_algorithm.searching_recursive;

import java.util.Arrays;
import java.util.Scanner;

public class Recursive {
    private static Scanner scanner = new Scanner(System.in);

    public static int binarySearch(int[] arr, int left, int right, int element) {
        if (left <= right) {
            int mid = (left + right) / 2;
            if (element == arr[mid]) {
                return mid;
            }
            if (element < arr[mid]) {
                return binarySearch(arr, left, mid - 1, element);
            }
            return binarySearch(arr, mid + 1, right, element);
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Input a number of elements:");
        int number = Integer.parseInt(scanner.nextLine());
        int[] array = new int[number];
        int i = 0;
        int element;
        while (number != i) {
            System.out.print("Input the elements:");
            element = Integer.parseInt(scanner.nextLine());
            array[i] = element;
            i++;
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Input the element that you want to search.");
        int search = Integer.parseInt(scanner.nextLine());
        System.out.println(binarySearch(array, 0, number - 1, search));
    }

}
