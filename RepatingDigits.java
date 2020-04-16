// Final round of geeks for geeks contest
// https://practice.geeksforgeeks.org/contest-problem/repeating-digits/0/
// Easy

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
  static ArrayList<Integer> lis = new ArrayList<>();

  static void preCal() {
    for (int i = 0; i < 11; i++)
      lis.add(0);

    for (int i = 11; i <= 1000000; i++) {
      String s = String.valueOf(i);
      int len = s.length();
      boolean flag = false;
      HashSet<Character> set = new HashSet<>();
      for (int j = 0; j < len; j++) {
        if (set.contains(s.charAt(j))) {
          flag = true;
          break;
        }
        set.add(s.charAt(j));
      }
      if (flag)
        lis.add(lis.get(i - 1) + 1);
      else
        lis.add(lis.get(i - 1));
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    preCal();
    int t = Integer.parseInt(bf.readLine());
    while (t-- > 0) {
      String s[] = bf.readLine().trim().split("\\s+");
      int l = Integer.parseInt(s[0]);
      int r = Integer.parseInt(s[1]);
      System.out.println(lis.get(r) - lis.get(l - 1));
    }
  }
}
