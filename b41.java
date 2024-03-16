package week3;

import java.util.Scanner;

public class b41 {
    static Scanner input = new Scanner(System.in);
    public static double[] inputArray( int n ) {
        double[] array = new double[n];
        for ( int i = 0; i < n; ++i) {
            array[i] = input.nextDouble();
        }
        return array;
    }

    public static double printMax( double[] a ) {
        double maxNumber = a[0];
        for ( int i = 1; i < a.length; i++) {
            if (a[i] > maxNumber) {
                maxNumber = a[i];
            }
        }
        return maxNumber;
    }


    public static void main(String[] args) {
        int n = input.nextInt();
        double[] array = new double[n];
        array = inputArray(n);
        System.out.println(printMax(array));
    }
    
}
