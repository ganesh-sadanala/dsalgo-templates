import java.util.*;
import java.io.*;

//Refer->https://discuss.codechef.com/t/https-codeforces-com-problemset-problem-1327-e/58629/2
public class Solution {

  static long mod = 998244353;

  public static void main(String[] ks) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(bf.readLine());
    long p[] = new long[n + 1];
    p[0] = 1;
    for (int i = 1; i <= n; i++) {
      p[i] = p[i - 1] * 10;
      p[i] %= mod;
    }
    long res[] = new long[n + 1];
    res[n] = 10;
    res[n - 1] = 180;
    for (int i = 1; i < n - 1; i++) {
      res[i] = (2 * 10 * 9 * p[n - i - 1]);
      res[i] %= mod;
      res[i] += ((n - i - 1) * 10 * 9 * 9 * p[n - i - 2]);
      res[i] %= mod;
    }
    for (int i = 1; i <= n; i++)
      System.out.print(res[i] + " ");

    System.out.println();
  }
}
