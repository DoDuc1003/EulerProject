package com.company.euler;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class LongestCollatz {
    static final int MAX_N = 5000000;
    static int[] dp = new int[MAX_N + 1];

    static int collatzLength(long v) {
        Stack<Long> path = new Stack<>();

        int distance = 0;
        while(v > 1) {
            if (v <= MAX_N && dp[(int)v] != 0) {
                distance = dp[(int)v] - 1;
                break;
            }
            v = (v % 2 == 0) ? (v / 2) : (3 * v + 1);
            path.push(v);
        }

        while(!path.empty()) {
            v = path.pop();
            distance++;
            if (v <= MAX_N) {
                dp[(int)v] = distance;
            }
        }

        return distance;
    }

    public static void main(String[] args) {

        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = Integer.parseInt(input.readLine());
            int v, distance;
            int maxDistance = 1;
            int maxValue = 1;
            int[] whoIsMax = new int[MAX_N + 1];

            for (int i = 1; i <= MAX_N; i++) {
                distance = collatzLength(i);

                if (distance >= maxDistance) {
                    maxDistance = distance;
                    maxValue = i;
                }
                whoIsMax[i] = maxValue;
            }
            for (int i = 0; i < n; i++) {
                v = Integer.parseInt(input.readLine());
                out.append(String.valueOf(whoIsMax[v])).append("\n");
            }
            out.flush();
            out.close();
            input.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
