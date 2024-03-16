package week3;

import java.util.Scanner;

public class a42 {
    static Scanner input = new Scanner(System.in);
    public static int[][] getInputMatrix(int n, int m) {
        int[][] matrix = new int[n][m];
        for ( int i = 0; i < n; i++) {
            for ( int j = 0; j < m;j++){
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }

    public static void printMatrix (int[][] matrix) {
        for ( int i = 0; i < matrix.length;i++) {
            for ( int j = 0; j < matrix[i].length;j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int n = input.nextInt();
        int m = input.nextInt();
        int[][] matrix = new int[n][m];
        matrix = getInputMatrix(n, m);
        printMatrix(matrix);
    }
}
