package newpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TestClass {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        PrintWriter wr = new PrintWriter(System.out);
//        String[] words = br.readLine().split(" ");

        int out_ = distance("raj", "ruj");
        System.out.println(out_);

//        wr.close();
//        br.close();
    }


    static int distance(String s1, String s2) {

//        if (a.length() == 0) {
//            return b.length();
//        }
//        if (b.length() == 0) {
//            return a.length();
//
//        }
//        else if (a.charAt(0) == b.charAt(0)) {
//            return distance(a.substring(1), b.substring(1));
//        } else {
//            int x = distance(a, b.substring(1));
//            int y = distance(a.substring(1), b);
//            int z = distance(a.substring(1), b.substring(1));
//            int t = Math.min(x, y);
//            return Math.min(z, t) + 1;
//        }
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m+1][n+1];
        dp[0][0] = 0;
        for (int i=1; i<m+1; i++) {
            dp[i][0] = i;
        }
        for (int j=1; j<n+1; j++) {
            dp[0][j] = j;
        }
        for (int i=1; i<m+1; i++) {
            for (int j=1; j<n+1; j++) {
                if (s1.charAt(i-1)==s2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1];
                }
                else {
                    dp[i][j] = 1 + Math.min(Math.min(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1]);
                }
            }
        }
        return dp[m][n];
    }
}