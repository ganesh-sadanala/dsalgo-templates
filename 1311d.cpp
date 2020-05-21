// Refer: Editorial
// Refer: Editorial

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
// #define int long long int
#define forn(i, n) for (int i = 0; i < n; i++)
#define fore(i, l, r) for (int i = l; i < r; i++)
#define sz(a) (int)((a).size())
#define ar array
#define ll long long

int a, b, c;
vector<ar<int, 3>> v;
void store()
{
  for (int i = 1; i <= 2 * 1e4; i++)
  {
    for (int j = i; j <= 2 * 1e4; j += i)
    {
      for (int k = j; k <= 2 * 1e4; k += j)
      {
        v.pb({i, j, k});
      }
    }
  }
}
int32_t main()
{
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  int t;
  cin >> t;
  store();
  while (t-- > 0)
  {
    ar<int, 4> ans = {(int)1e9};
    cin >> a >> b >> c;
    for (ar<int, 3> d : v)
    {
      ans = min(ans, ar<int, 4>{abs(a - d[0]) + abs(b - d[1]) + abs(c - d[2]), d[0], d[1], d[2]});
    }
    cout << ans[0] << "\n"
         << ans[1] << " " << ans[2] << " " << ans[3] << "\n";
  }
}
