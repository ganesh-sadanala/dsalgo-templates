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
    max=10;
    min=1;
    for(int i = 0; i < n; ++i) {
      int x=rand(min, max);
      str.append(x).append(" ");
    }
    str.append("\n");
    pw.print(str);
    pw.flush();
    // System.out.println(str);
  }
}