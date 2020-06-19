// Refer :https://www.youtube.com/watch?v=VwEOxEk8Hxw&t=657s

// Acha question hai
// kuch socha karna easy tha

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
#define ar bay
#define init(b) memset(b, 0, sizeof(b))
#define endl "\n"
#define mp make_pair

void solve()
{
  string s;
  cin >> s;
  int n;
  cin >> n;
  char res[n];
  int b[n];
  forn(i, n)
          cin >>
      b[i];

  map<char, int> ma;
  vector<pair<char, int>> v;
  for (char c : s)
    ma[c]++;
  for (auto i : ma)
    v.pb(i);

  int sz = v.size() - 1;
  bool vis[n];
  forn(i, n)
      vis[i] = false;
  while (true)
  {
    vi zero;
    forn(i, n)
    {
      if (!vis[i] && b[i] == 0)
        zero.pb(i);
    }
    if (zero.size() == 0)
      break;
    while (v[sz].s < zero.size())
      sz--;

    for (int i = 0; i < zero.size(); i++)
    {
      vis[zero[i]] = true;
      res[zero[i]] = v[sz].f;
    }
    sz--;
    for (int i : zero)
    {
      forn(j, n)
      {
        if (!vis[j])
          b[j] -= abs(i - j);
      }
    }
  }
  forn(i, n)
          cout
      << res[i];
  cout << endl;
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
