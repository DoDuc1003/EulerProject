
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class LargestProductMatrix {

    public static boolean isvalid(int r, int c) {
        return (r < 20 && r >= 0 && c >= 0 && c < 20);
    }


    public static void main(String[] args) {
        int x[] = {0, 0, 0, 1, 2, 3, 1, 2, 3, 1, 2, 3};
        int y[] = {1, 2, 3, 1, 2, 3, 0, 0, 0, -1, -2, -3};

        Scanner in = new Scanner(System.in);
        int[][] grid = new int[20][20];
        for(int grid_i=0; grid_i < 20; grid_i++){
            for(int grid_j=0; grid_j < 20; grid_j++){
                grid[grid_i][grid_j] = in.nextInt();
            }
        }

        long sum = 0, tempsum = 0;
        for (int i = 0; i < 20; ++i) {
            for (int j = 0; j < 20; ++j) {
                for (int s = 0; s < 12; ++s) {
                    if (s % 3 == 0) {
                        sum = Math.max(sum, tempsum);
                        tempsum = grid[i][j];
                    }
                    if (isvalid(i + x[s], j + y[s])) {
                        tempsum *= grid[i + x[s]][j + y[s]];
                    }
                }
                sum = Math.max(sum, tempsum);
            }
        }
        System.out.println(sum);
    }
}
