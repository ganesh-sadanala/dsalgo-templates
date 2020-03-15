//https://www.hackerrank.com/contests/protocol-prelims-seniors/challenges
import java.io.*;
import java.util.*;

public class Solution {

static long modulo(long  k, long a)
{
long  m=1000000007;
if(k==0)
{
return 1;
}
    long temp=modulo(k/2,a);
if(k%2!=0)
{
return ((a%m)*(temp%m)*(temp%m))%m;
}
return ((temp%m)*(temp%m))%m;
}
    public static void main(String[] args) throws Exception{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(bf.readLine());
        int m=1000000007;
        while(t-->0)
        {
         int k=Integer.parseInt(bf.readLine());
          long  a = modulo(k-1,2);
        a=a*10;
        a=a%m;
        System.out.println(a);
        }
    }
}