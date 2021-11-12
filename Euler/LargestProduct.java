
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LargestProduct {
    public static long solution(int n, String s) {
        int[] a = new int [s.length()];
        for (int i = 0; i < a.length; i++) {
            a[i] = s.charAt(i) - '0';
        }
        long max = 1;
        for (int i = 0; i < n; i++) {
            max = max * a[i];
        }
        for (int i = 0; i < s.length() - n - 1; i++) {

            long x = 1;
            for (int j = i; j < i + n; j++) {
                x = x * a[j];
            }
            if (max < x) {
                max = x;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            String num = in.next();
            System.out.println(solution(k, num));
        }
    }
}
