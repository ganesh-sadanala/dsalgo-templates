// Refer: https://www.youtube.com/watch?v=teyxFYAmiQQ
/*
 Learned that any number can be represented as the sum of powers of 2.
 If you cannot calculate the given value for a given bigger number
 Precalculate the value for powers of 2 and since any number can be represented as
 the sum of powers of 2, you can simply have a lookup and add the values.
*/
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

map<ll, ll> dp;
ll n;
void preprocess()
{
  dp[1] = 1;
  for (ll i = 2; i <= (1e18); i *= 2)
  {
    dp[i] = dp[i / 2] * 2 + 1;
  }
}
void solve()
{
  cin >> n;
  ll ans = 0, i = 0;
  while (n > 0)
  {
    if (n % 2 == 1)
      ans += dp[pow(2, i)];
    i++;
    n /= 2;
  }
  cout << ans << "\n";
}
int main()
{
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);
  ll t;
  cin >> t;
  preprocess();
  while (t--)
    solve();
}
