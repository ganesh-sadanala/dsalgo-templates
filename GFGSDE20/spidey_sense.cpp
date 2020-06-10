// Lots of learning from this question
// 1. DFS cannot be used to find shortest distance in an unweighted graph
// 2. BFS can be used
// DFS -> Start from source -> dest -> get the info -> store at src
// BFS -> Start at dest -> source -> store the info.

// URL : https://practice.geeksforgeeks.org/contest-problem/spidey-sense/0/
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

int m, n;
char mat[50][50];
int x[] = {1, -1, 0, 0};
int y[] = {0, 0, 1, -1};
bool vis[50][50];
int res[50][50];

struct Node
{
  int h, v, dist;
};
bool isValid(int r, int c)
{
  return (r >= 0 && c >= 0 && r < m && c < n);
}
bool isSafe(int r, int c)
{
  return !(mat[r][c] != 'O' || res[r][c] != 0);
}

void bfs()
{
  queue<Node> q;
  init(res);
  forn(i, m)
  {
    forn(j, n)
    {
      if (mat[i][j] == 'B')
      {
        Node node = {i, j, 0};
        q.push(node);
      }
    }
  }
  while (!q.empty())
  {
    Node node = q.front();
    q.pop();
    for (int i = 0; i < 4; i++)
    {
      int rr = node.h + x[i], cc = node.v + y[i];
      if (isValid(rr, cc) && isSafe(rr, cc))
      {
        res[rr][cc] = node.dist + 1;
        Node no = {rr, cc, res[rr][cc]};
        q.push(no);
      }
    }
  }
  for (int i = 0; i < m; i++)
  {
    for (int j = 0; j < n; j++)
    {
      if ((mat[i][j] == 'W') || (mat[i][j] == 'O' && res[i][j] == 0))
        res[i][j] = -1;
      cout << res[i][j] << " ";
    }
    cout << endl;
  }
}
int main()
{
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);
  int t;
  cin >> t;
  while (t-- > 0)
  {
    cin >> m >> n;
    for (int i = 0; i < m; i++)
    {
      for (int j = 0; j < n; j++)
      {
        cin >> mat[i][j];
      }
    }
    bfs();
  }
}
