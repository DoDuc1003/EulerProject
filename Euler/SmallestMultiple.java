
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class SmallestMultiple {
    static long gcd(long a, long b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    // method to return LCM of two numbers
    static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }

    public static long solution(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        if( n == 3) {
            return 6;
        }
        long value = 1;
        for (int i = 1 ; i <=n; i++) {
            value = lcm (value, i);
        }
        return value;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(solution(n));
        }
    }
}
