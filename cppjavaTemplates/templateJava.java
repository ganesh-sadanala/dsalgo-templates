/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
  static int n;
  static int a[];
  static StringBuffer str = new StringBuffer("");

  static void solve() {

  }

  public static void main(String[] args) throws java.lang.Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(bf.readLine());
    while (t-- > 0) {
      n = Integer.parseInt(bf.readLine());
      String s[] = bf.readLine().trim().split("\\s+");
      solve();
    }
    System.out.println(str);
  }
}
