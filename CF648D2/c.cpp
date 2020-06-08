// Refer : https://www.youtube.com/watch?v=xd5WkS1h9LI
// Nice question leveraging maps and offsets
// Like a rotation
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

void solve()
{
  int n;
  cin >> n;
  int a[n];
  int b[n];
  forn(i, n)
          cin >>
      a[i];
  forn(i, n)
          cin >>
      b[i];

  if (n == 1)
  {
    if (a[0] == b[0])
      cout << 1 << "\n";
    else
      cout << 0 << "\n";

    return;
  }
  map<int, int> ma;
  forn(i, n)
      ma[a[i]] = i;

  int right[n];

  init(right);
  forn(i, n)
  {
    int k = i - ma[b[i]];
    if (k < 0)
      right[abs(k)]++;
    else
      right[n - abs(k)]++;
  }
  int mx = 0;
  forn(i, n)
      mx = max(right[i], mx);
  cout << mx << endl;
}
int main()
{
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  solve();
}
