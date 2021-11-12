
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class LargestPrime {
    public static long solution(long n) {
        long temp = n;
        int sqrt = (int) Math.sqrt(n);
        boolean prime[] = new boolean[sqrt + 9];
        for (int i = 0; i <= sqrt + 1; i++)
            prime[i] = true;

        for (int p = 2; p * p <= sqrt; p++) {
            if (prime[p] == true) {
                for (int i = p * p; i <= sqrt; i += p) {
                    prime[i] = false;
                }
            }
        }

        for (int p = 2; p <= sqrt; p++) {
            if (prime[p] && temp % p == 0) {
                while (temp % p == 0) {
                    temp = temp / p;
                }
                if (temp == 1) {
                    return p;
                }
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            System.out.println(solution(n));
        }
    }

}
