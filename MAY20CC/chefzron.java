// Refer: Editorial

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
  static int n;
  static int a[];
  static ArrayList<Integer> pos;
  static StringBuffer str = new StringBuffer("");

  static int solveNonCyclic() {
    int N = pos.size();
    int INF = (int) 1e6;
    int[] dp = new int[N + 1];
    dp[1] = INF;
    for (int i = 2; i <= N; i++) {
      dp[i] = pos.get(i - 1) - pos.get(i - 2) + dp[i - 2];
      if (i >= 3)
        dp[i] = Math.min(dp[i], pos.get(i - 1) - pos.get(i - 3) + dp[i - 3]);
    }
    return dp[N];
  }

  static void solve() {
    if (pos.size() == 0)
      str.append(0 + "\n");
    else if (pos.size() == 1)
      str.append(-1 + "\n");
    else {
      int ans = n;
      for (int i = 0; i < 3; i++) {
        ans = Math.min(ans, solveNonCyclic());
        pos.add(pos.remove(0) + n);
      }
      str.append(ans + "\n");
    }
  }

  public static void main(String[] args) throws java.lang.Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(bf.readLine());
    while (t-- > 0) {
      n = Integer.parseInt(bf.readLine());
      a = new int[n];
      String s[] = bf.readLine().trim().split("\\s+");
      pos = new ArrayList<>();
      for (int i = 0; i < n; i++) {
        a[i] = Integer.parseInt(s[i]);
        if (a[i] == 1)
          pos.add(i);
      }
      solve();
    }
    System.out.println(str);
  }
}
