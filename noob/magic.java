/*
Motivation: https://www.youtube.com/watch?v=KNviwfDeRKg 

God of:
-------
1. Maximum sum alternating sign subsequence in an array.

Don't understand the Editorial
---------
https://codeforces.com/contest/559/problem/B

Tools and Resources
-------------------Pa
https://codeforces.com/blog/entry/62690
https://www.desmos.com/
http://www.dragonwins.com/domains/getteched/crypto/chinese_remainder_theorem.htm
http://disi.unitn.it/~montreso/acm-icpc/CompetitiveProgrammersHandbook.pdf : Page 26 finds a lot of books
https://academickids.com/encyclopedia/index.php/Mixed_radix : https://codeforces.com/contest/1620/problem/C => Mixed base number system
https://github.com/apaarkamal/Dynammic-Programming-Coding-Minutes : Java codes for DP, Games, Graphs
https://cses.fi/book/book.pdf
https://acm.timus.ru/
https://codeforces.com/blog/entry/101958
http://e-maxx.ru/
https://toph.co/p/lids
https://vjudge.net/
https://lightoj.com/
https://usaco.guide/CPH.pdf#page=75
Galen Colin Topic STreams and Mashups
https://www.omegalearn.org/thebookofformulas
https://www.desmos.com/calculator
https://mathworld.wolfram.com/
https://artofproblemsolving.com/
https://brilliant.org/home/
https://codeforces.com/blog/entry/65133
https://codeforces.com/blog/entry/79231
https://cses.fi/book/book.pdf
https://docs.google.com/document/d/1-wkEQSYLLaKne-6GJ4Wc_dTGmnRn5Fv_Ax64LrheK_M/edit - karthik arora
https://artofproblemsolving.com/wiki/index.php/Resources_for_mathematics_competitions
https://www.youtube.com/watch?v=bSdp2WeyuJY
https://docs.google.com/document/d/1-7Co93b504uyXyMjjE8bnLJP3d3QXvp_m1UjvbvdR2Y/edit - 
https://docs.google.com/document/d/1Qmh_suVjBv0F3LFC5CfO06knn2zW92nfTyVlQLrUnFs/edit - Priyansh Agarwal
https://www.csie.ntu.edu.tw/~r97002/temp/Concrete%20Mathematics%202e.pdf
https://codeforces.com/blog/entry/72285 : https://codeforces.com/problemset/problem/1047/B
cp-algo pending
https://codeforces.com/blog/entry/91363
https://codeforces.com/blog/entry/88672
https://codeforces.com/blog/entry/15729
https://codeforces.com/blog/entry/92092
https://codeforces.com/blog/entry/95106
https://codeforces.com/blog/entry/92170
https://codeforces.com/blog/entry/58747
https://codeforces.com/blog/entry/55274
https://codeforces.com/blog/entry/100826
https://codeforces.com/blog/entry/48122
https://codeforces.com/blog/entry/96699 => Good blog on Binary Search (different approaches to decide l and r)
Game to learn Geometry - https://www.euclidea.xyz/en/game/packs
online tools for cp - https://codeforces.com/blog/entry/82884
https://oeis.org/ ->  The On-Line Encyclopedia of Integer Sequences -> If problem in contests are about sequences
Google Interview Experience : https://docs.google.com/document/d/15PwjWY5leHJCvwtNQi9aCH9EASTa6HPmiQWTKbEnJkU/edit
cp book -> https://github.com/luisfcofv/competitive-programming-book
https://www.hackerearth.com/practice/notes/getting-started-with-the-sport-of-programming/
Game theory wonderful blog -> https://codeforces.com/blog/entry/66040
Codefores catalog - Have an amazing blog posts (Read it when find time) - https://codeforces.com/catalog
https://codeforces.com/blog/entry/68138
https://csacademy.com/
https://docs.google.com/spreadsheets/d/1-kY6uiLOo1AKSBCSjbpGRBZbIldO_3dg6oTRKIJzT-g/edit#gid=0
Exchange Arguments Greedy techniques: https://www.youtube.com/watch?v=Oq1seKJvfQU : https://www.youtube.com/watch?v=5d5tVcUAzJU : 
Stay Ahead Greedy(Interval Scheduling - Maximize compatible requests) : https://www.youtube.com/watch?v=WAf5fop1EZg
number of four cycles in a graph -> Topuc to be mastererd

Interesting hidden things in java
---------------------------------
https://stackoverflow.com/questions/19485818/why-are-2-long-variables-not-equal-with-operator-in-java
https://www.journaldev.com/31869/java-list-remove-methods-arraylist-remove -> Use objects such as Character, Integer and not int, char for removal of element
https://www.geeksforgeeks.org/treemap-lowerkey-in-java-with-examples/
Map<Long, Long> map; // map.get(3l) is not equal to map.get(3) and also map.put(3) is not supported.


Math and CS
-----------------
Fibonacci: https://en.wikipedia.org/wiki/Fibonacci_number
Interesting observations on Fibonocci : https://www.youtube.com/watch?v=SjSHVDfXHQ4
Problems based on Fib:
https://codeforces.com/contest/1239/problem/A
http://tech-queries.blogspot.com/2011/07/fit-12-dominos-in-2n-strip.html

Golden Ratio: a>b>0 => a/b = (a+b)/a = k where k is a constant => dividing two consective numbers in F series = (1+sqrr(5))/2
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

Stars and bars problem: https://cp-algorithms.com/combinatorics/stars_and_bars.html     https://www.youtube.com/watch?v=qvqPZkPURCo  - 
positive => with k boxes or k-1 bars and n balls is (n-1)Ck-1.
Non-negative with sticks can overlap => with k boxes or k-1 bars and n balls is (n+k-1)Ck-1 or (n+k-1)Cn
Non-negative with sticks cannot overlap => with k boxes or k-1 bars and n balls is (n+1)Ck-1.

https://www.geeksforgeeks.org/count-possible-paths-top-left-bottom-right-nxm-matrix/ - https://www.codechef.com/DEC21B/problems/PYRAMIDMOVES
https://atcoder.jp/contests/abc232/tasks/abc232_e

Amazing question on (x%a)%b) != (x%b)%a => Number of such x in a range => https://codeforces.com/problemset/problem/1342/C

Amazing question on given a[i]-k and a[i]+k find array a -> https://leetcode.com/contest/weekly-contest-273/problems/recover-the-original-array/

Wonderful question on AP -> https://codeforces.com/contest/1616/problem/C
In AP, (a[j]-a[i]) * (k-j) == (a[k] - a[j]) * (j-i) 

min(-c) = max(c)
max(-c) = min(c)

Interesting math question: https://codeforces.com/problemset/problem/1482/B

https://codeforces.com/contest/110/problem/C => Equation type questions (but not coin sum dp)

Notes: https://stackoverflow.com/questions/3269013/difference-between-hamiltonian-path-and-euler-path
An Euler path is a path that passes through every edge exactly once. If it ends at the initial vertex then it is an Euler cycle.
A Hamiltonian path is a path that passes through every vertex exactly once (NOT every edge). If it ends at the initial vertex then it is a Hamiltonian cycle.
In an Euler path you might pass through a vertex more than once.
In a Hamiltonian path you may not pass through all edges.

Let us denote by 𝑑(𝑛) the sum of all divisors of the number 𝑛, i.e. 𝑑(𝑛)=∑𝑘 such that k is a divisor of n.
Then the multiplicative identity holds i.e; d(a * b) = d(a) * d(b) if gcd(a, b)=1.

a+b=(a^b)+2*(a&b)
a+b=(a&b)+(a|b)
38

Bitwise operations that are just a boolean operator applied between corresponding bits of the operands follow laws analogous to the laws of Boolean algebra, for example:

AND (&) : Commutative, Associative, Identity (0xFF), Annihilator (0x00), Idempotent
OR  (|) : Commutative, Associative, Identity (0x00), Annihilator (0xFF), Idempotent
XOR (^) : Commutative, Associative, Identity (0x00), Inverse (itself)
NOT (~) : Inverse (itself)
AND and OR absorb each other:

a & (a | b) = a
a | (a & b) = a
There are some pairs of distributive operators, such as:

AND over OR: a & (b | c) = (a & b) | (a & c)
AND over XOR: a & (b ^ c) = (a & b) ^ (a & c)
OR over AND: a | (b & c) = (a | b) & (a | c)
Note however that XOR does not distribute over AND or OR, and neither does OR distribute over XOR.

DeMorgans law applies in its various forms:

~(a & b) = ~a | ~b
~(a | b) = ~a & ~b
Some laws that relate XOR and AND can be found by reasoning about the field ℤ/2ℤ, in which addition corresponds to XOR and multiplication to AND:

AND distributes over XOR
Working out products of sums: (a ^ b) & (c ^ d) = (a & c) ^ (a & d) ^ (b & c) ^ (b & d)
There are some laws that combine arithmetic and bitwise operations:

Subtract by adding: a - b = ~(~a + b)
Add carries separately: a + b = (a ^ b) + ((a & b) << 1)
Turn min into max and vice versa: min(a, b) = ~max(~a, ~b), max(a, b) = ~min(~a, ~b)
Shifts have no inverse because of the "destruction" of bits pushed to the edge

left shift  (<<) : Associative, Distributive, Identity (0x00)

right shift (>>) : Associative, Distributive, Identity (0x00)

rotate left  (rl) : Associative, Distributive, Identity (0x00), Inverse (rr)

rotate right (rr) : Associative, Distributive, Identity (0x00), Inverse (rl)

While shifts have no inverse, some expressions involving shifts do have inverses as consequence of other laws, for example:

x + (x << k) has an inverse, because it is effectively a multiplication by an odd number and odd numbers have an modular multiplicative inverse modulo a power of two. 
For x + (x << 1) = x * 3, the inverse is x * 0xAAAAAAAB (for 32 bits, adjust the constant for other sizes)
x ^ (x << k) has an inverse for a similar reason, but through the correspondence with carryless multiplication.
Similarly x ^ (x >>> k) (with unsigned right shift) has an inverse, it's just the "mirror image" of the above.

(a^(b^c))%m != (a^((b^c)%m))%m -> https://codeforces.com/problemset/problem/1594/E1
If possible always prefer to do LHS
Similarly (((a^b)%m)^c)%m != (a^((b*c)%m))%m

To cover a point (xi, yi), the length of the shorter side of the triangle should be at least xi + yi. 
So the answer is max(xi + yi). : https://codeforces.com/problemset/problem/1047/B

x<=y<=z are sides of triangle and if x and z are known, y=z-x+1 satisfies the property of degenerate triangle : https://codeforces.com/problemset/problem/766/B : https://codeforces.com/contest/667/problem/B

In a square matrix n*n, In diagonal configuration1, i+j is same for same diagonal elements where is the row number and j is the column number and in 
configuration2 (i-j) is same for same diagonal elements.

star numbers: 6*n*(n-1) + 1.

Parallelogram vector area: https://www.quora.com/What-is-the-area-of-parallelogram-in-vector-form
Distance from line to a point in vector form: https://www.youtube.com/watch?v=tYUtWYGUqgw
 
https://en.wikipedia.org/wiki/Calkin%E2%80%93Wilf_tree : https://codeforces.com/contest/343/problem/A : https://codeforces.com/blog/entry/8860?#comment-351231
GCD(A, B) => GCD(B, A%B) => GCD(A-B, B)
A=B*Q+R
There are A/B steps to reach from GCD(A, B) to one euclidean step GCD(B, A%B) using GCD(A-B, B) where A>B

// AOPS modulo 
Consider four integers ${a},{b},{c},{d}$ and a positive integer n such that a=b mod n and c=d mod n. In modular arithmetic, the following identities hold:
Addition: a+c=(b+d) mod m
Subtraction: a-c=(b-d)mod m
Multiplication: a*c=(b*d)mod m
Division: a/e=(b/e) mod (n/gcd(n,e)), where e is a positive integer that divides a and b.
Exponentiation: a^e=(b^e)mod m where e is a positive integer.

phi(p^x) = p^x-p^(x-1)    where p is a prime # and phi(x) is Euler Totient function
phi(p) = p-1
phi(a*b) = phi(a) * phi(b) * (gcd(a, b)/phi(gcd(a, b)))
a = sum of phi(d) where d is the all divisors of a
phi(n)<=n-1

Another useful idea is that d(n) is odd if and only if 'n' is a perfect square. d(n) is the number of divisors of n.
Generating Functions in combinatorics are very useful.

PigeonHole: 
1. If n+1 objects are placed in n boxes then one box contains more than one object.
2. If kn objects are placed in n boxes alteast one box contains atleast k+1 objects.
3. If average of n positive numbers is t, then atleast one of the numbers is greater or equal to t. 
   Further, atleast one of the numbers is less or equal to t.
4. https://www.geeksforgeeks.org/discrete-mathematics-the-pigeonhole-principle/

Every prime number can be represented in form of 6n+1 or 6n-1 except the prime number 2 and 3, where n is a natural number.
Two and Three are only two consecutive natural numbers that are prime.
Lemoine’s Conjecture: Any odd integer greater than 5 can be expressed as a sum of an odd prime (all primes other than 2 are odd) and an even semiprime. 
A semiprime number is a product of two prime numbers. https://codeforces.com/contest/735/problem/D
Goldbach's conjecture: is one of the oldest and best-known unsolved problems in number theory and all of mathematics. 
It states that every even whole number greater than 2 is the sum of two prime numbers.

Logic to construct Pascal's triangel: 
     1
   1 2 1
 1  3  3 1 (3=1+2, 3=1+2)
1  4  6 4 1 (4=3+1, 6=3+3, 4=3+1)
.
.
.

nCr = (n-1)Cr + (n-1)C(r-1)  (see top) => Also think of selecting k balls out of n balls and using 0/1 strategy of dynamic programming.
nCr = (n/r) * (n-1)C(r-1)
sum(x=0 to n)nCx = 2^n
Triangular numbers(nth term gives sum of first n numbers): 1, 3, 6, 10, 15, ...

If an operation gives a value always <=k then if we take a modulo with a number >k then there is no chance that the value%mod become 0 except the value=0.

In Number Theory, a Wilson Prime is a prime number N such that N^2 divides (N-1)!+1. It bears a striking resemblance to Wilson's Theorem. 
Although conjectured to be infinite in number, no other Wilson primes have been discovered besides 5,13, and 563.

In number theory, Wilson's Theorem states that if integer p > 1 , then (p-1)! + 1 is divisible by p if and only if p is prime.

If a number is divisible by consective 10 elements from 1 to 10 then the number has factor called 10!
Any number can have atleast one element that is not factor of that element between 1 and 10.
    
For any two positive integers x, y that satisfy x>=y what is the maximum value of x%y?
Key observation: x%y < (x+1)/2 if x>=y and x%y=x if x<y.
https://math.stackexchange.com/questions/3961702/prove-that-for-any-two-positive-integers-x-and-y-the-value-of-x-pmod-y

Problem B teaches u a lot of math: https://codeforces.com/blog/entry/97920
finding the first prime that does not divide n — 1, which must exist within the first 10 primes since n is at most 1e9.
Every integer can be expressed using congruent modulo 2 or 4.
When 𝑛≡0(mod2), output (𝑛−3,2,1).
When 𝑛≡1(mod4), output (⌊𝑛2⌋−1,⌊𝑛2⌋+1,1).
When 𝑛≡3(mod4), output (⌊𝑛2⌋−2,⌊𝑛2⌋+2,1).
https://codeforces.com/blog/entry/97920?#comment-868122
https://codeforces.com/blog/entry/97920?#comment-868199

An upper bound for a harmonic sum is log2(n) + 1.

https://artofproblemsolving.com/wiki/index.php/Binet%27s_Formula

The number of digits of an integer(base 10) in base b is floor(log x to base b + 1).

https://artofproblemsolving.com/wiki/index.php/Modular_arithmetic/Intermediate -> Addition, Subtraction and multiplication modulo n

Formally stated, the Chinese Remainder Theorem is as follows: https://codeforces.com/contest/1242/problem/A?locale=en
https://www.math.utah.edu/~bertram/AlgebraTopics/Chinese.pdf
Let m be relatively prime to n. Then each residue class mod mn is equal to the cross product of a unique residue class mod m
and a unique residue class mod n, and the cross product of each residue class mod m with a residue class mod n is a residue class mod mn.
=> Which means that {0,1,2,3...,mn-1} is the residue class of mn and this can be obtained from m and n.

https://codeforces.com/blog/entry/12545?#comment-922768 => Learned a lot about ternary search and time complexities

If you can formulate that a function f(x) is unimodal then you can use ternary search. => https://codeforces.com/contest/439/problem/D
Else if it is stictly or monotonically increasing or decreasing it is binary search.
Note: Learn how to know if a function is unimodal.

Teaches a lot of combinatorics although u get most of it: https://codeforces.com/problemset/problem/294/C : https://codeforces.com/blog/entry/7271#comment-129018 : https://codeforces.com/blog/entry/7287

The maximal number of divisors of n<=1e18 is cube root of n or n^(1/3) => https://codeforces.com/blog/entry/14463

LCM(x, n-x) = n-x iff x|n for some positive integer n and x is a divisor of n. Proof(Problem B): https://codeforces.com/blog/entry/79974

Prefix Codes : https://www.youtube.com/watch?v=bWSHmC1eSyY : https://www.facebook.com/codingcompetitions/hacker-cup/2022/qualification-round/problems/C1

https://www.youtube.com/watch?v=AbF6-TtkPLs : Learned a lot! In an undirected graph with M edges. The number of Big nodes: nodes having degree>sqrt(M) is atmost 2*sqrt(M) because total degree=2*M 
which can be obtained by 2*sqrt(M) * sqrt(M) = M where first 2*sqrt(M) is the number of big nodes and second one is degree of each.

















































































**//*
CF unsolved/upsolved/master
---------------------------
https://codeforces.com/contest/1605/problem/A
https://codeforces.com/contest/1605/problem/B
https://codeforces.com/contest/1005/problem/D
https://codeforces.com/contest/630/problem/K
https://codeforces.com/contest/1609/problem/D
https://codeforces.com/contest/1311/problem/F
https://codeforces.com/contest/1469/problem/C
https://codeforces.com/contest/1452/problem/D : was able to do in O(n^2) but need to do in O(n)
https://codeforces.com/contest/1684/problem/C
https://codeforces.com/contest/1684/problem/D
https://codeforces.com/contest/1608/problem/C
https://codeforces.com/contest/835/problem/C
https://codeforces.com/contest/814/problem/C
https://codeforces.com/contest/660/problem/C
https://codeforces.com/contest/1617/problem/C
https://codeforces.com/contest/1618/problem/D
https://codeforces.com/contest/1618/problem/E
https://codeforces.com/contest/734/problem/C
https://codeforces.com/contest/682/problem/C
https://codeforces.com/contest/286/problem/A
https://codeforces.com/contest/1423/problem/K : solution proof is vere level : i got almost :)
https://codeforces.com/contest/1619/problem/D
https://codeforces.com/contest/238/problem/A
https://codeforces.com/contest/1620/problem/C
https://codeforces.com/contest/1691/problem/C
https://codeforces.com/contest/1342/problem/C
https://codeforces.com/contest/1622/problem/C
https://codeforces.com/contest/573/problem/B
https://codeforces.com/contest/219/problem/C
https://codeforces.com/contest/1623/problem/C
https://atcoder.jp/contests/abc231/tasks/abc231_e : https://codeforces.com/blog/entry/97814#comment-870082
https://leetcode.com/contest/biweekly-contest-68/problems/check-if-a-parentheses-string-can-be-valid/
https://codeforces.com/problemset/problem/1355/C
https://leetcode.com/contest/biweekly-contest-68/problems/abbreviating-the-product-of-a-range/
https://leetcode.com/contest/weekly-contest-273/problems/recover-the-original-array/
https://codeforces.com/contest/1616/problem/C
https://codeforces.com/problemset/problem/1482/B
https://codeforces.com/contest/1690/problem/E
https://leetcode.com/problems/split-array-largest-sum/
https://leetcode.com/problems/palindrome-partitioning-ii/
https://codeforces.com/contest/1697/problem/C
https://codeforces.com/contest/1557/problem/C
https://codeforces.com/problemset/problem/840/A : https://codeforces.com/blog/entry/62690 : https://codeforces.com/blog/entry/72285
https://codeforces.com/problemset/problem/553/A
https://codeforces.com/problemset/problem/294/C : https://codeforces.com/blog/entry/7271#comment-129018 : https://codeforces.com/blog/entry/7287
https://codeforces.com/contest/1695/problem/C
https://codeforces.com/contest/1579/problem/F
https://codeforces.com/contest/1696/problem/C
https://codeforces.com/contest/1696/problem/D
https://codeforces.com/contest/1581/problem/C
https://codeforces.com/problemset/problem/1661/B
https://codeforces.com/contest/1556/problem/C : https://codeforces.com/blog/entry/94384
https://codeforces.com/contest/1699/problem/C
https://codeforces.com/problemset/problem/1700/C
https://codeforces.com/contest/1701/problem/C
https://codeforces.com/problemset/problem/1694/B
https://codeforces.com/contest/1442/problem/B
https://codeforces.com/contest/1702/problem/F : https://www.youtube.com/watch?v=HIiX3r5n27M
https://codeforces.com/problemset/problem/1436/D
https://codeforces.com/problemset/problem/1091/D
https://leetcode.com/problems/next-permutation/ : Funda for https://codeforces.com/contest/1091/problem/D
https://codeforces.com/problemset/problem/1486/B : Wonderful Geometry pbm based on manhattan distances
https://codeforces.com/problemset/problem/1312/A : https://codeforces.com/blog/entry/74640?#comment-655492
https://codeforces.com/contest/1708/problem/C
https://codeforces.com/contest/1706/problem/D1 : https://codeforces.com/blog/entry/105008?#comment-933980
https://codeforces.com/contest/1705/problem/A : Teaches Exchange Argument
https://codeforces.com/contest/1709/problem/C
https://codeforces.com/contest/1716/problem/C
https://codeforces.com/problemset/problem/1714/E : Got the idea but could not implement covering all the edge cases
https://codeforces.com/contest/1713/problem/D : Time: Optimizing Implementation 
https://codeforces.com/contest/1711/problem/C : Got the idea but taking a lot of time to get that
https://codeforces.com/contest/1721/problem/D
https://atcoder.jp/contests/abc266/tasks/abc266_e : https://codeforces.com/problemset/problem/453/A : https://www.youtube.com/watch?v=U_h3IjreRek
https://www.facebook.com/codingcompetitions/hacker-cup/2022/qualification-round/problems/B2
https://www.facebook.com/codingcompetitions/hacker-cup/2022/qualification-round/problems/D : https://ideone.com/bqEx8s
https://codeforces.com/contest/1722/problem/E

Solved and Learned other approaches / Took more time to solve / Got AC by luck
------------------------------------------------------------------------------
https://codeforces.com/problemset/problem/915/C
https://codeforces.com/contest/1703/problem/F : 
https://codeforces.com/problemset/problem/1692/E : binary search
https://codeforces.com/problemset/problem/1694/A : simple observation
https://codeforces.com/problemset/problem/1422/A
https://codeforces.com/problemset/problem/1369/A : https://codeforces.com/blog/entry/79235?#comment-648708 : https://www.youtube.com/watch?v=qAV5KA0kY2E
https://codeforces.com/contest/1706/problem/C
https://codeforces.com/contest/1722/problem/G : Learned easy solution

DP
--
https://www.geeksforgeeks.org/friends-pairing-problem/
https://www.geeksforgeeks.org/generate-unique-partitions-of-an-integer/ : Partition N into integer sums(Ordered and Unordered) : 91 : https://pplearn.udemy.com/course/dynamic-programming-master-course-coding-minutes/learn/lecture/30851968#overview
Learned one beautiful trick in dp on strings where we leave if we don't need a par. char : https://leetcode.com/problems/wildcard-matching/submissions/
https://www.spoj.com/problems/FIBOSUM/
https://codeforces.com/contest/1253/problem/D
https://www.hackerrank.com/challenges/stone-division/problem
https://www.hackerrank.com/challenges/tower-breakers-revisited-1/problem
https://www.spoj.com/problems/GNY07H/
- DP on graphs is enchanting 
- #145 Edit Distance with operations can be performed on any of the strings == Edit Distance with operations can be performed on any one specific string.
- #178, #179, #180, #181, #182, DP Bit masks problems Bottom Up, DP with combinatorics($90, #91, #93)
109: Memory optimization: Digit DP Udemy : https://lightoj.com/problem/investigation
https://codeforces.com/contest/1573/problem/C : failed at dp
https://codeforces.com/problemset/problem/630/H
https://codeforces.com/problemset/problem/1474/B

Math Problems Queue
-------------------
https://codeforces.com/blog/entry/79866
https://artofproblemsolving.com/wiki/index.php/Modular_arithmetic/Introduction : Exponentiation problem 1
https://artofproblemsolving.com/wiki/index.php/Modular_arithmetic/Intermediate - Problem @ End
https://artofproblemsolving.com/wiki/index.php/Simon%27s_Favorite_Factoring_Trick
https://artofproblemsolving.com/wiki/index.php/Wilson%27s_Theorem
https://artofproblemsolving.com/wiki/index.php/Chicken_McNugget_Theorem - I1 : https://artofproblemsolving.com/wiki/index.php/1994_AIME_Problems/Problem_11
https://artofproblemsolving.com/wiki/index.php/Chicken_McNugget_Theorem- I2
https://artofproblemsolving.com/wiki/index.php/2006_AMC_10B_Problems/Problem_25
https://artofproblemsolving.com/wiki/index.php/1989_AIME_Problems/Problem_9
https://artofproblemsolving.com/wiki/index.php/Fermat%27s_Little_Theorem : I2
https://artofproblemsolving.com/wiki/index.php/2006_AIME_II_Problems/Problem_3 : https://www.geeksforgeeks.org/finding-power-prime-number-p-n/
https://artofproblemsolving.com/wiki/index.php/Combinatorial_identity
https://artofproblemsolving.com/wiki/index.php/Pascal%27s_triangle
https://artofproblemsolving.com/wiki/index.php/Generating_function : Simple Exercise Problem : https://math.illinoisstate.edu/day/courses/old/305/contentgeneratingfunctions.html 
https://math.stackexchange.com/questions/4434822/generating-function-approach-giving-wrong-combination-count-while-normal-brute-f
https://artofproblemsolving.com/wiki/index.php/Casework : Last problem
https://artofproblemsolving.com/wiki/index.php/2008_AMC_12B_Problems/Problem_22
https://artofproblemsolving.com/wiki/index.php/2001_AMC_12_Problems/Problem_16
https://artofproblemsolving.com/wiki/index.php/2004_AIME_I_Problems/Problem_6
https://artofproblemsolving.com/wiki/index.php/Constructive_counting - Intermediate 
https://artofproblemsolving.com/wiki/index.php/Distinguishability
https://artofproblemsolving.com/wiki/index.php/1986_AIME_Problems/Problem_13

Articles/Blogs
--------
https://codeforces.com/blog/entry/65487?#comment-494720
https://codeforces.com/blog/entry/82417 : Learn Problem B all approaches
https://codeforces.com/blog/entry/79866
https://codeforces.com/blog/entry/46450 : Div2B reasoning and comparison is great
https://www.geeksforgeeks.org/print-all-possible-combinations-of-r-elements-in-a-given-array-of-size-n/
https://cp-algorithms.com/combinatorics/generating_combinations.html
https://www.geeksforgeeks.org/make-combinations-size-k/
https://www.geeksforgeeks.org/n-th-root-number/
https://cp-algorithms.com/combinatorics/catalan-numbers.html : https://www.youtube.com/watch?v=0pTN0qzpt-Y
https://www.geeksforgeeks.org/digital-rootrepeated-digital-sum-given-integer/
https://codeforces.com/blog/entry/95571 : https://www.youtube.com/watch?v=18sJ3mK173s
Weighted tree distance + Queries: https://www.geeksforgeeks.org/find-distance-between-two-nodes-in-the-given-binary-tree-for-q-queries/
https://www.geeksforgeeks.org/subset-sum-divisible-m/
https://discuss.codingblocks.com/t/knapsack-problem/33140/2 
https://www.geeksforgeeks.org/number-of-longest-increasing-subsequences/
https://www.geeksforgeeks.org/lowest-common-ancestor-in-a-binary-tree-set-2-using-parent-pointer/
https://www.geeksforgeeks.org/find-lca-in-binary-tree-using-rmq/
https://mathworld.wolfram.com/Multichoose.html : Multichosse is actually stars and bars
https://www.geeksforgeeks.org/program-for-nth-fibonacci-number/
https://www.geeksforgeeks.org/count-inversions-array-set-3-using-bit/
Eating Approach and Related - Constructive
https://codeforces.com/problemset/problem/1694/B : https://codeforces.com/blog/entry/103952?#comment-923675 : https://codeforces.com/blog/entry/85172

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
    
    // ------------------------------ #General  #Miscellaneous  #interesting ---------------------------------
    // Range Queries on MEX : https://stackoverflow.com/questions/41633225/please-tell-me-the-efficient-algorithm-of-range-mex-query
    
	
	// set precision for double values
	public static void setPrecision() {
 
		 // Declaring and initializing
		 // double value
		double a = 0.9;

		// Setting the precision
		// to 20 places
		System.out.println(
		  String.format("%.20f", a));

		double b = 1;

		// Setting the precision
		// to 5 places
		System.out.println(
		  String.format("%.5f", b));
    }
	
    // Number of distinct values of bitwise OR of all subarrays
    // i;e; distinct OR values for all 1<=l<=r<=n https://codeforces.com/problemset/problem/243/A
    static int distinctOROfAllSubarrays(int a[]){
	    int pre[]=new int[20];
	    int pos[]=new int[20];
	    boolean in[]=new boolean[1<<20];
	    int cnt=0;
	    for(int i=1;i<=n;i++){
	      for(int j=19;j>=0;j--) if((a[i]&(1<<j))>0) pre[j]=i;
	      int val=a[i];
	      if(!in[val]) cnt++;
	      in[val]=true;
	      for(int j=0;j<=19;j++) pos[j]=pre[j];
	      Arrays.sort(pos);
	      for(int j=19;j>=0;j--){
		val|=a[pos[j]];
		if(!in[val]) cnt++;
		in[val]=true;
	      }
	    }
	    return cnt;
    }
    
    // accurate floor if a or b is negative
    // or Taking Math.floor((double)a/b) works
    long accurateFloor(long a, long b) {
	long val = a / b;
	while (val * b > a)
		val--;
	return val;
     }
	
    // Awesome implementation => https://codeforces.com/contest/1310/problem/A
	
   // pair datastructure 
    // equals and hashCode should be overriden when you want to 
    // use something like hashmap or hashset
    // to compare them
    // Make use of Intellij IDE to generate equals and hashcode
    // #Pair class
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
	
	// find two max values of an array (max1>=max2)
	// consider all the array values are non=negative integers
	// learned this trick/impl from apaarkamal in dp123 course
	void findTwoMaxValues(int a[]){
		int n=a.length;
		int max1=0, max2=0;
		for(int i=0;i<n;i++){
			if(a[i]>max1){
				max2=max1;
				max1=a[i];
			}else if(a[i]>max2){
				max2=a[i];
			}
		}
		System.out.println(max1+" "+max2);
	}

	// ----------------------- #TWO POINTER -------------------------------
	// general template for two pointer which 
	// would give AC by handling edge cases most
	// of the time
	int r=-1, si=0, ei=-1;
    int cost=0, ans=0;
    for(int l=0;l<n;l++){
      while(r<n-1 && ...){
        
      }
    }
	
	
	
   // ----------------------- #SORTING -------------------------------

   // Optimization O(nlogn) to O(n) for Problem B: https://codeforces.com/blog/entry/102013
	
	// sorting template of normal array []
    static void templateSortArray(int a[]) {
	    int n=a.length;
        List < Integer > l = new ArrayList < > ();
        for (int i = 0; i < n; i++) l.add(a[i]);
        Collections.sort(l, Collections.reverseOrder());
        for (int i = 0; i < n; i++) a[i] = l.get(i);
    }

	// Shuffle and sort
    static void shuffle(int[] a) {
	Random get = new Random();
	for (int i = 0; i < a.length; i++) {
		int r = get.nextInt(a.length);
		int temp = a[i];
		a[i] = a[r];
		a[r] = temp;
	}
	Arrays.sort(a);
     }
 

    // counting sort 
    static void countSort(int arr[], int mx) {

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
	
    // ----------------------------------#Geometry----------------------------------
	//https://codeforces.com/problemset/problem/1486/B : Wonderful Geometry pbm based on manhattan distances
	
	
	
	
	
	// ax^2+bx+c=0 , a!=0
	// source: https://vlecomte.github.io/cp-geo.pdf Page: 22
	static void quadraticRoots(double a, double b, double c){
		double disc = b*b - 4*a*c;
		if(disc == 0){
			double sum = (b >= 0) ? -b-Math.sqrt(disc) : -b+Math.sqrt(disc);
			double root1 = sum/2*a;
		}else if(disc > 0){
			double sum = (b >= 0) ? -b-Math.sqrt(disc) : -b+Math.sqrt(disc);
			double r1 = sum/2*a;
			double r2 = 2*c/sum;
		}else return;
	}
	
	static class Point implements Comparable<Point>{
		static final double EPS = (double) 1e-9;
		double x, y;
		Point(double a, double b) { x = a; y = b; }  
		public int compareTo(Point p)
		{
			if(Math.abs(x - p.x) > EPS) return x > p.x ? 1 : -1;
			if(Math.abs(y - p.y) > EPS) return y > p.y ? 1 : -1;
			return 0;
		}
		public boolean isEqual(Point b) return x==b.x && y==b.y;
		public double square() return x*x+y*y;
		public double abs() return Math.sqrt(square());
		Point translate(Vector v) { return new Point(x + v.x , y + v.y); }
		Point scale(Vector v) { return new Point(x * v.x , y * v.y); }
		// (x+iy) * (cosp + i sinp)
		Point rotate(double angle)
		{
			double c = Math.cos(angle), s = Math.sin(angle);
			return new Point(x * c - y * s, x * s + y * c);
		}
		// if the point p lies on vector ab
		boolean onLine(Point a, Point b) 
		{
			if(a.compareTo(b) == 0) return compareTo(a) == 0;
			Vector ab=new Vector(a, b);
			Vector ap=new Vector(a, this);
			return Math.abs(ab.cross(ap)) < EPS;
		}
		
		// if the point p lies inside ab and ac vector plane
		boolean insideABC(Point a, Point b, Point c) 
		{
			
			Vector ab=new Vector(a, b);
			Vector ac=new Vector(a, c);
			double crossProd = ab.cross(ac);
			if(crossProd < 0){
				Point temp = b;
				b=c;
				c=temp;
			}
			Vector ap=new Vector(a, this);
			double crossProdAB = ab.cross(ap);
			double crossProdAC = ac.cross(ap);
			return crossProdAB>=0 && crossProdAC<=0;
		}
		
		double angle(Point a, Point o, Point b)  // angle AOB
		{
			Vector oa = new Vector(o, a), ob = new Vector(o, b);
			return Math.acos(oa.dot(ob) / Math.sqrt(oa.norm2() * ob.norm2()));
		}
		
		double cross(Point a, Point b, Point c){
			Vector ab=new Vector(a, b);
			Vector ac=new Vector(a, c);
			return ab.cross(ac);
		}
		
		boolean isConvex(List<Point> p){
			boolean hasPos=false, hasNeg=false;
			for(int i=0;i<p.size();i++){
				double o = cross(p.get(i), p.get((i+1)%n), p.get((i+2)%n));
				if(o > 0) hasPos=true;
				if(o < 0) hasNeg=true;
			}
			return !(hasPos && hasNeg);
		}
	}
	
	static class Vector {
		double x, y; 

		Vector(double a, double b) { x = a; y = b; }

		Vector(Point a, Point b) { this(b.x - a.x, b.y - a.y); }
		
		Vector scale(double s) { return new Vector(x * s, y * s); }              //s is a non-negative value

		double dot(Vector v) { return (x * v.x + y * v.y); }

		double cross(Vector v) { return x * v.y - y * v.x; }
		
		double dot2(Vector v) {return conjugate(this).multiply(v).x;}
		
		double cross2(Vector v) {return conjugate(this).multiply(v).y;}
		
		Vector conjugate() { return new Vector(this.x, -this.y);}
		
		// Vector multiply(Vector v){ return new Vector();}
		
		double norm2() { return x * x + y * y; }
		
		// [0, PI]
		// ABC
		double angle(Vector v){
			double cosTheta = dot(v) / norm2() / v.norm2();
			return Math.acos(Math.max(-1.0, Math.min(1.0, cosTheta)));
		}
		
		// BAC
		double orientedAngle(Vector v){
			double crossProd = cross(v);
			if(crossProd >= 0){
				return angle(v);
			}
			return 2*Math.PI-angle(v);
		}
		
		Vector normalize() 
		{ 
			double d = Math.sqrt(norm2());
			return scale(1 / d);
		}
		
		double abs(){
			return Math.sqrt(norm2());
		}
		
	}
	
	static class Line{
		// EPS can be determined from the problem
		// stating to pring upto x decimal places
		static final double INF = 1e9, EPS = 1e-9;
		double a, b, c;
		
		// Vector v(b, -a) is parallel to the line represented
		// as two points p and q. pq vector is equal v vector
		Line(Point p, Point q)
		{
			if(Math.abs(p.x - q.x) < EPS) {	a = 1; b = 0; c = -p.x;	}
			else
			{
				a = (p.y - q.y) / (q.x - p.x);
				b = 1.0;
				c = -(a * p.x + p.y);
			}

		}
		Line(Point p, double m) { a = -m; b = 1; c =  -(a * p.x + p.y); } 
		boolean parallel(Line l) { return Math.abs(a - l.a) < EPS && Math.abs(b - l.b) < EPS; }
		boolean same(Line l) { return parallel(l) && Math.abs(c - l.c) < EPS; }
		
		// Point p on the side of line v(b, -a)
		// 0 if p is on v
		// <0 if p is on right of v
		// >0 if p is on left of v
		double side(Point p){
			Vector v=new Vector(b, -a);
			return v.cross(new Vector(p.x, p.y))-c;
		}
		double dist(Point p){
			return Math.abs(side(p)/p.abs());
		}
		/*
			The squared distance can be useful to check if a point is within a certain
			integer distance of a line, because when using integers the result is exact if
			it is an integer.
			double sqDist(pt p) {return side(p)*side(p) / (double)sq(v);}
		*/
		
	}
 
   // a is sorted non-decreasing manner : https://codeforces.com/problemset/problem/766/B
   static String findNonDegnerateSidesOfTriangle(long a[]){
   	for(int i=1;i<n-1;i++) if(a[i-1]+a[i]>a[i+1]) return "YES\n";
    	return "NO\n";
   }
	
   // set precision
   static String setPrecision(double val){
   	return String.format("%.20f", val);
   }
	
   
	
    // ---------------------------------- #DP --------------------------------

	// Matrix Exponentation -> nth Fibonocci number where n<=1e18
	static class Matrix{
    int m[][];
    int sz;
    Matrix(int sz){
      this.sz=sz;
      m=new int[sz][sz];
    }
    void identity(){
      for(int i=0;i<sz;i++){
        m[i][i]=1;
      }
    }
    void multiply(Matrix a){
      Matrix res=new Matrix(a.sz);
      for(int i=0;i<sz;i++){
        for(int j=0;j<sz;j++){
          for(int k=0;k<sz;k++){
            res.m[i][j]+=m[i][k]*a.m[k][j];
            res.m[i][j]%=mod;
          }
        }
      }
    }
  }

  int Fib(int n){
    int sz=2;
    Matrix res=new Matrix(sz);
    res.identity();
    Matrix T=new Matrix(sz);
    T.m[0][0]=1;
    T.m[0][1]=1;
    T.m[1][0]=1;
    if(n==1) return 0;
    if(n==2) return 1;
    n-=2;
    while(n>0){
      if(n%2==1) res=res.multiply(T);
      T=T.multiply(T);
      n=n >> 1l;
    }
    return (res.m[0][0]+res.m[0][1])%mod;
  }
	
    /* Maximum size square sub-matrix with all 1s -> https://www.geeksforgeeks.org/maximum-size-sub-matrix-with-all-1s-in-a-binary-matrix/
       https://www.geeksforgeeks.org/number-of-submatrices-with-all-1s/
       Amazing variation of this: https://codeforces.com/problemset/problem/375/B

       DP Tree Traversal/Path Questions
       https://codeforces.com/problemset/problem/1340/B



    */
    // Longest palindrome subsequence with O(n) space -> https://www.geeksforgeeks.org/longest-palindrome-subsequence-space/
    public int longestPalindromicSubsequenceLinearSpace(char []s){
        int n=s.length;
        int a[]=new int[n];
        int pa[]=new int[n];
        
        for(int i=n-1;i>=0;i--){
            for(int j=i;j<n;j++){
                if(i==j) a[j]=1;
                else if(s[i]==s[j]){
                    // l[i+1][j-1]+2 => prev iter
                    a[j]=pa[j-1]+2;
                }else{
                    a[j]=Math.max(a[j-1], a[j]);
                }
            }
            for(int j=i;j<n;j++) pa[j]=a[j];
        }
        return a[n-1];
    }

    // Subset sum problem O(sum) - GFG
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

	// generating all possible sums by taking elements
    // in 0/1 fashion from 2 array a and b
    public void generateSum01Dp(int a[], int b[]){
	dp[0][0]=1;
    	for(int i=1; i<=n; i++)
        {
            for(int j=0; j<=10000; j++)
            {
                if(dp[i-1][j] == 0)continue;
                if(j + a[i]<=10000)
                {
                    dp[i][j + a[i]] = 1;
                }
                if(j + b[i]<=10000)
                {
                    dp[i][j + b[i]] = 1;
                }                
            }
        }
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
  static int upperBoundIndex(int a[], int len, int i){
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
  static void findLIS(int a[]){
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
	
	// https://codeforces.com/contest/166/problem/E
	static void numberOfWaysInTetrahedron(){
	    int n = Integer.parseInt(bf.readLine());
	    long dp[][]=new long[2][n+1];
	    dp[1][0] = 1;
	    for (int i = 1; i <10000002; i++) {
	      dp[1][i] = (int)((3L * dp[0][i - 1]) % mod);
	      dp[0][i] = (int)((2L * dp[0][i - 1] + dp[1][i - 1]) % mod);
	    }
	    System.out.println(dp[1][n]);
	}
    
	// Digit DP template
	static void ddp(String ans, int index, boolean last) {
        if (index == s.length()) {
            System.out.println(ans);
            return;
        }

        int till = (last ? (s.charAt(index) - '0') : 9);

        for (int i = 0; i <= till; i++) {
            ddp(ans + i, index + 1, (last && (i == till)) );
        }
    }
	
	
    // ----------------------------------- #BITWISE ---------------------------
    // sum of xor of all subsequences - https://www.geeksforgeeks.org/sum-xor-possible-subsets/ - Realted problem: https://codeforces.com/problemset/problem/1614/C
    // #submask generation
    // If you want 0 as a submask
    for(int submask = mask; ; submask = (submask - 1) & mask) {
	// do something
	if(submask == 0) break;
    }
	
    // Number of pairs in an array having bitwise AND as zero : https://codeforces.com/blog/entry/20174?#comment-249715
    // https://www.geeksforgeeks.org/number-ordered-pairs-ai-aj-0/ 
    // https://discuss.codechef.com/t/count-all-ordered-pairs-with-bitwise-and-equals-to-zero/36081/4
    // SOS DP https://codeforces.com/blog/entry/45223
    static void countPairs(){
    	
    }
	    
    // ------------------------------- #STRINGS ------------------------------
    // string hashing - Polynomial Rolling Hash
    // https://ideone.com/0sgZWx
    // https://www.youtube.com/watch?v=X_YgMWvCRS8&list=PL2q4fbVm1Ik6ThrYKCzgEpmaS_XWDGHjx&index=6
     public void rollHash(char []s){
        // prefix sum
        int n=s.length;
        rh=new long[n];
        inv=new long[n];
        
        // prime>=size of character set
        long p=2;
        long pw=1;
        rh[n-1]=(s[n-1]-'0')%mod;
        inv[n-1]=1;
        for(int i=n-2;i>=0;i--){
            pw=(pw * p)%mod;
            rh[i]=mod_add(rh[i+1], (s[i]-'0') * pw);
            inv[i]=pow(pw, mod-2);
        }
     }

     // KMP - GFG
     // LPS -> Number of characters from which you can match
     void KMPSearch(String pat, String txt)
    {
        int M = pat.length();
        int N = txt.length();
  
        int lps[] = new int[M];
        int j = 0; 

        computeLPSArray(pat, M, lps);
  
        int i = 0; 
        while (i < N) {
            if (pat.charAt(j) == txt.charAt(i)) {
                j++;
                i++;
            }
            if (j == M) {
                System.out.println("Found pattern "
                                   + "at index " + (i - j));
                j = lps[j - 1];
            }
  
            else if (i < N && pat.charAt(j) != txt.charAt(i)) {
                if (j != 0)
                    j = lps[j - 1];
                else
                    i = i + 1;
            }
        }
    }
  
    // computes LPS array
    void computeLPSArray(String pat, int M, int lps[])
    {
        int len = 0;
        int i = 1;
        lps[0] = 0;
	    
        while (i < M) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            }
            else 
            {
                if (len != 0) {
                    len = lps[len - 1];

                }
                else 
                {
                    lps[i] = len;
                    i++;
                }
            }
        }
    }
	
   // calculate nCr
   long[][] comb = new long[MAXN][MAXN];
    comb[0][0] = 1;
    for (int i = 1; i < MAXN; i++) {
      comb[i][0] = 1;
      for (int j = 1; j <= i; j++) {
        comb[i][j] = (comb[i-1][j] + comb[i-1][j-1]) % mod;
      }
    }

    // --------------------------- #PERMUTATIONS AND #COMBINATIONS ------------------------------
    /*
	Stars and Bars
	https://leetcode.com/problems/number-of-sets-of-k-non-overlapping-line-segments/
	https://progvar.fun/problemsets/stars-and-bars
    */
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
	
	// Get to see a lot like this for DP+Comb
	int sum = 0;
	int[] dp = new int[n + 1];

	for (int i = 1; i <= n; i++) {
		dp[i] = sum + 1;
		sum += dp[i];
	}

	
    // Number of ways to partition number n into sum of positive integers
    // Order matter: https://github.com/apaarkamal/Dynammic-Programming-Coding-Minutes/blob/main/Java%20Codes/CountOrdered.java 
    // Order does not matter: See 94: https://github.com/apaarkamal/Dynammic-Programming-Coding-Minutes/blob/main/Java%20Codes/CountUnordered.java

    // ------------------------- #NUMBER THEORY ------------------------ 
	
	// https://codeforces.com/blog/entry/48417#comment-931507 -> 3.Maximal possible subarray for any possible gcd value in an array
	
    // gray code
    int g (int n) {
        return n ^ (n >>> 1);
    }
    // https://www.youtube.com/watch?v=8Fqv4ddMC3I
    // #Extended Euclidean Algorithm
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

    // #Linear Diophantine
    static String findLinearDiophantineSol(long a, long b, long c) {
	    if(a==0 && b==0){
	       if(c==0) return "YES\n";
	       return "NO\n";
	    }
	    long ar[] = new long[3];
	    extendedGcd(a, b, ar);
	    long x0 = ar[0];
	    long y0 = ar[1];
	    long g = ar[2];
	    if (c % g != 0) return "NO\n";
	    x0 *= c / g;
	    y0 *= c / g;
	    if(y0<0) return "NO\n";
	    if(x0<0){
	      long l=0, r=(long)1e9;
	      long ans=-1;
	      while(l<=r){
			long k=l+(r-l)/2;
			long x=x0+k*b;
			if(x>=0){
			  ans=k;
			  r=k-1;
			}else l=k+1;
		  }
		  if(ans==-1 || y0-ans*a<0) return "NO\n";
		}
	    return "YES\n";

	    // All solutions
	    // x=x0+k*(b/g)
	    // y=y0-k*(a/g)
  }

    // #Chinese Remainder Theorem
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
	
    // #Euler Totient
    static int phi(int n)
    {
	 int result = n;
	 for (int p = 2; p * p <= n; ++p)
	  {
		if (n % p == 0)
		{
		    while (n % p == 0)
			n /= p;
		    result -= result / p;
		}
	  }
	  if (n > 1)
	     result -= result / n;
	  return result;
    }

    // non prime b;
    static long invmod(long a, long b) {
        long ar[] = new long[3];
        extendedGcd(a, b, ar);
        return ar[0];
    }
    
    // a raise to power of b
    // fast exponentiation
    static long pow(long a, long b) {
    long res = 1;
    while (b > 0) {
        if (b % 2 == 1) res = (res * a)%mod;
        a = (a * a)%mod;
        b = b >> 1l;
    }
    return res;
  }
	
	// (a*b)%mod where 1<=a,b,mod<=1e18
    // fast multiplication / Russian Peasant Multiplication / Binary Multiplication
	// Reference: Apaarkamal, codeforces
  static long fastMultiplication(long a, long b) {
    long res = 0;
    while (b > 0) {
        if (b % 2 == 1) res = (res + a)%mod;
        a = (a + a)%mod;
        b = b >> 1l;
    }
    return res;
  }
    
    // ncr
    static long combination(int a, int b) {
        long val1 = fact[a];
        long val2 = ifact[a - b];
        long val3 = ifact[b];
        return (((val1 * val2) % mod) * val3) % mod;
    }

    // factorial and inverse factorial under modulo
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

    // -------------------------------  #BINARY SEARCH -------------------------
    /*
	Binary Search on Real Numbers -> https://codeforces.com/blog/entry/63085
	https://codeforces.com/blog/entry/73888
	https://codeforces.com/blog/entry/45281#:~:text=Precision%20error%20problems%20%2D%20Codeforces
	
	nth root of a number - https://www.geeksforgeeks.org/n-th-root-number/  
	https://www.geeksforgeeks.org/calculating-n-th-real-root-using-binary-search/   
	CF prob:https://codeforces.com/problemset/problem/30/A
	
	
    */
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

    // ----------------------------- #GRAPHS #TREES-------------------------
    // Bi Partite graph: https://www.geeksforgeeks.org/bipartite-graph/
	
	// undirected graph
	boolean cycle = false
	static void printBackEdges(int u, int p){
		vis[u]=true;
		for(int v:l.get(u)){
		  if(!vis[v]){
			dfs(v, u);
		  }else if(v!=p){
			cycle=true;
			System.out.println(u+" "+v);
		  }
		}
    }
	
	 // detect cycle in an undirected/directed graph using color
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
	
    // count number of times each edge is counted in all simple paths
    static long dfs(int u, int p){
	    long ans=1;
	    for(int v:l.get(u)){
	      if(v!=p){
			long num=dfs(v, u);
			cost.add(num * (n-num));
			ans+=num;
		  }
	    }
	    return ans;
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

    class Node
	{
		int data;
		Node left, right;

		Node(int item)
		{
			data = item;
			left = right = null;
		}
	}
  
	
	// LCA on Binary Tree and Binary Search Tree
	class BinarySearchTree
	{
		Node root;

		/* Function to find LCA of n1 and n2. The function assumes that both
		   n1 and n2 are present in BST */
		Node lcaInBSTRecursive(Node node, int n1, int n2)
		{
			if (node == null)
				return null;

			// If both n1 and n2 are smaller than root, then LCA lies in left
			if (node.data > n1 && node.data > n2)
				return lca(node.left, n1, n2);

			// If both n1 and n2 are greater than root, then LCA lies in right
			if (node.data < n1 && node.data < n2)
				return lca(node.right, n1, n2);

			return node;
		}
		
		static Node lcaInBSTIterative(Node root, int n1, int n2)
		{
			while (root != null)
			{
				// If both n1 and n2 are smaller
				// than root, then LCA lies in left
				if (root.data > n1 &&
					root.data > n2)
				root = root.left;

				// If both n1 and n2 are greater
				// than root, then LCA lies in right
				else if (root.data < n1 &&
						 root.data < n2)
				root = root.right;

				else break;
			}
			return root;
		}
	}
	
	Node findLCAUtilBT(Node node, int n1, int n2)
    {
        // Base case
        if (node == null)
            return null;
         
        //Store result in temp, in case of key match so that we can search for other key also.
        Node temp=null;
 
        // If either n1 or n2 matches with root's key, report the presence
        // by setting v1 or v2 as true and return root (Note that if a key
        // is ancestor of other, then the ancestor key becomes LCA)
        if (node.data == n1)
        {
            v1 = true;
            temp = node;
        }
        if (node.data == n2)
        {
            v2 = true;
            temp = node;
        }
 
        // Look for keys in left and right subtrees
        Node left_lca = findLCAUtil(node.left, n1, n2);
        Node right_lca = findLCAUtil(node.right, n1, n2);
 
        if (temp != null)
            return temp;
 
        // If both of the above calls return Non-NULL, then one key
        // is present in once subtree and other is present in other,
        // So this node is the LCA
        if (left_lca != null && right_lca != null)
            return node;
 
        // Otherwise check if left subtree or right subtree is LCA
        return (left_lca != null) ? left_lca : right_lca;
    }
 
    // Finds lca of n1 and n2 under the subtree rooted with 'node'
    Node findLCABT(int n1, int n2)
    {
        // Initialize n1 and n2 as not visited
        v1 = false;
        v2 = false;
 
        // Find lca of n1 and n2 using the technique discussed above
        Node lca = findLCAUtil(root, n1, n2);
 
        // Return LCA only if both n1 and n2 are present in tree
        if (v1 && v2)
            return lca;
 
        // Else return NULL
        return null;
    }
	
	// #BINARY LIFTING
	// #LCA
	// Pre-processing to calculate values of memo[][]
    static void dfs(int u, int p)
    {
 
        // Using recursion formula to calculate
        // the values of memo[][]
        memo[u][0] = p;
        for (int i = 1; i <= log; i++)
            memo[u][i] = memo[memo[u][i - 1]][i - 1];
        for (int v : g[u]) {
            if (v != p) {
 
                // Calculating the level of each node
                lev[v] = lev[u] + 1;
                dfs(v, u);
            }
        }
    }
	
	// Function to return the LCA of nodes u and v
    static int lca(int u, int v)
    {
        // The node which is present farthest
        // from the root node is taken as u
        // If v is farther from root node
        // then swap the two
        if (lev[u] < lev[v]) {
            int temp = u;
            u = v;
            v = temp;
        }
 
        // Finding the ancestor of u
        // which is at same level as v
        for (int i = log; i >= 0; i--) {
            if ((lev[u] - (int)Math.pow(2, i)) >= lev[v])
                u = memo[u][i];
        }
 
        // If v is the ancestor of u
        // then v is the LCA of u and v
        if (u == v)
            return u;
 
        // Finding the node closest to the root which is
        // not the common ancestor of u and v i.e. a node
        // x such that x is not the common ancestor of u
        // and v but memo[x][0] is
        for (int i = log; i >= 0; i--) {
            if (memo[u][i] != memo[v][i]) {
                u = memo[u][i];
                v = memo[v][i];
            }
        }
 
        // Returning the first ancestor
        // of above found node
        return memo[u][0];
    }
	
	// #Prims Algo
	class NodeCost {

		int node; // Adjacent node
		int cost; // Costance/cost to adjacent node

		NodeCost (int node, int cost) {
			this.node = node;
			this.cost = cost;
		}
	}

	int Find_MST(int source_node, List<List<NodeCost>> graph) {

		// Comparator lambda function that enables the priority queue to store the nodes
		// based on the cost in the ascending order.
		Comparator<NodeCost> NodeCostComparator = (obj1, obj2) -> {
			return obj1.cost - obj2.cost;
		};

		// Priority queue stores the object node-cost into the queue with 
		// the smallest cost node at the top.
		PriorityQueue<NodeCost> pq = new PriorityQueue<>(NodeCostComparator);

		// The cost of the source node to itself is 0
		pq.add(new NodeCost(source_node, 0));

		boolean added[] = new boolean[graph.size()];
		Arrays.fill(added, false);

		int mst_cost = 0;

		while (!pq.isEmpty()) {

			// Select the item <node, cost> with minimum cost
			NodeCost item = pq.peek();
			pq.remove();

			int node = item.node;
			int cost = item.cost;

			// If the node is node not yet added to the minimum spanning tree, add it and increment the cost.
			if ( !added[node] ) {
				mst_cost += cost;
				added[node] = true;

				// Iterate through all the nodes adjacent to the node taken out of priority queue.
				// Push only those nodes (node, cost) that are not yet present in the minumum spanning tree.
				for (NodeCost pair_node_cost : graph.get(node)) {
					int adj_node = pair_node_cost.node;
					if (added[adj_node] == false) {
						pq.add(pair_node_cost);
					}
				}
			}
		}
		return mst_cost;
	}
	
	// #Kruskals
	class Node 
	{
		private int u;
		private int v;
		private int weight;

		Node(int _u, int _v, int _w) { u = _u; v = _v; weight = _w; }

		Node() {}

		int getV() { return v; }
		int getU() { return u; }
		int getWeight() { return weight; }

	}

	class SortComparator implements Comparator<Node> {
		@Override
		public int compare(Node node1, Node node2) 
		{ 
			if (node1.getWeight() < node2.getWeight()) 
				return -1; 
			if (node1.getWeight() > node2.getWeight()) 
				return 1; 
			return 0; 


		} 
	} 

	class Main
	{
		private int findPar(int u, int parent[]) {
			if(u==parent[u]) return u;
			return parent[u] = findPar(parent[u], parent); 
		}
		private void union(int u, int v, int parent[], int rank[]) {
			u = findPar(u, parent); 
			v = findPar(v, parent);
			if(rank[u] < rank[v]) {
				parent[u] = v;
			}
			else if(rank[v] < rank[u]) {
				parent[v] = u; 
			}
			else {
				parent[v] = u;
				rank[u]++; 
			}
		}
		void KruskalAlgo(ArrayList<Node> adj, int N)
		{
			Collections.sort(adj, new SortComparator());
			int parent[] = new int[N]; 
			int rank[] = new int[N];

			for(int i = 0;i<N;i++) {
				parent[i] = i; 
				rank[i] = 0; 
			}

			int costMst = 0;
			ArrayList<Node> mst = new ArrayList<Node>();
			for(Node it: adj) {
				if(findPar(it.getU(), parent) != findPar(it.getV(), parent)) {
					costMst += it.getWeight(); 
					mst.add(it); 
					union(it.getU(), it.getV(), parent, rank); 
				}
			} 
			System.out.println(costMst);
			for(Node it: mst) {
				System.out.println(it.getU() + " - " +it.getV()); 
			}
		}
	}
	
	// #Dijkshtra's
	
	
	
    // ------------------------- #ADVANCED DATA STRUCTURES ------------------------
    // #BIT
    // Using 2 BIT structures => https://codeforces.com/contest/1311/problem/F
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
 
  static int queryMin(int l, int r){
      int len=r-l+1;
      int p=(int)(Math.log(len)/Math.log(2));
      int k=(int)Math.pow(2, p);
      return Math.min(smn[l][p], smn[r-k+1][p]);
  }

  static int queryMax(int l, int r){
      int len=r-l+1;
      int p=(int)(Math.log(len)/Math.log(2));
      int k=(int)Math.pow(2, p);
      return Math.max(smx[l][p], smx[r-k+1][p]);
  }
  
  // Sparse Sum
  static void build(){
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
  
  // maximum element in given submatrix queries using Sparse Matrix
  // Source: StackOverflow
  static long M[][][][];
  static long matrix[][];
 
	static void precompute_max(){
	    for (int i = 0 ; (1<<i) <= n; i += 1){
		for(int j = 0 ; (1<<j) <= m ; j += 1){
		    for (int x = 0 ; x + (1<<i) -1 < n; x+= 1){
			for (int y = 0 ;  y + (1<<j) -1 < m; y+= 1){
			    if (i == 0 && j == 0)
				M[x][y][i][j] = matrix[x][y]; // store x, y
			    else if (i == 0)
				M[x][y][i][j] = Math.max(M[x][y][i][j-1], M[x][y+(1<<(j-1))][i][j-1]);
			    else if (j == 0)
				M[x][y][i][j] = Math.max(M[x][y][i-1][j], M[x+ (1<<(i-1))][y][i-1][j]);
			    else 
				M[x][y][i][j] = Math.max(M[x][y][i-1][j-1], Math.max(M[x + (1<<(i-1))][y][i-1][j-1], Math.max(M[x][y+(1<<(j-1))][i-1][j-1], M[x + (1<<(i-1))][y+(1<<(j-1))][i-1][j-1])));
			    // cout << "from i="<<x<<" j="<<y<<" of length="<<(1<<i)<<" and length="<<(1<<j) <<"max is: " << M[x][y][i][j] << endl;
			}
		    }
		}
	    }
	}

	// x,y are top left and x1, y1 are bottom right corners of a matrix
	static long compute_max(int x, int y, int x1, int y1){
	    int k = (int)(Math.log(x1 - x + 1)/Math.log(2));
	    int l = (int)(Math.log(y1 - y + 1)/Math.log(2));
	    // cout << "Value of k="<<k<<" l="<<l<<endl;
	    long ans = Math.max(M[x][y][k][l], Math.max(M[x1 - (1<<k) + 1][y][k][l], Math.max(M[x][y1 - (1<<l) + 1][k][l], M[x1 - (1<<k) + 1][y1 - (1<<l) + 1][k][l])));
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
	
  static void updateMax(int ss, int se, int si, int idx, int val){
	if(ss==se){
		a[idx]=val;
		smx[si]=val;
	}else{
		int mid=ss+(se-ss)/2;
		if(idx>=ss && mid>=idx) updateMax(ss, mid, 2*si+1, idx, val);
		else updateMax(mid+1, se, 2*si+2, idx, val);
		smx[si]=Math.max(smx[2*si+1], smx[2*si+2]);
	}
  }
	
  static void updateMin(int ss, int se, int si, int idx, int val){
	if(ss==se){
		a[idx]=val;
		smn[si]=val;
	}else{
		int mid=ss+(se-ss)/2;
		if(idx>=ss && mid>=idx) updateMin(ss, mid, 2*si+1, idx, val);
		else updateMin(mid+1, se, 2*si+2, idx, val);
		smn[si]=Math.max(smn[2*si+1], smn[2*si+2]);
	}
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
  
  // #MERGE SORT TREE
  static List<Long> tree[];
  static int sz=0;

  /*
  Given an array of N elements and you have to answer Q queries of the form L R K , To Count the numbers smaller than K in range L to R.
  Reference: https://discuss.codechef.com/t/merge-sort-tree-tutorial/14277
  */

  static long lowerBound(List<Long> l, long k){
    long idx=-1;
    int le=0, ri=l.size()-1;
    while(le<=ri){
      int mid=le+(ri-le)/2;
      if(l.get(mid)<k){
        le=mid+1;
        idx=mid;
      }else ri=mid-1;
    }
    return idx==-1?0:idx+1;
  }

  static long query( int cur, int l, int r, int x, int y, long k)
  {
         if( r < x || l > y )
        {
                 return 0; //out of range
        }
        if( x<=l && r<=y )
        {
                //Binary search over the current sorted vector to find elements smaller than K

                return lowerBound(tree[cur], k);
        }
        int mid=l+(r-l)/2;
       return query(2*cur+1,l,mid,x,y,k)+query(2*cur+2,mid+1,r,x,y,k);
  }

  static void merge(List<Long> res, List<Long> a, List<Long> b){
    int n1=a.size();
    int n2=b.size();
    int i=0, j=0;
    while(i<n1 && j<n2){
      if(a.get(i)<=b.get(j)){
        res.add(a.get(i));
        i++;
      }else{
        res.add(b.get(j));
        j++;
      }
    }
    while(i<n1){
      res.add(a.get(i));
      i++;
    }
    while(j<n2){
      res.add(b.get(j));
      j++;
    }
  }

  static void build( int cur , int l , int r )
  {
       if(l==r)
       {
          if(tree[cur]==null) tree[cur]=new ArrayList<>();
          tree[cur].add(w[l]);
          return ;
       }
       int mid = l+(r-l)/2;
       build(2*cur+1 , l , mid ); // Build left tree 
       build(2*cur+2 , mid+1 , r ); // Build right tree
       tree[cur] = new ArrayList<Long>();
       merge(tree[cur], tree[2*cur+1] , tree[2*cur+2] ); //Merging the two sorted arrays
  }
  
	
	// #Segment Tree Lazy Propagation/Range Updates 
	// Reference: GFG and CodeNCode
	class LazySegmentTree
{
    final int MAX = 1000;     // Max tree size
    int tree[] = new int[MAX]; // To store segment tree
    int lazy[] = new int[MAX]; // To store pending updates
  
    void updateRangeUtil(int si, int ss, int se, int us,
                        int ue, int diff)
    {
      
        if (lazy[si] != 0)
        {
         
            tree[si] += (se - ss + 1) * lazy[si];
  
          
            if (ss != se)
            {
               
                lazy[si * 2 + 1] += lazy[si];
                lazy[si * 2 + 2] += lazy[si];
            }
  
           
            lazy[si] = 0;
        }
  
        // out of range
        if (ss > se || ss > ue || se < us)
            return;
  
        // Current segment is fully in range
        if (ss >= us && se <= ue)
        {
            // Add the difference to current node
            tree[si] += (se - ss + 1) * diff;
  
            // same logic for checking leaf node or not
            if (ss != se)
            {
               
                lazy[si * 2 + 1] += diff;
                lazy[si * 2 + 2] += diff;
            }
            return;
        }
  
        // If not completely in rang, but overlaps, recur for
        // children,
        int mid = (ss + se) / 2;
        updateRangeUtil(si * 2 + 1, ss, mid, us, ue, diff);
        updateRangeUtil(si * 2 + 2, mid + 1, se, us, ue, diff);
  
        // And use the result of children calls to update this
        // node
        tree[si] = tree[si * 2 + 1] + tree[si * 2 + 2];
    }
  
   
    void updateRange(int n, int us, int ue, int diff) {
        updateRangeUtil(0, 0, n - 1, us, ue, diff);
    }
  
    int getSumUtil(int ss, int se, int qs, int qe, int si)
    {
     
        if (lazy[si] != 0)
        {
            
            tree[si] += (se - ss + 1) * lazy[si];
  
            // checking if it is not leaf node because if
            // it is leaf node then we cannot go further
            if (ss != se)
            {
                // Since we are not yet updating children os si,
                // we need to set lazy values for the children
                lazy[si * 2 + 1] += lazy[si];
                lazy[si * 2 + 2] += lazy[si];
            }
  
            // unset the lazy value for current node as it has
            // been updated
            lazy[si] = 0;
        }
  
        // Out of range
        if (ss > se || ss > qe || se < qs)
            return 0;
  
      
        if (ss >= qs && se <= qe)
            return tree[si];
  
        // If a part of this segment overlaps with the given
        // range
        int mid = (ss + se) / 2;
        return getSumUtil(ss, mid, qs, qe, 2 * si + 1) +
            getSumUtil(mid + 1, se, qs, qe, 2 * si + 2);
    }
  
    
    int getSum(int n, int qs, int qe)
    {
        // Check for erroneous input values
        if (qs < 0 || qe > n - 1 || qs > qe)
        {
            System.out.println("Invalid Input");
            return -1;
        }
  
        return getSumUtil(0, n - 1, qs, qe, 0);
    }
  
   
    void constructSTUtil(int arr[], int ss, int se, int si)
    {
        // out of range as ss can never be greater than se
        if (ss > se)
            return;
  
        /* If there is one element in array, store it in
        current node of segment tree and return */
        if (ss == se)
        {
            tree[si] = arr[ss];
            return;
        }
  
       
        int mid = (ss + se) / 2;
        constructSTUtil(arr, ss, mid, si * 2 + 1);
        constructSTUtil(arr, mid + 1, se, si * 2 + 2);
  
        tree[si] = tree[si * 2 + 1] + tree[si * 2 + 2];
    }
  
    void constructST(int arr[], int n)
    {
        // Fill the allocated memory st
        constructSTUtil(arr, 0, n - 1, 0);
    }
		
  // -------------------------------- #SCHEDULING ALGO --------------------------
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
  

 // -------------------------------- #STACKS/#QUEUES ---------------------------
 // Good one => Try i, j and j, k and i, k combo to determine the answer: https://leetcode.com/problems/132-pattern/
	
 // https://cp-algorithms.com/data_structures/stack_queue_modification.html#finding-the-minimum-for-all-subarrays-of-fixed-length
 // => Find the minimum element in all subarrays of size M in O(N) where N is the size of the array.
	
 // Sum of all min/max elememnts of all subarrys/Good stack problems/ Monotonous incr/decr stack article  
 // https://leetcode.com/problems/sum-of-subarray-minimums/discuss/178876/stack-solution-with-very-detailed-explanation-step-by-step
 // https://codeforces.com/contest/281/problem/D
 // Maximum xor of two maximum numbers of every subarray
 static void solve(){
    Stack<Integer> fwd=new Stack<>();
    fwd.push(0);
    long res=0;
    for(int i=0;i<n;i++){
      while(!fwd.isEmpty() && a[fwd.peek()]<a[i]){
        res=Math.max(res, a[fwd.pop()]^a[i]);
      }
      fwd.push(i);
    }
    Stack<Integer> bwd=new Stack<>();
    bwd.push(n-1);
    for(int i=n-1;i>=0;i--){
      while(!bwd.isEmpty() && a[bwd.peek()]<a[i]){
        res=Math.max(res, a[bwd.pop()]^a[i]);
      }
      bwd.push(i);
    }
    str.append(res).append("\n");
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
