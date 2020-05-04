/*
 * Vari. of Shortest Path using BFS -> Minimize the number of edges between src
 * and dest The idea is to find the optimal value of d. a -> d , b -> d, c -> d
 */
/*
 * If the question is shortest path between two nodes then we simply return the
 * number of nodes using the distance matrix
 */
/*
 * This problem includes finding the optimal value of d and also assigning the
 * smaller cost edges to the repeated ones
 */
/*package whatever //do not write package name here */

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

public class GFG {

  static int n, m, a, b, c;
  static ArrayList<ArrayList<Integer>> edges = new ArrayList<>();

  static int[] solveUtil(int a) {
    Queue<Integer> queue = new LinkedList<>();
    queue.add(a);
    boolean vis[] = new boolean[n + 1];
    vis[a] = true;
    int dist[] = new int[n + 1];
    dist[a] = 0;
    while (!queue.isEmpty()) {
      int u = queue.peek();
      queue.remove();
      for (int v : edges.get(u)) {
        if (!vis[v]) {
          vis[v] = true;
          queue.add(v);
          dist[v] = dist[u] + 1;
        }
      }
    }
    return dist;
  }

  static long solve(Long p[]) {
    int[] ad = solveUtil(a);
    int[] bd = solveUtil(b);
    int[] cd = solveUtil(c);

    long cost = Long.MAX_VALUE;
    for (int d = 1; d <= n; d++) {
      int id = ad[d] + bd[d] + cd[d];
      int ext = bd[d];
      if (id > m)
        continue;

      cost = Math.min(cost, p[id] + p[ext]);
    }
    return cost;
  }

  public static void main(String[] args) throws Exception {

    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(bf.readLine());
    StringBuffer str = new StringBuffer("");
    while (t-- > 0) {
      edges.clear();
      String s[] = bf.readLine().trim().split("\\s+");
      n = Integer.parseInt(s[0]);
      m = Integer.parseInt(s[1]);
      a = Integer.parseInt(s[2]);
      b = Integer.parseInt(s[3]);
      c = Integer.parseInt(s[4]);
      Long p[] = new Long[m + 1];
      p[0] = 0L;
      s = bf.readLine().trim().split("\\s+");
      for (int i = 1; i <= m; i++)
        p[i] = Long.parseLong(s[i - 1]);
      for (int i = 0; i <= n; i++)
        edges.add(new ArrayList<>());

      Arrays.sort(p);
      for (int i = 1; i <= m; i++)
        p[i] += p[i - 1];
      for (int i = 0; i < m; i++) {
        s = bf.readLine().trim().split("\\s+");
        int x = Integer.parseInt(s[0]), y = Integer.parseInt(s[1]);
        edges.get(x).add(y);
        edges.get(y).add(x);
      }
      str.append(solve(p) + "\n");
    }
    System.out.println(str);
  }
}
