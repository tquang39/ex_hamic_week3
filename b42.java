package week3;

import java.util.Scanner;

public class b42 {
    static Scanner input = new Scanner(System.in);
    public static double[][] getInputMatrix (int n, int m) {
        double[][] matrix = new double[n][m];
        for ( int i = 0; i < n; i++) {
            for ( int j = 0; j < m;j++){
                matrix[i][j] = input.nextDouble();
            }
        }
        return matrix;
    }

    public static double findMax(double[][] matrix) {
        double maximum = matrix[0][0];
        for ( int i = 0; i < matrix.length; i++) {
            for ( int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > maximum){
                    maximum = matrix[i][j];
                }
            }
        }
        return maximum;
    }


    public static void main(String[] args) {
        int n = input.nextInt();
        int m = input.nextInt();
        double[][] matrix = new double[n][m];
        matrix = getInputMatrix(n, m);
        System.out.println(findMax(matrix));
    }
}
