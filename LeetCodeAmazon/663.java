// Got the idea but implementing that dfs recursive will
// fail since there are some edge cases given

// Use explicit stack to pass those edge cases.
import java.util.*;
import java.io.*;

class Solution {
  Stack<Integer> seen;

  public boolean checkEqualTree(TreeNode root) {
    seen = new Stack();
    int total = sum(root);
    seen.pop();
    if (total % 2 == 0)
      for (int s : seen)
        if (s == total / 2)
          return true;
    return false;
  }

  public int sum(TreeNode node) {
    if (node == null)
      return 0;
    seen.push(sum(node.left) + sum(node.right) + node.val);
    return seen.peek();
  }

  public static void main(String[] args) {
  }
}
