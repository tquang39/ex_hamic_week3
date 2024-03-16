package week3;

import java.util.Scanner;

public class c42 {
    static Scanner input = new Scanner(System.in);
    public static double[][] getInputMatrix (double[][] matrix) {
        for ( int i = 0; i < matrix.length; i++) {
            for ( int j = 0; j < matrix[i].length;j++){
                matrix[i][j] = input.nextDouble();
            }
        }
        return matrix;
    }

    public static double[] sumCol(double[][] matrix) {
        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        double[] colSum = new double[colLength];
        for ( int j = 0; j < colLength; ++j ) {
            double sum = 0;
            for ( int i = 0; i < rowLength; i++) {
                sum += matrix[i][j];
            }
            colSum[j] = sum;
        }
        return colSum;
    }

    public static double findSecondMax(double[] colSum) {
        double maxFirst = Double.MIN_VALUE;
        double maxSecond = Double.MIN_VALUE;
        double maxSecondIndex = -1;
        for ( int i = 0; i < colSum.length; i++) {
                if (colSum[i] > maxFirst) {
                    maxSecond = maxFirst;
                    maxFirst = colSum[i];
                    maxSecondIndex = i;
                }
                else if (colSum[i] > maxSecond && (colSum[i] != maxFirst)) {
                    maxSecond = colSum[i];
                    maxSecondIndex = i;
                }
        }
        return maxSecondIndex + 1 ;
    }

    

    public static void main(String[] args) {
        int n = input.nextInt(); // so hang
        int m = input.nextInt(); // so cot
        double[][] matrix = new double[n][m];
        matrix = getInputMatrix(matrix);
        double[] colSum = new double[m];
        colSum = sumCol(matrix);
        System.out.println(findSecondMax(colSum));
        input.close();
        
    }
}
