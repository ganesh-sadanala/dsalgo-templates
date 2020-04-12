// I have solved it in the contest
// Managed to solve 2 questions yet failed to be under 250 top
// Due to time constraints
// My rank was 399
// contest-> https://practice.geeksforgeeks.org/contest/gsc-triple-threat-coding-contest/leaderboards/
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {

  static int[] findInx(int n, int[] a) {
    int inx[] = new int[n];
    int suffix_max[] = new int[n];
    suffix_max[n - 1] = a[n - 1];
    for (int i = n - 2; i >= 0; i--) {
      suffix_max[i] = Math.max(suffix_max[i + 1], a[i]);
    }
    for (int i = 0; i < n; i++) {
      int l = i + 1, h = n - 1, ans = -1;
      while (l <= h) {
        int mid = (l + h) / 2;
        if (suffix_max[mid] > a[i]) {
          ans = mid;
          l = mid + 1;
        } else
          h = mid - 1;
      }
      inx[i] = ans;
    }
    return inx;
  }

  static void solve(int[] inx, int[] a, int n) {
    HashMap<Integer, Integer> map = new HashMap<>();
    Integer aux[] = new Integer[n];
    for (int i = 0; i < n; i++) {
      if (inx[i] == -1) {
        if (!map.containsKey(i))
          map.put(i, 1);
        else
          map.put(i, map.get(i) + 1);
      } else {
        if (!map.containsKey(inx[i]))
          map.put(inx[i], 1);
        else
          map.put(inx[i], map.get(inx[i]) + 1);
      }
      aux[i] = a[i];
    }
    Arrays.sort(aux, Collections.reverseOrder());
    StringBuffer str1 = new StringBuffer("");
    int start = 0;
    for (int i = 0; i < n; i++) {
      if (inx[i] != -1) {
        str1.append("Not possible\n");
      } else {
        int end = map.get(i) + start;
        StringBuffer str = new StringBuffer("");
        for (int k = start; k < end; k++) {
          str.append(aux[k] + " ");
        }
        str1.append(str.toString() + "\n");
        start += map.get(i);
      }
    }
    System.out.print(str1);
  }

  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(bf.readLine());
    while (t-- > 0) {
      int n = Integer.parseInt(bf.readLine());
      String s[] = bf.readLine().trim().split("\\s+");
      int a[] = new int[n];
      for (int i = 0; i < n; i++)
        a[i] = Integer.parseInt(s[i]);

      int inx[] = findInx(n, a);
      solve(inx, a, n);
    }
  }
}

// Another easier (less code with same tc) used by my frns

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG2 {

  static void solve(Integer a[], Integer ar[], int n) {
    HashMap<Integer, Integer> map = new HashMap<>();
    Arrays.sort(ar, Collections.reverseOrder());
    int j = 0;
    for (int i = 0; i < n; i++) {
      if (ar[j] == a[i]) {
        while (j < n) {
          if (!map.containsKey(ar[j]) || (map.get(ar[j]) != 1))
            break;
          else {
            System.out.print(ar[j] + " ");
            j++;
          }
        }
        System.out.println();
      } else {
        System.out.println("Notpossible");
        map.put(a[i], 1);
      }
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(bf.readLine());
    while (t-- > 0) {
      int n = Integer.parseInt(bf.readLine());
      String s[] = bf.readLine().trim().split("\\s+");
      Integer a[] = new Integer[n];
      Integer ar[] = new Integer[n];
      for (int i = 0; i < n; i++) {
        a[i] = Integer.parseInt(s[i]);
        ar[i] = a[i];
      }

      solve(a, ar, n);
    }
  }
}
