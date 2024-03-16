package week3;

import java.util.*;

public class testw4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng phần tử trong mảng
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = scanner.nextInt();

        // Khai báo mảng và nhập các phần tử từ bàn phím
        int[] array = inputArray(scanner, n);

        // Nhập vị trí của số nhỏ thứ n
        int position = inputPosition(scanner, n);

        // Tìm và in ra số nhỏ thứ n trong mảng
        int nthSmallest = findNthSmallest(array, position);
        if (nthSmallest != -1) {
            System.out.println("Số nhỏ thứ " + position + " trong mảng là: " + nthSmallest);
        } else {
            System.out.println("Không có số nhỏ thứ " + position + " trong mảng.");
        }

        scanner.close();
    }

    // Phương thức nhập mảng từ bàn phím
    public static int[] inputArray(Scanner scanner, int n) {
        int[] array = new int[n];
        System.out.println("Nhập các số nguyên:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    // Phương thức nhập vị trí của số nhỏ thứ n
    public static int inputPosition(Scanner scanner, int n) {
        int position;
        do {
            System.out.print("Nhập số nhỏ thứ n (1 <= n <= " + n + "): ");
            position = scanner.nextInt();
        } while (position < 1 || position > n);
        return position;
    }

    // Phương thức tìm số nhỏ thứ n trong mảng
    public static int findNthSmallest(int[] array, int position) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : array) {
            minHeap.offer(num);
        }
        for (int i = 1; i < position; i++) {
            minHeap.poll();
        }
        return minHeap.isEmpty() ? -1 : minHeap.poll();
    }
}
