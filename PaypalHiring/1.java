// Refer: https://leetcode.com/discuss/interview-question/221639/
import java.util.*;
import java.io.*;

class GFG
{
    static int[] dx = new int[]{1, -1, 0, 0};
    static int[] dy = new int[]{0, 0, -1, 1};

    public static void main(String[] args) {
        System.out.println(findMinDist(14,2,5));
    }

    static int findMinDist(int w, int h, int n)
    {

        int [][]grid=new int[w][h];
        for(int i=0;i<w;i++)
            Arrays.fill(grid[i],-1);

        return solve(n,w,h,0,0,grid);
    }

    static int bfs(int W, int H, int[][] grid) {

        int [][]dist=new int[W][H];
        for(int i=0;i<W;i++)
            for(int j=0;j<H;j++)
                dist[i][j]=grid[i][j];

        int maxDist=0;
        Queue<Location> q=new LinkedList<>();
        for(int i=0;i<W;i++)
            for(int j=0;j<H;j++)
                if(dist[i][j]==0)
                    q.add(new Location(i,j));

        while(!q.isEmpty())
        {
            int x=q.peek().first;
            int y=q.peek().second;
            int maxDist=Math.max(maxDist,dist[x][y]);
            q.poll();

            for(int i=0;i<4;i++)
            {
                if((nx>=0&&nx<W&&ny>=0&&ny<H)&(dist[nx][ny]==-1))
                {
                    dist[nx][y]=dist[x][y]+1;
                    q.add(new Location(nx,ny));
                }
            }
        }

        return maxDist;
    }

    static int solve(int points, int W, int H, int ho, int ve,int[][] grid) {
        if(points == 0) {
            return bfs(W,H,grid);
        }

        int hor=ho;
        int ver=ve;
        if(ver>=H)
        {
            hor+=ver/H;
            ver=ver%H;
        }

        int minDistance = Integer.MAX_VALUE;
        for(int i=ho;i<W;i++){
            for(int j=ve;j<H;j++) {
                //Mark Building locations in the recursive call.
                grid[i][j] = 0;
                int val = solve(points-1, W, H,i,j+1,grid);

                // Among all maximum distances we need to find min. distance
                minDistance = Math.min(minDistance, val);
                // Remove the building
                // Backtracking
                grid[i][j] = -1;
            }
        }
        return minDistance;
    }
}
