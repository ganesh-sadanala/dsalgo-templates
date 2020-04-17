// Watch this video by Ashish Gupta
// https://www.youtube.com/watch?v=31tpPqRHthc&t=551s

import java.util.*;
import java.io.*;

public class Solution {
  static long dp[][] = new long[51][1501];
  static long pref[][] = new long[51][31];
  static int n, p, k;

  static long plates(int stack, int sum) {
    if (sum == p)
      return 0;

    if (stack > n || sum > p)
      return Long.MIN_VALUE;

    if (dp[stack][sum] != -1)
      return dp[stack][sum];

    long ans = Long.MIN_VALUE;
    for (int i = 0; i <= k; i++) {
      ans = Math.max(ans, pref[stack][i] + plates(stack + 1, sum + i));
    }
    return dp[stack][sum] = ans;
  }

  public static void main(String[] ks) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int t1 = Integer.parseInt(bf.readLine());
    StringBuffer str = new StringBuffer("");
    for (int t = 1; t <= t1; t++) {

      Solution sol = new Solution();
      String s[] = bf.readLine().trim().split("\\s+");
      n = Integer.parseInt(s[0]);
      k = Integer.parseInt(s[1]);
      p = Integer.parseInt(s[2]);
      for (int i = 0; i <= 50; i++)
        Arrays.fill(dp[i], -1);
      for (int i = 1; i <= n; i++) {
        s = bf.readLine().trim().split("\\s+");
        for (int j = 1; j <= k; j++) {
          pref[i][j] = pref[i][j - 1] + Long.parseLong(s[j - 1]);
        }
      }
      str.append("Case #" + t + ": " + plates(1, 0) + "\n");
    }
    System.out.println(str);
  }
}
