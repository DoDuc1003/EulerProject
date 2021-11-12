
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SumSquare {
    public static long solution(int n) {
        long x = (long) n;
        long first = x * (x + 1) / 2;
        long value = first * first - first * (2 * x + 1) / 3;
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
