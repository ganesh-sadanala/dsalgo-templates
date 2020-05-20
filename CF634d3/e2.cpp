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

int a[200010];
int n;
void solve()
{
  int ans = 0;
  forn(i, n)
          cin >>
      a[i];

  vector<vi> cnt(200, vi(n + 1));
  vector<vi> pos(200);
  forn(i, n)
  {
    forn(j, 200)
        cnt[j][i + 1] = cnt[j][i];

    ++cnt[a[i] - 1][i + 1];
    pos[a[i] - 1].pb(i);
  }
  forn(i, 200)
  {
    ans = max(ans, sz(pos[i]));
    forn(p, sz(pos[i]) / 2)
    {
      int l = pos[i][p] + 1;
      int r = pos[i][sz(pos[i]) - p - 1] - 1;

      forn(j, 200)
      {
        int sum = cnt[j][r + 1] - cnt[j][l];
        ans = max(ans, sum + 2 * (p + 1));
      }
    }
  }
  cout << ans << "\n";
}
int32_t main()
{
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  int t;
  cin >> t;
  while (t-- > 0)
  {
    cin >> n;
    memset(a, 0, sizeof(a));
    solve();
  }
}
