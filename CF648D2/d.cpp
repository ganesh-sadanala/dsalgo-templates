// Refer: https://www.youtube.com/watch?v=pyeJMinHpLw
// Key idea : Blocking B from all sides
// Running dfs or bfs from the goal node

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

int n, m;
bool isValid(int x, int y)
{
  return (x >= 0 && x < n && y >= 0 && y < m);
}
void solve()
{
  cin >> n >> m;
  bool vis[n][m];
  char mat[n][m];
  memset(vis, false, sizeof(vis));
  int gcnt = 0;
  forn(i, n)
  {
    forn(j, m)
    {
      cin >> mat[i][j];
      if (mat[i][j] == 'G')
        gcnt++;
    }
  }

  if (gcnt == 0)
  {
    cout << "Yes\n";
    return;
  }
  forn(i, n)
  {
    forn(j, m)
    {
      if (mat[i][j] == 'B')
      {
        if (isValid(i + 1, j) && mat[i + 1][j] == '.')
          mat[i + 1][j] = '#';
        if (isValid(i - 1, j) && mat[i - 1][j] == '.')
          mat[i - 1][j] = '#';
        if (isValid(i, j + 1) && mat[i][j + 1] == '.')
          mat[i][j + 1] = '#';
        if (isValid(i, j - 1) && mat[i][j - 1] == '.')
          mat[i][j - 1] = '#';
      }
    }
  }

  queue<pair<int, int>> q;
  q.push(mp(n - 1, m - 1));
  vis[n - 1][m - 1] = true;
  while (!q.empty())
  {
    pair<int, int> p = q.front();
    q.pop();
    if (isValid(p.f + 1, p.s) && mat[p.f + 1][p.s] != '#' && !vis[p.f + 1][p.s])
    {
      vis[p.f + 1][p.s] = true;
      q.push(mp(p.f + 1, p.s));
    }
    if (isValid(p.f - 1, p.s) && mat[p.f - 1][p.s] != '#' && !vis[p.f - 1][p.s])
    {
      vis[p.f - 1][p.s] = true;
      q.push(mp(p.f - 1, p.s));
    }
    if (isValid(p.f, p.s + 1) && mat[p.f][p.s + 1] != '#' && !vis[p.f][p.s + 1])
    {
      vis[p.f][p.s + 1] = true;
      q.push(mp(p.f, p.s + 1));
    }
    if (isValid(p.f, p.s - 1) && mat[p.f][p.s - 1] != '#' && !vis[p.f][p.s - 1])
    {
      vis[p.f][p.s - 1] = true;
      q.push(mp(p.f, p.s - 1));
    }
  }
  forn(i, n)
  {
    forn(j, m)
    {
      if (mat[i][j] == 'G' && !vis[i][j])
      {
        cout << "No\n";
        return;
      }
      else if (mat[i][j] == 'B' && vis[i][j])
      {
        cout << "No\n";
        return;
      }
    }
  }
  cout << "Yes\n";
}
int main()
{
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  int t;
  cin >> t;
  while (t--)
    solve();
}
