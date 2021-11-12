
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class PowerDigitNum {
    public static int solution(int n) {
        BigInteger value = new BigInteger("2");
        value = value.pow(n);
        String x = value.toString();
        int sum = 0;
        for (int i = 0; i < x.length(); i++) {
            sum += x.charAt(i) - '0';
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            System.out.println(solution(n));
        }
    }
}
