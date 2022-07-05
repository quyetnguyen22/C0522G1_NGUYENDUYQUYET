package SS3_Array_And_Method.Exercise;

import java.util.Scanner;

public class MinElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input row: ");
        int row = scanner.nextInt();
        System.out.println("Input column: ");
        int col = scanner.nextInt();
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Input matrix [%d][%d]: ", i, j);
                matrix[i][j] = scanner.nextInt();
            }
        }

        int min = matrix[0][0];
        System.out.println("Matrix: ");
        for (int[] rowMatrix : matrix) {
            for (int colMatrix : rowMatrix) {
                System.out.print(colMatrix + " ");
                if (colMatrix < min) {
                    min = colMatrix;
                }
            }
            System.out.println();
        }
        System.out.println("Max element: ");
        System.out.println(min);
    }
}
