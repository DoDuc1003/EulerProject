package com.company.euler;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LatticePath {
    static long MODULO = 1000000007;

    public static BigInteger solution(int m, int n) {
        if (m == 1) {
            return new BigInteger(String.valueOf(n));
        }
        BigInteger num = new BigInteger("1");
        for (int i = m + 1; i <= n ; i++) {
            num = num.multiply(BigInteger.valueOf(i));
        }
        BigInteger de = new BigInteger("1");
        for (int i = 1; i <= n-m ; i++) {
            de = de.multiply(BigInteger.valueOf(i));
        }
        BigInteger value = num.divide(de);
        BigInteger result = value.mod(BigInteger.valueOf(MODULO));
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            System.out.println(solution(m, m + n));
        }

    }
}
