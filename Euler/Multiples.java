
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Multiples {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            long n = in.nextInt();
            long three = (n-1) / 3;
            long five = (n-1) / 5;
            long fifteen = (n-1) / 15;
            long value = 3*(three + 1)*three/2 + 5*five*(five + 1)/2 - 15*fifteen*(fifteen + 1);
            System.out.println(value);
        }

    }
}
