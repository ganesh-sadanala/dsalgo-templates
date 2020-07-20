// Source: https://leetfree.com/problems/number-of-distinct-islands.html
// Refer: Editorial
// Approach1:Hash By Local Coordinates
import java.util.*;
import java.io.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
  static int a[];
  static StringBuilder str = new StringBuilder("");

  static boolean vis[][];
  static HashSet<ArrayList<Integer>> res=new HashSet<>();
  static ArrayList<Integer> list;
  static int n,m;

  static boolean isValid(int x,int y)
  {
      return (x>=0&&x<n&&y>=0&&y<m);
  }
  static void dfs(int mat[][],int x,int y,int p)
  {
      vis[x][y]=true;
      if(isValid(x+1,y)&&(!vis[x+1][y])&&mat[x+1][y]==1){
        list.add(1);
        dfs(mat,x+1,y,1);
      }
      if(isValid(x-1,y)&&(!vis[x-1][y])&&mat[x-1][y]==1){
        list.add(2);
        dfs(mat,x-1,y,2);
      }
      if(isValid(x,y+1)&&(!vis[x][y+1])&&mat[x][y+1]==1){
        list.add(3);
        dfs(mat,x,y+1,3);
      }
      if(isValid(x,y-1)&&(!vis[x][y-1])&&mat[x][y-1]==1){
        list.add(4);
        dfs(mat,x,y-1,4);
      }
  }
  static void solve(int mat[][]) {

        n=mat.length;
        m=mat[0].length;
        vis=new boolean[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                    if(!vis[i][j]&&(mat[i][j]==1)){
                        list=new ArrayList<>();
                        list.add(0);
                        dfs(mat,i,j,0);
                        res.add(list);
                    }
            }
        }
        System.out.println(res.size());
  }

  public static void main(String[] args) throws java.lang.Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    // int t = Integer.parseInt(bf.readLine().trim());
    // while (t-- > 0) {
    //   n = Integer.parseInt(bf.readLine().trim());
    //   String s[] = bf.readLine().trim().split("\\s+");
    //   solve();
    // }
    int	mat[][]={{1,1,0,1,1},
                 {1,1,0,0,0},
                 {0,0,0,1,1},
                 {1,1,0,1,1}
                };
    solve(mat);
    System.out.print(str);
  }
}
