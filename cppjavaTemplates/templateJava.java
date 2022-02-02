/*
God of:
1. Maximum sum alternating sign subsequence in an array.


*/
// Learning -> Solving -> Contesting -> Upsolving -> Learning
// A Holiday an Algo, New Stuff
// cp book -> https://github.com/luisfcofv/competitive-programming-book
// https://www.hackerearth.com/practice/notes/getting-started-with-the-sport-of-programming/
/* Motivation: https://www.youtube.com/watch?v=KNviwfDeRKg */
// Whenever you don't able to solve, it means u did not solve closer idea problem -> so make a lot of observations.
// +Key to Excel: Think more, Think all, Never Give Up!
/*
Interesting hidden things in java
https://stackoverflow.com/questions/19485818/why-are-2-long-variables-not-equal-with-operator-in-java
https://www.journaldev.com/31869/java-list-remove-methods-arraylist-remove -> Use objects such as Character, Integer and not int, char for removal of element
https://www.geeksforgeeks.org/treemap-lowerkey-in-java-with-examples/

*/
/*
Stars and Bars
https://leetcode.com/problems/number-of-sets-of-k-non-overlapping-line-segments/
https://progvar.fun/problemsets/stars-and-bars
*/
/*
Binary Search on Real Numbers -> https://codeforces.com/blog/entry/63085
https://codeforces.com/blog/entry/73888
https://codeforces.com/blog/entry/45281#:~:text=Precision%20error%20problems%20%2D%20Codeforces

*/
// Game theory wonderful blog -> https://codeforces.com/blog/entry/66040
/* Codefores catalog - Have an amazing blog posts (Read it when find time) - https://codeforces.com/catalog */
/* 
sum of xor of all subsequences - https://www.geeksforgeeks.org/sum-xor-possible-subsets/ - Realted problem: https://codeforces.com/problemset/problem/1614/C

Bi Partite graoh: https://www.geeksforgeeks.org/bipartite-graph/

Next greatest element, Next least element, Monotonic stack
Sum of all min/max elememnts of all subarrys/Good stack problems/ Monotonous incr/decr stack article -> https://leetcode.com/problems/sum-of-subarray-minimums/discuss/178876/stack-solution-with-very-detailed-explanation-step-by-step

Maximum size square sub-matrix with all 1s -> https://www.geeksforgeeks.org/maximum-size-sub-matrix-with-all-1s-in-a-binary-matrix/
https://www.geeksforgeeks.org/number-of-submatrices-with-all-1s/
Amazing variation of this: https://codeforces.com/problemset/problem/375/B

Variation of coin sum dp problem (If can't form change and change given to us in back is also a cost) -> https://atcoder.jp/contests/abc231/tasks/abc231_e
nth root of a number - https://www.geeksforgeeks.org/n-th-root-number/     CF prob:https://codeforces.com/problemset/problem/30/A
Pigeon hole principle Ques: https://codeforces.com/contest/1619/problem/D : https://www.youtube.com/watch?v=UGLQtUVbkhg
Topic question:
Weighted tree distance + Queries: https://www.geeksforgeeks.org/find-distance-between-two-nodes-in-the-given-binary-tree-for-q-queries/

Array formed using sum of absolute differences of that element with all other elements -> https://www.geeksforgeeks.org/array-formed-using-sum-of-absolute-differences-of-that-element-with-all-other-elements/
////
The intuition behind this algorithm is that since the array is sorted, think how would you do it manually.
Let's take an array as an example and do a dry run,
[2, 3, 5, 6]
For 2 -> (3+5+6) - (3*2)
For 3 -> (5+6) - (2*3) + 3 - 2 {Since 3 is greater than 2}
For 5 -> 6-(1*5) + (2*5) - (2+3) {Since 5 is greater than 2 and 3}
For 6 -> 0-(0*6) + (3*6)-(2+3+5) {Since 6 is greater than 2, 3 and 5}

In general,
(sum of ele to the right) - (# ele to_the_right * current_value) + (# ele to_the_left * current_value) - (sum of ele to the left).

If i > j then 2 * i greater than j+i => This is the key intuition behind this algorithm.
////

Amazing question on valid parentheseis which people usually get into the trap of Stack: https://leetcode.com/contest/biweekly-contest-68/problems/check-if-a-parentheses-string-can-be-valid/

https://www.geeksforgeeks.org/path-with-minimum-xor-sum-of-edges-in-a-directed-graph/

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
Amazing question on combinatorics forming sequence from given elements such that there isn't a subarray in the sequence whose xor sum is 0 - https://codeforces.com/problemset/problem/238/A - https://codeforces.com/blog/entry/5765
Similar to # subarray with given xor sum or sum 

Amazing question on base of the number : https://codeforces.com/contest/1620/problem/C : See the editorial and https://www.youtube.com/watch?v=0wtOyCcdUWo
Number system conversion: https://www.tutorialspoint.com/computer_logical_organization/number_system_conversion.htm

Array of Doubled Pairs -> https://codeforces.com/problemset/problem/1305/C -> Interesting observation on modulus question (https://leetcode.com/problems/array-of-doubled-pairs/)
Similar question -> https://leetcode.com/contest/weekly-contest-273/problems/recover-the-original-array/


Getting the first n and last n digits of a huge multiplication -> https://leetcode.com/contest/biweekly-contest-68/problems/abbreviating-the-product-of-a-range/

Good problem to fall in trap of binary and ternary search : https://codeforces.com/contest/1622/problem/C

Standard kind of dp problem (Asked in different ways) Min/Max l and r -> https://codeforces.com/problemset/problem/573/B

Standard sorting and finding max cost/pay/ans -> sometimes greedy works and sometimes not -> https://codeforces.com/problemset/problem/416/C

Standard problem of adjacent cells having different colors -> https://codeforces.com/problemset/problem/219/C

Difficult to observe as binary search problem -> https://codeforces.com/contest/1623/problem/C 
Note: Whenever you hear as max(min) or min(max), try to use binary search here. Most of the times binary search works.

Wonderful Implementation question to use PAIR data structure to find the min and max easily? : https://codeforces.com/contest/1621/problem/B : https://www.youtube.com/watch?v=HsLu6Shu9iE

Wonderful dp, greedy, bs, sortings question - https://codeforces.com/problemset/problem/1257/D

https://en.wikipedia.org/wiki/Gray_code
*
Math:
----

https://codeforces.com/contest/735/problem/D
Goldbach's conjecture: is one of the oldest and best-known unsolved problems in number theory and all of mathematics. 
It states that every even whole number greater than 2 is the sum of two prime numbers.

Fibonacci: https://en.wikipedia.org/wiki/Fibonacci_number
Interesting observations on Fibonocci : https://www.youtube.com/watch?v=SjSHVDfXHQ4
Problems based on Fib:
https://codeforces.com/contest/1239/problem/A
http://tech-queries.blogspot.com/2011/07/fit-12-dominos-in-2n-strip.html

Golden Ratio: a>b>0 => a/b = (a+b)/a = k where k is a constant
https://codeforces.com/contest/515/problem/C

x is even, gcd(x-1, x+1) = 1
x is odd, gcd(x-2, x+2) = 1

lcm(gcd(x, y), gcd(x, z)) = gcd(x, lcm(y, z))
gcd(lcm(x, y), lcm(x, z)) = lcm(x, gcd(y, z))

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

Find number of solutions of a linear equation of n variables -> https://www.geeksforgeeks.org/find-number-of-solutions-of-a-linear-equation-of-n-variables/
Stars and bars problem: https://cp-algorithms.com/combinatorics/stars_and_bars.html     https://www.youtube.com/watch?v=qvqPZkPURCo  - 
positive => with k boxes or k-1 bars and n balls is (n-1)Ck-1.
Non-negative with sticks can overlap => with k boxes or k-1 bars and n balls is (n+k-1)Ck-1 or (n+k-1)Cn
Non-negative with sticks cannot overlap => with k boxes or k-1 bars and n balls is (n+1)Ck-1.

https://www.geeksforgeeks.org/count-possible-paths-top-left-bottom-right-nxm-matrix/ - https://www.codechef.com/DEC21B/problems/PYRAMIDMOVES
https://atcoder.jp/contests/abc232/tasks/abc232_e

Amazing question on (x%a)%b) != (x%b)%a => Number of such x in a range => https://codeforces.com/problemset/problem/1342/C

Amazing question on given a[i]-k and a[i]+k find array a -> https://leetcode.com/contest/weekly-contest-273/problems/recover-the-original-array/

Wonderful question on AP -> https://codeforces.com/contest/1616/problem/C
Got to know some observation in AP

min(-c) = max(c)
max(-c) = min(c)

Interesting math question: https://codeforces.com/problemset/problem/1482/B

https://codeforces.com/contest/110/problem/C => Equation type questions (but not coin sum dp)

Notes: https://stackoverflow.com/questions/3269013/difference-between-hamiltonian-path-and-euler-path
An Euler path is a path that passes through every edge exactly once. If it ends at the initial vertex then it is an Euler cycle.
A Hamiltonian path is a path that passes through every vertex exactly once (NOT every edge). If it ends at the initial vertex then it is a Hamiltonian cycle.
In an Euler path you might pass through a vertex more than once.
In a Hamiltonian path you may not pass through all edges.

**/
/* Round Robin 
cur
---


Queue 1
-------
https://codeforces.com/contest/797/problem/C
https://codeforces.com/contest/1327/problem/E 
https://codeforces.com/contest/166/problem/E 
https://codeforces.com/contest/883/problem/F
https://codeforces.com/contest/182/problem/D
https://leetcode.com/contest/weekly-contest-275/problems/count-words-obtained-after-adding-a-letter/
https://atcoder.jp/contests/abc234/tasks/abc234_e
https://codeforces.com/contest/1108/problem/D
https://codeforces.com/contest/1154/problem/D
https://codeforces.com/contest/1203/problem/E
https://codeforces.com/contest/1131/problem/C -> exp: https://codeforces.com/blog/entry/65487?#comment-494720 
https://codeforces.com/contest/1343/problem/D
https://codeforces.com/contest/1102/problem/C 
https://codeforces.com/contest/958/problem/F1
https://codeforces.com/contest/1144/problem/F
https://codeforces.com/contest/363/problem/C
https://codeforces.com/contest/401/problem/C
https://codeforces.com/contest/1239/problem/A
https://codeforces.com/contest/492/problem/C
https://codeforces.com/contest/1343/problem/E
https://codeforces.com/contest/778/problem/A
https://codeforces.com/contest/1311/problem/F
https://codeforces.com/contest/1335/problem/D
https://codeforces.com/contest/1354/problem/C2
https://codeforces.com/contest/1216/problem/E1
https://www.hackerrank.com/challenges/misere-nim-1/problem?isFullScreen=true
https://codeforces.com/contest/1365/problem/C
https://codeforces.com/contest/1365/problem/E
https://www.codechef.com/problems/GRAYSC
https://www.geeksforgeeks.org/find-a-non-empty-subset-in-an-array-of-n-integers-such-that-sum-of-elements-of-subset-is-divisible-by-n/. -> https://codeforces.com/blog/entry/80683
https://codeforces.com/contest/1364/problem/B
https://codeforces.com/contest/1364/problem/C
https://codeforces.com/contest/1280/problem/A
https://codeforces.com/contest/1132/problem/C
https://codeforces.com/contest/1310/problem/A -> https://codeforces.com/contest/1310/submission/82178840
https://codeforces.com/contest/1364/problem/B
https://codeforces.com/contest/1364/problem/C
https://www.hackerrank.com/challenges/nimble-game-1/problem?isFullScreen=true -> GTC
https://www.hackerrank.com/challenges/tower-breakers-revisited-1/problem?isFullScreen=true -> GTC
https://codeforces.com/contest/274/problem/A
https://codeforces.com/contest/455/problem/A
https://codeforces.com/contest/468/problem/A
https://codeforces.com/contest/1367/problem/D
https://codeforces.com/contest/439/problem/D -> Ternary Search (log(n)/log(3/2) times only) -> https://codeforces.com/blog/entry/12545?#comment-172751
https://codeforces.com/contest/1368/problem/D
https://codeforces.com/contest/891/problem/A
https://codeforces.com/contest/1010/problem/A -> Non integral value binary search
https://codeforces.com/contest/1179/problem/A
https://codeforces.com/contest/1242/problem/A
https://codeforces.com/contest/1373/problem/D
https://codeforces.com/contest/1299/problem/A
https://codeforces.com/contest/1264/problem/A
https://codeforces.com/contest/1114/problem/B
https://codeforces.com/contest/1278/problem/B
https://codeforces.com/contest/743/problem/C
https://codeforces.com/contest/1166/problem/C
https://codeforces.com/contest/340/problem/D
https://codeforces.com/contest/1186/problem/D
https://codeforces.com/contest/343/problem/A
https://codeforces.com/contest/607/problem/A
https://codeforces.com/contest/1385/problem/E
https://codeforces.com/contest/704/problem/A
https://codeforces.com/contest/763/problem/A
https://www.hackerrank.com/challenges/tower-breakers-again-1/problem?isFullScreen=true -> GTC
https://www.hackerrank.com/challenges/zero-move-nim/problem?isFullScreen=true
https://codeforces.com/contest/1188/problem/A1
https://codeforces.com/contest/1198/problem/A
https://codeforces.com/contest/322/problem/B
https://codeforces.com/contest/407/problem/B -> https://codeforces.com/blog/entry/11333?#comment-163504
https://codeforces.com/contest/429/problem/B
https://codeforces.com/contest/1399/problem/D
https://codeforces.com/contest/1137/problem/B -> Try with all string methods -> https://cp-algorithms.com/string/string-hashing.html
https://codeforces.com/contest/1175/problem/B
https://codeforces.com/contest/1291/problem/C
https://codeforces.com/contest/1198/problem/B
https://codeforces.com/contest/1282/problem/B2
https://codeforces.com/contest/165/problem/C
https://codeforces.com/contest/913/problem/C
https://codeforces.com/contest/1036/problem/D
https://codeforces.com/problemset/problem/1257/D
https://codeforces.com/problemset/problem/1295/C
https://codeforces.com/contest/1542/problem/B
https://codeforces.com/contest/1542/problem/C

Queue 2
-------
https://codeforces.com/contest/1210/problem/B
https://leetcode.com/problems/132-pattern/
https://codeforces.com/contest/281/problem/D
https://codeforces.com/contest/797/problem/C

*/
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

    // string hashing


    // pair datastructure 
    // equals and hashCode should be overriden when you want to 
    // use something like hashmap or hashset
    // to compare them
    // Make use of Intellij IDE to generate equals and hashcode
    static class Pair {
        long x, y;

        public Pair(long x, long y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (x != pair.x) return false;
            return y == pair.y;
        }

        @Override
        public int hashCode() {
            int result = (int)(x ^ (x >>> 32));
            result = 31 * result + (int)(y ^ (y >>> 32));
            return result;
        }
    }

    // sorting template of normal array []
    static void templateSortArray() {
        List < Integer > l = new ArrayList < > ();
        for (int i = 0; i < n; i++) l.add(a[i]);
        Collections.sort(l, Collections.reverseOrder());
        for (int i = 0; i < n; i++) a[i] = l.get(i);
    }

    // Heaps algorithm -> to find all the permutations of an array
    static void heapsAlgorithm() {
        https: //www.geeksforgeeks.org/heaps-algorithm-for-generating-permutations/
    }

    static long mod_mul(long a, long b) {
        a = a % mod;
        b = b % mod;
        return (((a * b) % mod) + mod) % mod;
    }

    static long mod_add(long a, long b) {
        a = a % mod;
        b = b % mod;
        return (((a + b) % mod) + mod) % mod;
    }

    // Shuffle and sort
    static void sort(int[] A) {
        int n = A.length;
        Random rnd = new Random();
        for (int i = 0; i < n; ++i) {
            int tmp = A[i];
            int randomPos = i + rnd.nextInt(n - i);
            A[i] = A[randomPos];
            A[randomPos] = tmp;
        }
        Arrays.sort(A);
    }
    static void sort(long[] A) {
        int n = A.length;
        Random rnd = new Random();
        for (int i = 0; i < n; ++i) {
            long tmp = A[i];
            int randomPos = i + rnd.nextInt(n - i);
            A[i] = A[randomPos];
            A[randomPos] = tmp;
        }
        Arrays.sort(A);
    }

    // counting sort 
    static void countSort(int mx) {

        int n = arr.length;
        int output[] = new int[mx];
        int count[] = new int[mx];
        for (int i = 0; i < 2; ++i)
            count[i] = 0;

        for (int i = 0; i < n; ++i)
            ++count[arr[i]];

        for (int i = 1; i <= mx; ++i)
            count[i] += count[i - 1];

        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            --count[arr[i]];
        }

        for (int i = 0; i < n; ++i)
            arr[i] = output[i];
    }

    // Math 
    // https://www.youtube.com/watch?v=8Fqv4ddMC3I
    static void extendedGcd(long a, long b, long ar[]) {
        if (b == 0) {
            ar[0] = 1;
            ar[1] = 0;
            ar[2] = a;
            return;
        }
        extendedGcd(b, a % b, ar);
        long temp = ar[1];
        ar[1] = (ar[0] - ar[1] * (a / b));
        ar[0] = temp;
        return;
    }

    // Linear Diophontine
    static void findLinearDiophontineSol(int a, int b, int c) {
        long ar[] = new long[3];
        extendedGcd(a, b, ar);
        int x0 = ar[0];
        int y0 = ar[1];
        int g = ar[2];
        if (c % g != 0) return;
        int x = x0 * c / g;
        int y = y0 * c / g;
        if (a < 0) x = -x;
        if (b < 0) y = -y;
    }

    // Chinese Remainder Theorem
    static void chineseRemainderTheorem(int num[], int rem[], int k) {
        int prod = 1;
        for (int i = 0; i < k; i++)
            prod *= num[i];

        int result = 0;

        for (int i = 0; i < k; i++) {
            int pp = prod / num[i];
            long ar[] = new long[3];
            extendedGcd(pp, num[i], ar);
            result += rem[i] * ar[0] * pp;
        }

        return result % prod;
    }

    // non prime b;
    static long invmod(long a, long b) {
        long ar[] = new long[3];
        extendedGcd(a, b, ar);
        return ar[0];
    }
    static long pow(long a, long b) {
        long res = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                res = (res * a) % mod;
                b--;
            } else {
                a = (a * a) % mod;
                b = b >> 1;
            }
        }
        return res;
    }
    static long combination(int a, int b) {
        long val1 = fact[a];
        long val2 = ifact[a - b];
        long val3 = ifact[b];
        return (((val1 * val2) % mod) * val3) % mod;
    }
    static void cal() {
        fact[0] = ifact[0] = 1;
        for (int i = 1; i < sz; i++) {
            fact[i] = (i * fact[i - 1]) % mod;
        }
        ifact[sz - 1] = pow(fact[sz - 1], mod - 2);
        for (int i = sz - 2; i > 0; i--) {
            ifact[i] = ((i + 1) * ifact[i + 1]) % mod;
        }
    }

    // Binary search on float values
    /*
    If you want to say "relative or absolute error up to EPS", then I recommend while(R-L >= EPS * max(1., L)).
    100 iterations might hurt you if TL is tight and 30 iterations would be enough. Maybe you'll get TLE this way. 
    That being said, a constant number of iterations is fine in competitive programming. You're avoiding one more 'if' where you could make a mistake.
    */
    // Type 1:
    float l = 0.00000000, r = 100000.00000000;
    cout << l << " " << r;
    while ((r - l) > 0.0000000001) {
        float mid = (float)((l + r) / 2);
        cout << mid << endl;
        if (mid > target) r = mid;
        else l = mid;
    }
    cout << l;
    // Type 2:
    int iterations = 0;
    while (iterations < 300) {
        // your binary search logic
        iterations++;
    }
    // DSU
    static int find(int i) {
        if (parent[i] != i)
            parent[i] = find(parent[i]);
        return parent[i];
    }
    static boolean union(int x, int y) {
        int xr = find(x);
        int yr = find(y);
        if (xr == yr) return false;
        if (rank[xr] < rank[yr]) {
            parent[xr] = yr;
        } else if (rank[yr] < rank[xr]) {
            parent[yr] = xr;
        } else {
            parent[xr] = yr;
            rank[yr]++;
        }
        return true;
    }

    // BIT
    static long query(int idx) {
        long sum = 0;
        idx++;
        while (idx > 0) {
            sum = (sum + bit[idx]) % mod;
            idx -= (idx & (-idx));
        }
        return sum;
    }
    static void update(int idx, long v) {
        idx++;
        while (idx <= n) {
            bit[idx] = (bit[idx] + v + mod) % mod;
            idx += (idx & (-idx));
        }
    }
    static void update(int l, int r, long v) {
        update(l, v);
        if ((r + 1) <= n) update(r + 1, -v);
    }

    // print all cycles in an undirected graph - correct algo (There is a wrong in GfG)
    static int cyclenumber;
    static void dfs_cycle(int u, int p, int[] color, int[] mark, int[] par) {
        if (color[u] == 1) {
            cyclenumber++;
            int cur = p;
            cycles[cyclenumber].add(cur);
            while (cur != u) {
                cur = par[cur];
                cycles[cyclenumber].add(cur);
            }
            return;
        }
        par[u] = p;
        color[u] = 1;
        for (int v: graph[u]) {
            if (v == par[u]) continue;
            dfs_cycle(v, u, color, mark, par);
        }
        color[u] = 2;
    }

    // detect cycle in an undirected graph using color
    static int v, e;
    static boolean flag;
    static ArrayList < ArrayList < Integer >> edg = new ArrayList < > ();
    static char color[];
    static void dfs(int u, int p) {
        color[u] = 'g';
        ArrayList < Integer > list = edg.get(u);
        for (int ver: list) {
            char c = color[ver];
            if (c == 'b' || ver == p)
                continue;
            if (c == 'g')
                flag = true;
            if (c == 'w')
                dfs(ver, u);
        }
        color[u] = 'b';
    }

    // TOPO - BFS
    static void topSort() {
        // l is the adjacency list
        vis = new boolean[n + 1];
        topo = new ArrayList < > ();
        Queue < Integer > q = new LinkedList < > ();
        for (int i = 1; i <= n; i++)
            if ( in [i] == 0) q.add(i);
        while (!q.isEmpty()) {
            int u = q.remove();
            topo.add(u);
            vis[u] = true;
            for (int v: l.get(u)) {
                if (--ind[v] == 0) {
                    q.add(v);
                }
            }
        }
    }

    // TOPO-DFS
    void topologicalSortUtil(int v, boolean visited[],
            Stack < Integer > stack) {
            // Mark the current node as visited.
            visited[v] = true;
            Integer i;

            // Recur for all the vertices adjacent
            // to thisvertex
            Iterator < Integer > it = adj.get(v).iterator();
            while (it.hasNext()) {
                `
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
	
    // find if there is a cycle in a directed graph by checking if it 
    // has a valid TOPO sort or not
    // or constructing a valid DAG using TOPO sort https://codeforces.com/contest/1385/problem/E
    static void dfs(int u)
    {
      vis[u]=true;
      for(int v:dedges.get(u))
      {
	  if(!vis[v])
	    dfs(v);
      }
      stack.push(u); 
    }

    static void isValidTOPOSortOrCycleInDAG(){
	 stack=new Stack<>();
	 vis=new boolean[n+1];
	 for(int i=1;i<=n;i++)
	 {
	     if(!vis[i])
	        dfs(i);
	 }
	 ArrayList<Integer> top=new ArrayList<>();
	 while(!stack.isEmpty())
	    top.add(stack.pop());
	 boolean flag=false;
	 int pos[]=new int[n+1];
	 for(int i=0;i<n;i++)
	    pos[top.get(i)]=i;
	 for(int i=1;i<=n;i++)
	 {
           for(int v:dedges.get(i))
	    {
	       if(pos[v]<pos[i])
		{
	            flag=true;
		     break;
		}
	     }
	  }
	 return !flag; 
    }
  
  // LIS(Monotonically increasing or Strictly increasing) where elements are 
  // consecutive elements {eg: x, x+1, x+2, ... x+k}
  static void LISConsecutive(int []arr)
    {
       HashMap<Integer,Integer> map=new HashMap<>();
       int n=arr.length;
       int max=0,num=0;
	   for(int i=0;i<n;i++)
	   {
	       if(!map.containsKey(arr[i]-1))
	          map.put(arr[i],1);
	       
	       else
	          map.put(arr[i],map.get(arr[i]-1)+1);
	          
	        if(max<map.get(arr[i]))
	        {
	            num=arr[i];
	            max=map.get(arr[i]);
	        }
	   }
	   System.out.println(max);
	   
	   ArrayList<Integer> list=new ArrayList<>();
	   for(int i=n-1;i>=0;i--)
	   {
	       if(arr[i]==num)
	       {
	           list.add(i+1);
	           num--;
	       }
	   }
	   int sz=list.size();
	   for(int i=sz-1;i>=0;i--)
	     System.out.print(list.get(i)+" ");
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
