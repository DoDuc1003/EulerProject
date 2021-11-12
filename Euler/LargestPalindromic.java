
import java.util.*;

public class LargestPalindromic {

    public static int solution(int n, List<Integer> a) {
        for (int i = 0; i < a.size() - 1; i++) {
            if (a.get(i) <= n && n < a.get(i + 1)) {
                return a.get(i);
            }
        }
        return a.get(a.size() - 1);
    }

    public static boolean check(int a) {
        String s = String.valueOf(a);
        if (s.charAt(5) != s.charAt(0) || s.charAt(4) != s.charAt(1) || s.charAt(3) != s.charAt(2)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        for (int i = 100; i < 1000; i = i + 1) {
            for (int j = 100000/i + 1; j < 1000; j++) {
                if (check(i * j) && (i * j) % 10 != 0 ) {
                    set.add(i * j);
                }
            }
        }
        //System.out.println(count);
        List<Integer> a = new ArrayList<>();
        a.addAll(set);
        Collections.sort(a);
        System.out.println(a);
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(solution(n, a));
        }
    }

}
