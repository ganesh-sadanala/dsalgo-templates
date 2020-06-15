// Refer : Editorial
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

void solve()
{
  int n;
  cin >> n;
  int a[n];
  forn(i, n)
          cin >>
      a[i];
  int ans[n];
  for (int i = 0; i < n; i++)
    ans[i] = -1;
  int vis[2 * n];
  init(vis);

  for (int i = 1; i < n; i++)
  {
    if (a[i] != a[i - 1])
    {
      ans[i] = a[i - 1];
      vis[a[i - 1]] = 1;
    }
  }

  vis[a[n - 1]] = 1;
  int l = 0;
  for (int i = 0; i < n; i++)
  {
    if (ans[i] == -1)
    {
      while (vis[l])
        l++;
      ans[i] = l;
      vis[l] = 1;
    }
  }
  forn(i, n)
          cout
      << ans[i] << " ";

  cout << endl;
}
int main()
{
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);
  solve();
}
