// Refer Editorial
// Link: https://www.hackerearth.com/practice/algorithms/graphs/topological-sort/practice-problems/algorithm/social-graph-1-ac58bbdf/description/

#include <iostream>
#include <bits/stdc++.h>
using namespace std;

#define pb push_back
#define vi vector<int>
#define vpii vector<pair<int, int>>
#define N (int)2e5 + 5
#define f first
#define s second
#define all(x) x.begin(), x.end()
#define forn(i, n) for (int i = 0; i < n; i++)
#define fore(i, l, r) for (int i = l; i < r; i++)
#define sz(a) (int)((a).size())
#define ll long long
#define ar array
#define init(arr, val) memset(arr, val, sizeof(arr))

vi edge[N];
bool vis[N];
int dp[N];

void dfs(int u)
{

  vis[u] = true;
  dp[u] = 1;
  for (int v : edge[u])
  {
    if (!vis[v])
      dfs(v);

    dp[u] = max(dp[u], 1 + dp[v]);
  }
}

int main()
{
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  int n, m;
  cin >> n >> m;
  init(vis, false);
  init(dp, 1);
  while (m-- > 0)
  {
    int a, b;
    cin >> a >> b;
    edge[a].pb(b);
  }
  int ans = -1;
  for (int i = 1; i <= n; i++)
  {
    if (!vis[i])
      dfs(i);
  }
  for (int i = 1; i <= n; i++)
    ans = max(dp[i], ans);

  cout << ans << "\n";
}
