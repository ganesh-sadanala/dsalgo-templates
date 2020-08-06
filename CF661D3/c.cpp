// Refer: Watch Youtube
#include <iostream>
#include <bits/stdc++.h>
using namespace std;

#define pb push_back
#define forn(i, n) for (int i = 0; i < n; i++)
#define ll long long
#define endl "\n"

const int N = 1e5 + 1;
void solve()
{
  int n;
  cin >> n;
  int w[n];
  unordered_map<int, int> ma;
  forn(i, n)
  {
    cin >> w[i];
    ma[w[i]]++;
  }

  int res = 0;
  for (int i = 2; i <= 2 * n; i++)
  {
    int sum = i;
    int ans = 0;
    int cnt = 0;
    for (auto p : ma)
    {
      int other = sum - p.first;
      if (other >= 1 && ma.count(other))
        ans += min(p.second, ma[other]);
    }
    res = max(res, ans / 2);
  }
  cout << res << endl;
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
