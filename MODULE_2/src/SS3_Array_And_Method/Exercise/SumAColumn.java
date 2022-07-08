package ss3_array_and_method.Exercise;

import java.util.Scanner;

public class SumAColumn {
    public static void main(String[] args) {
        int temp[][] = addMatrix();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Input the column that you want to calculator.");
        int input = scanner1.nextInt();
        System.out.println("Sum of row: " + calSumColumn(input, temp));
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

    public static int calSumColumn(int row, int array[][]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][row];
        }
        return sum;
    }
}


