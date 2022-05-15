/*
Motivation: https://www.youtube.com/watch?v=KNviwfDeRKg 

God of:
-------
1. Maximum sum alternating sign subsequence in an array.

Don't understand the Editorial
---------
https://codeforces.com/contest/559/problem/B

Tools and Resources
-------------------
https://codeforces.com/blog/entry/101958
http://e-maxx.ru/
https://toph.co/p/lids
https://vjudge.net/
https://lightoj.com/
Galen Colin Topic STreams and Mashups
https://www.omegalearn.org/thebookofformulas
https://www.desmos.com/calculator
https://mathworld.wolfram.com/
https://artofproblemsolving.com/
https://brilliant.org/home/
https://artofproblemsolving.com/wiki/index.php/Resources_for_mathematics_competitions
https://www.youtube.com/watch?v=bSdp2WeyuJY
https://docs.google.com/document/d/1-7Co93b504uyXyMjjE8bnLJP3d3QXvp_m1UjvbvdR2Y/edit
https://docs.google.com/document/d/1Qmh_suVjBv0F3LFC5CfO06knn2zW92nfTyVlQLrUnFs/edit
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
Game to learn Geometry - https://www.euclidea.xyz/en/game/packs
online tools for cp - https://codeforces.com/blog/entry/82884
https://oeis.org/ ->  The On-Line Encyclopedia of Integer Sequences -> If problem in contests are about sequences
Google Interview Experience : https://docs.google.com/document/d/15PwjWY5leHJCvwtNQi9aCH9EASTa6HPmiQWTKbEnJkU/edit
cp book -> https://github.com/luisfcofv/competitive-programming-book
https://www.hackerearth.com/practice/notes/getting-started-with-the-sport-of-programming/
Game theory wonderful blog -> https://codeforces.com/blog/entry/66040
Codefores catalog - Have an amazing blog posts (Read it when find time) - https://codeforces.com/catalog
 
Interesting hidden things in java
---------------------------------
https://stackoverflow.com/questions/19485818/why-are-2-long-variables-not-equal-with-operator-in-java
https://www.journaldev.com/31869/java-list-remove-methods-arraylist-remove -> Use objects such as Character, Integer and not int, char for removal of element
https://www.geeksforgeeks.org/treemap-lowerkey-in-java-with-examples/
Map<Long, Long> map; // map.get(3l) is not equal to map.get(3) and also map.put(3) is not supported.

*/
/*
Variation of coin sum dp problem (If can't form change and change given to us in back is also a cost) -> https://atcoder.jp/contests/abc231/tasks/abc231_e
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
Math and Related
-----------------
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

x + (x << k) has an inverse, because it is effectively a multiplication by an odd number and odd numbers have an modular multiplicative inverse modulo a power of two. For x + (x << 1) = x * 3, the inverse is x * 0xAAAAAAAB (for 32 bits, adjust the constant for other sizes)
x ^ (x << k) has an inverse for a similar reason, but through the correspondence with carryless multiplication.
Similarly x ^ (x >> k) (with unsigned right shift) has an inverse, it's just the "mirror image" of the above.

(a^(b^c))%m != (a^((b^c)%m))%m -> https://codeforces.com/problemset/problem/1594/E1

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
phi(a) = sum of phi(d) where d is the all divisors of a
phi(n)<=n-1

Another useful idea is that d(n) is odd if and only if 'n' is a perfect square. d(n) is the number of divisors of n.
https://artofproblemsolving.com/wiki/index.php/Diophantine_equation
https://artofproblemsolving.com/wiki/index.php/Linear_congruence

Generating Functions in combinatorics are very useful.

PigeonHole: 
1. If n+1 objects are placed in n boxes then one box contains more than one object.
2. If kn objects are placed in n boxes alteast one box contains k+1 objects.
3. If average of n positive numbers is t, then atleast one of the numbers is greater or equal to t. 
   Further, atleast one of the numbers is less or equal to t.
4. https://www.geeksforgeeks.org/discrete-mathematics-the-pigeonhole-principle/

Every prime number can be represented in form of 6n+1 or 6n-1 except the prime number 2 and 3, where n is a natural number.
Two and Three are only two consecutive natural numbers that are prime.
Lemoine’s Conjecture: Any odd integer greater than 5 can be expressed as a sum of an odd prime (all primes other than 2 are odd) and an even semiprime. A semiprime number is a product of two prime numbers. 
https://codeforces.com/contest/735/problem/D
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

In Number Theory, a Wilson Prime is a prime number $N$ such that $N^2$ divides $(N-1)!+1$. It bears a striking resemblance to Wilson's Theorem. 
Although conjectured to be infinite in number, no other Wilson primes have been discovered besides 5,13, and 563.

In number theory, Wilson's Theorem states that if integer $p > 1$ , then $(p-1)! + 1$ is divisible by $p$ if and only if $p$ is prime.

If a number is divisible by consective 10 elements from 1 to 10 then
the number has factor called 10!
Any number can have atleast one element that is not factor of that element between 1 and 10.
    





































































**//*
cur -> CF unsolved
------------------
https://codeforces.com/contest/1311/problem/F
https://codeforces.com/contest/1354/problem/C2
https://codeforces.com/contest/439/problem/D -> Ternary Search (log(n)/log(3/2) times only) -> https://codeforces.com/blog/entry/12545?#comment-172751 -> Another easy sol https://codeforces.com/blog/entry/12545?#comment-172684
https://codeforces.com/contest/1242/problem/A?locale=en
https://codeforces.com/contest/1557/problem/C
https://codeforces.com/problemset/problem/840/A : https://codeforces.com/blog/entry/62690 : https://codeforces.com/blog/entry/72285
https://codeforces.com/problemset/problem/1288/C
https://codeforces.com/problemset/problem/553/A
https://codeforces.com/problemset/problem/294/C : https://codeforces.com/blog/entry/7271#comment-129018 : https://codeforces.com/blog/entry/7287
https://codeforces.com/problemset/problem/57/C : https://codeforces.com/blog/entry/1169#comment-20773
https://codeforces.com/contest/1411/problem/C
https://codeforces.com/contest/1451/problem/D
https://codeforces.com/contest/1253/problem/D
https://codeforces.com/contest/1573/problem/C
https://codeforces.com/problemset/problem/1215/B // similar to number of subarrays with k sum
https://codeforces.com/problemset/problem/851/B
https://codeforces.com/problemset/problem/630/H
https://codeforces.com/contest/1574/problem/D
https://codeforces.com/problemset/problem/1658/B
https://codeforces.com/problemset/problem/1601/A
https://codeforces.com/problemset/problem/1541/B
https://codeforces.com/problemset/problem/1526/B
https://codeforces.com/problemset/problem/1485/A
https://codeforces.com/problemset/problem/1474/B
https://codeforces.com/problemset/problem/1372/B
https://codeforces.com/contest/1422/problem/C
Tiling Problem - 3 : 85 : https://pplearn.udemy.com/course/dynamic-programming-master-course-coding-minutes/learn/lecture/30851968#overview
https://www.spoj.com/problems/GNY07H/
https://www.geeksforgeeks.org/friends-pairing-problem/
https://www.geeksforgeeks.org/generate-unique-partitions-of-an-integer/ : Partition N into integer sums(Ordered and Unordered) : 91 : https://pplearn.udemy.com/course/dynamic-programming-master-course-coding-minutes/learn/lecture/30851968#overview
109: Memory optimization: Digit DP Udemy : https://lightoj.com/problem/investigation
https://codeforces.com/contest/1422/problem/C
https://codeforces.com/contest/1579/problem/E2
https://codeforces.com/contest/1579/problem/E2
https://codeforces.com/contest/1579/problem/F
https://codeforces.com/contest/1674/problem/D
https://codeforces.com/contest/1674/problem/E
https://codeforces.com/contest/1592/problem/C
https://codeforces.com/contest/1581/problem/C
https://codeforces.com/problemset/problem/1661/B
https://codeforces.com/contest/1554/problem/C
https://codeforces.com/contest/1594/problem/D : https://www.codechef.com/INOIPRAC/problems/AMONGUS2
https://codeforces.com/contest/1675/problem/C
https://codeforces.com/problemset/problem/1659/B
https://codeforces.com/problemset/problem/1600/J
https://codeforces.com/contest/1582/problem/F1
https://codeforces.com/problemset/problem/1667/A
https://codeforces.com/contest/1606/problem/C
https://codeforces.com/contest/1604/problem/C
https://codeforces.com/contest/1556/problem/C : https://codeforces.com/blog/entry/94384
https://codeforces.com/contest/1605/problem/A
https://codeforces.com/contest/1605/problem/B
https://codeforces.com/contest/1005/problem/D
https://codeforces.com/contest/630/problem/K
https://codeforces.com/contest/1609/problem/D

Math Problems Queue
-------------------
https://artofproblemsolving.com/wiki/index.php/Simon%27s_Favorite_Factoring_Trick
https://artofproblemsolving.com/wiki/index.php/Wilson%27s_Theorem
https://artofproblemsolving.com/wiki/index.php/Chicken_McNugget_Theorem - I1 : https://artofproblemsolving.com/wiki/index.php/1994_AIME_Problems/Problem_11
https://artofproblemsolving.com/wiki/index.php/Chicken_McNugget_Theorem- I2
https://artofproblemsolving.com/wiki/index.php/2006_AMC_10B_Problems/Problem_25
https://artofproblemsolving.com/wiki/index.php/Modular_arithmetic/Intermediate - Problem @ End
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
https://cp-algorithms.com/combinatorics/catalan-numbers.html : https://www.youtube.com/watch?v=0pTN0qzpt-Y


Articles
--------
https://codeforces.com/blog/entry/65487?#comment-494720
https://codeforces.com/blog/entry/82417 : Learn Problem B all approaches
https://codeforces.com/blog/entry/79866
https://codeforces.com/blog/entry/46450 : Div2B reasoning and comparison is great
https://www.geeksforgeeks.org/print-all-possible-combinations-of-r-elements-in-a-given-array-of-size-n/
https://cp-algorithms.com/combinatorics/generating_combinations.html
https://www.geeksforgeeks.org/make-combinations-size-k/

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

	
   // ----------------------- #SORTING -------------------------------
	
   // Optimization O(nlogn) to O(n) for Problem B: https://codeforces.com/blog/entry/102013
	
	// sorting template of normal array []
    static void templateSortArray(int a[]) {
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
    /* Maximum size square sub-matrix with all 1s -> https://www.geeksforgeeks.org/maximum-size-sub-matrix-with-all-1s-in-a-binary-matrix/
       https://www.geeksforgeeks.org/number-of-submatrices-with-all-1s/
       Amazing variation of this: https://codeforces.com/problemset/problem/375/B
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
	
    // Number of ways to partition number n into sum of positive integers
    // Order matter: https://github.com/apaarkamal/Dynammic-Programming-Coding-Minutes/blob/main/Java%20Codes/CountOrdered.java 
    // Order does not matter: See 94: https://github.com/apaarkamal/Dynammic-Programming-Coding-Minutes/blob/main/Java%20Codes/CountUnordered.java

    // ------------------------- #NUMBER THEORY ------------------------ 
	
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

    // Linear Diophantine
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
	
    // Euler Totient
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
        if (b % 2 == 1) {
            res = mod_mul(res, a);
            b--;
        } else {
            a = mod_mul(a, a);
            b = b >> 1l;
        }
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

    // ----------------------------- #GRAPHS -------------------------
    // Bi Partite graph: https://www.geeksforgeeks.org/bipartite-graph/
	
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

    // ------------------------- #ADVANCED DATA STRUCTURES ------------------------
    // BIT
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
