// Reference : https://www.youtube.com/watch?v=TSUvGqRFlug
/* the idea is to use prefix trick */
/*
 * What is missed -> some math and observation, patience Do i know the prefix
 * trick at that time -> YES Figuring out adhocness Bloddy 1700 beat it
 */
/*
 * x lies in between 2 and k+k. Takes a quadratic time in figuring out for all
 * pairs.
 */
/*
 * [L+1,R+k] is the range of numbers it can form => (0/1 change)
 */
// Inclusion and Exclusion principle
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

public class GFG {

  static int a[] = new int[200001];
  static int pre[] = new int[400011];
  static int n;
  static int k;

  static class Pair {
    int l, r;

    Pair(int l, int r) {
      this.l = l;
      this.r = r;
    }
  }

  static int solve() {
    ArrayList<Pair> list = new ArrayList<>();
    for (int i = 0; i < n / 2; i++)
      list.add(new Pair(Math.min(a[i], a[n - i - 1]), Math.max(a[i], a[n - i - 1])));

    HashMap<Integer, Integer> map = new HashMap<>();
    for (Pair p : list) {
      int l = p.l + 1;
      int r = p.r + k;
      if (!map.containsKey(p.l + p.r))
        map.put(p.l + p.r, 1);
      else
        map.put(p.l + p.r, map.get(p.l + p.r) + 1);

      pre[l] += 1;
      pre[r + 1] -= 1;
    }
    for (int i = 1; i < 2 * k + 10; i++)
      pre[i] += pre[i - 1];

    int ans = Integer.MAX_VALUE;
    for (int x = 2; x <= 2 * k; x++) {
      int z = 0, o = 0, t = 0;
      if (map.containsKey(x))
        z = map.get(x);

      o = pre[x] - z;
      t = list.size() - pre[x];
      ans = Math.min(ans, o + t * 2);
    }
    return ans;
  }

  public static void main(String[] args) throws Exception {

    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(bf.readLine());
    StringBuffer str = new StringBuffer();
    while (t-- > 0) {
      String s[] = bf.readLine().trim().split("\\s+");
      n = Integer.parseInt(s[0]);
      k = Integer.parseInt(s[1]);
      s = bf.readLine().trim().split("\\s+");
      for (int i = 0; i < n; i++)
        a[i] = Integer.parseInt(s[i]);
      for (int i = 0; i < (2 * k + 10); i++)
        pre[i] = 0;

      str.append(solve() + "\n");
    }
    System.out.println(str);
  }
}
