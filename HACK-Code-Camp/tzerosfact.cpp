// Url: https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/trailing-zeroes-in-factorial/description/

// Refer : GFG
#include <iostream>
#include <bits/stdc++.h>
using namespace std;

#define pb push_back
#define vi vector<int>
#define vpii vector<pair<int, int>>
#define N 2e5 + 5
#define f first
#define s second
#define all(x) x.begin(), x.end()
#define forn(i, n) for (int i = 0; i < n; i++)
#define fore(i, l, r) for (int i = l; i < r; i++)
#define sz(a) (int)((a).size())
#define ll long long
#define ar array
#define init(arr) memset(arr, 0, sizeof(arr))
#define endl "\n"
#define mp make_pair

ll m;
ll trailing_zeros(ll n)
{
  ll cnt = 0;
  while (n)
  {
    n /= 5;
    cnt += n;
  }
  return cnt;
}
void solve()
{
  ll l = 1, r = 1000000000;
  ll ans = -1;
  while (l <= r)
  {
    ll mid = l + (r - l) / 2;
    ll cnt = trailing_zeros(mid);
    if (cnt >= m)
    {
      ans = mid;
      r = mid - 1;
    }
    else
      l = mid + 1;
  }
  if (trailing_zeros(ans) != m)
    cout << 0 << endl;
  else
  {
    cout << 5 << endl;
    cout << ans << " " << (ans + 1) << " " << (ans + 2) << " " << (ans + 3) << " " << (ans + 4) << endl;
  }
}
int main()
{
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(0);
  int t;
  cin >> t;
  while (t--)
  {
    cin >> m;
    solve();
  }
}
