// 50 marks is easy
// Refer : https://www.geeksforgeeks.org/submatrix-sum-queries/

// For 100 marks , refer editorial

#include <iostream>
#include <bits/stdc++.h>
using namespace std;

#define pb push_back
#define vi vector<int>
#define N 2e5 + 5
#define f first
#define s second
#define all(x) x.begin(), x.end()
#define forn(i, n) for (int i = 0; i < n; i++)
#define ll long long
#define init(arr) memset(arr, 0, sizeof(arr))
#define endl "\n"
#define mp make_pair

ll freq[(int)1e6 + 1];
void solve()
{
  int n;
  ll x;
  ll res = 0;
  cin >> n >> x;
  ll a[n];
  forn(i, n)
          cin >>
      a[i];
  vector<ll> factors;
  for (ll i = 1; i * i <= x; i++)
  {
    if (x % i == 0)
    {
      factors.pb(i);
      if (x / i != i)
        factors.pb(x / i);
    }
  }

  // X = sz*(sum of two subarrays of a of size a)
  ll ans = 0;
  init(freq);
  ll sum[n];
  init(sum);
  for (ll sz : factors)
  {
    if (sz > n)
      continue;

    ll S = x / sz;

    ll tot = 0;
    int ptr = 0;
    for (int i = 0; i < sz - 1; i++)
      tot += a[i];
    for (int i = sz - 1; i < n; i++)
    {
      tot += a[i];
      if (tot <= S)
      {
        sum[ptr++] = tot;
        freq[(int)tot]++;
      }
      tot -= a[i - sz + 1];
    }
    for (int i = 0; i < ptr; i++)
      ans += freq[S - sum[i]];
    for (int i = 0; i < ptr; i++)
      freq[sum[i]]--;
  }
  cout << ans << endl;
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
