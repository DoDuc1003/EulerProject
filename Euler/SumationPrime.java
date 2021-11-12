
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class SumationPrime {


    public static void main(String[] args) {
        long[] a = new long [1000000 + 9];
        a[0] = 0;
        a[1] = 0;
        boolean prime[] = new boolean[1000000 + 9];
        for (int i = 0; i <= 1000000 + 1; i++)
            prime[i] = true;

        for (int p = 2; p * p <= 1000000; p++) {
            if (prime[p] == true) {
                for (int i = p * p; i <= 1000000; i += p) {
                    prime[i] = false;
                }
            }
        }

        for (int i = 2; i < 1000000; i++) {
            if (prime[i]) {
                a[i] = a[i-1] + i;
            } else {
                a[i] = a[i-1];
            }
        }

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(a[n]);
        }
    }

    private static long solution(int n, boolean[] prime) {
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                sum += i;
            }
        }
        return sum;
    }
}
