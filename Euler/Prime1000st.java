package com.company.euler;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Prime1000st {
    public static void main(String[] args) {
        int[] a = new int [10000];
        a[0] = 2;
        a[1] = 3;
        a[2] = 5;
        a[3] = 7;
        int count = 4;
        int value  = 9;
        while (count < 10000) {
            boolean flag = true;
            for (int i = 0; a[i] <= Math.sqrt(value); i++) {
                if (value % a[i] == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                a[count++] = value;
            }
            value = value + 2;
        }

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(a[n-1]);
        }
    }
}
