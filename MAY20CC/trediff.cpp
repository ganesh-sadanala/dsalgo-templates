// Was unable to implement a brute force solution even
// Learned a new way of finding the lca (lowest common ancestor) using two parent pointers

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
//#define int long long int
#define forn(i, n) for (int i = 0; i < n; i++)
#define fore(i, l, r) for (int i = l; i < r; i++)
#define sz(a) (int)((a).size())
#define ll long long
#define ar array

int n, q;
vector<vi> adj;
int dist[N];
int parent[N];

void lca(int u, int v, int arr[])
{
  vector<int> list;
  list.pb(arr[u]);
  list.pb(arr[v]);
  while (u != v)
  {
    if (dist[u] > dist[v])
    {
      u = parent[u];
      list.pb(arr[u]);
    }
    else
    {
      v = parent[v];
      list.pb(arr[v]);
    }
    if (list.size() > 100)
    {
      cout << 0 << "\n";
      return;
    }
  }
  list.pop_back();
  sort(list.begin(), list.end());
  int MAX = INT_MAX;
  for (int i = 1; i < list.size(); i++)
    MAX = min(MAX, abs(list[i] - list[i - 1]));
  cout << MAX << "\n";
}

void dfs(int u, int p, int h)
{
  dist[u] = h;
  parent[u] = p;
  for (int v : adj[u])
  {
    if (v != p)
      dfs(v, u, h + 1);
  }
}

void solve()
{
  cin >> n >> q;
  int arr[n];
  forn(i, n)
          cin >>
      arr[i];

  adj = vector<vi>(n);
  forn(i, n - 1)
  {
    int u, v;
    cin >> u >> v;
    u--;
    v--;
    adj[u].pb(v);
    adj[v].pb(u);
  }
  memset(dist, 0, sizeof(dist));
  memset(parent, 0, sizeof(parent));
  dfs(0, -1, 0);
  while (q-- > 0)
  {
    int u, v;
    cin >> u >> v;
    u--;
    v--;
    lca(u, v, arr);
  }
}

int32_t main()
{
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  int t;
  cin >> t;
  while (t-- > 0)
    solve();
}
