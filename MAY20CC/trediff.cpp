// Was unable to implement a brute force solution even
// Learned a new way of finding the lca (lowest common ancestor) using two parent pointers
// Refer Editorial + youtube codechef

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
#define init(arr) memset(arr, 0, sizeof(arr))

int n, q;
vector<vi> adj;
int dist[N];
int parent[N];

void lca(int u, int v, int arr[])
{
  int freq[101];
  init(freq);
  if (dist[v] < dist[u])
  {
    int temp = v;
    v = u;
    u = temp;
  }

  while (dist[v] > dist[u])
  {
    if (freq[arr[v]] > 0)
    {
      cout << 0 << "\n";
      return;
    }
    freq[arr[v]]++;
    v = parent[v];
  }

  while (u != v)
  {
    if (freq[arr[u]] > 0)
    {
      cout << 0 << "\n";
      return;
    }
    freq[arr[u]]++;
    if (freq[arr[v]] > 0)
    {
      cout << 0 << "\n";
      return;
    }
    freq[arr[v]]++;
    u = parent[u];
    v = parent[v];
  }
  if (freq[arr[v]] > 0)
  {
    cout << 0 << "\n";
    return;
  }
  freq[arr[v]]++;
  int MIN = INT_MAX;
  int prev = -1;
  for (int i = 1; i <= 100; i++)
  {
    if (freq[i] > 0)
    {
      if (prev != -1)
        MIN = min(MIN, i - prev);

      prev = i;
    }
  }
  cout << MIN << "\n";
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
  init(dist);
  init(parent);
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
