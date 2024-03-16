package week3;

import java.util.Scanner;

public class f42 {
    static Scanner input = new Scanner(System.in);
    public static int[][] getInputMatrix(int[][] matrix) {
        for ( int i = 0; i < matrix.length; ++i) {
            for ( int j = 0; j < matrix[i].length; ++j) {
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }

    public static boolean checkSquareMatrix( int[][] matrix) {
        for ( int i = 0; i < matrix.length; i++) {
            for ( int j = 0; j < matrix[i].length; j++) {
                if (matrix.length != matrix[i].length) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkUnitMatrix( int[][] matrix) {
        for ( int i = 0; i < matrix.length; i++) {
            for ( int j = 0; j < matrix.length; ++j) {
                if (i > j || i < j) {
                    if ( matrix[i][j] != 0) {
                        return false;
                    }
                }
                else {
                    if ( matrix[i][j] != 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }



    public static void main(String[] args) {
        int n = input.nextInt();
        int m = input.nextInt();
        int[][] matrix = new int[n][m];
        matrix = getInputMatrix(matrix);
        if (checkSquareMatrix(matrix)) {
            System.out.println(checkUnitMatrix(matrix));
        }
        else {
            System.out.println("false");
        }
        
    }
}
