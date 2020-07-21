// Refer: https://www.youtube.com/watch?v=BH_btihSwVM&t=287s
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {

  static int inx = 0;

  Node traverse(String s) {
    if (inx >= s.length())
      return null;
    boolean neg = false;
    if (s.charAt(inx) == '-') {
      neg = true;
      inx++;
    }
    int num = 0;
    while (inx < s.length() && Character.isDigit(s.charAt(inx)))
      num = num * 10 + (s.charAt(inx) - 48);

    if (neg)
      num = -num;
    Node root = new Node(num);
    if (inx >= s.length())
      return root;

    if (inx < s.length() && s.charAt(inx) == '(') {
      inx++;
      root.left = traverse(s);
    }
    if (inx < s.length() && s.charAt(inx) == ')') {
      inx++;
      return root;
    }
    if (inx < s.length() && s.charAt(inx) == '(') {
      inx++;
      root.right = traverse(s);
    }
    if (inx < s.length() && s.charAt(inx) == ')') {
      inx++;
      return root;
    }
  }

  public static void main(String[] args) {

    String str = "4(2(3)(1))(6(5))";
    if (str.length() == 0)
      return null;
    Node root = traverse(str);
  }
}
