// These kind of divisibility pbms are under lis dp
// Though i know these i am solvind it under storage

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

public class GFG {

  public static void main(String[] args) throws Exception {

    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(bf.readLine());
    while (t-- > 0) {
      int n = Integer.parseInt(bf.readLine());
      String s[] = bf.readLine().trim().split("\\s+");
      int a[] = new int[n + 1];
      for (int i = 0; i < n; i++)
        a[i + 1] = Integer.parseInt(s[i]);

      int cnt[] = new int[n + 1];
      Arrays.fill(cnt, 1);
      for (int i = 1; i <= n; i++) {
        for (int j = i * 2; j <= n; j += i) {
          if (a[i] < a[j])
            cnt[j] = Math.max(cnt[j], cnt[i] + 1);
        }
      }
      int ans = 0;
      for (int i = 1; i <= n; i++)
        ans = Math.max(ans, cnt[i]);

      System.out.println(ans);
    }
  }
}
