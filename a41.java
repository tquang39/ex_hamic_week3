package week3;

import java.util.Scanner;

/**
 * 4_1_a
 */
public class a41 {
    static Scanner input = new Scanner(System.in);
    public static int[] inputArray( int n ) {
        int[] array = new int[n];
        for ( int i = 0; i < n; ++i) {
            array[i] = input.nextInt();
        }
        return array;
    }

    public static void printArray( int[] a ) {
        for ( int i = 0; i<a.length; ++i) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int n = input.nextInt();
        int[] array = new int[n];
        array = inputArray(n);
        printArray(array);
    }
    
}