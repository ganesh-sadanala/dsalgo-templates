// Failure: consider drawing the square from the side instead of a vertex of a polygon

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {

  static StringBuffer str = new StringBuffer("");
  static long n;

  // Refer whatsapp chat with Harsha
  static void solve() {
    n = 2 * n;
    str.append(String.format("%.9f", ((float) 1 / Math.tan((float) Math.PI / n))) + "\n");
  }

  public static void main(String[] args) throws Exception {

    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(bf.readLine());
    while (t-- > 0) {
      n = Long.parseLong(bf.readLine());
      solve();
    }
    System.out.println(str);
  }
}
