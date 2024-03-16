package week3;

import java.util.Scanner;

public class g42 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        boolean[] primes = sieveOfEratosthenes(a,b);
        System.out.println("Các số nguyên tố nhỏ hơn hoặc bằng " + b + " là:");
        for (int i = a; i <= b; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
            }
        }
        input.close();
    }

    public static boolean[] sieveOfEratosthenes(int a, int b) {
        boolean[] prime = new boolean[b + 1];
        for (int i = 0; i <= b; i++) {
            prime[i] = true;
        }

        for (int p = 2; p * p <= b; p++) {
            if (prime[p]) {
                for (int i = p * p; i <= b; i += p) {
                    prime[i] = false;
                }
            }
        }

        return prime;
    }


}
