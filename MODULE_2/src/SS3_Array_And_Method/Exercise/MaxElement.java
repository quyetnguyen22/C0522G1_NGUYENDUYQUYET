package ss3_array_and_method.Exercise;

import java.util.Scanner;

public class MaxElement {
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

            int max = matrix[0][0];
            System.out.println("Matrix: ");
            for (int[] rowMatrix : matrix) {
                for (int colMatrix : rowMatrix) {
                    System.out.print(colMatrix + " ");
                    if (colMatrix > max) {
                        max = colMatrix;
                    }
                }
                System.out.println();
            }
            System.out.println("Max element: ");
            System.out.println(max);
        }
}
