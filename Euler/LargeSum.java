
import java.io.*;
import java.math.*;
import java.util.*;

public class LargeSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BigInteger sum = new BigInteger("0");
        for (int i = 0; i < n; i++) {
            /*String value = scanner.nextLine();
            BigInteger add = new BigInteger(value);*/
            BigInteger add = scanner.nextBigInteger();
            sum = sum.add(add);
        }
        String res = sum.toString();

        System.out.println(res.substring(0, 10));
    }
}
