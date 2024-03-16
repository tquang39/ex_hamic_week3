package week3;

import java.util.Scanner;

public class d42 {
    static Scanner input = new Scanner(System.in);
    public static int[][] getInputMatrix(int[][] matrix) {
        for ( int i = 0; i < matrix.length; ++i) {
            for ( int j = 0; j < matrix[i].length; ++j) {
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }

    public static void replaceMatrix(int[][] matrix) {
        for ( int i = 0; i< matrix.length; i++) {
            for ( int j = 0; j < matrix[i].length; j++) {
                if (i > j) {
                    matrix[i][j] = 0;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }


    public static void main(String[] args) {
        int n = input.nextInt();
        int[][] matrix = new int[n][n];
        matrix = getInputMatrix(matrix);
        replaceMatrix(matrix);
    }
}
