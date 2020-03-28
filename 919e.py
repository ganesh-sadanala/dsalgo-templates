//Problem from https://codeforces.com/problemset/problem/919/E

def pow(a,b,p):
    ans = 1
    base = a
    while b:
        if b & 1:
            ans *= base
            base = base%p
        base *= base
        base %= p
        b >>= 1
    return ans

def inv(x, p):
    return pow(x, p-2, p)

def condition(a, b, p, x):
    ans = 0
    for i in range(1, p):
        now = b*inv(pow(a,i,p), p)%p
        first = (p-1)*((i-now+p)%p)+i
        if first > x:
            continue
        ans += (x-first)//(p*(p-1))+1
    return ans

if __name__ == '__main__':
    n = int(input())
    for i in range(n):
        s = [int(x) for x in input().split()]
        a = s[0]
        b = s[1]
        p = s[2]
        x = s[3]
        print(condition(a, b, p, x))
