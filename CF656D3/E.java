
// Prerequisites: TOpSort
// Refer: Editorial
import java.util.*;
import java.io.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codechef {
  static int n, m;
  static boolean vis[];
  static Stack<Integer> stack;

  static class Pair {
    int x, y;

    Pair(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }

  static ArrayList<Pair> edges;
  static ArrayList<ArrayList<Integer>> dedges;
  static StringBuilder str = new StringBuilder("");

  static void dfs(int u) {
    vis[u] = true;
    for (int v : dedges.get(u)) {
      if (!vis[v])
        dfs(v);
    }
    stack.push(u);
  }

  static void solve() {

    stack = new Stack<>();
    vis = new boolean[n + 1];
    for (int i = 1; i <= n; i++) {
      if (!vis[i])
        dfs(i);
    }
    ArrayList<Integer> top = new ArrayList<>();
    while (!stack.isEmpty())
      top.add(stack.pop());
    boolean flag = false;
    int pos[] = new int[n + 1];
    for (int i = 0; i < n; i++)
      pos[top.get(i)] = i;
    for (int i = 1; i <= n; i++) {
      for (int v : dedges.get(i)) {
        if (pos[v] < pos[i]) {
          flag = true;
          break;
        }
      }
    }
    if (flag)
      str.append("NO\n");
    else {
      str.append("YES\n");
      for (Pair n : edges) {
        if (pos[n.x] > pos[n.y])
          str.append(n.y + " " + n.x + "\n");
        else
          str.append(n.x + " " + n.y + "\n");
      }
    }
  }

  public static void main(String[] args) throws java.lang.Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(bf.readLine().trim());
    while (t-- > 0) {
      String s[] = bf.readLine().trim().split("\\s+");
      n = Integer.parseInt(s[0]);
      m = Integer.parseInt(s[1]);
      edges = new ArrayList<>();
      dedges = new ArrayList<>();
      for (int i = 0; i <= n; i++)
        dedges.add(new ArrayList<>());

      for (int i = 0; i < m; i++) {
        s = bf.readLine().trim().split("\\s+");
        int ty = Integer.parseInt(s[0]);
        int x = Integer.parseInt(s[1]);
        int y = Integer.parseInt(s[2]);
        if (ty == 1)
          dedges.get(x).add(y);
        edges.add(new Pair(x, y));
      }
      solve();
    }
    System.out.print(str);
  }
}
