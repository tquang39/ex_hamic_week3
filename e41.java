package week3;

import java.util.Scanner;

public class e41 {
    static Scanner input = new Scanner(System.in);
    public static int[] getArrayInput( int n) {
        int[] array = new int[n];
        for ( int i = 1; i < n; ++i) {
            array[i] = input.nextInt();
        }
        return array;
    }

    public static boolean checkAscendingArray( int[] array) {
        for( int i = 0; i < array.length - 1; ++i) {
            if (array[i] > array[i+1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = input.nextInt();
        int[] array = new int[n];
        array = getArrayInput(n);
        boolean result = checkAscendingArray(array);
        if (result) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
