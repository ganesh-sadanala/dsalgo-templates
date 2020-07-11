// URL: https://www.hackerearth.com/practice/data-structures/advanced-data-structures/fenwick-binary-indexed-trees/practice-problems/algorithm/permutation-and-inversions-43b5147e/description/
// Refer : https://discuss.codechef.com/t/how-to-solve-the-permuatations-and-inversions-from-hackerearth/71586

#include <iostream>
#include <bits/stdc++.h>
using namespace std;

#define forn(i, n) for (int i = 0; i < n; i++)
#define ll long long
#define endl "\n"
#define pb push_back

const int N = 1e5 + 5;
int bit[N];

int getSum(int inx)
{
  int res = 0;
  while (inx > 0)
  {
    res += bit[inx];
    inx -= (inx & (-inx));
  }
  return res;
}

void update(int inx, int val)
{
  while (inx <= N)
  {
    bit[inx] += val;
    inx += (inx & (-inx));
  }
}
void solve()
{
  forn(i, N)
      bit[i] = 0;

  int n;
  cin >> n;
  int a[n];
  forn(i, n)
          cin >>
      a[i];
  ll ans = 0;
  for (int i = n - 1; i >= 0; i--)
  {
    ans += getSum(a[i] - 1);
    update(a[i], 1);
  }
  ll xr = ans;
  for (int i = 0; i < n - 1; i++)
  {
    ans = ans - (a[i] - 1);
    ans += (n - a[i]);
    xr ^= ans;
  }
  cout << xr << endl;
}
int main()
{
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);
  int t;
  cin >> t;
  while (t--)
    solve();
}
