
// Got the idea to use Trie , but did not get how to use that for this
/**
 * Words from Ashish Gupta in the youtube video editorial (Awesome words man):
 * Longest common prefix <=> Height of LCA in the Trie. Greedily group them of
 * size k
 */
import java.util.*;
import java.io.*;

public class Solution {
  static int n, k, ans = 0;
  static String str[] = new String[100001];

  static class Trie {
    Trie child[] = new Trie[26];
    int cnt;

    Trie() {
      for (int i = 0; i < 26; i++)
        child[i] = null;

      cnt = 0;
    }
  }

  static Trie root;

  static void insert(String s) {
    Trie temp = root;
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      int inx = c - 'A';
      if (temp.child[inx] == null)
        temp.child[inx] = new Trie();

      temp = temp.child[inx];
    }
    temp.cnt++;
  }

  static void dfs(Trie node, int level) {
    for (int i = 0; i <= 25; i++) {
      if (node.child[i] != null) {
        dfs(node.child[i], level + 1);
        node.cnt += node.child[i].cnt;
      }
    }
    while (node.cnt >= k) {
      node.cnt -= k;
      ans += level;
    }
  }

  static void solve() {
    for (int i = 0; i < n; i++) {
      insert(str[i]);
    }
    dfs(root, 0);
  }

  public static void main(String[] ks) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int t1 = Integer.parseInt(bf.readLine());
    StringBuffer str1 = new StringBuffer("");
    for (int t = 1; t <= t1; t++) {
      String s[] = bf.readLine().trim().split("\\s+");
      n = Integer.parseInt(s[0]);
      k = Integer.parseInt(s[1]);
      for (int i = 0; i < n; i++)
        str[i] = bf.readLine();

      ans = 0;
      root = new Trie();
      solve();
      str1.append("Case #" + t + ": " + ans + "\n");
    }
    System.out.println(str1);
  }
}
