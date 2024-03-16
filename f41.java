package week3;

import java.util.Scanner;

public class f41 {
    static Scanner input = new Scanner(System.in);

    public static int[] getArrayInput( int n) {
        int[] array = new int[n];
        for ( int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        return array;
    }

    public static void sortArrayDescending( int[] array) {
        for ( int i = 0; i < array.length - 1; ++i) {
            for ( int j = 0; j < array.length - i - 1; j++) {
                if ( array[j] < array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int n = input.nextInt();
        int[] array = new int[n];
        array = getArrayInput(n);
        sortArrayDescending(array);
        for ( int number : array) {
            System.out.print(number + " ");
        }
    }
}
