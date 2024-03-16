package week3;

import java.util.Scanner;


public class c41 {
    static Scanner input = new Scanner(System.in);
    public static double[] getArrayInput( int n) {
        double[] array = new double[n];
        for (int i = 0; i < n; ++i) {
            array[i] = input.nextDouble();
        }
        return array;
    }

    public static double sumArray(double[] array) {
        double sum = 0;
        for ( int i = 0; i < array.length; ++i) {
            sum += array[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = input.nextInt();
        double[] array = new double[n];
        array = getArrayInput(n);
        System.out.println(sumArray(array));
    }
}
