
// Link: https://www.codechef.com/CHPTRS01/problems/CSCARE
/* package codechef; // don't place package name! */
// Reference : https://discuss.codechef.com/t/corona-scare-codechef/60398/7
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
  static void calLps(int[] lps, int[] pat) {
    int len = 0, i = 0;
    lps[0] = 0;
    int n = pat.length;
    i++;
    while (i < n) {
      if (pat[i] == pat[len]) {
        len++;
        lps[i] = len;
        i++;
      } else {
        if (len != 0) {
          len = lps[len - 1];
        } else {
          lps[i] = 0;
          i++;
        }
      }
    }
  }

  static long kmp(int[] a, int[] b, int[] pat, int[] act, int x) {
    int n = act.length, m = pat.length;
    int lps[] = new int[m];
    calLps(lps, pat);
    int i = 0, j = 0;
    long res = 0;
    while (i < n) {
      // System.out.println(i+" "+j);
      if (pat[j] == act[i]) {
        i++;
        j++;
      }
      if (j == m) {
        if (Math.abs(b[i - j] - a[0]) <= x)
          res++;

        j = lps[j - 1];
      } else if (i < n && pat[j] != act[i]) {
        if (j != 0)
          j = lps[j - 1];
        else
          i++;
      }
    }
    return res;
  }

  public static void main(String[] args) throws java.lang.Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(bf.readLine());
    StringBuffer str = new StringBuffer("");
    while (t-- > 0) {
      int x = Integer.parseInt(bf.readLine().trim());
      int n = Integer.parseInt(bf.readLine().trim());
      String s[] = bf.readLine().trim().split("\\s+");
      int a[] = new int[n];
      for (int i = 0; i < n; i++)
        a[i] = Integer.parseInt(s[i]);
      int m = Integer.parseInt(bf.readLine().trim());
      int b[] = new int[m];
      s = bf.readLine().trim().split("\\s+");

      for (int i = 0; i < m; i++)
        b[i] = Integer.parseInt(s[i]);
      if (n == 1) {
        int res = 0;
        for (int i = 0; i < m; i++) {
          if (Math.abs(b[i] - a[0]) <= x)
            res++;
        }
        str.append(res + "\n");
      } else {
        int pat[] = new int[n - 1];
        int act[] = new int[m - 1];
        for (int i = 1; i < n; i++)
          pat[i - 1] = a[i] - a[i - 1];
        for (int i = 1; i < m; i++)
          act[i - 1] = b[i] - b[i - 1];

        str.append(kmp(a, b, pat, act, x) + "\n");
      }
    }
    System.out.println(str);
  }
}
