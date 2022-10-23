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

public class bruteForce {

  static StringBuffer str=new StringBuffer();
  static BufferedReader bf;
  static PrintWriter pw;
  static int n;
  static long a[];

  static void templateSortArray(long a[]) {
    int n=a.length;
    List<Long> l = new ArrayList < > ();
    for (int i = 0; i < n; i++) l.add(a[i]);
    Collections.sort(l);
    for (int i = 0; i < n; i++) a[i] = l.get(i);
  }

  static void solve(int te) throws Exception{
    templateSortArray(a);
    long min=Long.MAX_VALUE;
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        for(int k=j+1;k<n;k++){
          long diff=a[k]-a[i];
          min=Math.min(min, diff);
        }
      }
    }
    str.append(min).append("\n");
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
    
    // int q1 = Integer.parseInt(bf.readLine().trim());
    // for(te=1;te<=q1;te++) {
      String s[]=bf.readLine().trim().split("\\s+");
      n=Integer.parseInt(s[0]);
      s=bf.readLine().trim().split("\\s+");
      a=new long[n];
      for(int i=0;i<n;i++) a[i]=Long.parseLong(s[i]);
      solve(te);
    // }
    pw.print(str);
    pw.flush();
    // System.out.println(str);
  }
}