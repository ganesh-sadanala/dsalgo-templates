
/*
 * Idea formation: When we see these kind of questions You should check with
 * greedy If greedy does not work and dp also then you need nlogn sol and array
 * is sorted Take answer as a range of sorted integers and do binarysearch with
 * answers and check which exactly fits Let d be the maximum difference
 *
 * f(d) => calculation that tells the minimum number of insertions<=k such that
 * difference between adjacent elements is <=d \n Reference:
 * https://www.youtube.com/watch?v=UoFKId_LCpg
 */
/**
 *
 * Awesome point learned about binary search: It is related to monotonicity,
 * learned in this question. if output was the input then we can use binary
 * search Iterating the output using it as input -> Use binary Search
 */
import java.util.*;
import java.io.*;

public class Solution {
  // (a[i+1]-a[i]-1)/d

  static int a[] = new int[100001];
  static int n, k;

  static int workout() {
    int l = 1, r = (int) 1e9 - 1;
    int ans = 0;
    while (l <= r) {
      int m = l + (r - l) / 2;
      int add = 0;
      for (int i = 1; i < n; i++) {
        add += ((a[i] - a[i - 1] - 1) / m);
      }
      ans = m;
      if (add <= k)
        r = m - 1;
      else
        l = m + 1;
    }
    return l;
  }

  public static void main(String[] ks) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int t1 = Integer.parseInt(bf.readLine());
    StringBuffer str = new StringBuffer("");
    for (int t = 1; t <= t1; t++) {
      String s[] = bf.readLine().trim().split("\\s+");
      n = Integer.parseInt(s[0]);
      k = Integer.parseInt(s[1]);
      s = bf.readLine().trim().split("\\s+");
      for (int i = 0; i < n; i++)
        a[i] = (Integer.parseInt(s[i]));

      str.append("Case #" + t + ": " + workout() + "\n");
    }
    System.out.println(str);
  }
}
