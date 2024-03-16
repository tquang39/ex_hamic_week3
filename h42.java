package week3;

import java.util.Scanner;

public class h42 {
    static Scanner input = new Scanner(System.in);
    public static double[][] getInputMatrix(double[][] matrix) {
        for ( int i = 0; i < matrix.length; ++i) {
            for ( int j = 0; j < matrix[i].length; ++j) {
                matrix[i][j] = input.nextDouble();
            }
        }
        return matrix;
    }

    public static double[][] transposeOfMatrix(double[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        double[][] transposeMatrix = new double[m][n];
        for ( int i = 0; i < m; i++) {
            for ( int j = 0; j < n; j++) {
                transposeMatrix[i][j] = matrix[j][i];
            }
        }
        return transposeMatrix;
    }

    public static void main(String[] args) {
        int n = input.nextInt();
        int m = input.nextInt();
        double[][] matrix = new double[n][m];
        matrix = getInputMatrix(matrix);
        double[][] transposeMatrix = new double[m][n];
        transposeMatrix = transposeOfMatrix(matrix);
        for ( int i =0; i < m; i++) {
            for ( int j = 0; j < n; j++) {
                System.out.print(transposeMatrix[i][j] +" ");
            }
            System.out.println("");
        }
    }
}
