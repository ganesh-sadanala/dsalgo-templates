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

int pre[26][2005];
int a[2005];
int n;
void solve()
{
  forn(i, n) cin >> a[i];
  int ans = 0;
  forn(i, n)
  {
    forn(j, 26)
        pre[j][i + 1] = pre[j][i];

    pre[a[i] - 1][i + 1]++;
  }

  // For 1 char
  forn(i, 26)
      ans = max(ans, pre[i][n]);
  // For 2 char
  forn(l, n)
  {
    fore(r, l, n)
    {
      int mx = 0;
      int maxlr = 0;
      forn(i, 26)
      {
        mx = max(mx, pre[i][r + 1] - pre[i][l]);
        maxlr = max(maxlr, min(pre[i][l], pre[i][n] - pre[i][r + 1]) * 2);
      }
      ans = max(ans, maxlr + mx);
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
    memset(pre, 0, sizeof(pre));
    solve();
  }
}
