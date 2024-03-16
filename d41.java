package week3;

import java.util.Scanner;
import java.util.Arrays;
public class d41 {
    static Scanner input = new Scanner(System.in);
    //nhap mang
    public static int[] getArrayInput( int n) {
        int[] array = new int[n];
        for ( int i = 0; i < n; ++i) {
            array[i] = input.nextInt();
        }
        return array;
    }
    //nhap so nho thu n 
    public static int inputNth( int n) {
        int position;
        do {
            System.out.print("Nhap so nho thu n thuoc (1 <= n <= " + n + "): ");
            position = input.nextInt();
        }while (position < 1 || position > n);
        return position;
    }

    // in so nho thu n
    public static void printNthMin(int[] array, int position) {
        System.out.println("So nho thu " + position + " trong mang la: " + array[position - 1]);
    }

    public static void main(String[] args) {
        int n = input.nextInt();
        int[] array = new int[n];
        array = getArrayInput(n);
        Arrays.sort(array);
        int position = inputNth(n);
        printNthMin(array, position);
    }
}
