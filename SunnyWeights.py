# array size whose subset sums produces all the numbers from 1 to n

import math
n=int(input())
for j in range(n):
    x=int(input())
    print(math.ceil(math.log(2*x+1,3)))


#https://www.hackerrank.com/contests/algo-builder/challenges/help-the-sunny