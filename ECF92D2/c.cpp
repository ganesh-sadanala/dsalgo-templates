// refer: editorial
#include <iostream>
#include <bits/stdc++.h>
using namespace std;

#define pb push_back
#define forn(i, n) for (int i = 0; i < n; i++)
#define ll long long
#define endl "\n"

const int N = 1e5 + 1;

ll solveUtil(string &s, int x, int y)
{
  ll res = 0;
  for (auto c : s)
  {
    if ((c - '0') == x)
    {
      res++;
      x += y;
      y = x - y;
      x -= y;
    }
  }
  if (x != y && res % 2 == 1)
    res--;
  return res;
}
void solve()
{
  string s;
  cin >> s;
  ll res = 0;
  for (int i = 0; i <= 9; i++)
    for (int j = 0; j <= 9; j++)
      res = max(res, solveUtil(s, i, j));
  cout << (ll)s.size() - res << endl;
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
