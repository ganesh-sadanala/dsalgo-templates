/*
// I have failed but learned a lot.
m = n*a + (b-c)
Let us say x = (b-c)
Then it becomes m = n*a + x
which is of the form, Dividened = Quotient * Divisor + remainder
Then range of a, b, c is [l, r]
So then range of x becomes [l-r, r-l]
We need to observe that (m-x) % a should be equal to 0.
Then only we can get a quotient n.
So we iterate a from [l, r]
We calculate mod = m % a.
Case 1:
------
when we get mod i.e; (x as <=r-l) which is in the required range
also the (m-x) != 0 because when it is zero, then n is 0 which is not we want.
Then b = r and c = r - rem because x is b-c = rem <= r-l
We can also have b as l + rem and c as l.
Case 2:
------
Sometimes we get (m-x) as <= a or (m-x) == 0.
in that case, we add a to make (m-x+a)>=a.
Here (x-a) is obviously negative then only (m-(x-a)) >= a.
We take (m-x+a) and we check whether our rem = (x - a) <= r-l
If it is true, then our c>b,
rem = (b-c) = (x-a)
if b = l then c = l - x + a
or if c = r then b is r + x - a

 (c - b) = (a - x) < = (r-l)
*/
#include <iostream>
#include <bits/stdc++.h>
using namespace std;

#define pb push_back
#define forn(i, n) for (int i = 0; i < n; i++)
#define ll long long
#define endl "\n"

ll l, r, m;
ll aa, bb, cc;
void solve()
{
  ll mx = r - l;
  for (ll a = l; a <= r; a++)
  {
    ll x = m % a;
    ll xma = a - x;
    if (x <= mx && (m - x) != 0)
    {
      aa = a;
      bb = l + x;
      cc = l;
    }
    else if (xma <= mx)
    {
      aa = a;
      bb = r - xma;
      cc = r;
    }
  }
  cout << aa << " " << bb << " " << cc << endl;
}
int main()
{
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);
  int t;
  cin >> t;
  while (t--)
  {
    cin >> l >> r >> m;
    solve();
  }
}
