/* package codechef; // don't place package name! */

/* 
Find number of solutions of a linear equation of n variables -> https://www.geeksforgeeks.org/find-number-of-solutions-of-a-linear-equation-of-n-variables/
Sum of all min/max elememnts of all subarrys/Good stack problems/ Monotonous incr/decr stack article -> https://leetcode.com/problems/sum-of-subarray-minimums/discuss/178876/stack-solution-with-very-detailed-explanation-step-by-step
Variation of coin sum dp problem (If can't form change and change given to us in back is also a cost) -> https://atcoder.jp/contests/abc231/tasks/abc231_e
nth root of a number - https://www.geeksforgeeks.org/n-th-root-number/     CF prob:https://codeforces.com/problemset/problem/30/A
Pigeon hole principle Ques: https://codeforces.com/contest/1619/problem/D : https://www.youtube.com/watch?v=UGLQtUVbkhg
Topic question:
Weighted tree distance + Queries: https://www.geeksforgeeks.org/find-distance-between-two-nodes-in-the-given-binary-tree-for-q-queries/

Hard:
Number of distinct values of bitwise or value of all subarrays of an array: https://codeforces.com/problemset/problem/243/A
Number of different triangle formed from the side ranges using Two Pointers: https://codeforces.com/problemset/problem/1355/C
Math + Dividing two number and taking ceil without using pre function + exponentiation : https://codeforces.com/contest/1606/problem/B
Awesome question on LCM usage: https://codeforces.com/contest/1604/problem/C
Number of subarrays with valid bracket sequence: https://codeforces.com/problemset/problem/1556/C => sol:https://www.youtube.com/watch?v=7AHvvTWSsqY
**/
/* 
/*Interesting Observations
the use of == ... The comparison was ok on Long < 128 but ko on greater values.
Generally it's not a good idea to use == to compare Objects, use .equals() as much as possible ! Keep ==, >, <, <= etc. for primitives.
More read on https://stackoverflow.com/questions/19485818/why-are-2-long-variables-not-equal-with-operator-in-java

Amazing questions on composite and prime numbers: https://codeforces.com/problemset/problem/1423/K 
*
Math:
----
x is even, gcd(x-1, x+1) = 1
x is odd, gcd(x-2, x+2) = 1

If we want to get a number n as a remainder i.e; a[i]%x=n then a[i]>2*n
For example:
if x>a[i] then n=a[i]
else a[i]=10
x.   -> rem
x=10 -> 0
x=9  -> 1
x=8  -> 2
x=7  -> 3
x=6  -> 4
x=5  -> 0
x=4
x=3
.
.
So rem is in the range of [0, (a[i]-1)/2]
In other words: xmody < x/2 if x>=y and xmody=x if y>x

DMCA or digital root: https://codeforces.com/problemset/problem/1505/B => https://www.geeksforgeeks.org/digital-rootrepeated-digital-sum-given-integer/
ans = n%9 if ans!=0
else ans=9;

Number of perfect cubes or squares : https://www.geeksforgeeks.org/perfect-cubes-range/
**/
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
  
  
  // Heaps algorithm -> to find all the permutations of an array
  static void heapsAlgorithm(){
    https://www.geeksforgeeks.org/heaps-algorithm-for-generating-permutations/
  }
  
  long mod_mul(long a, long b) {a = a % mod; b = b % mod; return (((a * b) % mod) + mod) % mod;}
 
  long mod_add(long a, long b) {a = a % mod; b = b % mod; return (((a + b) % mod) + mod) % mod;}
  
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
  // https://www.youtube.com/watch?v=8Fqv4ddMC3I
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
  
  // TOPO-DFS
  void topologicalSortUtil(int v, boolean visited[],
                             Stack<Integer> stack)
    {
        // Mark the current node as visited.
        visited[v] = true;
        Integer i;
 
        // Recur for all the vertices adjacent
        // to thisvertex
        Iterator<Integer> it = adj.get(v).iterator();
        while (it.hasNext()) {
            i = it.next();
            if (!visited[i])
                topologicalSortUtil(i, visited, stack);
        }
 
        // Push current vertex to stack
        // which stores result
        stack.push(new Integer(v));
    }
 
    // The function to do Topological Sort.
    // It uses recursive topologicalSortUtil()
    void topologicalSort()
    {
        Stack<Integer> stack = new Stack<Integer>();
 
        // Mark all the vertices as not visited
        boolean visited[] = new boolean[V];
        for (int i = 0; i < V; i++)
            visited[i] = false;
 
        // Call the recursive helper
        // function to store
        // Topological Sort starting
        // from all vertices one by one
        for (int i = 0; i < V; i++)
            if (visited[i] == false)
                topologicalSortUtil(i, visited, stack);
 
        // Print contents of stack
        while (stack.empty() == false)
            System.out.print(stack.pop() + " ");
    }
  
  // LIS(Monotonically or Strictly increasing) - nlogn
  // Minimum last element of length len+1 is stored
  // t stores minium last element index of length len+1
  // r is used to traverse the subsequence of length len+1
  // first element i.e; >= a[i]
  static int upperBoundIndex(int len, int i){
    int l=0, r=len;
    int idx=0;
    while(l<=r){
      int mid=l+(r-l)/2;
      if(a[t[mid]]>=a[i]){
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
        int idx = upperBoundIndex(len, i);
        t[idx]=i;
        r[i]=t[idx-1];
      }
    }
    
    // printing in reverse order
    int idx=t[len];
    while(idx!=-1){
      str.append(a[idx]).append(" ");
      idx=r[idx];
    }
  }
  
  // LIS(Non-Monotonically or Non-Strictly increasing or non-decreasing) - nlogn
  // Minimum last element of length len+1 is stored
  // t stores minium last element index of length len+1
  // r is used to traverse the subsequence of length len+1
  // first element i.e; >= a[i]
  // Reference: https://stackoverflow.com/questions/21715892/longest-nondecreasing-subsequence-in-onlgn
   public static int findArray(List<Integer> a) {
     int n=a.size();
     int dp[]=new int[n];
     int ans=0;
     for(int i=0;i<n;i++){
       int ele=a.get(i);
       int idx=Arrays.binarySearch(dp, 0, ans, ele); 
       if(idx<0){
         idx=-(idx+1);
       }
       if(dp[idx]==ele){
         idx=Arrays.binarySearch(dp, 0, ans, ele+1);
         if(idx<0) idx=-(idx+1);
       }
       dp[idx]=ele;
       if(idx==ans) ans++;
     }
     return ans;
   }
  
  // post order dfs
    void euler(Map<Integer, Queue<Integer>> adj, List<int []> ans, int start){
        Queue<Integer> q = adj.get(start);
        while(q!=null && !q.isEmpty()){
            int cur = q.remove();
            euler(adj, ans, cur);
            ans.add(new int[]{start, cur});
        }
    }
  
  // Eulerian Path/Cycle detection and also Eulerian Path/Cycle construction
  // Ex: https://leetcode.com/contest/weekly-contest-270/problems/valid-arrangement-of-pairs/
    public int[][] validArrangement(int[][] pairs) {

        Map<Integer, Queue<Integer>> map=new HashMap<>();
        Map<Integer, Integer> in=new HashMap<>();
        Map<Integer, Integer> out=new HashMap<>();
        
        // Indegree and Outdegree cal
        for(int i=0;i<pairs.length;i++){
            Queue<Integer> l=map.getOrDefault(pairs[i][0], new LinkedList<>());
            l.add(pairs[i][1]);
            map.put(pairs[i][0], l);
            in.put(pairs[i][1], in.getOrDefault(pairs[i][1], 0)+1);
            out.put(pairs[i][0], out.getOrDefault(pairs[i][0], 0)+1);
        }
        int start=-1;
        for(Map.Entry<Integer, Queue<Integer>> m:map.entrySet()){
            if(in.getOrDefault(m.getKey(), 0) == out.getOrDefault(m.getKey(), 0)-1){
                // Eulerian Path
                start=m.getKey();
                break;
            }
        }
        // Eulerian cycle
        if(start==-1){
            start=map.entrySet().iterator().next().getKey();
        }
        
        // Eulerian Path/Cycle - Heirholzer's algorithm
        List<int []> ans=new ArrayList<>();
        euler(map, ans, start);
        int [][]res=new int[pairs.length][2];
        int idx=0;
        for(int i=ans.size()-1;i>=0;i--){
            res[idx]=ans.get(i);
            idx++;
        }
        return res;
    }
  
    // Function to count
    // derangements
    static int countDer(int n)
    {
        // Create an array to store
        // counts for subproblems
        int der[] = new int[n + 1];
     
        // Base cases
        der[1] = 0;
        der[2] = 1;
     
        // Fill der[0..n] in bottom up
        // manner using above recursive
        // formula
        for (int i = 3; i <= n; ++i)
            der[i] = (i - 1) * (der[i - 1] +
                                der[i - 2]);
     
        // Return result for n
        return der[n];
    }
  
  
  // Sparse Table
  int [][]smn;
  int [][]smx;
  int sum[][];
  int n;
  int a[];
  // static StringBuffer str=new StringBuffer();
  
  // Sparse min and max
  void build(){
      int sz=(int)(Math.log(n)/Math.log(2));
      smn=new int[n][sz+1];
      smx=new int[n][sz+1];
      for(int i=0;i<n;i++){smn[i][0]=a[i];smx[i][0]=a[i];}
      for(int j=1;j<=sz;j++){
          for(int i=0;(i+(1<<j)-1)<n;i++){
              smn[i][j]=Math.min(smn[i][j-1], smn[i+(1<<(j-1))][j-1]);
              smx[i][j]=Math.max(smx[i][j-1], smx[i+(1<<(j-1))][j-1]);
          }
      }
  }
 
  int queryMin(int l, int r){
      int len=r-l+1;
      int p=(int)(Math.log(len)/Math.log(2));
      int k=(int)Math.pow(2, p);
      return Math.min(smn[l][p], smn[r-k+1][p]);
  }

  int queryMax(int l, int r){
      int len=r-l+1;
      int p=(int)(Math.log(len)/Math.log(2));
      int k=(int)Math.pow(2, p);
      return Math.max(smx[l][p], smx[r-k+1][p]);
  }
  
  // Sparse Sum
  void build(){
      int sz=(int)Math.log(n)/Math.log(2);
      sum=new int[n][sz+1];
      for(int i=0;i<n;i++) sum[i][0]=a[i];
      for(int j=1;j<=sz;j++){
        for(int i=0;(i+(1<<j)-1)<n;i++){
          sum[i][j]=sum[i][j-1]+sum[i+(1<<(j-1))][j-1];
        }  
      }
  }
 
  // Associative queries
  int querySum(int l, int r){
      int len=r-l+1;
      int p=(int)(Math.log(len)/Math.log(2));
      int k=(int)Math.pow(2, p);
      int ans=0;
      for(int j=k;j>=0;j--){
        if(r>=l+(1<<j)-1){
          ans+=sum[l][j];
          l=l+(1<<j);
        }
      }
    return ans;
  }
  
  
  // Segment Tree
  static int a[];
  static HashSet<Integer> []seg;
  static int l,r;
  static int smn[];
  static int smx[];
  static StringBuffer str=new StringBuffer();
  
  static int constructMin(int ss, int se, int si){
      if(ss==se){
          smn[si]=a[ss];
          return smn[si];
      }
      
      int mid=ss+(se-ss)/2;
      return smn[si]=Math.min(constructMin(ss, mid, 2*si+1), constructMin(mid+1, se, 2*si+2));
  }
  
  static int constructMax(int ss, int se, int si){
      if(ss==se){
          smx[si]=a[ss];
          return smx[si];
      }
      
      int mid=ss+(se-ss)/2;
      return smx[si]=Math.max(constructMax(ss, mid, 2*si+1), constructMax(mid+1, se, 2*si+2));
  }
  
  static int getMax(int ss, int se, int si, int qs, int qe){
      if(qs<=ss && qe>=se) return smx[si];
      
      if(qs>se || qe<ss) return Integer.MIN_VALUE;
      int mid=ss+(se-ss)/2;
      return Math.max(getMax(ss, mid, 2*si+1, qs, qe), getMax(mid+1, se, 2*si+2, qs, qe));
  }
  
  static int getMin(int ss, int se, int si, int qs, int qe){
      if(qs<=ss && qe>=se) return smn[si];
      
      if(qs>se || qe<ss) return Integer.MAX_VALUE;
      int mid=ss+(se-ss)/2;
      return Math.min(getMin(ss, mid, 2*si+1, qs, qe), getMin(mid+1, se, 2*si+2, qs, qe));
  }
  
  // segment min and max
  static void build(){
      int sz=2 * (int)Math.pow(2, (int)Math.ceil(Math.log(n)/Math.log(2))) - 1;
      smn=new int[sz];
      smx=new int[sz];
      constructMin(0, n-1, 0);
      constructMax(0, n-1, 0);
  }
  
  static int constructSum(int ss, int se, int si){
    if(ss==se){
      return sum[si]=a[ss];
    }
    
    int mid=ss+(se-ss)/2;
    return sum[mid]=constructSum(ss, mid, 2*si+1)+constructSum(mid+1, se, 2*si+2);
  }
  
  static int getSum(int ss, int se, int si, int qs, int qe){
    if(qe<ss || qs>se) return 0;
    if(qs<=ss && qe>=se) return sum[si];
    
    int mid=ss+(se-ss)/2;
    return getSum(ss, mid, 2*si+1, qs, qe)+getSum(mid+1, se, 2*si+2, qs, qe);
  }
  
  // segment sum
   static void build(){
     int x=(int)Math.pow(2, (int)Math.ceil(Math.log(n)/Math.log(2)))
     int sz=(int)2*x-1;
     sum=new int[sz];
     constructSum(0, n-1, 0);
  }
  
  
  // Subset sum problem O(sum)
      bool isPossible(int elements[], int sum, int n)
    {
        int dp[sum + 1];

        // Initializing with 1 as sum 0 is
        // always possible
        dp[0] = 1;

        // Loop to go through every element of
        // the elements array
        for(int i = 0; i < n; i++)
        {

            // To change the values of all possible sum
            // values to 1
            for(int j = sum; j >= elements[i]; j--)
            {
                if (dp[j - elements[i]] == 1)
                    dp[j] = 1;
            }
        }

        // If sum is possible then return 1
        if (dp[sum] == 1)
            return true;

        return false;
    }
  
  // Segment Scheduling Algorithm
  // https://atcoder.jp/contests/abc230/tasks/abc230_d
  static void segmentScheduling(){
    Collections.sort(l, (a, b) -> {
      return (int)(a[1]-b[1]);
    });
    long ans=0;
    long x=-(1l<<40);
    for(long []li:l){
      if(x+d-1 < li[0]){
        x=li[1];
        ans++;
      }
    }
    str.append(ans).append("\n");
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
