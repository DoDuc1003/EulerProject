
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EvenFibo {
    public static long solution(long n) {
        long a = 0;
        long b = 2;
        long sum = 0;
        if (n < 2)  return 0;
        if (n < 8) return 2;
        while (b < n) {
            sum += b;
            long temp = b;
            b = b * 4 + a;
            a = temp;
        }
        return sum;
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
