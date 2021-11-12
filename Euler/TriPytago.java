
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class TriPytago {
    public static long solution(int n) {
        int half = n/2;
        int quarter = (int) (half/Math.sqrt(2));
        if (quarter == 1) return -1;
        long max = -1;
        for (int a = 1 ; a < half; a++) {
            for (int b = a + 1; b < half; b++) {
                int c = n - a - b;
                if (c > b) {
                    long c2 = c * c;
                    long a2 = a * a;
                    long b2 = b * b;
                    if (c2 == a2 + b2) {
                        if (max < a * b * c) {
                            max = a * b * c;
                            System.out.println(a + " " + b + " " + c);
                        }
                    }
                }
            }
        }
        return max;
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
