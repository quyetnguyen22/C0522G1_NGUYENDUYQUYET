package SS3_Array_And_Method.Exercise;

import java.util.Scanner;

public class SquareArray {
    public static void main(String[] args) {
       int[][] array2D = addMatrix();
        System.out.println("Sum of diagonal line: " + calSumLine(array2D));
    }
    public static int[][] addMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input row: ");
        int rowNum = scanner.nextInt();
        System.out.println("Input column: ");
        int colNum = scanner.nextInt();
        System.out.println("Input the elements: ");
        int[][] matrix = new int[rowNum][colNum];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }
    public static int calSumLine(int array[][]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }
}
