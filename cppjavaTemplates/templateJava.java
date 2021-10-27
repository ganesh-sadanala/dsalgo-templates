/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
  static int n;
  static int a[];
  static StringBuilder str = new StringBuilder("");

  static void solve() {

  }
  
  
  // Shuffle and sort
  static void sort(int[] A){
      int n = A.length;
      Random rnd = new Random();
      for(int i=0; i<n; ++i){
          int tmp = A[i];
          int randomPos = i + rnd.nextInt(n-i);
          A[i] = A[randomPos];
          A[randomPos] = tmp;
      }
      Arrays.sort(A);
   }
  static void sort(long[] A){
      int n = A.length;
      Random rnd = new Random();
      for(int i=0; i<n; ++i){
          long tmp = A[i];
          int randomPos = i + rnd.nextInt(n-i);
          A[i] = A[randomPos];
          A[randomPos] = tmp;
      }
      Arrays.sort(A);
  }
  
  // Math 
  static void extendedGcd(long a, long b, long ar[]){
    if(b==0){
      ar[0]=1;
      ar[1]=0;
      ar[2]=a;
      return;
    }
    extendedGcd(b, a%b, ar);
    long temp=ar[1];
    ar[1]=(ar[0]- ar[1]*(a/b));
    ar[0]=temp;
    return;
  }
  // non prime b;
  static long invmod(long a, long b){
    long ar[]=new long[3];
    extendedGcd(a, b, ar);
    return ar[0];
  }
  static long pow(long a, long b){
    long res=1;
    while(b>0){
      if(b%2==1){
        res = (res * a)%mod;
        b--;
      }else{
        a = (a*a)%mod;
        b=b>>1;
      }
    }
    return res;
  }
  static long combination(int a, int b){
    long val1=fact[a];
    long val2=ifact[a-b];
    long val3=ifact[b];
    return (((val1 * val2)%mod) * val3)%mod;
  } 
  static void cal(){
    fact[0]=ifact[0]=1;
    for(int i=1;i<sz;i++){
      fact[i]=(i*fact[i-1])%mod;
    }
    ifact[sz-1]=pow(fact[sz-1], mod-2);
    for(int i=sz-2;i>0;i--){
      ifact[i]=((i+1)*ifact[i+1])%mod;
    }
  }
  
  // DSU
  static int find(int i){
    if(parent[i]!=i)
      parent[i]=find(parent[i]);
    return parent[i];
  }
  static boolean union(int x, int y){
    int xr=find(x);
    int yr=find(y);
    if(xr==yr) return false;
    if(rank[xr]<rank[yr]){
      parent[xr]=yr;
    }else if(rank[yr]<rank[xr]){
      parent[yr]=xr;
    }else{
      parent[xr]=yr;
      rank[yr]++;
    }
    return true;
  }
  
  // BIT
  static long query(int idx){
    long sum=0;
    idx++;
    while(idx>0){
      sum=(sum+bit[idx])%mod;
      idx-=(idx&(-idx));
    }
    return sum;
  }
  static void update(int idx, long v){
    idx++;
    while(idx<=n){
      bit[idx]=(bit[idx]+v+mod)%mod;
      idx+=(idx&(-idx));
    }
  }
  static void update(int l, int r, long v){
    update(l, v);
    if((r+1)<=n) update(r+1, -v);
  }
  
  // TOPO - BFS
  static void topSort(){
    // l is the adjacency list
    vis=new boolean[n+1];
    topo=new ArrayList<>();
    Queue<Integer> q=new LinkedList<>();
    for(int i=1;i<=n;i++) if(in[i]==0) q.add(i);
    while(!q.isEmpty()){
      int u=q.remove();
      topo.add(u);
      vis[u]=true;
      for(int v:l.get(u)){
        if(--ind[v]==0){
          q.add(v);
        }
      }
    }
  }
  
  // LIS - nlogn
  static int lowerBoundIndex(int len, int i){
    int l=0, r=len;
    int idx=0;
    while(l<=r){
      int mid=l+(r-l)/2;
      if(a[t[mid]]>a[i]){
        idx=mid;
        r=mid-1;
      }else l=mid+1;
    }
    return idx;
  }
  static void findList(){
    int len=0;
    for(int i=0;i<n;i++) r[i]=-1;
    t[0]=0;
    for(int i=1;i<n;i++){
      if(a[t[0]] > a[i]){
        t[0]=i;
      }else if(a[t[len]] < a[i]){
        r[i]=t[len];
        len++;
        t[len]=i;
      }else{
        int idx = lowerBoundIndex(len, i);
        t[idx]=i;
        r[i]=t[idx-1];
      }
    }
  }
  public static void main(String[] args) throws java.lang.Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(bf.readLine().trim());
    while (t-- > 0) {
      n = Integer.parseInt(bf.readLine().trim());
      String s[] = bf.readLine().trim().split("\\s+");
      solve();
    }
    System.out.print(str);
  }
}
