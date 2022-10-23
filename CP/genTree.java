/*
  Goal: Become better in CP!
  Key: Consistency and Discipline
  Desire: SDE @ Google USA
  Motto: Do what i Love <=> Love what i do
  If you don't use your brain 100%, it deteriorates gradually
*/

import java.util.*;
import java.io.*;
import java.math.*;

public class generator {

  static StringBuffer str=new StringBuffer();
  static BufferedReader bf;
  static PrintWriter pw;
  static Random random;
  static int n;

  static int rand(int a, int b) {
    return a + random.nextInt(b-a+1);
  }

  public static void main(String[] args) throws java.lang.Exception {
    boolean lenv=false;
    int te=1;
    if(lenv){
      bf = new BufferedReader(
                          new FileReader("input.txt"));
      pw=new PrintWriter(new
            BufferedWriter(new FileWriter("output.txt")));
    }else{
      bf = new BufferedReader(new InputStreamReader(System.in));
      pw = new PrintWriter(new OutputStreamWriter(System.out));
    }

    random=new Random(Long.parseLong(args[0]));
    int max=10;
    int min=3;
    n=rand(min, max);
    str.append(n).append("\n");
    List<int []> edges=new ArrayList<>();
    for(int i = 2; i <= n; ++i) {
      edges.add(rand(1, i - 1), i);
    }
    List<Integer> perm=new ArrayList<>(n+1);
    for(int i = 1; i <= n; ++i) {
      perm.set(i, i);
    }
    Collections.shuffle(edges);
    Collections.shuffle(perm.subList(1, n+1));
    for(int[] edge : edges) {
      int a = edge[0], b = edge[1];
      if(random.nextInt() % 2 == 0) {
        int temp=a;
        a=b;
        b=temp;
      }
      str.append(perm.get(a)).append(" ").append(perm.get(b)).append("\n");
    }
    pw.print(str);
    pw.flush();
    // System.out.println(str);
  }
}