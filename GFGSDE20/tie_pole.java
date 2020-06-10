// URL : https://practice.geeksforgeeks.org/contest-problem/tie-the-poles-in-pairs/0/
// Lesson Learned : Find whether it can be broken into subpbms -> DP
// Long time no proper dp -> so could not find it

// Lesson Learned : Find whether it can be broken into subpbms -> DP
// Long time no proper dp -> so could not find it

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
  static long dp[] = new long[5002];
  static StringBuffer str = new StringBuffer("");
  static long mod = (long) 1e9 + 7;

  static long solve(int n) {

    if (n == 0 || n == 2)
      return 1;

    if (dp[n] != -1)
      return dp[n];
    long ans = 0;
    for (int i = 0; i < n - 1; i += 2) {
      ans += ((solve(i) % mod) * (solve(n - i - 2) % mod)) % mod;
    }
    return dp[n] = ans % mod;
  }

  public static void main(String[] args) throws java.lang.Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(bf.readLine());
    while (t-- > 0) {
      int n = Integer.parseInt(bf.readLine());
      Arrays.fill(dp, -1);
      str.append(solve(2 * n) + "\n");
    }
    System.out.print(str);
  }
}
